import javax.faces.component.behavior.ClientBehaviorBase;
import javax.faces.component.behavior.ClientBehaviorContext;
import javax.faces.component.behavior.FacesBehavior;

@FacesBehavior(value = "confirm")
public class ComportamentoComponente extends ClientBehaviorBase {
    @Override
    public String getScript(ClientBehaviorContext behaviorContext) {
        return "return confirm('vc tem certeza?');";
    }


}
