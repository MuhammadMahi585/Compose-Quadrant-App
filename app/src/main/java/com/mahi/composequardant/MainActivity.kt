package com.mahi.composequardant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mahi.composequardant.ui.theme.ComposeQuardantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuardantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposableDisplay()
                }
            }
        }
    }
}
@Composable
fun ComposableDisplay(){
        Column(modifier=Modifier.fillMaxSize()) {
            Row(modifier=Modifier.weight(1f)) {
                ComposableInfoCard(
                    tittle = stringResource(id = R.string.text_composable),
                    description = stringResource(id = R.string.text_composable_text), 
                    backgroundColor = colorResource(id = R.color.text_composable_color),
                    modifier = Modifier.weight(1f))
                ComposableInfoCard(
                    tittle = stringResource(id = R.string.image_composable),
                    description = stringResource(id = R.string.image_composable_text),
                    backgroundColor = colorResource(id = R.color.image_composable_color),
                    modifier = Modifier.weight(1f) )
           }
            Row(modifier = Modifier.weight(1f)){
                ComposableInfoCard(
                    tittle = stringResource(id = R.string.row_composable) ,
                    description = stringResource(id = R.string.row_composable_text),
                    backgroundColor = colorResource(id = R.color.Row_composable),
                    modifier = Modifier.weight(1f)
                )
                ComposableInfoCard(
                    tittle = stringResource(id = R.string.column_composable),
                    description = stringResource(id = R.string.column_composable_text),
                    backgroundColor = colorResource(id = R.color.column_composable),
                   modifier = Modifier.weight(1f))
            }
            
        }
    }
@Composable
private fun ComposableInfoCard(
    tittle : String,
    description : String,
    backgroundColor: Color,
    modifier: Modifier
    ) {
    Column(
        modifier =
        modifier
            .fillMaxSize()
            .background(color = backgroundColor)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Text(
            text = tittle,
            fontWeight = Bold,
            modifier=Modifier.padding(bottom = 16.dp)
        )
    Text(
        text = description
    )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeQuardantTheme {
       ComposableDisplay()
    }
}