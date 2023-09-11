

import javax.annotation.PostConstruct;
import javax.faces.component.UIComponent;
import javax.faces.component.UISelectOne;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.DataModel;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import static java.util.Arrays.asList;

@Named
@ViewScoped
public class Bean implements Serializable {
    private static final int CLIENT_ROWS_IN_AJAX_MODE = 15;
    private String nome = "teste";
    private Integer numero;
    private String nu;


    private List<Integer> listaInteira = new ArrayList<Integer>();
    private Pessoa pessoa = new Pessoa("SAmuel",19,"analista");
    private List<String> nomes = asList("samuel","bito","ana","maria","samuel","bito","ana","maria","samuel","bito","ana","maria","samuel","bito","ana","maria","samuel","bito","ana","maria");
    private DataModel<String> model ;
    private int clientRows;

    public void switchAjaxLoading(ValueChangeEvent event) {
        this.clientRows = (Boolean) event.getNewValue() ? CLIENT_ROWS_IN_AJAX_MODE : 0;
    }






    public DataModel getModel() {
        return model;
    }

    public void setModel(DataModel model) {
        this.model = model;
    }
    @PostConstruct
    public void init(){
        System.out.println(nomes);
    }

    public void atualizaAlgo(){
        this.setNome(this.nome+"1+++");
        String[] a = {"divMensagem","texto"};
        List<String> b = new ArrayList<String>();
        b.add("divMensagem");
        b.add("texto");
        b.add("texto2");
        numero = Integer.parseInt(nu);
        listaInteira.add(1);
        listaInteira.add(2);
        pessoa.setNome("testtt");
//        RequestContext.getCurrentInstance().update(b);

        /**RequestContext.getCurrentInstance().update(b);
         * atualiza a view aqui belo bean
         *
         */
    }
    public void teste(AjaxBehaviorEvent event){
        UIComponent ui = event.getComponent().findComponent("texto2");
        String t = ((UISelectOne)ui).getValue().toString();
    }
    public void teste2(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNu() {
        return nu;
    }

    public void setNu(String nu) {
        this.nu = nu;
    }

    public List<Integer> getListaInteira() {
        return listaInteira;
    }

    public void setListaInteira(List<Integer> listaInteira) {
        this.listaInteira = listaInteira;
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

    public void my(){
        System.out.println("Teste");
    }
}
