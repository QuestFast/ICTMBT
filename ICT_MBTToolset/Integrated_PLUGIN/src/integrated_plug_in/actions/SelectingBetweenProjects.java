package integrated_plug_in.actions;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class SelectingBetweenProjects {

	private JFrame frame = new JFrame("Title Here");
	private Container c1 = new Container();
	private JComboBox<String> comboBox;
	private JButton submitBtn;
	private JList<String> list;
	
	public static void main(String[] args){
		SelectingBetweenProjects mainClass = new SelectingBetweenProjects();
		mainClass.init();
	}
	
	public void init(){
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		c1 = frame.getContentPane();
		c1.setLayout(new BorderLayout());
		


		String[] petStrings = { "Bird", "Cat", "Dog", "Rabbit", "Pig" };
/*		comboBox = new JComboBox<String>(petStrings);
		comboBox.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));*/
		
		
		list = new JList<String>(petStrings);
		list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		list.setLayoutOrientation(JList.VERTICAL);
		list.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,13));
		list.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if (e.getValueIsAdjusting() == false) {

			        if (list.getSelectedIndex() == -1) {
			        //No selection, disable fire button.
			            submitBtn.setEnabled(false);

			        } else {
			        //Selection, enable the fire button.
			            submitBtn.setEnabled(true);
			        }
			    }
			}
		});
		
		list.addMouseListener(new MouseAdapter() {
		    public void mouseClicked(MouseEvent evt) {
		        JList<String> list = (JList<String>)evt.getSource();
		        if (evt.getClickCount() == 2) {
		        	String selectedValue = list.getSelectedValue();					
					JOptionPane.showMessageDialog(c1, "Selected Value: "+selectedValue,"Information",JOptionPane.INFORMATION_MESSAGE);
					frame.setVisible(false);
		        }
		    }
		});
		
		JScrollPane listScroller = new JScrollPane(list);
		listScroller.setPreferredSize(new Dimension(400, 310));
		listScroller.setAutoscrolls(true);

		
		JPanel listPanel = new JPanel();
		listPanel.setLayout(new BorderLayout());
		listPanel.add(listScroller);
		listPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		submitBtn = new JButton("Submit");
		submitBtn.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
		submitBtn.setToolTipText("Submit");
		submitBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		submitBtn.setPreferredSize(new Dimension(100, 30));
		submitBtn.setEnabled(false);
		submitBtn.addMouseListener(new SubmitBtnActionHandler(submitBtn));
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setLayout(new GridBagLayout());
		GridBagConstraints bottomPanelConstraints = new GridBagConstraints();
		bottomPanelConstraints.insets = new Insets(10, 5, 10, 5);
		bottomPanel.add(submitBtn,bottomPanelConstraints);
		
		c1.add(listPanel,BorderLayout.NORTH);
		c1.add(bottomPanel,BorderLayout.SOUTH);
		
		frame.setResizable(false);
		frame.setBounds(0, 0, 300,400);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private class SubmitBtnActionHandler implements MouseListener {

		JButton btn = null;
		
		public SubmitBtnActionHandler(JButton btn) {
			super();
			this.btn = btn;
		}

		@Override
		public void mouseClicked(MouseEvent arg0) {
			String selectedValue = list.getSelectedValue();
			JOptionPane.showMessageDialog(c1, "Selected Value: "+selectedValue,"Information",JOptionPane.INFORMATION_MESSAGE);
			frame.setVisible(false);
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {

		}

		@Override
		public void mouseExited(MouseEvent arg0) {

		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

	}

}
