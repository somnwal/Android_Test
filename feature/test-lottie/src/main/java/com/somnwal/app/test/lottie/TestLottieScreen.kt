package com.somnwal.app.feature.test.webview

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
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
                .padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            var lottieTestIndex by remember { mutableIntStateOf(0) }

            val lottieTestList = listOf(
                rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.lottie_test_1)),
                rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.lottie_test_2)),
                rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.lottie_test_3)),
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
            ) {
                LottieAnimation(
                    composition = lottieTestList[lottieTestIndex].value,
                    isPlaying = true,
                    iterations = 10000,
                    restartOnPlay = true
                )
            }

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(scrollState)
            ) {
                for(index: Int in lottieTestList.indices) {
                    CustomButton(
                        modifier = Modifier
                            .fillMaxSize(),
                        text = "로띠 테스트 ${index + 1}",
                        onClick = {
                            lottieTestIndex = index
                        }
                    )
                }
            }
        }
    }
}
