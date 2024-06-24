package com.somnwal.test.kakaobank.app.feature.main.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavDestination
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navOptions
import com.somnwal.test.kakaobank.app.feature.favorite.navigation.navigateFavorite
import com.somnwal.test.kakaobank.app.feature.search.navigation.navigateSearch
import com.somnwal.kakaobank.app.feature.web.navigation.navigateWeb

internal class MainNavigator(
    val navController: NavHostController
) {

    private val currentDestination: NavDestination?
        @Composable get() = navController
            .currentBackStackEntryAsState().value?.destination

    val startDestination = MainTab.SEARCH.route

    val currentTab: MainTab?
        @Composable get() = currentDestination
            ?.route
            ?.let(MainTab::find)

    fun navigate(tab: MainTab) {
        // TODO 개념정리
        val navOptions = navOptions {
            // 시작화면 까지 스택을 전부 팝업한다.
            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }

            launchSingleTop = true
            restoreState = true
        }

        when(tab) {
            MainTab.SEARCH -> navController.navigateSearch(navOptions)
            MainTab.FAVORITE -> navController.navigateFavorite(navOptions)
        }
    }

    fun popBackStack() {
        navController.popBackStack()
    }

    @Composable
    fun shouldShowAppBar(): Boolean {
        val currentRoute = currentDestination?.route ?: return false
        return currentRoute !in MainTab
    }

    @Composable
    fun shouldShowBottomBar(): Boolean {
        val currentRoute = currentDestination?.route ?: return false
        return currentRoute in MainTab
    }

    fun navigateWeb(url: String) {
        val navOptions = navOptions {
            launchSingleTop = true
            restoreState = true
        }

        navController.navigateWeb(url, navOptions)
    }
}

@Composable
internal fun rememberMainNavigator(
    navController: NavHostController = rememberNavController(),
): MainNavigator = remember(navController) {
    MainNavigator(navController)
}