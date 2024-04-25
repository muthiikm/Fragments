package com.example.refugee_onboarding
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@Composable
fun LoginScreen() {
        Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
        ) {
                CircularAvatar(
                        painter = painterResource(id = R.drawable.refugee),
                        contentDescription = "refugee",
                        modifier = Modifier.size(200.dp)
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(text = "Welcome please Login to continue")
                Spacer(modifier = Modifier.height(20.dp))
                OutlinedTextField(value = "", onValueChange ={}, label = {
                        Text(text = "Email Address")

                } )
                Spacer(modifier = Modifier.height(20.dp))
                OutlinedTextField(value = "", onValueChange ={}, label = {
                        Text(text = "Password")
                } )
                Spacer(modifier = Modifier.height(20.dp))

                Button(onClick = {}) {
                      Text(text = "Login")
                }
                Spacer(modifier = Modifier.height(20.dp))

                Button(onClick = {}) {
                        Text(text = "Forgot password")
                }
                Spacer(modifier = Modifier.height(20.dp))

                Button(onClick = {}) {
                        Text(text = "Reset password")
                }
        }
}

@Composable
fun CircularAvatar(
        painter: Painter,
        contentDescription: String?,
        modifier: Modifier = Modifier,
        size: Int = 250,
) {
        Surface(
                modifier = modifier
                        .size(size.dp)
                        .clip(CircleShape)
        ) {
                Image(
                        painter = painter,
                        contentDescription = contentDescription,
                        contentScale = ContentScale.Crop
                )
        }
}
