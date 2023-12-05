import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen

actual fun getPlatformName(): String = "Desktop"
actual fun getHomeScreen(): Screen = ListDetailScreen


@Composable fun MainView() = App()

@Preview
@Composable
fun AppPreview() {
    App()
}