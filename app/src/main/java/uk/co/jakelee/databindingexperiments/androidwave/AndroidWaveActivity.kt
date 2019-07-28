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
    }
}