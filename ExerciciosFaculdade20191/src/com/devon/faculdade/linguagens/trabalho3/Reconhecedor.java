package com.devon.faculdade.linguagens.trabalho3;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Reconhecedor {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reconhecedor window = new Reconhecedor();
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
	public Reconhecedor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 865, 410);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		frame.getContentPane().add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] {864};
		gbl_panel.rowHeights = new int[] {173};
		gbl_panel.columnWeights = new double[]{1.0};
		gbl_panel.rowWeights = new double[]{1.0};
		panel.setLayout(gbl_panel);
		
		JTextPane textPane = new JTextPane();
		GridBagConstraints gbc_textPane = new GridBagConstraints();
		gbc_textPane.fill = GridBagConstraints.BOTH;
		gbc_textPane.gridx = 0;
		gbc_textPane.gridy = 0;
		panel.add(textPane, gbc_textPane);
		
		JPanel panel2 = new JPanel();
		GridBagConstraints gbc_panel2 = new GridBagConstraints();
		gbc_panel2.insets = new Insets(0, 0, 5, 0);
		gbc_panel2.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel2.gridx = 0;
		gbc_panel2.gridy = 1;
		frame.getContentPane().add(panel2, gbc_panel2);
		GridBagLayout gbl_panel2 = new GridBagLayout();
		gbl_panel2.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel2.rowHeights = new int[]{0, 0};
		gbl_panel2.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel2.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel2.setLayout(gbl_panel2);
		
		JButton btnAnalisar = new JButton("Analisar");
		btnAnalisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String valor = textPane.getText();
				ProcessadorPalavra processador = new ProcessadorPalavra(valor);
				processador.processaPalavra();
			}
		});
		GridBagConstraints gbc_btnAnalisar = new GridBagConstraints();
		gbc_btnAnalisar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAnalisar.insets = new Insets(0, 0, 0, 5);
		gbc_btnAnalisar.gridx = 0;
		gbc_btnAnalisar.gridy = 0;
		panel2.add(btnAnalisar, gbc_btnAnalisar);
		
		JButton btnLimpar = new JButton("Limpar");
		GridBagConstraints gbc_btnLimpar = new GridBagConstraints();
		gbc_btnLimpar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnLimpar.insets = new Insets(0, 0, 0, 5);
		gbc_btnLimpar.gridx = 1;
		gbc_btnLimpar.gridy = 0;
		panel2.add(btnLimpar, gbc_btnLimpar);
		
		JButton btnEquipe = new JButton("Equipe");
		btnEquipe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Devon Barth Schvabe");
			}
		});
		GridBagConstraints gbc_btnEquipe = new GridBagConstraints();
		gbc_btnEquipe.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnEquipe.gridx = 2;
		gbc_btnEquipe.gridy = 0;
		panel2.add(btnEquipe, gbc_btnEquipe);
		
		JPanel panel3 = new JPanel();
		GridBagConstraints gbc_panel3 = new GridBagConstraints();
		gbc_panel3.insets = new Insets(0, 0, 5, 0);
		gbc_panel3.fill = GridBagConstraints.BOTH;
		gbc_panel3.gridx = 0;
		gbc_panel3.gridy = 2;
		frame.getContentPane().add(panel3, gbc_panel3);
		GridBagLayout gbl_panel3 = new GridBagLayout();
		gbl_panel3.columnWidths = new int[]{0, 0};
		gbl_panel3.rowHeights = new int[]{0, 0};
		gbl_panel3.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel3.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel3.setLayout(gbl_panel3);
	}

}
