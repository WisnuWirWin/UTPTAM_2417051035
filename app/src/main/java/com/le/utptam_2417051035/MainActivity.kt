package com.le.utptam_2417051035

import com.le.utptam_2417051035.Model.Video
import com.le.utptam_2417051035.Model.VideoSource
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.le.utptam_2417051035.ui.theme.UTPTAM_2417051035Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UTPTAM_2417051035Theme {
                daftarVideoYT()
            }
        }
    }
}

@Composable
fun daftarVideoYT() {
    LazyColumn() {
        items(VideoSource.dummyVideos) { video ->
            detailVideo(video = video)
            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}

@Composable
fun detailVideo(video: Video){
    Column(modifier = Modifier.fillMaxWidth()) {
        Image(
            painter = painterResource(id = video.imageRes),
            contentDescription = video.id,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(420.dp)
                .height(200.dp)
        )
        Row() {
            Image(
                painter = painterResource(R.drawable.ic_launcher_foreground),
                contentDescription = "Profile",
                modifier = Modifier
                    .size(50.dp)
            )
            Column() {
                Text(
                    text = video.title,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.padding(top = 7.dp, bottom = 5.dp)
                )
                Row() {
                    Text(
                        text = video.channelName,
                        fontWeight = FontWeight.ExtraLight,
                        modifier = Modifier.padding(end = 5.dp)
                    )
                    Text(
                        text = "•",
                        modifier = Modifier.padding(end = 5.dp)
                    )
                    Text(
                        fontFamily = FontFamily.SansSerif,
                        text = video.views,
                        fontWeight = FontWeight.ExtraLight,
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    UTPTAM_2417051035Theme {
        daftarVideoYT()
    }
}