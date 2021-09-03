package com.shobanasha.ktjetpackopps

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.shobanasha.ktjetpackopps.ui.theme.KotlinTrainingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            /* setContent Params is the composable() */

            KotlinTrainingTheme {
                // A surface container using the 'background' color from the theme
                Surface(Modifier.fillMaxSize(), color = colorResource(id = R.color.white)) {
                    OPPSConcepts()
                }
            }
        }
    }
}

@Composable
fun OPPSConcepts() {
    /* get context inside the composable() */
    val context = LocalContext.current
    /* Text is also composable() */
    Text(
        text = "Class and Object",
        fontSize = 20.sp,
        fontFamily = FontFamily.Cursive,
        color = colorResource(id = R.color.black_alpha_100),
        /* modifier are the like layout properties */
        modifier = Modifier.clickable {
            Log.v("MainActivity", "Class and Objects Clicked")
            Toast.makeText(context, "Class and Objects Clicked", Toast.LENGTH_SHORT).show()
        }
    )
}

/* Show background is true background show full screen */
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    KotlinTrainingTheme {
        Surface(Modifier.fillMaxSize()) {
            OPPSConcepts()
        }
    }
}