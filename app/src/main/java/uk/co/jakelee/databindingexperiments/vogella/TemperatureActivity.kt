package uk.co.jakelee.databindingexperiments.vogella

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import uk.co.jakelee.databindingexperiments.R
import uk.co.jakelee.databindingexperiments.databinding.VogellaTempActivityBinding

class TemperatureActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val temperatureData = TemperatureData("England", "55")
        val binding : VogellaTempActivityBinding = DataBindingUtil.setContentView(this, R.layout.vogella_temp_activity);
        binding.temp = temperatureData
    }
}