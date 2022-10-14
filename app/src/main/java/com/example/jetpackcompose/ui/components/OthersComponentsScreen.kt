package com.example.jetpackcompose.ui.components

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme

@Composable
fun OthersComponents() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        TextComponent()
        TextFieldComponent()
        ButtonComponent()
        SwitchComponent()
        CheckBoxComponent()
        RadioButtonComponent()
        ProgressBarComponent()
    }
}

@Composable()
fun TextComponent() {
    Text(text = "Hello world", modifier = Modifier.padding(vertical = 16.dp))
}

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun TextFieldComponent() {
    val keyboardController = LocalSoftwareKeyboardController.current
    var value by remember {
        mutableStateOf("")
    }
    TextField(
        value = value,
        onValueChange = { value = it },
        modifier = Modifier.fillMaxWidth(),
        placeholder = { Text("Write here") },
        keyboardOptions = KeyboardOptions(
            imeAction = ImeAction.Done,
            keyboardType = KeyboardType.Text
        ),
        keyboardActions = KeyboardActions(
            onDone = { keyboardController?.hide() }
        )
    )
}

@Composable
fun ButtonComponent() {
    val context = LocalContext.current

    Button(onClick = {
        Toast
            .makeText(context, "Hello world", Toast.LENGTH_SHORT)
            .show()
    }, modifier = Modifier.padding(top = 16.dp)) {
        Text(text = "Show toast")
    }
}

@Composable()
fun SwitchComponent() {
    var state by remember {
        mutableStateOf(false)
    }

    Switch(
        checked = state,
        onCheckedChange = { state = !state },
        modifier = Modifier.padding(top = 16.dp)
    )
}

@Composable()
fun CheckBoxComponent() {
    var state by remember {
        mutableStateOf(false)
    }

    Checkbox(
        checked = state,
        onCheckedChange = { state = !state },
        modifier = Modifier.padding(top = 16.dp)
    )
}

@Composable()
fun RadioButtonComponent() {
    var state by remember {
        mutableStateOf(false)
    }

    RadioButton(
        selected = state,
        onClick = { state = !state },
        modifier = Modifier.padding(top = 16.dp)
    )
}

@Composable()
fun ProgressBarComponent() {
    CircularProgressIndicator(modifier = Modifier.padding(top = 16.dp))
    LinearProgressIndicator(modifier = Modifier.padding(top = 16.dp))
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    JetpackComposeTheme {
        OthersComponents()
    }
}