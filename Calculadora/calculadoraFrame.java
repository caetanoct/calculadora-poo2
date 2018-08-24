package Calculadora;

import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class calculadoraFrame extends JFrame {
	private JButton but1;
	private JButton but2;
	private JButton but3;
	private JButton but4;
	private JTextField textfield1;
	private JTextField textfield2;
	private JTextField textResult;
	private class ButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == but1) {
				double num1 = Double.parseDouble(textfield1.getText());
				double num2 = Double.parseDouble(textfield2.getText());
				double result = num1 + num2;
				
				textResult.setText(Double.toString(result));
			}
			if(e.getSource() == but2) {
				double num1 = Double.parseDouble(textfield1.getText());
				double num2 = Double.parseDouble(textfield2.getText());
				double result = num1 - num2;
				
				textResult.setText(Double.toString(result));
			}
			if(e.getSource() == but3) {
				double num1 = Double.parseDouble(textfield1.getText());
				double num2 = Double.parseDouble(textfield2.getText());
				double result = num1 * num2;
				
				textResult.setText(Double.toString(result));
			}
			if(e.getSource() == but4) {
				double num1 = Double.parseDouble(textfield1.getText());
				double num2 = Double.parseDouble(textfield2.getText());
				if(num2 == 0) {
					JOptionPane.showMessageDialog(null, "Indefinição Matemática", "ERRO!", JOptionPane.ERROR_MESSAGE);
					textResult.setText("ERRO");
				}
				else {
				double result = num1 / num2;
				
				textResult.setText(Double.toString(result));}
			}
		}
		
	}
	public calculadoraFrame() {
		super("Título");
		setLayout(new FlowLayout());
		JLabel label1 = new JLabel("Informe o primeiro número:");
		add(label1);
		textfield1 = new JTextField(5);
		add(textfield1);
		JLabel label2 = new JLabel("Informe o segundo número:");
		add(label2);
		textfield2 = new JTextField(5);
		add(textfield2);
		Icon sumIcon = new ImageIcon(getClass().getResource("if_1_1_387516.png"));
		but1 = new JButton("Somar", sumIcon);
		add(but1);
		Icon difIcon = new ImageIcon(getClass().getResource("if_1_2_387517.png"));
		but2 = new JButton("Subtrair", difIcon);
		add(but2);
		Icon mulIcon = new ImageIcon(getClass().getResource("if_1_3_387518.png"));
		but3 = new JButton("Multiplicar", mulIcon);
		add(but3);
		Icon divIcon = new ImageIcon(getClass().getResource("if_1_4_387519.png"));
		but4 = new JButton("Dividir", divIcon);
		add(but4);
		ButtonHandler butHandler = new ButtonHandler();
		but1.addActionListener(butHandler);
		but2.addActionListener(butHandler);
		but3.addActionListener(butHandler);
		but4.addActionListener(butHandler);
		textResult = new JTextField(15);
		textResult.setEditable(false);
		add(textResult);
	}
}
