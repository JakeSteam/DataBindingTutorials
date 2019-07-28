package uk.co.jakelee.databindingexperiments.androidwave

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import uk.co.jakelee.databindingexperiments.R
import uk.co.jakelee.databindingexperiments.databinding.AndroidwaveActivityBinding


class AndroidWaveActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: AndroidwaveActivityBinding = DataBindingUtil.setContentView(this, R.layout.androidwave_activity)

        binding.user = User("Mr User", "101 Fake Road | England", "101K", "29")
        binding.handler = EventHandler(this)
    }
}