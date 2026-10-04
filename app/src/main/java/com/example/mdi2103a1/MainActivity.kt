package com.example.mdi2103a1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableDoubleStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mdi2103a1.ui.theme.MDI2103A1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BakeryRevenueScreen()

        }
    }
}


// CHALLENGE 3
@Composable
fun BakeryRevenueScreen() {
    val currencySymbol = "$"
    var cookiesSold by remember { mutableStateOf("") }
    var cookiePrice by remember { mutableStateOf("") }
    // CHALLENGE 6
    var muffinsSold by remember { mutableStateOf("") }
    var muffinPrice by remember { mutableStateOf("") }
    var cakesSold by remember { mutableStateOf("") }
    var cakePrice by remember { mutableStateOf("") }


    // DATA STRUCTURE
    val bakeryItems = remember { mutableListOf<BakeryItem>() }
    var totalRevenue by remember { mutableDoubleStateOf(0.0) }
    var bestSellingItem by remember { mutableStateOf("") }
    var errorMessage by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Bakery Revenue Calculator",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(top = 16.dp)
        )

        Text(
            text = "Enter the sales information for each product",
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        // CHALLENGE 7
        // COOKIES
        OutlinedTextField(
            value = cookiesSold,
            onValueChange = { cookiesSold = it },
            label = { Text("Cookies sold") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = cookiePrice,
            onValueChange = { cookiePrice = it },
            label = { Text("Price per cookie") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        // CHALLENGE 8
        // MUFFINS
        OutlinedTextField(
            value = muffinsSold,
            onValueChange = { muffinsSold = it },
            label = { Text("Muffins sold") },
            modifier = Modifier.fillMaxWidth()

        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = muffinPrice,
            onValueChange = { muffinPrice = it },
            label = { Text("Price per muffin") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        // CHALLENGE 9
        // CAKES
        OutlinedTextField(
            value = cakesSold,
            onValueChange = { cakesSold = it },
            label = { Text("Cakes sold") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = cakePrice,
            onValueChange = { cakePrice = it },
            label = { Text("Price per cake") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))
    }

}

@Preview(showBackground = true)
@Composable
fun BakeryRevenueScreenPreview() {
    BakeryRevenueScreen()
}