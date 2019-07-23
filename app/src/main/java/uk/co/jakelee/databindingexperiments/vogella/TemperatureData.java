package uk.co.jakelee.databindingexperiments.vogella;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import uk.co.jakelee.databindingexperiments.BR;

public class TemperatureData extends BaseObservable {
    private String celsius;

    public TemperatureData(String celsius) {
        this.celsius = celsius;
    }

    @Bindable
    public String getCelsius() {
        return celsius;
    }

    public void setCelsius(String celsius) {
        this.celsius = celsius;
        notifyPropertyChanged(BR.celsius);
    }

}
