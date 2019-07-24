package uk.co.jakelee.databindingexperiments.vogella

import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import android.app.Activity
import uk.co.jakelee.databindingexperiments.R
import uk.co.jakelee.databindingexperiments.databinding.VogellaTempActivityBinding


class TemperatureActivity : Activity(), TemperatureActivityContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: VogellaTempActivityBinding = DataBindingUtil.setContentView(this, R.layout.vogella_temp_activity)
        val temperatureActivityPresenter = TemperatureActivityPresenter(this, applicationContext)
        val temperatureData = TemperatureData("Hamburg", "10")
        binding.temp = temperatureData
        binding.presenter = temperatureActivityPresenter
    }

    override fun showData(temperatureData: TemperatureData) {
        val celsius = temperatureData.getCelsius()
        Toast.makeText(this, celsius, Toast.LENGTH_SHORT).show()
    }

}