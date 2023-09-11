import enums.OrdemStatus;
import enums.WorkerLevel;

import javax.inject.Named;
import javax.persistence.criteria.Order;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

@Named
public class Bean2 implements Serializable {
    private Pessoa pessoa = new Pessoa("samuel",20,"ok");
    private List<String> nomes = new ArrayList<String>(asList("Samuel","Melo","1223","1234","test"));
    private String array[] = {"1","2","3"};
    private OrdemStatus ordemStatus;
    private OrdemStatus ordemStatus2;
    private Worker worker;
    private Boolean  ajax = false;
    private String string = " 7";





    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public Boolean getAjax() {
        return ajax;
    }

    public void setAjax(Boolean ajax) {
        this.ajax = ajax;
    } public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<String> getNomes() {
        return nomes;
    }

    public void setNomes(List<String> nomes) {
        this.nomes = nomes;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }
    public void init(){
        System.out.println("__________________________________Enum______________________");
        String var ="AGUARDANDO_PAGAMENTO";
        System.out.println("Enum ordemStatus =  OrdemStatus.AGUARDANDO_PAGAMENTO;");
        ordemStatus =  OrdemStatus.AGUARDANDO_PAGAMENTO;
        System.out.println(ordemStatus);
        System.out.println("------------------Passando String para enum------------------------");
        ordemStatus2 =  OrdemStatus.valueOf(var);
        System.out.println(ordemStatus2);
        worker = new Worker("samuel", WorkerLevel.MID_LEVEL, 1000.0, new Department("teste"));
        HourContract hourContract = new HourContract(100.0,2);
        HourContract hourContract2= new HourContract(1000.0,3);
        worker.addContract(hourContract);
        worker.addContract(hourContract2);
        System.out.println(worker);
        worker.removerContract(hourContract);
        System.out.println(worker);
        System.out.println(worker.getHourContractList());

        System.out.println();

    }

}
