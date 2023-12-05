import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import cafe.adriel.voyager.core.screen.Screen

object ListDetailScreen : Screen {
    @Composable
    override fun Content() {
        var selectedItem by remember { mutableStateOf<Int?>(null) }
        Row{
            List{
                selectedItem = it
            }
            selectedItem?.let {
                Detail("Item $it", "Description $it")
            }
        }
    }
}