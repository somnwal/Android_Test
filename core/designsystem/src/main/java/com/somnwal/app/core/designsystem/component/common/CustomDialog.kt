package com.somnwal.app.core.designsystem.component.common

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.somnwal.app.core.designsystem.theme.TossGray

@Composable
fun CustomDialog(
    visible: Boolean = false,
    title: String,
    content: String,
    confirmButtonText: String,
    cancelButtonText: String,
    onConfirm: () -> Unit,
    onCancel: () -> Unit,
    onDismiss: () -> Unit,
) {
    if(visible) {
        AlertDialog(
            title = {
                Text(
                    text = title
                )
            },
            text = {
                Text(
                    text = content
                )
            },
            confirmButton = {
                CustomButton(
                    text = confirmButtonText,
                    onClick = onConfirm
                )
            },
            dismissButton = {
                CustomButton(
                    text = cancelButtonText,
                    color = TossGray,
                    onClick = onCancel
                )
            },
            onDismissRequest = onDismiss,
        )
    }
}

@Preview(
    device = Devices.PHONE,
    showBackground = true
)
@Composable
internal fun CustomDialogPreview() {
    Box(
       modifier = Modifier
           .fillMaxSize()
    ) {
        CustomDialog(
            visible = true,
            title = "테스트",
            content = "테스트 내용",
            confirmButtonText = "확인",
            cancelButtonText = "취소",
            onConfirm = { },
            onCancel = { },
            onDismiss = { }
        )
    }
}