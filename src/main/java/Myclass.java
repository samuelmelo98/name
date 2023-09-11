import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import java.util.ArrayList;
import java.util.List;

public class Myclass implements java.io.Serializable {


    private Pessoa pessoa =  new Pessoa();
    private List<Pessoa> listaPessoa = new ArrayList<Pessoa>();


    private DataModel<Pessoa> model = new ListDataModel(this.listaPessoa);



//    public void pegaValorNaView(AjaxBehaviorEvent event){
////
////        FacesContext context =FacesContext.getCurrentInstance();
////
////        UIComponent ui = event.getComponent().findComponent("teste");
////        String valor = ((UIInput)ui).getValue().toString();
////
////    }


    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<Pessoa> getListaPessoa() {
        return listaPessoa;
    }

    public void setListaPessoa(List<Pessoa> listaPessoa) {
        this.listaPessoa = listaPessoa;
    }

    public DataModel<Pessoa> getModel() {
        return model;
    }

    public void setModel(DataModel<Pessoa> model) {
        this.model = model;
    }
//                System.out.println();

}
