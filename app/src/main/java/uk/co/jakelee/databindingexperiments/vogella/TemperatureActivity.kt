package uk.co.jakelee.databindingexperiments.vogella

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import uk.co.jakelee.databindingexperiments.databinding.VogellaTempActivityBinding

class TemperatureActivity : AppCompatActivity(), TemperatureActivityContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding : VogellaTempActivityBinding = DataBindingUtil.setContentView(this, uk.co.jakelee.databindingexperiments.R.layout.vogella_temp_activity)
        binding.temp = TemperatureData("England")
        binding.presenter = TemperatureActivityPresenter(this)
    }

    override fun showData(temperatureData: TemperatureData) {
        val celsius = temperatureData.celsius
        Toast.makeText(this, celsius, Toast.LENGTH_SHORT).show()
    }

    override fun startSecondActivity() {
        //val intent = Intent(this, SecondActivity::class.java)
        //startActivity(intent)
    }

}