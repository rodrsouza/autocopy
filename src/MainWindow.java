import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.border.LineBorder;


public class MainWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
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
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 340);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Copia Automatica");
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		layeredPane.setBounds(40, 50, 404, 40);
		frame.getContentPane().add(layeredPane);
		layeredPane.setLayout(null);
		
		JLabel lblOrigem = new JLabel("Origem: ");
		lblOrigem.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblOrigem.setBounds(10, 10, 65, 20);
		layeredPane.add(lblOrigem);
		
		JLabel lblDest = new JLabel("");
		lblDest.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblDest.setBounds(75, 10, 319, 20);
		layeredPane.add(lblDest);
		
		JButton btnNewButton = new JButton("Seleciona Origem");
		btnNewButton.setBounds(307, 101, 137, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		layeredPane_1.setLayout(null);
		layeredPane_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		layeredPane_1.setBounds(40, 148, 404, 40);
		frame.getContentPane().add(layeredPane_1);
		
		JLabel lblDestino = new JLabel("Destino:");
		lblDestino.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDestino.setBounds(10, 10, 65, 20);
		layeredPane_1.add(lblDestino);
		
		JLabel lblDestinoView = new JLabel("");
		lblDestinoView.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblDestinoView.setBounds(75, 10, 319, 20);
		layeredPane_1.add(lblDestinoView);
		
		JButton btnSelecionaDestino = new JButton("Seleciona Destino");
		btnSelecionaDestino.setBounds(307, 199, 137, 23);
		frame.getContentPane().add(btnSelecionaDestino);
		
		JButton btnNewButton_1 = new JButton("Converte para PDF");
		btnNewButton_1.setBounds(179, 268, 155, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
