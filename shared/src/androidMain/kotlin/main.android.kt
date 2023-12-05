import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen

actual fun getPlatformName(): String = "Android"
actual fun getHomeScreen(): Screen = ListScreen

@Composable fun MainView() = App()
