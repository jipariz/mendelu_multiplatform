import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.Navigator

@Composable
fun App() {
    MaterialTheme {
        Navigator(getHomeScreen())
    }
}

expect fun getPlatformName(): String
expect fun getHomeScreen() : Screen