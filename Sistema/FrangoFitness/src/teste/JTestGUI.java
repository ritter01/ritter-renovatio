package teste;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class JTestGUI {

	private JFrame frame;
	private JTextField p1;
	private JTextField p2;
	private JTextField p3;
	private final Action actionSomar = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTestGUI window = new JTestGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JTestGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		frame.getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		JLabel lblp1 = new JLabel("P1");
		frame.getContentPane().add(lblp1, "2, 2, right, default");
		
		p1 = new JTextField();
		frame.getContentPane().add(p1, "4, 2, fill, default");
		p1.setColumns(10);
		
		JLabel lblp2 = new JLabel("P2");
		frame.getContentPane().add(lblp2, "2, 4, right, default");
		
		p2 = new JTextField();
		frame.getContentPane().add(p2, "4, 4, fill, default");
		p2.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setAction(actionSomar);
		frame.getContentPane().add(btnNewButton, "4, 6");
		
		JLabel lblresulttado = new JLabel("P1+P2");
		frame.getContentPane().add(lblresulttado, "2, 8, right, default");
		
		p3 = new JTextField();
		p3.setEditable(false);
		frame.getContentPane().add(p3, "4, 8, fill, default");
		p3.setColumns(10);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Somar");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			
			int n1 = Integer.parseInt(p1.getText());
			int n2 = Integer.parseInt(p2.getText());
			int resultado = n1+n2;
			p3.setText(String.format("%d", resultado));
		}
	}
}
