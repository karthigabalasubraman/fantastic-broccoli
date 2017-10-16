package AppPackage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ApplicationWidget extends JFrame implements ActionListener {

	 ImageIcon basic;
	    JLabel label1;
	    JFrame frame;
	    JLabel label;
	    JTextField textfield;
	    JButton button;
	  
	    public static void main (String[]args){        
	        ApplicationWidget gui = new ApplicationWidget();
	        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        gui.setVisible(true);
	        gui.setSize(320, 480);
	    }
	        public ApplicationWidget() {

	            setLayout(new FlowLayout());
	            WeatherAPI weather = new WeatherAPI("44418");
	            System.out.println(WeatherAPI.theWeatherRSS);
	            for(int i = 0; i < WeatherAPI.weatherForecastList.size(); i++)
	            {
	                System.out.println(WeatherAPI.weatherForecastList.get(i).lowTemp + " " +
	                WeatherAPI.weatherForecastList.get(i).highTemp);
	            }

	            label = new JLabel("Welcome! Please Enter your location");
	            add(label);

	            textfield = new JTextField(15);
	            add(textfield);
	            for(int i = 0; i < WeatherAPI.weatherForecastList.size(); i++)
	            {
	                System.out.println(WeatherAPI.weatherForecastList.get(i).lowTemp + " " +
	                WeatherAPI.weatherForecastList.get(i).highTemp);
	            }


	            button = new JButton("Check weather");

	            add(button);



	            basic = new ImageIcon(getClass().getResource("basicback.jpg"));
	            label1 = new JLabel(basic);
	            add(label1);

	            /*add design here*/
	            /*add mouse interaction*/
	            /*add image capture*/   
 }	    
	    
	        @Override
	        public void actionPerformed(ActionEvent e){
	        	 JButton button = (JButton) e.getSource();
	             if (e.getSource() == button){
	                 String data = textfield.getText();
	                 System.out.println(data);
	             }


	        }

}
