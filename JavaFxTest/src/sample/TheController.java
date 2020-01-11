package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class TheController
{
    public Label helloWorld;

    public void sayHelloWorld(ActionEvent actionEvent)
    {
        helloWorld.setText("Hello World!");
    }

    Pane root = new Pane();

}
