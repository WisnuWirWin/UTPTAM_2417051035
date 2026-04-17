package com.le.utptam_2417051035.Model
import com.le.utptam_2417051035.R

data class Video(
    val id : String,
    val title : String,
    val channelName : String,
    val views : String,
    val duration : String,
    val imageRes : Int
)

object VideoSource{
    val dummyVideos = listOf(
        Video(id = "1",  "Pohon Benci Kamu...", "Windah Barusadar", "102k x ditonton", "12:30",R.drawable.windah),
        Video(id = "2",  "Lets Learn Kotlin!!!", "wasawho", "55k x ditonton", "24:10",R.drawable.wasa),
        Video(id = "3",  "Penjelasan dokter tirta tentang doomscrolling dan syaraf terjepit", "MALAKA", "1M x ditonton", "08:15",R.drawable.tirta),
        Video(id = "4",  "Ayo bersih bersih laut!!", "MiawAug", "120k x ditonton", "45:00",R.drawable.miawaug),
        Video(id = "5",  "JUJUR GUA KAGET", "Mamank Kuliner", "89k x ditonton", "16:20",R.drawable.mamank)
    )
}
