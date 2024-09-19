package com.somnwal.app.feature.test.testcase

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.somnwal.app.core.designsystem.component.common.CustomBottomSheet
import com.somnwal.app.core.designsystem.component.common.CustomButton
import com.somnwal.app.core.designsystem.component.common.CustomDialog
import com.somnwal.app.core.designsystem.component.common.CustomTitle
import com.somnwal.app.core.designsystem.theme.AppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BasicTest(
    onShowErrorSnackbar: (Throwable?) -> Unit,
    doLoadingBarTest: () -> Unit,
) {
    var showAlert by remember { mutableStateOf(false) }
    var showBottomSheet by remember { mutableStateOf(false) }

    /** ====================================================================================
     * 기본 테스트
     * ================================================================================== */
    CustomTitle(text = "기본 테스트")

    CustomButton(
        modifier = Modifier
            .fillMaxWidth(),
        text = "알럿 테스트",
        onClick = {
            showAlert = true
        }
    )

    // 알럿 다이얼로그
    CustomDialog(
        visible = showAlert,
        title = "알림",
        content = "테스트 알럿 표시됨",
        confirmButtonText = "확인",
        cancelButtonText = "취소",
        onConfirm = { showAlert = false },
        onCancel = { showAlert = false },
        onDismiss = { showAlert = false }
    )

    // 바텀시트
    CustomBottomSheet(
        onDismiss = {

        }
    ) {

    }

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
            doLoadingBarTest()
        }
    )

    CustomButton(
        modifier = Modifier
            .fillMaxWidth(),
        text = "애니메이션 팝업 테스트",
        onClick = {

        }
    )

    CustomButton(
        modifier = Modifier
            .fillMaxWidth(),
        text = "Bottom Sheet 테스트",
        onClick = {
            showBottomSheet = true
        }
    )
}

@Preview(
    widthDp = 400,
    showBackground = true
)
@Composable
internal fun BasicTestLightThemePreview() {
    AppTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        ) {
            BasicTest(
                onShowErrorSnackbar = { },
                doLoadingBarTest = { }
            )
        }
    }
}