package alg22no;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class ders42_slider_ile_not_hesaplama extends JFrame {

	private JPanel contentPane;
	int v,f;
	float ort;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ders42_slider_ile_not_hesaplama frame = new ders42_slider_ile_not_hesaplama();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ders42_slider_ile_not_hesaplama() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel vl = new JLabel("0");
		vl.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		vl.setBounds(10, 11, 27, 26);
		contentPane.add(vl);
		
		JSlider vs = new JSlider();
		vs.setValue(0);
		vs.setPaintTicks(true);
		vs.setPaintLabels(true);
		vs.setMinorTickSpacing(5);
		vs.setMajorTickSpacing(20);
		vs.setBounds(47, 8, 377, 39);
		contentPane.add(vs);
		
		JSlider os = new JSlider();
		os.setValue(0);
		os.setPaintTicks(true);
		os.setPaintLabels(true);
		os.setMinorTickSpacing(5);
		os.setMajorTickSpacing(20);
		os.setBounds(47, 200, 377, 39);
		contentPane.add(os);
		
		JLabel ol = new JLabel("0");
		ol.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		ol.setBounds(10, 200, 40, 26);
		contentPane.add(ol);
		
		JSlider fs = new JSlider();
		fs.setValue(0);
		fs.setPaintTicks(true);
		fs.setPaintLabels(true);
		fs.setMinorTickSpacing(5);
		fs.setMajorTickSpacing(20);
		fs.setBounds(47, 75, 377, 39);
		contentPane.add(fs);
		
		JLabel fl = new JLabel("0");
		fl.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		fl.setBounds(10, 78, 27, 26);
		contentPane.add(fl);
		
		
		vs.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				v = vs.getValue();
				vl.setText(Integer.toString(v));
				f = fs.getValue();
				ort = (float) (v*0.4+f*0.6);
				os.setValue(Math.round(ort));
				ol.setText(Float.toString(ort));
				
				if(ort>=60) os.setBackground(Color.GREEN);
				else if (ort>=55 && ort<60) os.setBackground(Color.ORANGE);
				else os.setBackground(Color.RED);
			}
		});
		
		fs.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				v = vs.getValue();
				f = fs.getValue();
				fl.setText(Integer.toString(f));
				ort = (float) (v*0.4+f*0.6);
				os.setValue(Math.round(ort));
				ol.setText(Float.toString(ort));
				
				if(ort>=60) os.setBackground(Color.GREEN);
				else if (ort>=55 && ort<60) os.setBackground(Color.ORANGE);
				else os.setBackground(Color.RED);
			}
		});
	}
}
