package uk.co.jakelee.databindingexperiments.codelabs.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import uk.co.jakelee.databindingexperiments.R
import uk.co.jakelee.databindingexperiments.codelabs.data.SimpleViewModel
import uk.co.jakelee.databindingexperiments.databinding.CodelabsPlainActivityBinding

/**
 * Plain old activity with lots of problems to fix.
 */
class PlainOldActivity : AppCompatActivity() {

    // Obtain ViewModel from ViewModelProviders
    private val viewModel by lazy {
        ViewModelProviders.of(this).get(SimpleViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding : CodelabsPlainActivityBinding = DataBindingUtil.setContentView(this, R.layout.codelabs_plain_activity)

        binding.lifecycleOwner = this
        binding.viewmodel = viewModel
    }
}