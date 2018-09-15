package calculusproject;

import java.awt.event.ActionEvent;
import java.text.DecimalFormat;

public class Calculate extends Main {

	static void Calc (ActionEvent a) throws Exception{
		double FV = Double.parseDouble(textField_2.getText());
		double PV = Double.parseDouble(textField.getText());
		double r = Double.parseDouble(textField_1.getText());
		
		double r2 = r/100;
		double h = FV/PV;
		double log = Math.log(h);
		double T = (1/r2)*log;
		DecimalFormat nF = new DecimalFormat ("#.000"); 
		String Y = String.valueOf(nF.format(T));
		
		textField_3.setText(Y);
	}
}
