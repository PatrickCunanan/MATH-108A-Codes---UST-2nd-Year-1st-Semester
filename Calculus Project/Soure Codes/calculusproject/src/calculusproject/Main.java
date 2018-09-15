package calculusproject;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Main implements ActionListener{
	public static JTextField textField;
	protected static JTextField textField_1;
	protected static JTextField textField_2;
	protected static JTextField textField_3;

	public static void Window(){
		JFrame m = new JFrame("JFrame");
		m.setResizable(false);
		m.setTitle("MATH108PROGRAM");
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m.getContentPane().setBackground(SystemColor.desktop);
		SpringLayout springLayout = new SpringLayout();
		m.getContentPane().setLayout(springLayout);
		
		JLabel lblMathaProject = new JLabel("MATH 108A PROJECT");
		lblMathaProject.setHorizontalAlignment(SwingConstants.CENTER);
		springLayout.putConstraint(SpringLayout.NORTH, lblMathaProject, 11, SpringLayout.NORTH, m.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblMathaProject, 12, SpringLayout.WEST, m.getContentPane());
		lblMathaProject.setForeground(Color.WHITE);
		lblMathaProject.setFont(new Font("Arial Black", Font.BOLD, 14));
		m.getContentPane().add(lblMathaProject);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.WEST, panel, 12, SpringLayout.WEST, m.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, -10, SpringLayout.EAST, m.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblMathaProject, 0, SpringLayout.EAST, panel);
		springLayout.putConstraint(SpringLayout.NORTH, panel, 41, SpringLayout.NORTH, m.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, -10, SpringLayout.SOUTH, m.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblMathaProject, -6, SpringLayout.NORTH, panel);
		panel.setBackground(SystemColor.control);
		m.getContentPane().add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JLabel lblNewLabel = new JLabel("Suppose that $");
		sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel, -178, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel, -329, SpringLayout.EAST, panel);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, textField, -1, SpringLayout.NORTH, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.WEST, textField, 6, SpringLayout.EAST, lblNewLabel);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblIsInvestedAt = new JLabel("is invested at ");
		sl_panel.putConstraint(SpringLayout.NORTH, lblIsInvestedAt, 0, SpringLayout.NORTH, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.WEST, lblIsInvestedAt, 5, SpringLayout.EAST, textField);
		lblIsInvestedAt.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(lblIsInvestedAt);
		
		textField_1 = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, textField_1, -1, SpringLayout.NORTH, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.WEST, textField_1, 6, SpringLayout.EAST, lblIsInvestedAt);
		sl_panel.putConstraint(SpringLayout.EAST, textField_1, -54, SpringLayout.EAST, panel);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label = new JLabel("%");
		sl_panel.putConstraint(SpringLayout.NORTH, label, 0, SpringLayout.NORTH, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.WEST, label, 6, SpringLayout.EAST, textField_1);
		label.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(label);
		
		JLabel lblInterestCompoundedContinuously = new JLabel("interest compounded continuously. After how many years");
		sl_panel.putConstraint(SpringLayout.NORTH, lblInterestCompoundedContinuously, 6, SpringLayout.SOUTH, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.WEST, lblInterestCompoundedContinuously, 0, SpringLayout.WEST, lblNewLabel);
		lblInterestCompoundedContinuously.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(lblInterestCompoundedContinuously);
		
		JLabel lblWillTheAccount = new JLabel("will the account reach $");
		sl_panel.putConstraint(SpringLayout.NORTH, lblWillTheAccount, 6, SpringLayout.SOUTH, lblInterestCompoundedContinuously);
		sl_panel.putConstraint(SpringLayout.EAST, lblWillTheAccount, -212, SpringLayout.EAST, panel);
		lblWillTheAccount.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(lblWillTheAccount);
		
		textField_2 = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, textField_2, 6, SpringLayout.SOUTH, lblInterestCompoundedContinuously);
		sl_panel.putConstraint(SpringLayout.WEST, textField_2, 6, SpringLayout.EAST, lblWillTheAccount);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label_1 = new JLabel("?");
		sl_panel.putConstraint(SpringLayout.NORTH, label_1, 6, SpringLayout.SOUTH, lblInterestCompoundedContinuously);
		sl_panel.putConstraint(SpringLayout.WEST, label_1, 10, SpringLayout.EAST, textField_2);
		label_1.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(label_1);
		
		JButton btnCalculate = new JButton("Calculate!");
		sl_panel.putConstraint(SpringLayout.WEST, btnCalculate, 0, SpringLayout.WEST, textField);
		btnCalculate.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnCalculate.setBackground(SystemColor.textHighlight);
		panel.add(btnCalculate);
		btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent i) {
                try {
                        Calculate.Calc(i);
                    } catch (Exception ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
		
		JLabel lblFormula = new JLabel("Formula:");
		sl_panel.putConstraint(SpringLayout.WEST, lblFormula, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblFormula, -56, SpringLayout.SOUTH, panel);
		lblFormula.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(lblFormula);
		
		JLabel lblTr = new JLabel("T = (1/r) ln (FV/PV)");
		sl_panel.putConstraint(SpringLayout.NORTH, lblTr, 6, SpringLayout.SOUTH, lblFormula);
		sl_panel.putConstraint(SpringLayout.WEST, lblTr, 0, SpringLayout.WEST, lblNewLabel);
		lblTr.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(lblTr);
		
		JLabel lblAnswer = new JLabel("Answer:");
		sl_panel.putConstraint(SpringLayout.NORTH, lblAnswer, 0, SpringLayout.NORTH, lblFormula);
		sl_panel.putConstraint(SpringLayout.WEST, lblAnswer, 156, SpringLayout.EAST, lblFormula);
		lblAnswer.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(lblAnswer);
		
		textField_3 = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, textField_3, -1, SpringLayout.NORTH, lblTr);
		sl_panel.putConstraint(SpringLayout.EAST, textField_3, 0, SpringLayout.EAST, lblIsInvestedAt);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblYears = new JLabel("years");
		sl_panel.putConstraint(SpringLayout.NORTH, lblYears, 0, SpringLayout.NORTH, lblTr);
		sl_panel.putConstraint(SpringLayout.WEST, lblYears, 0, SpringLayout.WEST, textField_1);
		lblYears.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(lblYears);
		
		JButton btnClearValues = new JButton("Clear Values");
		sl_panel.putConstraint(SpringLayout.WEST, btnClearValues, 6, SpringLayout.EAST, btnCalculate);
		sl_panel.putConstraint(SpringLayout.NORTH, btnCalculate, 0, SpringLayout.NORTH, btnClearValues);
		sl_panel.putConstraint(SpringLayout.NORTH, btnClearValues, 14, SpringLayout.SOUTH, textField_2);
		btnClearValues.setBackground(SystemColor.textHighlight);
		btnClearValues.setFont(new Font("Arial Black", Font.PLAIN, 11));
		panel.add(btnClearValues);
		btnClearValues.addActionListener(new ActionListener(){
		    public void actionPerformed(ActionEvent e){
		        textField.setText("");
		        textField_1.setText("");
		        textField_2.setText("");
		        textField_3.setText("");
		    }
		});
		
		m.setSize(472, 297);
	    m.setLocation(300,200);
		m.setVisible(true);
	}
	public static void main(String[] args) {
		Window();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
