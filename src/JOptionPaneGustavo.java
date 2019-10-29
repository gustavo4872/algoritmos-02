import java.awt.Component;

import javax.swing.Icon;
import javax.swing.JOptionPane;

public class JOptionPaneGustavo extends JOptionPane {

	public JOptionPaneGustavo() {
		// TODO Auto-generated constructor stub
	}

	public JOptionPaneGustavo(Object message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public JOptionPaneGustavo(Object message, int messageType) {
		super(message, messageType);
		// TODO Auto-generated constructor stub
	}

	public JOptionPaneGustavo(Object message, int messageType, int optionType) {
		super(message, messageType, optionType);
		// TODO Auto-generated constructor stub
	}

	public JOptionPaneGustavo(Object message, int messageType, int optionType, Icon icon) {
		super(message, messageType, optionType, icon);
		// TODO Auto-generated constructor stub
	}

	public JOptionPaneGustavo(Object message, int messageType, int optionType, Icon icon, Object[] options) {
		super(message, messageType, optionType, icon, options);
		// TODO Auto-generated constructor stub
	}

	public JOptionPaneGustavo(Object message, int messageType, int optionType, Icon icon, Object[] options,
			Object initialValue) {
		super(message, messageType, optionType, icon, options, initialValue);
		// TODO Auto-generated constructor stub
	}
	
	public static boolean showQuestionDialog(Component ref, Object msg) {
		int ret = JOptionPane.showConfirmDialog(ref, msg);
		return (ret == 0);
	}

}
