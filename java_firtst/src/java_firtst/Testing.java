package java_firtst;

import java.awt.*;
import javax.swing.*;
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
import javax.swing.JTabbedPane;
import javax.swing.border.TitledBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JDesktopPane;
import javax.swing.border.BevelBorder;
import java.awt.CardLayout;
//import org.eclipse.wb.swing.FocusTraversalOnArray;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JMenuBar;
import javax.swing.border.LineBorder;
import javax.swing.JInternalFrame;
import javax.swing.BoxLayout;
import java.awt.Dimension;
import javax.swing.JSplitPane;
import javax.swing.border.MatteBorder;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Arrays;

public class Testing {

	private JFrame frame;
	private JTable table_1;
	private JTable table_2;
	private JTable table;
	private JTable table_3;

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
		initialize(null, null);
	}

	/**
	 * Initialize the contents of the frame.
	 * @param scroll_1 
	 * @param scroll 
	 */
	private void initialize(JScrollPane scroll_1, JScrollPane scroll) {
		frame = new JFrame();
		frame.setBounds(50, 50, 1284, 758);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 20, 1256, 672);
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		frame.getContentPane().add(tabbedPane);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setToolTipText("");
		desktopPane.setForeground(new Color(0, 128, 192));
		tabbedPane.addTab("New tab", null, desktopPane, null);
		desktopPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1252, 23);
		desktopPane.setLayer(menuBar, 5);
		desktopPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("New menu");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("open");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("close");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 180, 985, 80);
		desktopPane.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setToolTipText("요율키정보");
		scrollPane_1.setViewportView(table_1);
		
		
				table_1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
				
						table_1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
						

		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"P0001", "1", "11111", "\uAC74\uAC15\uB4F1\uAE09", "1~2", "\uC5F0\uB839", "{\uBCF4\uAE30\uB0A9\uAE30}", "\uC131\uBCC4", "1~2", "\uBCF4\uD5D8\uAE30\uAC04", "{\uBCF4\uAE30\uB0A9\uAE30}", "\uB0A9\uC785\uAE30\uAC04", "{\uBCF4\uAE30\uB0A9\uAE30}"},
				{"P0002", "2", "11111", "\uC131\uBCC4", "2~2", "\uC5F0\uB839", "{\uBCF4\uAE30\uB0A9\uAE30}", "\uC0C1\uD574\uAE09\uC218", "1~3", "\uBCF4\uD5D8\uAE30\uAC04", "{\uBCF4\uAE30\uB0A9\uAE30", "\uB0A9\uC785\uAE30\uAC04", "{\uBCF4\uAE30\uB0A9\uAE30}"},
				{"A0001", "1", "22222", "\uAC74\uBB3C\uAD6C\uC870", "1~3", "\uBCF4\uD5D8\uAE30\uAC04", "{\uBCF4\uAE30\uB0A9\uAE30}", "\uB0A9\uC785\uAE30\uAC04", "{\uBCF4\uAE30\uB0A9\uAE30}", "\uC18C\uD654\uC124\uBE44", "1~2", "\uBBF8\uAD6C\uC131", "0~0"},
			},
			new String[] {
				"\uC0C1\uD488\uCF54\uB4DC", "SUB\uCF54\uB4DC", "\uB2F4\uBCF4\uCF54\uB4DC", "K1", "K1_\uAC12", "K2", "K2_\uAC12", "K3", "K3_\uAC12", "K4", "K4_\uAC12", "K5", "K5_\uAC12"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table_1.getColumnModel().getColumn(0).setMaxWidth(100);
		table_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(12, 46, 1113, 87);
		desktopPane.add(scrollPane_2);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"P0001", "1", "11111", "\uD45C\uC900\uD615", null, new Double(0.0325), "1,1", new Integer(100000), "A", new Integer(17), "Y", new Integer(2), new Integer(15), new Integer(15)},
				{"P0002", "2", "11111", "\uBB34\uD574\uC9C02", "P0001,1,11111", new Double(0.0325), "0,0.5", new Integer(100000), "A", new Integer(17), "Y", new Integer(1), new Integer(15), new Integer(16)},
				{"A0001", "1", "22222", "\uD45C\uC900\uD615", null, new Double(0.0325), "1,1", new Integer(1000), "Y", new Integer(30), "Y", new Integer(30), null, null},
			},
			new String[] {
				"\uC0C1\uD488\uCF54\uB4DC", "SUB\uCF54\uB4DC", "\uB2F4\uBCF4\uCF54\uB4DC", "\uBB34\uD574\uC9C0\uAD6C\uBD84", "\uCC38\uC870\uC0C1\uD488\uB2F4\uBCF4", "\uC608\uC815\uC774\uC728", "W_\uC9C0\uAE09\uB960", "\uAC00\uC785\uAE08\uC561", "\uBCF4\uAE30\uC720\uD615", "\uBCF4\uAE30\uAC12", "\uB0A9\uAE30\uC720\uD615", "\uB0A9\uAE30\uAC12", "\uCD5C\uC18C\uC5F0\uB839", "\uCD5C\uB300\uC5F0\uB839"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, Double.class, String.class, Integer.class, String.class, Integer.class, Object.class, Integer.class, Integer.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(3).setPreferredWidth(83);
		table.getColumnModel().getColumn(4).setPreferredWidth(98);
		table.getColumnModel().getColumn(5).setPreferredWidth(81);
		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		scrollPane_2.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("상품/담보 정보 + 가입금액 + 보기납기정보");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBounds(10, 25, 382, 23);
		desktopPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("요율키구성");
		lblNewLabel_1.setToolTipText("요율키구성");
		lblNewLabel_1.setBounds(12, 151, 382, 30);
		desktopPane.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 293, 994, 173);
		desktopPane.add(scrollPane);
		
		JButton btnNewButton = new JButton("모델포인트 구성");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		//		System.out.print(table.getRowCount()); 3
		//		System.out.print(table.getColumnCount()); 14
				
				int[] P0001 = {0,0,0,0,0};
				int[] P0002 = {0,0,0,0,0};
				int[] A0001 = {0,0,0,0,0};
				
				String[] words = ((String) table_1.getValueAt(0,4)).split("~");
				P0001[0]=Integer.parseInt(words[1])-Integer.parseInt(words[0])+1;
				
				words = ((String) table_1.getValueAt(1,4)).split("~");
				P0002[0]=Integer.parseInt(words[1])-Integer.parseInt(words[0])+1;
				
				words = ((String) table_1.getValueAt(2,4)).split("~");
				A0001[0]=Integer.parseInt(words[1])-Integer.parseInt(words[0])+1;

				
				int tmp_P0001_MAX = (int) table.getValueAt(0,13);
				int tmp_P0001_MIN = (int) table.getValueAt(0,12);
				int tmp_P0001_연령n = tmp_P0001_MAX - tmp_P0001_MIN - 1;
				P0001[1]=tmp_P0001_연령n;
				
				int tmp_P0002_MAX = (int) table.getValueAt(1,13);
				int tmp_P0002_MIN = (int) table.getValueAt(1,12);
				int tmp_P0002_연령n = tmp_P0002_MAX - tmp_P0002_MIN - 1;
				P0002[1]=tmp_P0002_연령n;
				
				words = ((String) table_1.getValueAt(0,8)).split("~");
				P0001[2]=Integer.parseInt(words[1])-Integer.parseInt(words[0])+1;
				
				words = ((String) table_1.getValueAt(1,8)).split("~");
				P0002[2]=Integer.parseInt(words[1])-Integer.parseInt(words[0])+1;
				
				words = ((String) table_1.getValueAt(2,10)).split("~");
				A0001[3]=Integer.parseInt(words[1])-Integer.parseInt(words[0])+1;
				
				int row_n = P0001[0]*P0001[1]*P0001[2]+P0002[0]*P0002[1]*P0002[2]+A0001[0]*A0001[3];
				System.out.print(row_n);
				System.out.print(Arrays.toString(P0001));
				System.out.print(Arrays.toString(P0002));
				System.out.print(Arrays.toString(A0001));
				

			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 13));
		btnNewButton.setBounds(1016, 180, 166, 74);
		desktopPane.add(btnNewButton);
		
		table_3 = new JTable();
		table_3.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_3.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
				{"P0001", "1", "11111", "A", "17", "Y", "2", new Integer(2), new Integer(2), new Integer(15), new Integer(15), new Integer(15), "\uAC74\uAC15\uB4F1\uAE09|\uC5F0\uB839|\uC131\uBCC4|\uBCF4\uD5D8\uAE30\uAC04|\uB0A9\uC785\uAE30\uAC04", new Integer(1), new Integer(15), new Integer(1), new Integer(2), new Integer(2)},
				{"P0001", "1", "11111", "A", "17", "Y", "2", new Integer(2), new Integer(2), new Integer(15), new Integer(15), new Integer(15), "\uAC74\uAC15\uB4F1\uAE09|\uC5F0\uB839|\uC131\uBCC4|\uBCF4\uD5D8\uAE30\uAC04|\uB0A9\uC785\uAE30\uAC04", new Integer(2), new Integer(15), new Integer(1), new Integer(2), new Integer(2)},
				{"P0001", "1", "11111", "A", "17", "Y", "2", new Integer(2), new Integer(2), new Integer(15), new Integer(15), new Integer(15), "\uAC74\uAC15\uB4F1\uAE09|\uC5F0\uB839|\uC131\uBCC4|\uBCF4\uD5D8\uAE30\uAC04|\uB0A9\uC785\uAE30\uAC04", new Integer(1), new Integer(15), new Integer(2), new Integer(2), new Integer(2)},
				{"P0001", "1", "11111", "A", "17", "Y", "2", new Integer(2), new Integer(2), new Integer(15), new Integer(15), new Integer(15), "\uAC74\uAC15\uB4F1\uAE09|\uC5F0\uB839|\uC131\uBCC4|\uBCF4\uD5D8\uAE30\uAC04|\uB0A9\uC785\uAE30\uAC04", new Integer(2), new Integer(15), new Integer(2), new Integer(2), new Integer(2)},
				{"P0002", "2", "11111", "A", "17", "Y", "1", new Integer(2), new Integer(1), new Integer(15), new Integer(16), new Integer(15), "\uC131\uBCC4|\uC5F0\uB839|\uC0C1\uD574\uAE09\uC218|\uBCF4\uD5D8\uAE30\uAC04|\uB0A9\uC785\uAE30\uAC04", new Integer(2), new Integer(15), new Integer(1), new Integer(2), new Integer(1)},
				{"P0002", "2", "11111", "A", "17", "Y", "1", new Integer(2), new Integer(1), new Integer(15), new Integer(16), new Integer(15), "\uC131\uBCC4|\uC5F0\uB839|\uC0C1\uD574\uAE09\uC218|\uBCF4\uD5D8\uAE30\uAC04|\uB0A9\uC785\uAE30\uAC04", new Integer(2), new Integer(15), new Integer(2), new Integer(2), new Integer(1)},
				{"P0002", "2", "11111", "A", "17", "Y", "1", new Integer(2), new Integer(1), new Integer(15), new Integer(16), new Integer(15), "\uC131\uBCC4|\uC5F0\uB839|\uC0C1\uD574\uAE09\uC218|\uBCF4\uD5D8\uAE30\uAC04|\uB0A9\uC785\uAE30\uAC04", new Integer(2), new Integer(15), new Integer(3), new Integer(2), new Integer(1)},
				{"P0002", "2", "11111", "A", "17", "Y", "1", new Integer(1), new Integer(1), new Integer(15), new Integer(16), new Integer(16), "\uC131\uBCC4|\uC5F0\uB839|\uC0C1\uD574\uAE09\uC218|\uBCF4\uD5D8\uAE30\uAC04|\uB0A9\uC785\uAE30\uAC04", new Integer(2), new Integer(16), new Integer(1), new Integer(1), new Integer(1)},
				{"P0002", "2", "11111", "A", "17", "Y", "1", new Integer(1), new Integer(1), new Integer(15), new Integer(16), new Integer(16), "\uC131\uBCC4|\uC5F0\uB839|\uC0C1\uD574\uAE09\uC218|\uBCF4\uD5D8\uAE30\uAC04|\uB0A9\uC785\uAE30\uAC04", new Integer(2), new Integer(16), new Integer(2), new Integer(1), new Integer(1)},
				{"P0002", "2", "11111", "A", "17", "Y", "1", new Integer(1), new Integer(1), new Integer(15), new Integer(16), new Integer(16), "\uC131\uBCC4|\uC5F0\uB839|\uC0C1\uD574\uAE09\uC218|\uBCF4\uD5D8\uAE30\uAC04|\uB0A9\uC785\uAE30\uAC04", new Integer(2), new Integer(16), new Integer(3), new Integer(1), new Integer(1)},
				{"A0001", "1", "22222", "A", "30", "Y", "30", new Integer(30), new Integer(30), null, null, null, "\uAC74\uBB3C\uAD6C\uC870|\uBCF4\uD5D8\uAE30\uAC04|\uB0A9\uC785\uAE30\uAC04|\uC18C\uD654\uC124\uBE44|\uBBF8\uAD6C\uC131", new Integer(1), new Integer(30), new Integer(30), new Integer(1), new Integer(0)},
			},
			new String[] {
				"\uC0C1\uD488\uCF54\uB4DC", "SUB\uCF54\uB4DC", "\uB2F4\uBCF4\uCF54\uB4DC", "\uBCF4\uAE30\uC720\uD615", "\uBCF4\uAE30\uAC12", "\uB0A9\uC785\uC720\uD615", "\uB0A9\uAE30\uAC12", "\uBCF4\uD5D8\uAE30\uAC04", "\uB0A9\uC785\uAE30\uAC04", "\uCD5C\uC18C\uC5F0\uB839", "\uCD5C\uB300\uC5F0\uB839", "\uC5F0\uB839", "\uD0A4\uBC30\uC5F4", "K1", "K2", "K3", "K4", "K5"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, Object.class, String.class, String.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, String.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table_3.getColumnModel().getColumn(0).setPreferredWidth(45);
		table_3.getColumnModel().getColumn(1).setPreferredWidth(59);
		table_3.getColumnModel().getColumn(2).setPreferredWidth(64);
		table_3.getColumnModel().getColumn(3).setPreferredWidth(35);
		table_3.getColumnModel().getColumn(4).setPreferredWidth(25);
		table_3.getColumnModel().getColumn(5).setPreferredWidth(35);
		table_3.getColumnModel().getColumn(6).setPreferredWidth(18);
		table_3.getColumnModel().getColumn(7).setPreferredWidth(18);
		table_3.getColumnModel().getColumn(8).setPreferredWidth(18);
		table_3.getColumnModel().getColumn(9).setPreferredWidth(18);
		table_3.getColumnModel().getColumn(10).setPreferredWidth(19);
		table_3.getColumnModel().getColumn(11).setPreferredWidth(18);
		table_3.getColumnModel().getColumn(12).setPreferredWidth(263);
		scrollPane.setViewportView(table_3);
		

		
		JLabel lblNewLabel_1_1 = new JLabel("모델포인트");
		lblNewLabel_1_1.setToolTipText("모델포인트");
		lblNewLabel_1_1.setBounds(17, 266, 382, 30);
		desktopPane.add(lblNewLabel_1_1);
		

		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar_1.setBounds(0, 0, 1256, 23);
		frame.getContentPane().add(menuBar_1);
		
		JMenu mnNewMenu_1 = new JMenu("File");
		menuBar_1.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("1_menu");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("2_menu");
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu_2 = new JMenu("Run");
		menuBar_1.add(mnNewMenu_2);


		
	}
}
