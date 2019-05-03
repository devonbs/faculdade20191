package com.devon.faculdade.linguagens.trabalho3;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SpringLayout;
import java.awt.BorderLayout;

public class Reconhecedor {

	private JFrame frmReconhecedorDeLinguagens;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reconhecedor window = new Reconhecedor();
					window.frmReconhecedorDeLinguagens.setVisible(true);
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
		DefaultTableModel modelo = new DefaultTableModel();
		
		modelo.addColumn("Linha");
		modelo.addColumn("Resultado");
		modelo.addColumn("Sequencia");
		modelo.addColumn("Reconhecimento");
		table = new JTable(modelo);
		
		
		frmReconhecedorDeLinguagens = new JFrame();
		frmReconhecedorDeLinguagens.setTitle("Reconhecedor de linguagens regulares");
		frmReconhecedorDeLinguagens.setResizable(false);
		frmReconhecedorDeLinguagens.setBounds(100, 100, 865, 410);
		frmReconhecedorDeLinguagens.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		frmReconhecedorDeLinguagens.getContentPane().setLayout(gridBagLayout);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.weightx = 1.0;
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		frmReconhecedorDeLinguagens.getContentPane().add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] {864};
		gbl_panel.rowHeights = new int[] {173, 0};
		gbl_panel.columnWeights = new double[]{1.0};
		gbl_panel.rowWeights = new double[]{1.0, 1.0};
		panel.setLayout(gbl_panel);
		
		JTextPane textPane = new JTextPane();
//		GridBagConstraints gbc_textPane = new GridBagConstraints();
//		gbc_textPane.insets = new Insets(0, 0, 5, 0);
//		gbc_textPane.fill = GridBagConstraints.BOTH;
//		gbc_textPane.gridx = 0;
//		gbc_textPane.gridy = 0;
		//panel.add(textPane, gbc_textPane);
		
		JScrollPane scrollPane_1 = new JScrollPane(textPane);
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.gridheight = 2;
		gbc_scrollPane_1.weighty = 1.0;
		gbc_scrollPane_1.weightx = 1.0;
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 0;
		gbc_scrollPane_1.gridy = 0;
		panel.add(scrollPane_1, gbc_scrollPane_1);
		//scrollBar_1.add(textPane);
		
		
		GridBagConstraints gbc_scrollBar_1 = new GridBagConstraints();
		gbc_scrollBar_1.fill = GridBagConstraints.BOTH;
		gbc_scrollBar_1.gridx = 0;
		gbc_scrollBar_1.gridy = 1;
		
		JPanel panel2 = new JPanel();
		GridBagConstraints gbc_panel2 = new GridBagConstraints();
		gbc_panel2.insets = new Insets(0, 0, 5, 0);
		gbc_panel2.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel2.gridx = 0;
		gbc_panel2.gridy = 1;
		frmReconhecedorDeLinguagens.getContentPane().add(panel2, gbc_panel2);
		
		JButton btnAnalisar = new JButton("Analisar");
		try {
		    Image img = ImageIO.read(getClass().getResource("play.png"));
		    btnAnalisar.setIcon(new ImageIcon(img));
		  } catch (Exception ex) {
		    System.out.println(ex);
		  }
		
		btnAnalisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String[] linhas = textPane.getText().split("\\n");
				for (int i = 0; i < linhas.length; i++) {
					String[] palavras = linhas[i].split(" ");
					for (int j = 0; j < palavras.length; j++) {
						if(palavras[j].trim().length() > 0) {
							ProcessadorPalavra processador = new ProcessadorPalavra(palavras[j].trim());
							modelo.addRow(new Object[] {i+1, processador.validacao()[0], processador.validacao()[1]});	
						}
					}
				}
				
			}
		});
		panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panel2.add(btnAnalisar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for (int j = 0; j < modelo.getRowCount(); j++) {
					modelo.removeRow(j);
					textPane.setText("");
				}
				
			}
		});
		panel2.add(btnLimpar);
		
		JButton btnEquipe = new JButton("Equipe");
		btnEquipe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Devon Barth Schvabe");
			}
		});
		panel2.add(btnEquipe);
		
		JPanel panel3 = new JPanel();
		GridBagConstraints gbc_panel3 = new GridBagConstraints();
		gbc_panel3.gridheight = 2;
		gbc_panel3.weighty = 1.0;
		gbc_panel3.insets = new Insets(0, 0, 5, 0);
		gbc_panel3.fill = GridBagConstraints.BOTH;
		gbc_panel3.gridx = 0;
		gbc_panel3.gridy = 2;
		frmReconhecedorDeLinguagens.getContentPane().add(panel3, gbc_panel3);
		
		
		
		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.insets = new Insets(0, 0, 5, 0);
		gbc_table.fill = GridBagConstraints.BOTH;
		gbc_table.gridx = 0;
		gbc_table.gridy = 0;
		panel3.setLayout(new BorderLayout(0, 0));
		//panel3.add(table, gbc_table);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		panel3.add(scrollPane);
		
		
		//scrollBar.add(table);
		GridBagConstraints gbc_scrollBar = new GridBagConstraints();
		gbc_scrollBar.fill = GridBagConstraints.BOTH;
		gbc_scrollBar.gridx = 0;
		gbc_scrollBar.gridy = 1;
		//panel3.add(scrollBar, gbc_scrollBar);
	}

}
