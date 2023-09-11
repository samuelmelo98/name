import java.util.Date;

public class HourContract {
private Date data;
private Double valuePerHour;
private Integer hours;

    public HourContract(Double valuePerHour, Integer hours) {
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public Double totalValue(){
    return null;
}

    @Override
    public String toString() {
        return "HourContract{" +
                "data=" + data +
                ", valuePerHour=" + valuePerHour +
                ", hours=" + hours +
                '}';
    }
}
