package com.somnwal.app.feature.test

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.AlertDialog
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.somnwal.app.core.designsystem.component.common.CustomButton
import com.somnwal.app.core.designsystem.component.common.CustomDialog
import com.somnwal.app.core.designsystem.component.common.CustomLoadingBar
import com.somnwal.app.core.designsystem.component.common.CustomTextField
import com.somnwal.app.core.designsystem.component.common.CustomTitle
import com.somnwal.app.core.designsystem.theme.AppTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

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
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues = padding)
    ) {
        val scrollState = rememberScrollState()

        var alertTestShowDialog by remember { mutableStateOf(false) }

        var loadingBarTestShowLoadingBar by remember { mutableStateOf(false) }
        val laodingBarTestCoroutineScope = rememberCoroutineScope()

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
                .verticalScroll(scrollState)
        ) {
            CustomTitle(text = "전자서명 테스트")

            CustomTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        horizontal = 4.dp
                    ),
                label = "원문",
                value = "",
                onValueChange = { }
            )

            CustomTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        horizontal = 4.dp
                    ),
                label = "전자서명문",
                value = "",
                onValueChange = { }
            )

            CustomButton(
                modifier = Modifier
                    .fillMaxWidth(),
                text = "전자서명",
                onClick = {

                }
            )

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

            CustomTitle(text = "기본 테스트")

            CustomButton(
                modifier = Modifier
                    .fillMaxWidth(),
                text = "알럿 테스트",
                onClick = {
                    alertTestShowDialog = true
                }
            )

            // 알럿 다이얼로그
            CustomDialog(
                visible = alertTestShowDialog,
                title = "알림",
                content = "테스트 알럿 표시됨",
                confirmButtonText = "확인",
                cancelButtonText = "취소",
                onConfirm = { alertTestShowDialog = false },
                onCancel = { alertTestShowDialog = false },
                onDismiss = { alertTestShowDialog = false }
            )

            CustomButton(
                modifier = Modifier
                    .fillMaxWidth(),
                text = "에러 스낵바 테스트",
                onClick = {
                    onShowErrorSnackbar(Throwable("테스트 오류"))
                }
            )

            CustomButton(
                modifier = Modifier
                    .fillMaxWidth(),
                text = "로딩바 테스트 (1초)",
                onClick = {
                    laodingBarTestCoroutineScope.launch {
                        loadingBarTestShowLoadingBar = true
                        delay(1000)
                        loadingBarTestShowLoadingBar = false
                    }
                }
            )
        }

        CustomLoadingBar(visible = loadingBarTestShowLoadingBar)
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