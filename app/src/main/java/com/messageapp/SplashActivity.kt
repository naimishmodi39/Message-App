package com.messageapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.messageapp.ui.theme.MessageAppGreenTheme
import kotlinx.coroutines.delay

@SuppressLint("CustomSplashScreen")
class SplashActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MessageAppGreenTheme {
                SplashScreen()
            }
        }

    }


    @Preview
    @Composable
    private fun SplashScreen() {
        LaunchedEffect(key1 = true) {
            delay(2000)
            startActivity(Intent(this@SplashActivity, LoginActivity::class.java))
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = colorResource(id = R.color.splash_green)),
            contentAlignment = Alignment.Center,
        ) {

            Column(modifier = Modifier.wrapContentSize()) {
                Image(
                    painter = painterResource(id = R.drawable.splash_messages_icon),
                    modifier = Modifier
                        .size(100.dp)
                        .align(Alignment.CenterHorizontally),
                    contentDescription = stringResource(R.string.image_description_this_is_the_splash_screen_icon)
                )

                Text(
                    text = stringResource(R.string.text_message),
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    maxLines = 1
                )
            }
        }
    }
}