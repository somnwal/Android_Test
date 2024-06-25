package com.somnwal.app.core.designsystem.component.common

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.somnwal.app.core.designsystem.theme.Toss
import com.somnwal.app.core.designsystem.theme.White

@Composable
fun CustomButton(
    modifier: Modifier = Modifier,
    text: String,
    color: Color? = null,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier
            .padding(4.dp),
        shape = RoundedCornerShape(8.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = color?.let { color } ?: Toss,
        ),
        onClick = onClick,
    ) {
        Text(
            text = text
        )
    }
}

@Preview(
    widthDp = 400,
    heightDp = 200,
    showBackground = true
)
@Composable
internal fun CustomButtonPreview() {
    Column (
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        CustomButton(
            modifier = Modifier
                .fillMaxWidth(),
            text = "테스트",
            onClick = { },
        )
    }
}