package uk.co.jakelee.databindingexperiments.mindorks

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import uk.co.jakelee.databindingexperiments.R
import uk.co.jakelee.databindingexperiments.databinding.MindorksActivityBinding


class MindorksActivity : AppCompatActivity() {
    private var binding: MindorksActivityBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.mindorks_activity)
        binding!!.textviewDefault.setText("Hello to a New Word!")
    }
}