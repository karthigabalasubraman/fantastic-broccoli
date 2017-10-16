import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.InputStream;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import java.awt.Font;
import javax.swing.AbstractListModel;
import javax.swing.JComponent;
import javax.swing.JButton;


//public class AllInOne implements ActionListener {
public class AllInOne  {
	
	//protected static final String frame = null;
	private JTextField textFieldMessage;
	private JLabel lblClock;
	private JFrame frame;
	JFrame guiFrame = new JFrame();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable(){
			public void run() {
	    try {
	    	AllInOne window = new AllInOne();
	        window.frame.setVisible(true);
	    	
	} catch (Exception e) {
		e.printStackTrace();
		}
	}
	
	
	
	public void clock() {
		
	Thread clock = new Thread() {
	public void run() {
		try {
			for(;;) {
				Calendar cal = Calendar.getInstance();   
				//Calendar cal = new GregorianCalendar();
				int day = cal.get(Calendar.DAY_OF_MONTH);
				int month = cal.get(Calendar.MONTH);
				int year = cal.get(Calendar.YEAR);
				int second = cal.get(Calendar.SECOND);
				int minute = cal.get(Calendar.MINUTE);
				int hour = cal.get(Calendar.HOUR);
				lblClock.setText("Time "+hour+":"+minute+":"+second+"Date"+year+"/"+month+"/"+day);
				sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			}
		};
		clock.start();
			
	//Get current date time
	public AllInOne() {
		initialize();
		clock();
	}
	//Initialize the content of the frame
	private void initialize() {
	frame = new JFrame();
	frame.setBounds(100,100,450,300);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);
	
	JButton btnClick = new JButton("click");
	btnClick.addActionListener(new ActionListener() {
		public void actinPerformed(ActionEvent args) {
			frame.display();
			emp1 e = new emp1();
			e.setVisible(true);
		}
	});
	btnClick.setBounds(50,4,16,23);
	frame.getContentPane().add(btnClick);
	
	JLabel lblNewLabel1 = new JLabel("New label");
	Image img = new ImageIcon(this.getClass().getResource("/ok_icon.pg")).getImage();
	lblNewLabel1.setIcon(new ImageIcon(img));
	lblNewLabel1.setBounds(10,0,30,31);
	frame.getContentPane().add(lblNewLabel1);
	
	JList list = new JList();
	list.setModel(new AbstractListModel() {
		String[] values = new String[] {"Mark","July","Peter"};
		
		public int getSize() {
			return values.length;
		}
		public Object getElementAt(int index) {
			return values[index];
		}
	});
	list.setBounds(175,7,166,20);
	frame.getContentPane().add(list);
	
	JButton btnLoadValue = new JButton("Load Value");
	btnLoadValue.addActionListener(new ActionListener);
	
	public void actionPerformed(ActionEvent args) {
		DefaultListModel DLM = new DefaultListModel();
		DLM.addElement("Mark");
		DLM.addElement("July");
		DLM.addElement("Jhon");
		DLM.addElement("Peter");
		list.setModel(DLM);
	}
	});
		
	btnLoadValue.setBounds(76,4,89,23);
	frame.getContentPane().add(btnLoadValue);
	
	lblClock = new JLabel("Clock");
	lblClock.setFont(new font("Tahoma",font.Bold,20));
	lblClock.setBounds(20,61,392,166);
	frame.getContenPane().add(lblClock);
	}
	}
		}