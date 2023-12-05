import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.text.font.FontWeight
import cafe.adriel.voyager.core.model.ScreenModel
import cafe.adriel.voyager.core.model.rememberScreenModel
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import kotlin.random.Random

@Composable
fun Detail(item: String, description: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(text = item, fontWeight = FontWeight.Bold)
        Text(text = description)
    }
}

data class DetailsScreen(val item: String) : Screen {

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        val screenModel = rememberScreenModel { DetailScreenModel() }

        Scaffold(
            topBar = {
                Image(
                    modifier = Modifier.clickable { navigator.pop() },
                    painter = rememberVectorPainter(Icons.Default.ArrowBack),
                    contentDescription = ""
                )
            }
        ) {
            Detail(item, screenModel.getDescription(), Modifier)
        }
    }
}

class DetailScreenModel : ScreenModel {

    fun getDescription(): String = Random(420).toString()
}