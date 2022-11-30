package com.example.weatherapp.ui

import androidx.compose.runtime.Composable
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.Modifier
import com.example.weatherapp.R



<<<<<<< Updated upstream


@Composable
fun CurrentConditions(
=======
) {

    val state by viewModel.currentConditions.collectAsState(null)

    LaunchedEffect(Unit) {
        viewModel.fetchData()
    }

    Scaffold (
        topBar = { AppBar(title = "WeatherApp")},
    ) {
        state?.let {
            CurrentConditionsContent(it) {
                onForecastButtonClick()
            }
        }
    }
}


@Composable
fun CurrentConditionsContent(
    currentConditions: CurrentConditions,
>>>>>>> Stashed changes
    onForecastButtonClick: () -> Unit,
) {
    Column(
        modifier = Modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(
            text = stringResource(id = R.string.city_name),
            style = TextStyle(
                fontWeight = FontWeight(600),
                fontSize = 24.sp
            )
        )
        Row(
            modifier = Modifier.padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(id = R.string.temperature, currentConditions.conditionsData.temperature),
                    style = TextStyle(
                        fontWeight = FontWeight(400),
                        fontSize = 72.sp
                    )
                )
                Text(
                    text = stringResource(id = R.string.feels_like, currentConditions.conditionsData.feelsLike),
                    style = TextStyle(
                        fontWeight = FontWeight(400),
                        fontSize = 12.sp
                    )
                )
            }
            Spacer(modifier = Modifier.weight(1f, fill = true))
            Image(
                modifier = Modifier.size(72.dp),
                painter = painterResource(R.drawable.sunny),
                contentDescription = "Sunny")
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {
            val textStyle = TextStyle(
                fontSize = 16.sp
            )
            Text(text = stringResource(id = R.string.high_temp, currentConditions.conditionsData.maxTemperature), style = textStyle)
            Text(text = stringResource(id = R.string.low_temp, currentConditions.conditionsData.minTemperature), style = textStyle)
            Text(text = stringResource(id = R.string.humidity, currentConditions.conditionsData.humidity), style = textStyle)
            Text(text = stringResource(id = R.string.pressure, currentConditions.conditionsData.pressure), style = textStyle)
        }
        Spacer(modifier = Modifier.height(72.dp))
        Button(onClick = onForecastButtonClick) {
            Text(text = stringResource(id = R.string.forecast))

        }

    }
<<<<<<< Updated upstream
}

@Preview(
    showSystemUi = true
)
@Composable
fun CurrentConditionsPreview() {
    CurrentConditions {}
=======
>>>>>>> Stashed changes
}