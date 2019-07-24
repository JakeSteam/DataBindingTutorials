package uk.co.jakelee.databindingexperiments.vogella

import android.content.Context
import android.content.Intent



class TemperatureActivityPresenter(private val view: TemperatureActivityContract.View, private val ctx: Context) :
    TemperatureActivityContract.Presenter {

    override fun onShowData(temperatureData: TemperatureData) {
        view.showData(temperatureData)
    }

    override fun showList() {
        val i = Intent(ctx, SecondActivity::class.java)
        i.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        ctx.startActivity(i)
    }
}