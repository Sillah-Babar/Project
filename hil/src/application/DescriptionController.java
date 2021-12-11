package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;

public class DescriptionController {

	   @FXML
	    private TextArea Description;

	    @FXML
	    private ImageView Image;

	    @FXML
	    private Label Name;

	    @FXML
	    private Label Price;

	    @FXML
	    private Button Return;

	    @FXML
	    private ListView<String> listview;

	    @FXML
	    private ImageView returnButton;

    @FXML
    void ActionHandled(ActionEvent event) {

    }

}
