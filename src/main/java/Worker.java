import enums.WorkerLevel;

import java.util.ArrayList;
import java.util.List;

public class Worker {

    private String name;

    public Worker(String name, WorkerLevel workerLevel, Double baseSalary, Department department) {
        this.name = name;
        this.workerLevel = workerLevel;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    private WorkerLevel workerLevel;
    private Double baseSalary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getWorkerLevel() {
        return workerLevel;
    }

    public void setWorkerLevel(WorkerLevel workerLevel) {
        this.workerLevel = workerLevel;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public List<HourContract> getHourContractList() {
        return hourContractList;
    }


    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    private List<HourContract> hourContractList = new ArrayList<HourContract>();
    private Department department;

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", workerLevel=" + workerLevel +
                ", baseSalary=" + baseSalary +
                ", hourContractList=" + hourContractList +
                ", department=" + department +
                '}';
    }

    public void addContract(HourContract hourContract){
        hourContractList.add(hourContract);
    }
    public void removerContract(HourContract hourContract){
        hourContractList.remove(hourContract);
    }
}
