package com.somnwal.app.feature.test.webview

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.rememberLottieComposition
import com.somnwal.app.core.designsystem.component.common.CustomButton
import com.somnwal.test.feature.test.lottie.R

@Composable
fun TestLottieRoute(
    padding: PaddingValues,
    onShowErrorSnackbar: (Throwable?) -> Unit
) {
    TestLottieScreen(
        padding = padding,
        onShowErrorSnackbar = onShowErrorSnackbar
    )
}

@Composable
internal fun TestLottieScreen(
    padding: PaddingValues,
    onShowErrorSnackbar: (Throwable?) -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues = padding)
    ) {
        val scrollState = rememberScrollState()

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
                .verticalScroll(scrollState),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val lottieTest1 = rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.lottietest))

            LottieAnimation(composition = lottieTest1.value)

            CustomButton(
                modifier = Modifier
                    .fillMaxSize(),
                text = "로띠 테스트 1",
                onClick = {

                })
        }
    }
}
