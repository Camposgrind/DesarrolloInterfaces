package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Controller implements ActionListener {
	
	//ESTADO
	protected JTextField textFieldUser;
	protected JPasswordField passField;
	protected JLabel jLabelOK;
	private static final String USER = "pepe";
	private static final String PASSWORD = "1234";
	
	
	//CONSTRUCTOR
	
	/**Constructor de nuestro controlador
	 */
	
	public Controller(JTextField myJTextField, JPasswordField myJPField ,JLabel myJLabel) {
		this.textFieldUser = myJTextField;
		this.passField = myJPField;
		this.jLabelOK = myJLabel;
		
	}
	
	//RESTO COMPORTAMIENTOS
	
	/**
	 * Comportamiento para comparar el usuario y contraseña 
	 */
	public boolean testLogin(String user,String passwd) {
		boolean resultado;
		
		resultado = (user.equals(USER) && passwd.equals(PASSWORD));


		return resultado;
	}

	public void actionPerformed(ActionEvent arg0){
		
		
		if (this.testLogin(textFieldUser.getText(),passField.getText())) {
			jLabelOK.setText("Usuario Logeado");
			
		}
		else {
			
			jLabelOK.setText("Has fallado gorrion");
		}
	}
	
	
	

}
