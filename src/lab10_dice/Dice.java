package lab10_dice;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Dice extends JFrame {

	private JPanel contentPane;
	private ArrayList<JLabel> dices;
	int num;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dice frame = new Dice();
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
	public Dice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnRoll = new JButton("Roll");
		btnRoll.setFont(new Font("Gurmukhi MN", Font.BOLD, 23));
		contentPane.add(btnRoll, BorderLayout.SOUTH);
		
		btnRoll.setBorder(new EmptyBorder(7, 0, 7, 0));
		btnRoll.setBorderPainted(false);
		btnRoll.setForeground(Color.PINK);
		btnRoll.setBackground(Color.DARK_GRAY);
		btnRoll.setOpaque(true);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel label = new JLabel("");
		panel.add(label);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setHorizontalTextPosition(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(Dice.class.getResource("/diceImages/die-2.png")));
		
		dices = new ArrayList<>();
		for(JLabel dice : dices) {
			dices.add(new JLabel());
		}
		
		btnRoll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random rand = new Random();
				num = rand.nextInt(6) + 1;
				label.setIcon(new ImageIcon(Dice.class.getResource("/diceImages/die-" + num + ".png")));
			}
		});
	}

}
