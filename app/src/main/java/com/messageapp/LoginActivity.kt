package com.messageapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.messageapp.ui.theme.MessageAppTheme
import com.messageapp.ui.theme.green

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    val userName = remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Column(Modifier.padding(10.dp)) {
            Box(modifier = Modifier.fillMaxWidth()) {

                Text(
                    text = stringResource(R.string.log_in),
                    fontSize = 30.sp,
                    fontWeight = FontWeight(600),
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
                Text(
                    text = stringResource(R.string.sign_up),
                    fontSize = 16.sp,
                    fontWeight = FontWeight(500),
                    color = green,
                    modifier = Modifier
                        .align(Alignment.CenterEnd)
                )
            }

            Row {
                TextField(value = userName.value,
                    onValueChange = {
                        userName.value = it
                    },
                    placeholder = { Text(text = "Email or Phone number") }
                )
            }
        }
    }

}


@Composable
fun GreetingPreview() {
    MessageAppTheme {
        // Greeting()
        // StyleTextField()
    }
}

@Preview(showBackground = true)
@Composable
fun StyleTextField(
    /* value: String,
     onChangeValue: (String) -> Unit,
     modifier: Modifier,
     hint: String,*/

) {
    val userName = remember { mutableStateOf(" ") }

    /*BasicTextField(
        value = userName.value,
        onValueChange = {
                        userName.value = it
        },
        placeholder = {},

    )*/
}