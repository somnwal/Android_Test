package com.somnwal.app.test.lottie.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.somnwal.app.feature.test.webview.TestLottieRoute

fun NavController.navigateToTestLottie(navOptions: NavOptions) {
    navigate(TestLottieRoute.ROUTE, navOptions)
}

fun NavGraphBuilder.testLottieNavGraph(
    padding: PaddingValues,
    onShowErrorSnackbar: (Throwable?) -> Unit
) {
    composable(route = TestLottieRoute.ROUTE) {
        TestLottieRoute(
            padding = padding,
            onShowErrorSnackbar = onShowErrorSnackbar
        )
    }
}

data object TestLottieRoute {
    const val ROUTE = "testLottie"
}