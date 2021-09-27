package list.exec.entities;

import list.exec.entities.enums.Months;

public class Temp {
    private Months month;
    private double temp;


    public Temp(){}
    public Temp(Months month, double temp){
        this.month = month;
        this.temp = temp;
    }
    @Override
    public String toString(){
        StringBuilder sd = new StringBuilder();
        sd.append("Month: " + this.getMonth());
        sd.append(", Temperature: " + this.getTemp());
        return sd.toString();
    }
    public Months getMonth() {
        return month;
    }

    public void setMonth(Months month) {
        this.month = month;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }
}
