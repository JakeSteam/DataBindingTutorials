package uk.co.jakelee.databindingexperiments.androidhive

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import uk.co.jakelee.databindingexperiments.R
import uk.co.jakelee.databindingexperiments.databinding.AndroidhiveActivityBinding
import android.widget.Toast
import android.content.Context
import android.view.View


class AndroidHiveActivity : AppCompatActivity() {

    private var user: User? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: AndroidhiveActivityBinding = DataBindingUtil.setContentView(this, uk.co.jakelee.databindingexperiments.R.layout.androidhive_activity)

        setSupportActionBar(binding.toolbar);

        user = User("Ravi Tamada", "ravi@androidhive.info")
        binding.user = user
        binding.content.handlers = MyClickHandlers(this)
    }

    inner class MyClickHandlers(internal var context: Context) {

        fun onFabClicked(view: View) {
            Toast.makeText(applicationContext, "FAB clicked!", Toast.LENGTH_SHORT).show()
        }

        fun onButtonClick(view: View) {
            Toast.makeText(applicationContext, "Button clicked!", Toast.LENGTH_SHORT).show()
        }

        fun onButtonClickWithParam(view: View, user: User) {
            Toast.makeText(applicationContext, "Button clicked! Name: " + user.name, Toast.LENGTH_SHORT).show()
        }

        fun onButtonLongPressed(view: View): Boolean {
            Toast.makeText(applicationContext, "Button long pressed!", Toast.LENGTH_SHORT).show()
            return false
        }
    }
}