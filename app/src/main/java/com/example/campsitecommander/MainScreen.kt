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
               Button(
                   onClick = {

                   }
               ) {
                    Text(text = "Add gear")
                    
                }
                var item = "Tent, Marshmallow, Flashlight"
                var category = "Shelter, Food, Safety"
                var quantity = "1, 3, 2"
                var comment = "4-person waterproof, For mega size, Check batteries"

                val totalitems = 3

            }
            setBackgroundColor("#0000")

        }

    }

    fun setBackgroundColor(string: String) {}
}


