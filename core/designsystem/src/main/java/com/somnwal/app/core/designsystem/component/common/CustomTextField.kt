package com.somnwal.app.core.designsystem.component.common

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.somnwal.app.core.designsystem.theme.Toss
import com.somnwal.app.core.designsystem.theme.TossGray
import com.somnwal.app.core.designsystem.theme.White

@Composable
fun CustomTextField(
    modifier: Modifier = Modifier,
    label: String,
    value: String,
    onValueChange: (String) -> Unit
) {
    OutlinedTextField(
        modifier = modifier
            .padding(4.dp),
        shape = RoundedCornerShape(10.dp),
        label = {
            Text(
                text = label
            )
        },
        value = value,
        onValueChange = onValueChange,

    )
}

@Preview(
    widthDp = 400,
    heightDp = 200,
    showBackground = true
)
@Composable
internal fun CustomTextFieldPreview() {
    Column (
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
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
    }
}