package java_firtst;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Scrollbar;
import java.awt.SystemColor;

public class Testing {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Testing window = new Testing();
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
	public Testing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(50, 50, 415, 340);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		table = new JTable();
		table.setToolTipText("이건머지");
		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{new Integer(1), new Float(1234.0f), null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"key1", "value", "string", "New column", "New column", "New column", "New column"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Float.class, String.class, Object.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(95);
		table.getColumnModel().getColumn(1).setPreferredWidth(78);
		table.setBounds(9, 178, 344, 50);
		frame.getContentPane().add(table);
		
		Scrollbar scrollbar = new Scrollbar();
		scrollbar.setValue(50);
		scrollbar.setBackground(SystemColor.inactiveCaption);
		scrollbar.setBounds(359, 156, 17, 113);
		frame.getContentPane().add(scrollbar);
		int tmp= scrollbar.getValue();
		System.out.print(tmp);

		
	}
}
