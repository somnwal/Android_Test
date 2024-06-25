package com.somnwal.app.core.designsystem.component.common

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CustomTitle(
    modifier: Modifier = Modifier,
    text: String
) {
    Text(
        modifier = modifier
            .fillMaxWidth()
            .padding(20.dp),
        text = text,
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold
    )
}

@Preview(
    widthDp = 400,
    heightDp = 200,
    showBackground = true
)
@Composable
internal fun CustomTitlePreview() {
    Column (
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        CustomTitle(
            modifier = Modifier
                .fillMaxWidth(),
            text = "테스트",
        )
    }
}