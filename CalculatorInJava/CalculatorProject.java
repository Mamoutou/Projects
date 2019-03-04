/* created on April 10, 2016 by Mamoutou Sangare V00010526 
 * This code creates a calculator.
 * the buttons are used to do a calculation and the textfields should be clear before
 * doing any other operations with the clear button.
 * To do a calculation (with +,*,/,-), enter a number, enter a operator, enter a second number and press =
 * To do a calculation (with %), enter a number and press %, the answer will appears in the answer textfield 
 *  
*/

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.SystemColor;

public class CalculatorProject extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	double firstNumber;
	double secondNumber;
	double result;
	String operations;
	String enterNum;
	private JTextField answer1 = new JTextField();;
	private JTextField answer2 = new JTextField();;
	private JTextField answerResult = new JTextField();
	JLabel answerSign = new JLabel("");
	DecimalFormat formatter = new DecimalFormat("###.#########");

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorProject frame = new CalculatorProject();
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
	public CalculatorProject() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 1400, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setBounds(196, 120, 246, 33);
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(textField);
		textField.setColumns(10);

		JButton Button1 = new JButton("1");
		Button1.setBounds(196, 171, 50, 40);
		Button1.setFont(new Font("Tahoma", Font.BOLD, 18));
		Button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterNum = textField.getText() + Button1.getText();
				textField.setText(enterNum);
			}
		});
		contentPane.add(Button1);

		JButton button2 = new JButton("2");
		button2.setBounds(265, 171, 50, 40);
		button2.setFont(new Font("Tahoma", Font.BOLD, 18));
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterNum = textField.getText() + button2.getText();
				textField.setText(enterNum);
			}
		});

		contentPane.add(button2);

		JButton button3 = new JButton("3");
		button3.setBounds(332, 171, 50, 40);
		button3.setFont(new Font("Tahoma", Font.BOLD, 18));
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterNum = textField.getText() + button3.getText();
				textField.setText(enterNum);
			}
		});
		contentPane.add(button3);

		JButton buttonAdd = new JButton("+");
		buttonAdd.setBackground(Color.WHITE);
		buttonAdd.setBounds(392, 171, 50, 40);
		buttonAdd.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";

			}
		});
		contentPane.add(buttonAdd);

		JButton button4 = new JButton("4");
		button4.setBounds(196, 222, 50, 40);
		button4.setFont(new Font("Tahoma", Font.BOLD, 18));
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterNum = textField.getText() + button4.getText();
				textField.setText(enterNum);
			}
		});
		contentPane.add(button4);

		JButton button5 = new JButton("5");
		button5.setBounds(265, 222, 50, 40);
		button5.setFont(new Font("Tahoma", Font.BOLD, 18));
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterNum = textField.getText() + button5.getText();
				textField.setText(enterNum);
			}
		});
		contentPane.add(button5);

		JButton button6 = new JButton("6");
		button6.setBounds(332, 222, 50, 40);
		button6.setFont(new Font("Tahoma", Font.BOLD, 18));
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterNum = textField.getText() + button6.getText();
				textField.setText(enterNum);
			}
		});
		contentPane.add(button6);

		JButton buttonSub = new JButton("-");
		buttonSub.setBackground(Color.WHITE);
		buttonSub.setBounds(392, 222, 50, 40);
		buttonSub.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		contentPane.add(buttonSub);

		JButton button7 = new JButton("7");
		button7.setBounds(196, 281, 50, 40);
		button7.setFont(new Font("Tahoma", Font.BOLD, 18));
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterNum = textField.getText() + button7.getText();
				textField.setText(enterNum);
			}
		});
		JButton buttonPoint = new JButton(".");
		buttonPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterNum = textField.getText() + buttonPoint.getText();
				textField.setText(enterNum);
			}
		});
		buttonPoint.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonPoint.setBounds(265, 330, 50, 40);
		contentPane.add(buttonPoint);

		contentPane.add(button7);

		JButton button8 = new JButton("8");
		button8.setBounds(265, 279, 50, 40);
		button8.setFont(new Font("Tahoma", Font.BOLD, 18));
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterNum = textField.getText() + button8.getText();
				textField.setText(enterNum);
			}
		});
		contentPane.add(button8);

		JButton button9 = new JButton("9");
		button9.setBounds(332, 279, 50, 40);
		button9.setFont(new Font("Tahoma", Font.BOLD, 18));
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterNum = textField.getText() + button9.getText();
				textField.setText(enterNum);
			}
		});
		contentPane.add(button9);

		JButton buttonEqual = new JButton("=");
		buttonEqual.setBackground(Color.GREEN);
		buttonEqual.setBounds(198, 381, 117, 40);
		buttonEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondNumber = Double.parseDouble(textField.getText());
				if (operations == "+") {
					result = firstNumber + secondNumber;
					textField.setText(formatter.format(result));
					answerResult.setText(formatter.format(result));
					textField.setText("");
				} else if (operations == "-") {
					result = firstNumber - secondNumber;
					textField.setText(formatter.format(result));

					answerResult.setText(formatter.format(result));
					textField.setText("");
				} else if (operations == "*") {
					result = firstNumber * secondNumber;
					textField.setText(formatter.format(result));

					answerResult.setText(formatter.format(result));

					textField.setText("");
				} else if (operations == "/") {
					result = firstNumber / secondNumber;
					textField.setText(formatter.format(result));
					answerResult.setText(formatter.format(result));
					textField.setText("");
				}
				answer1.setText(formatter.format(firstNumber) + "");
				answerSign.setText(operations);
				answer2.setText(formatter.format(secondNumber) + "");

			}
		});
		contentPane.add(buttonEqual);

		JButton button0 = new JButton("0");
		button0.setBounds(196, 330, 50, 40);
		button0.setFont(new Font("Tahoma", Font.BOLD, 18));
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNum = textField.getText() + button0.getText();
				textField.setText(enterNum);
			}
		});
		contentPane.add(button0);

		JButton buttonClear = new JButton("Clear");
		buttonClear.setBackground(Color.WHITE);
		buttonClear.setForeground(Color.GREEN);
		buttonClear.setBounds(332, 381, 110, 40);
		buttonClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textField.setText("");
				answer1.setText("");
				answer2.setText("");
				answerSign.setText("");
				answerResult.setText("");

			}
		});
		contentPane.add(buttonClear);

		JLabel lblNewLabel = new JLabel("Answer");
		lblNewLabel.setBounds(109, 446, 76, 24);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel);
		answer1.setBounds(195, 443, 101, 31);
		answer1.setFont(new Font("Tahoma", Font.BOLD, 18));
		answer1.setEditable(false);
		contentPane.add(answer1);
		answer1.setColumns(10);
		answerSign.setBounds(306, 432, 29, 59);

		answerSign.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(answerSign);
		answer2.setBounds(335, 442, 107, 33);
		answer2.setFont(new Font("Tahoma", Font.BOLD, 18));
		answer2.setEditable(false);

		answer2.setColumns(10);
		contentPane.add(answer2);

		JLabel label = new JLabel("=");
		label.setBounds(468, 451, 29, 14);
		label.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(label);
		answerResult.setBounds(496, 442, 145, 33);
		answerResult.setFont(new Font("Tahoma", Font.BOLD, 18));
		answerResult.setBackground(SystemColor.control);
		answerResult.setEditable(false);

		answerResult.setColumns(10);
		contentPane.add(answerResult);

		JButton button = new JButton("*");
		button.setBackground(Color.WHITE);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
			}
		});
		button.setBounds(392, 279, 50, 40);
		button.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(button);

		JButton button_1 = new JButton("/");
		button_1.setBackground(Color.WHITE);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_1.setBounds(392, 330, 50, 40);
		contentPane.add(button_1);

		JLabel lblNewLabel_1 = new JLabel("CALCULATOR CREATED BY MAMOUTOU SANGARE");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(200, 43, 478, 33);
		contentPane.add(lblNewLabel_1);

		JButton buttonPerCent = new JButton("%");
		buttonPerCent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations = "%";
				firstNumber = Double.parseDouble(textField.getText());
				double percentCal = firstNumber / 100;
				answerResult.setText(formatter.format(percentCal) + "");
				answer1.setText(formatter.format(firstNumber) + "");
				answerSign.setText(operations);
				textField.setText("");

			}
		});

		buttonPerCent.setFont(new Font("Tahoma", Font.BOLD, 13));
		buttonPerCent.setBackground(Color.WHITE);
		buttonPerCent.setBounds(332, 330, 50, 40);
		contentPane.add(buttonPerCent);

	}
}
