package com.example.campsitecommander

import android.os.Bundle
import android.text.style.BackgroundColorSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Constraints
import com.example.campsitecommander.ui.theme.CampsiteCommanderTheme

class MainScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CampsiteCommanderTheme {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Add gear")
                }
                var item = "Tent"
                var category = "Shelter"
                var quality = "1"
                var comment = "4-person waterproof"
                var item2 = "Marshmallows"
                var category2 = "Food"
                var quality2 = "3"
                var comment2 = "For Mega size"
                var item3 = "Flashlight"
                var category3 = "Safety"
                var quality3 = "3"
                var comment3 = "Check batteries"

                }

            }

        }
    }


