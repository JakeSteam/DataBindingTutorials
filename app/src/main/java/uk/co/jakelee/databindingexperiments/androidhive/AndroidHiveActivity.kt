package uk.co.jakelee.databindingexperiments.androidhive

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import uk.co.jakelee.databindingexperiments.R
import uk.co.jakelee.databindingexperiments.databinding.AndroidhiveActivityBinding


class AndroidHiveActivity : AppCompatActivity() {

    private var user: User? = null
    private var handlers: MyClickHandlers? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: AndroidhiveActivityBinding = DataBindingUtil.setContentView(this, R.layout.androidhive_activity)

        setSupportActionBar(binding.toolbar);

        user = User()
        user!!.name.set("Original name")
        user!!.email.set("Original.email@email.com")
        user!!.profileImage = "https://via.placeholder.com/350x350"
        binding.user = user

        handlers = MyClickHandlers(this)
        binding.content.handlers = handlers
    }

    inner class MyClickHandlers(internal var context: Context) {

        fun onFabClicked(view: View) {
            user!!.name.set("New name")
            user!!.email.set("New.email@email.com")
        }

        fun onButtonClick(view: View) {
            Toast.makeText(context, "Button clicked!", Toast.LENGTH_SHORT).show()
        }

        fun onButtonClickWithParam(view: View, user: User) {
            Toast.makeText(context, "Button clicked! Name: " + user.name.get(), Toast.LENGTH_SHORT).show()
        }

        fun onButtonLongPressed(view: View): Boolean {
            Toast.makeText(context, "Button long pressed!", Toast.LENGTH_SHORT).show()
            return false
        }
    }
}