package uk.co.jakelee.databindingexperiments.vogella

interface TemperatureActivityContract {
    interface Presenter {
        fun onShowData(temperatureData: TemperatureData)
    }

    interface View {
        fun showData(temperatureData: TemperatureData)
    }

}