package blockchain;
import javafx.scene.control.TextField;

public class DoubleField extends TextField{
    public DoubleField(){
    }

    public double getValue(){
        if(getText().isEmpty()){
            return 0;
        }
        else{
            return Double.parseDouble(getText());
        }
    }
}