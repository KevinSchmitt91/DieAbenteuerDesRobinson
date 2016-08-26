package main;

import berufe.Beruf;
import berufe.Koch;
import berufe.Soldat;

/**
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
*/

public class Main {

    public static void main(String[] args) {
        Beruf b1 = new Soldat();
        Beruf b2 = new Koch();

        System.out.println("Ich bin von Beruf: " + b1.getTyp() + " und ich hab ein Leben von: " + b1.getVerundungen());
        System.out.println("Ich bin von Beruf: " + b2.getTyp() + " und ich hab ein Leben von: " + b2.getVerundungen());
    }

}
