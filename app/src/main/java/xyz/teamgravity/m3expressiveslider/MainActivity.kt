package xyz.teamgravity.m3expressiveslider

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.RangeSlider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.VerticalSlider
import androidx.compose.material3.rememberRangeSliderState
import androidx.compose.material3.rememberSliderState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import xyz.teamgravity.m3expressiveslider.ui.theme.M3ExpressiveSliderTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            M3ExpressiveSliderTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { padding ->
                    Column(
                        verticalArrangement = Arrangement.spacedBy(10.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(padding)
                            .padding(16.dp)
                    ) {
                        Slider(
                            state = rememberSliderState(
                                value = 0.5F,
                                steps = 10
                            )
                        )
                        RangeSlider(
                            state = rememberRangeSliderState(
                                activeRangeStart = 0.4F,
                                activeRangeEnd = 0.6F,
                                steps = 10
                            )
                        )
                        VerticalSlider(
                            state = rememberSliderState(
                                value = 0.2F,
                                steps = 10
                            ),
                            reverseDirection = true
                        )
                    }
                }
            }
        }
    }
}