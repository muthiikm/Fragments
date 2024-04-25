package com.example.refugee_onboarding.upload
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material.icons.outlined.Face
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.refugee_onboarding.CircularAvatar
import com.example.refugee_onboarding.R
import com.example.refugee_onboarding.ui.theme.ButtonColor
import com.example.refugee_onboarding.ui.theme.CardBack
import com.example.refugee_onboarding.ui.theme.Maroon

@Composable


fun Upload2(){
    val appColor = Maroon
    val cardback = CardBack
    val maroon = Maroon
    val buttonColor = ButtonColor
    Column() {
        Box( modifier = Modifier
            .background(color = appColor)
            .size(width = 450.dp, height = 50.dp)
            .clip(RoundedCornerShape(0.dp))  ){


            Text(text = "Register Refugee",
                color = Color.White ,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(vertical =10.dp, horizontal = 130.dp )                   )

        }

        Spacer(modifier = Modifier.height(30.dp))


        Card(modifier = Modifier
            .align(Alignment.CenterHorizontally)
            .size(height = 231.dp, width = 310.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(color = cardback)


        ) {
            Column {

                Box( modifier = Modifier
                    .background(color = appColor)
                    .size(width = 310.dp, height = 30.dp)
                    .clip(RoundedCornerShape(75.dp))  ){


                    Text(text = "Fingerprint",
                        color = Color.White ,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(vertical =5.dp, horizontal = 10.dp )                   )

                }

                Spacer(modifier = Modifier.height(30.dp))
                CircularAvatar(
                    painter = painterResource(id = R.drawable.img_1),
                    contentDescription = "fingerprint",
                    modifier = Modifier
                        .size(100.dp)
                        .align(Alignment.CenterHorizontally)
                )

                Spacer(modifier = Modifier.height(30.dp))

                IconButton(
                    modifier = Modifier
                        .size(width = 150.dp, height = 40.dp)
                        .background(color = ButtonColor)
                        .clip(RoundedCornerShape(5.dp))
                        .align(Alignment.CenterHorizontally)
                    ,

                    onClick = { /*TODO*/ }) {
                    Text(text = "Upload",
                        color = Color.White)
                }

            }

        }
        Spacer(modifier = Modifier.height(70.dp))

        Card(modifier = Modifier
            .align(Alignment.CenterHorizontally)
            .size(height = 231.dp, width = 310.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(color = cardback)





        ) {
            Column {
                Box( modifier = Modifier
                    .background(color = appColor)
                    .size(width = 310.dp, height = 30.dp)
                    .clip(RoundedCornerShape(75.dp))  ){


                    Text(text = "Signature",
                        color = Color.White ,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(vertical =5.dp, horizontal = 10.dp )                   )

                }

                Spacer(modifier = Modifier.height(30.dp))

                CircularAvatar(
                    painter = painterResource(id = R.drawable.img_2),
                    contentDescription = "fingerprint",
                    modifier = Modifier
                        .size(100.dp)
                        .align(Alignment.CenterHorizontally)                   )

                Spacer(modifier = Modifier.height(30.dp))

                IconButton(
                    modifier = Modifier
                        .size(width = 150.dp, height = 40.dp)
                        .background(color = ButtonColor)
                        .clip(RoundedCornerShape(5.dp))
                        .align(Alignment.CenterHorizontally)
                    ,

                    onClick = { /*TODO*/ }) {
                    Text(text = "Upload",
                        color = Color.White)

                }

            }



        }
        Spacer(modifier = Modifier.height(80.dp))

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.End
        ) {
            IconButton(
                modifier = Modifier
                    .padding(vertical = 5.dp, horizontal = 16.dp)
                    .size(width = 150.dp, height = 40.dp)
                    .background(color = maroon)
                    .clip(RoundedCornerShape(5.dp)),
                onClick = { /*TODO*/ }
            ) {
                Text(text = "Submit", color = Color.White)
            }
        }



    }




}