package com.example.campsitecommander

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.campsitecommander.ui.theme.CampsiteCommanderTheme

class DetailedView : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CampsiteCommanderTheme {
                Column {

                    Button(onClick = { /*TODO*/ }) {
                        Text(text = "Full list")
                        val intent = Intent(this@DetailedView, MainScreen::class.java)
                        startActivity(intent)

                    }
                    Button(onClick = { /*TODO*/ }) {
                        Text(text = "Back to base")
                        val intent = Intent(this@DetailedView, MainScreen::class.java)
                        startActivity(intent)

                    }

                }
            }
        }
    }
}

