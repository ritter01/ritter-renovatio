package GUI;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import frangofitness.gui.action.CadastrarAction;
import frangofitness.gui.action.CadastrarAlunoAction;
import frangofitness.gui.action.SairAction;
import frangofitness.gui.action.SobreAction;

public class FitnessSwing {
	


	/**
	 * 
	 * @author ritter.zc@gmail.com
	 *
	 */

		/**
		 * Create the GUI and show it. For thread safety, this method should be
		 * invoked from the event-dispatching thread.
		 */
		private static void createAndShowGUI() {
			// Create and set up the window.
			JFrame frame = new JFrame("Frango Fitness - Tela Aluno");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setIconImage(new ImageIcon(("img.png")).getImage());
			
			CardLayout card = new CardLayout(0,0);
			

			JMenuBar mb = new JMenuBar();
			frame.setJMenuBar(mb);

			JMenu arquivo = new JMenu("Arquivo");
			arquivo.setMnemonic(KeyEvent.VK_A);
			mb.add(arquivo);

			JMenu ajuda = new JMenu("Ajuda");
			ajuda.setMnemonic(KeyEvent.VK_U);
			mb.add(ajuda);

			JMenuItem sair = new JMenuItem(new SairAction());
			arquivo.add(sair);
			sair.setMnemonic(KeyEvent.VK_S);
			sair.setAccelerator(KeyStroke.getKeyStroke(
			        KeyEvent.VK_Q, ActionEvent.CTRL_MASK));
			
			JMenuItem cadastrar = new JMenuItem(new CadastrarAction(frame, card));
			arquivo.add(cadastrar);
			cadastrar.setMnemonic(KeyEvent.VK_C);
			cadastrar.setAccelerator(KeyStroke.getKeyStroke(
			        KeyEvent.VK_S, ActionEvent.CTRL_MASK));
			
			JMenuItem sobre = new JMenuItem(new SobreAction(frame));
			ajuda.add(sobre);
			sobre.setMnemonic(KeyEvent.VK_S);

			JPanel panelCadastrarAluno = new CadastrarAlunoPanel(frame, card);
			JPanel vazio = new JPanel();
			
			frame.setLayout(card);
			frame.getContentPane().add(vazio, "vazio");
			frame.getContentPane().add(panelCadastrarAluno, "Tela Cadastrar Aluno");
			
			frame.setPreferredSize(new Dimension(800,200));
			frame.pack();
			frame.setVisible(true);
		}

		

		public static void main(String[] args) {
			// Schedule a job for the event-dispatching thread:
			// creating and showing this application's GUI.
			javax.swing.SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					createAndShowGUI();
				}
			});
		}
	}

