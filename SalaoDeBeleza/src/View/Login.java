package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Panel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private final JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel BemVindo = new JLabel("Bem-Vindo!");
		BemVindo.setBounds(235, 20, 136, 59);
		BemVindo.setFont(new Font("Times New Roman", Font.BOLD, 24));
		contentPane.add(BemVindo);
		
		JButton CadastroCliente = new JButton("Cadastro de cliente");
		CadastroCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		CadastroCliente.setBounds(26, 42, 151, 23);
		contentPane.add(CadastroCliente);
		
		JButton CadastroFuncionario = new JButton("Cadastro de Funcionário");
		CadastroFuncionario.setBounds(26, 80, 151, 23);
		contentPane.add(CadastroFuncionario);
		
		JButton Agenda = new JButton("Agenda");
		Agenda.setBounds(26, 114, 151, 23);
		contentPane.add(Agenda);
		
		JButton Caixa = new JButton("Caixa");
		Caixa.setBounds(26, 148, 151, 23);
		contentPane.add(Caixa);
		
		JButton Login = new JButton("Login");
		Login.setBounds(26, 182, 151, 23);
		contentPane.add(Login);
		
		JLabel lblNewLabel = new JLabel("Escolha uma opção para prosseguir \r\nno programa.");
		lblNewLabel.setBounds(187, 20, 237, 119);
		contentPane.add(lblNewLabel);
	}
}
