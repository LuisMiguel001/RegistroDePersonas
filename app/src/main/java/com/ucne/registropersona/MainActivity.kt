package com.ucne.registropersona

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ucne.registropersona.ui.theme.RegistroPersonaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RegistroPersonaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                }
            }
        }
    }
}

@Composable
fun Registro(modifier: Modifier = Modifier){
    Text(
        text = "Registro de personas",
        modifier = modifier
            .padding(10.dp)
    )
    OutlinedTextField(value = "",
        onValueChange = {},
        placeholder ={
            Text(text = "Nombres")
        },
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 45.dp, horizontal = 8.dp)
    )
    OutlinedTextField(value = "",
        onValueChange = {},
        placeholder ={
            Text(text = "Telefono")
        },
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 110.dp, horizontal = 8.dp)
    )
    OutlinedTextField(value = "",
        onValueChange = {},
        placeholder ={
            Text(text = "Celular")
        },
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 175.dp, horizontal = 8.dp)
    )
    OutlinedTextField(value = "",
        onValueChange = {},
        placeholder ={
            Text(text = "Email")
        },
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 240.dp, horizontal = 8.dp)
    )
    OutlinedTextField(value = "",
        onValueChange = {},
        placeholder ={
            Text(text = "Dirección")
        },
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 305.dp, horizontal = 8.dp)
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    RegistroPersonaTheme {
        Registro()
    }
}