import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.net.URL;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class NBAViewController throws Exception {

    @FXML
    private Label heightLabel;

    @FXML
    private Label myLabel1;

    @FXML
    private Label myLabel2;

    @FXML
    private Label nameLabel;

    @FXML
    private Label teamLabel;

    @FXML
    private Label weightLabel;

    @FXML
    void searchPlayer(ActionEvent event) {
         URL url = new URL("https://www.balldontlie.io/api/v1/players/"+ (Math.random()*500));
         Scanner s = new Scanner(url.openStream());
         String rawData = s.nextLine();
         Gson gson = new Gson();
         NBAPlayer data = gson.fromJson(rawData, NBAPlayer.class);
         //Team NBAteam = gson.fromJson(rawData, Team.class);
         heightLabel.setText("Height: " + data.height_feet + "ft " + data.height_inches + "in");
         myLabel2.setText(data.first_name + " " + data.last_name + " Info");
         nameLabel.setText("Name: " + data.first_name + " " + data.last_name);
         teamLabel.setText("Team: " + data.team.full_name);
         weightLabel.setText("Weight: " + data.weight_pounds + "lbs");
    }

}
