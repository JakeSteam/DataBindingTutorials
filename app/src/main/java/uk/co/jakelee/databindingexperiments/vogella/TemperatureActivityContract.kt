package uk.co.jakelee.databindingexperiments.vogella

interface TemperatureActivityContract {
    interface Presenter {
        fun onShowData(temperatureData: TemperatureData)
        fun showList()
    }

    interface View {
        fun showData(temperatureData: TemperatureData)
        fun startSecondActivity()
    }

}