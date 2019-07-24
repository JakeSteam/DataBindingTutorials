package uk.co.jakelee.databindingexperiments.vogella

import android.content.Context

class TemperatureActivityPresenter(private val view: TemperatureActivityContract.View, private val ctx: Context) :
    TemperatureActivityContract.Presenter {

    override fun onShowData(temperatureData: TemperatureData) {
        view.showData(temperatureData)
    }

}