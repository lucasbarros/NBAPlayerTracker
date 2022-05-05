/** The NBAMain class is the start code for the actual application. This is what initially
starts up the app*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class NBAMain extends Application
{
   public static void main(String[] args)
   {
      launch(args);
   }
   
   @Override
   public void start(Stage stage) throws Exception
   {
      Parent root = FXMLLoader.load(getClass().getResource("NBAView.fxml"));
      Scene scene = new Scene(root);
      stage.setTitle("NBA Player Info");
      stage.setScene(scene);
      stage.show();
   }
}