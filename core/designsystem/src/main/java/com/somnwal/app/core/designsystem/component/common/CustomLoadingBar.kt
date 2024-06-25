package com.somnwal.app.core.designsystem.component.common

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CustomLoadingBar(
    modifier: Modifier = Modifier,
    visible: Boolean = true
) {
    if(visible) {
        Box(
            modifier = modifier
                .fillMaxSize()
                .background(
                    brush = SolidColor(Color.Black.copy(alpha = 0.5f)),
                ),
            contentAlignment = Alignment.Center
        ) {
            CircularProgressIndicator()
        }
    }
}

@Preview(
    showBackground = true,
    widthDp = 100,
    heightDp = 100,
)
@Composable
internal fun CustomLoadingBarPreview() {
    CustomLoadingBar()
}