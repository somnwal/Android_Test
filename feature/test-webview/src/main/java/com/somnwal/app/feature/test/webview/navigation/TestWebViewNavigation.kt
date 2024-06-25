package com.somnwal.app.feature.test.webview.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.somnwal.app.feature.test.webview.TestWebViewRoute

fun NavController.navigateToTestWebView(navOptions: NavOptions) {
    navigate(TestWebViewRoute.ROUTE, navOptions)
}

fun NavGraphBuilder.testWebViewNavGraph(
    padding: PaddingValues,
    onShowErrorSnackbar: (Throwable?) -> Unit
) {
    composable(route = TestWebViewRoute.ROUTE) {
        TestWebViewRoute(
            padding = padding,
            onShowErrorSnackbar = onShowErrorSnackbar
        )
    }
}

data object TestWebViewRoute {
    const val ROUTE = "testWebView"
}