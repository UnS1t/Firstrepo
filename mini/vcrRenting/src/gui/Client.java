package gui;

import java.awt.EventQueue;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Client {

	public JFrame frame;
	private JTable table;
	private JTextField nameField;
	private JTextField phoneField;
	private JTextField addressField;

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
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			 if(!(nameField.getText().equals("")  || phoneField.getText().equals("")|| addressField.getText().equals(""))){
				 List<String> data = new ArrayList<String>();
				 data.add(nameField.getText());
				 data.add(phoneField.getText());
				 data.add(addressField.getText());
				 
				 try {
						new backEnd.Core().add(data, "client");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 
			 }
				
			}
		});
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
		String[][] getData = null;
		try{
		String[][] tryGetData = new String[core.client.length][client.valueCount];
		for (int x = 0; x < core.client.length + 1 ; x ++){
			for(int y = 0; y < client.valueCount + 1; y ++)
				tryGetData[x][y] = core.client[x].data.get(y);
			getData = tryGetData;
		}
		
		}catch(NullPointerException ex){
			
			
		}
		
		
		table.setModel(new DefaultTableModel(
			
			getData,
			new String[] {
				"ID", "Name", "Phone", "Adress"
			}
		));
		table.setCellSelectionEnabled(true);
		table.setColumnSelectionAllowed(true);
		
		nameField = new JTextField();
		nameField.setBounds(111, 382, 86, 20);
		frame.getContentPane().add(nameField);
		nameField.setColumns(10);
		
		phoneField = new JTextField();
		phoneField.setBounds(330, 382, 80, 20);
		frame.getContentPane().add(phoneField);
		phoneField.setColumns(10);
		
		addressField = new JTextField();
		addressField.setBounds(564, 382, 258, 20);
		frame.getContentPane().add(addressField);
		addressField.setColumns(10);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(53, 385, 46, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblPhone = new JLabel("Phone:");
		lblPhone.setBounds(276, 385, 46, 14);
		frame.getContentPane().add(lblPhone);
		
		JLabel lblAdress = new JLabel("Address:");
		lblAdress.setBounds(512, 385, 46, 14);
		frame.getContentPane().add(lblAdress);
		
		}	
	}

