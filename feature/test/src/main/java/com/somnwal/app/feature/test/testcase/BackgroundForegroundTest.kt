package com.somnwal.app.feature.test.testcase

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.somnwal.app.core.designsystem.component.common.CustomButton
import com.somnwal.app.core.designsystem.component.common.CustomTitle

@Composable
fun BackgroundForegroundTest(

) {
    /** ====================================================================================
     * 백그라운드/포그라운드 테스트
     * ================================================================================== */
    CustomTitle(text = "백그라운드/포그라운드 테스트")

    CustomButton(
        modifier = Modifier
            .fillMaxWidth(),
        text = "백그라운드 서비스 테스트",
        onClick = {
        }
    )

    CustomButton(
        modifier = Modifier
            .fillMaxWidth(),
        text = "포그라운드 서비스 테스트",
        onClick = {
        }
    )
}