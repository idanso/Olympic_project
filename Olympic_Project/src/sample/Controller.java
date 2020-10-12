package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
//import javafx.scene.control.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.TextFlow;

public class Controller implements Initializable {

    @FXML
    private Button changeTomanagerPage;

    @FXML
    private TabPane tapPaneSummery;

    @FXML
    private Tab viewTournamentsTap;

    @FXML
    private MenuButton tournamentMenu;

    @FXML
    private TableView<?> tournamentsTableView;

    @FXML
    private TableColumn<?, ?> tournamentTypeCol;

    @FXML
    private TableColumn<?, ?> tornamentParticipentsCol;

    @FXML
    private TableColumn<?, ?> tornamentRefereeCol;

    @FXML
    private TableColumn<?, ?> tornamentLocationCol;

    @FXML
    private Tab viewAthletesTap;

    @FXML
    private MenuButton countryMenu;

    @FXML
    private TableView<?> athletesTableView;

    @FXML
    private TableColumn<?, ?> athlleteNameCol;

    @FXML
    private TableColumn<?, ?> athleteMedalsCol;

    @FXML
    private TableColumn<?, ?> athleteTypecol;

    @FXML
    private Tab viewRefereesTab;

    @FXML
    private TableView<?> refereeTableView;

    @FXML
    private TableColumn<?, ?> refereeNameCol;

    @FXML
    private TableColumn<?, ?> refereeTypeCol;

    @FXML
    private Tab viewMedalsTab;

    @FXML
    private TableView<?> medalsTableView;

    @FXML
    private TableColumn<?, ?> medalCountryNameCol;

    @FXML
    private TableColumn<?, ?> medalAllMedalsCol;

    public void buttonEvent (ActionEvent event){
        System.out.println("hello world");
    }

    public void menuButtonEvent (String tornamentType){
        //  tournamentTypeCol.setCellValueFactory(new PropertyValueFactory<>());
    }




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ArrayList <MenuItem> menulistArray = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            menulistArray.add(new MenuItem("tournament type num" + (i+1)));//need to add refference to all tournament types array
            menulistArray.get(i).setId("type" + i);
            menulistArray.get(i).setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    System.out.println(((MenuItem)event.getSource()).getId());
                    System.out.println(((MenuItem)event.getSource()).getText());
                    menuButtonEvent(((MenuItem)event.getSource()).getText());
                }
            });
        }
        tournamentMenu.getItems().addAll(menulistArray);
        for (int i = 0; i < 5; i++) {
            menulistArray.add(new MenuItem("country num" + (i+1)));//need to add refference to all countrys array
        }
        countryMenu.getItems().addAll(menulistArray);



    }

}
