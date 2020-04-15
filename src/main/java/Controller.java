import javafx.scene.control.Label;
import javafx.scene.paint.Paint;

public class Controller {
    public Label label;

    public void initialize(){
        label.setTextFill(Paint.valueOf("green"));
    }

    public void setText(String text){
        label.setText(text);
    }
}
