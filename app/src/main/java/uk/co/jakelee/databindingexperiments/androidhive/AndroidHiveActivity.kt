package uk.co.jakelee.databindingexperiments.androidhive

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import uk.co.jakelee.databindingexperiments.R
import uk.co.jakelee.databindingexperiments.databinding.AndroidhiveActivityBinding


class AndroidHiveActivity : AppCompatActivity() {

    private var user: User? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: AndroidhiveActivityBinding = DataBindingUtil.setContentView(this, R.layout.androidhive_activity)

        setSupportActionBar(binding.toolbar);

        user = User("Ravi Tamada", "ravi@androidhive.info")
        binding.user = user
    }
}