package com.somnwal.app.feature.test.webview

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun TestWebViewRoute(
    padding: PaddingValues,
    onShowErrorSnackbar: (Throwable?) -> Unit
) {
    TestWebViewScreen(
        padding = padding,
        onShowErrorSnackbar = onShowErrorSnackbar
    )
}

@Composable
internal fun TestWebViewScreen(
    padding: PaddingValues,
    onShowErrorSnackbar: (Throwable?) -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(padding)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Text(text = "웹뷰 테스트")
        }
    }
}
