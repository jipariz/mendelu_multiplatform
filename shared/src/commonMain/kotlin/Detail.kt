import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import cafe.adriel.voyager.core.screen.Screen

@Composable
fun Detail(item: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(text = item, fontWeight = FontWeight.Bold)
    }
}

data class DetailsScreen(val item: String) : Screen {

    @Composable
    override fun Content() {
        Detail(item, Modifier)
    }
}