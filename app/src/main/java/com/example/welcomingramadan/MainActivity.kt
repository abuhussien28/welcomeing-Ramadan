package com.example.welcomingramadan

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.welcomingramadan.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    var player: MediaPlayer?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        playAudio()
    }
    private fun playAudio(){
        if (player==null){
            player= MediaPlayer.create(this,R.raw.hello)
            player!!.isLooping=true
            player!!.start()
        }
        else{
            player!!.start()
        }
    }
    override fun onPause() {
        super.onPause()
        player?.pause()
    }
    override fun onResume() {
        super.onResume()
        player?.start()
    }
}