package uk.co.jakelee.databindingexperiments.vogella

class TemperatureActivityPresenter(private val view: TemperatureActivityContract.View) : TemperatureActivityContract.Presenter {

    override fun onShowData(temperatureData: TemperatureData) {
        view.showData(temperatureData)
    }

    override fun showList() {
        view.startSecondActivity()
    }
}