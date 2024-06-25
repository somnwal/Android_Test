package com.somnwal.app.feature.main.navigation

import androidx.compose.ui.graphics.vector.ImageVector
import com.somnwal.app.core.designsystem.component.icon.AppIcons
import com.somnwal.app.feature.test.navigation.TestRoute
import com.somnwal.app.feature.test.webview.navigation.TestWebViewRoute
import com.somnwal.app.test.lottie.navigation.TestLottieRoute

internal enum class MainTab(
    val route: String,
    internal val contentDescription: String,
    val unselectedIcon: ImageVector,
    val selectedIcon: ImageVector
) {
    TEST(
        route = TestRoute.ROUTE,
        contentDescription = "테스트",
        unselectedIcon = AppIcons.ICON_TEST_OUTLINED,
        selectedIcon = AppIcons.ICON_TEST_FILLED
    ),

    TEST_LOTTIE(
        route = TestLottieRoute.ROUTE,
        contentDescription = "Lottie 테스트",
        unselectedIcon = AppIcons.ICON_TEST_LOTTIE_OUTLINED,
        selectedIcon = AppIcons.ICON_TEST_LOTTIE_FILLED
    ),

    TEST_WEBVIEW(
        route = TestWebViewRoute.ROUTE,
        contentDescription = "웹뷰 테스트",
        unselectedIcon = AppIcons.ICON_TEST_WEBVIEW_OUTLINED,
        selectedIcon = AppIcons.ICON_TEST_WEBVIEW_FILLED
    );

    companion object {
        operator fun contains(route: String): Boolean {
            return entries.map { it.route }.contains(route)
        }

        fun find(route: String): MainTab? {
            return entries.find { it.route == route }
        }
    }
}