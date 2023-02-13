package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

	
	@FXML
	private Label result;
	@FXML
	private TextField mytextfield;
	@FXML
	private Button submit;
	
	int ages;
	
	public void SubmitHandler(ActionEvent event) {
		try {
			ages=Integer.parseInt(mytextfield.getText());
			System.out.println(ages);

			if(ages<18) {
				result.setText("Your ages is under 18");
			}else {
				result.setText("Your Age Is : "+ages);
			}
			
		} catch(NumberFormatException e) {
			result.setText("please Ener number only");
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	
	
}
