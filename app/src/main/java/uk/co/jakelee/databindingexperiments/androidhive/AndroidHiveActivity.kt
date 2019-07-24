package uk.co.jakelee.databindingexperiments.androidhive

import androidx.databinding.DataBindingUtil
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import uk.co.jakelee.databindingexperiments.databinding.AndroidhiveActivityBinding
import uk.co.jakelee.databindingexperiments.R


class AndroidHiveActivity : AppCompatActivity() {

    private var user: User? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: uk.co.jakelee.databindingexperiments.databinding.AndroidhiveActivityBinding = DataBindingUtil.setContentView(this, R.layout.androidhive_activity)

        user = User("Ravi Tamada", "ravi@androidhive.info")
        binding.setUser(user)
    }
}