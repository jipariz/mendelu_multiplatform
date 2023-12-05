import androidx.compose.ui.window.ComposeUIViewController
import cafe.adriel.voyager.core.screen.Screen

actual fun getPlatformName(): String = "iOS"
actual fun getHomeScreen(): Screen = ListScreen

fun MainViewController() = ComposeUIViewController { App() }