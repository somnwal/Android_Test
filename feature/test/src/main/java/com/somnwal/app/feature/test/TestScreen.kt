package com.somnwal.app.feature.test

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.somnwal.app.core.designsystem.component.common.CustomButton
import com.somnwal.app.core.designsystem.component.common.CustomTextField
import com.somnwal.app.core.designsystem.component.common.CustomTitle
import com.somnwal.app.core.designsystem.theme.AppTheme

@Composable
internal fun TestRoute(
    padding: PaddingValues,
    onShowErrorSnackbar: (Throwable?) -> Unit
) {
    TestScreen(
        padding = padding,
        onShowErrorSnackbar = onShowErrorSnackbar
    )
}

@Composable
internal fun TestScreen(
    padding: PaddingValues,
    onShowErrorSnackbar: (Throwable?) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues = padding)
    ) {
        CustomTitle(
            text = "기본 테스트 (알럿/스낵바)"
        )

        CustomButton(
            modifier = Modifier
                .fillMaxWidth(),
            text = "Alert 테스트",
            onClick = {
            }
        )

        CustomButton(
            modifier = Modifier
                .fillMaxWidth(),
            text = "에러 스낵바 테스트",
            onClick = {
                onShowErrorSnackbar(Throwable("테스트 오류"))
            }
        )

        Spacer(modifier = Modifier.height(20.dp))

        CustomTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    horizontal = 4.dp
                ),
            label = "테스트",
            value = "테스트",
            onValueChange = { }
        )

        CustomButton(
            modifier = Modifier
                .fillMaxWidth(),
            text = "에러 스낵바 테스트",
            onClick = {
                onShowErrorSnackbar(Throwable("테스트 오류"))
            }
        )
    }
}

@Preview(
    widthDp = 400,
    showBackground = true
)
@Composable
internal fun TestScreenLightThemePreview() {
    AppTheme {
        TestScreen(
            padding = PaddingValues(0.dp),
            onShowErrorSnackbar = { }
        )
    }
}