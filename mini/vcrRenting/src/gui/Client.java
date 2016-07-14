package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class Client {

	public JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 * @throws IOException 
	 * @throws ParseException 
	 */
	public Client() throws IOException, ParseException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 * @throws ParseException 
	 */
	private void initialize() throws IOException, ParseException {
		frame = new JFrame();
		frame.setBounds(100, 100, 862, 620);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new Menu().frame.setVisible(true);
			}
		});
		btnReturn.setBounds(10, 547, 89, 23);
		frame.getContentPane().add(btnReturn);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(330, 547, 89, 23);
		frame.getContentPane().add(btnAdd);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setBounds(429, 547, 89, 23);
		frame.getContentPane().add(btnEdit);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(747, 547, 89, 23);
		frame.getContentPane().add(btnDelete);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(54, 11, 742, 301);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		backEnd.Core core = new backEnd.Core();
		backEnd.Client client = new backEnd.Client();
		String[][] getData = new String[core.client.length][client.valueCount];
		for (int x = 0; x < core.client.length ; x ++){
			for(int y = 0; y < client.valueCount ; y ++)
				getData[x][y] = core.client[x].data.get(y);
		}
		
		
		table.setModel(new DefaultTableModel(
			new Object[][]{
				{"null","null","null","null"}
			},
			new String[] {
				"ID", "Name", "Phone", "Adress"
			}
		));
		table.setCellSelectionEnabled(true);
		table.setColumnSelectionAllowed(true);
		
		}	
	}

