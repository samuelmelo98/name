import java.io.Serializable;
import java.util.Date;

public class ReuPresoHist implements Serializable {

    private Date dtInclusao;
    private Date    dtPrisao;
    private Date    dtUltimaRevisao;
    private String  nomeUsuarioAlteracao;
    private String  numeroProcesso;
    private String  registroJudiciarioIndividual;
    private Boolean reuPreso;
}
