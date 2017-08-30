package Ejercicio_2;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelVentas extends JPanel {
	
	private JTextField tfArticulo1;
	private JTextField tfValor1;
	private JTextField tfArticulo2;
	private JTextField tfValor2;
	private JTextField tfArticulo3;
	private JTextField tfValor3;
	private JTextField tfCalcularVentas;

	/**
	 * Create the panel.
	 */
	public PanelVentas() {
		
		setBorder(new TitledBorder(null, "Sistema de Ventas Diarias", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		
		setLayout(new GridLayout(5, 4, 5, 5));
		
		JLabel lblArticulo = new JLabel("Articulo 1: ");
		add(lblArticulo);
		
		tfArticulo1 = new JTextField();
		add(tfArticulo1);
		tfArticulo1.setColumns(10);
		
		JLabel lblValor = new JLabel("Valor: ");
		add(lblValor);
		
		tfValor1 = new JTextField();
		add(tfValor1);
		tfValor1.setColumns(10);
		
		JLabel lblArticulo_1 = new JLabel("Articulo 2: ");
		add(lblArticulo_1);
		
		tfArticulo2 = new JTextField();
		add(tfArticulo2);
		tfArticulo2.setColumns(10);
		
		JLabel lblValor_1 = new JLabel("Valor: ");
		add(lblValor_1);
		
		tfValor2 = new JTextField();
		add(tfValor2);
		tfValor2.setColumns(10);
		
		JLabel lblArticulo_2 = new JLabel("Articulo 3: ");
		add(lblArticulo_2);
		
		tfArticulo3 = new JTextField();
		add(tfArticulo3);
		tfArticulo3.setColumns(10);
		
		JLabel lblValor_2 = new JLabel("Valor");
		add(lblValor_2);
		
		tfValor3 = new JTextField();
		add(tfValor3);
		tfValor3.setColumns(10);
		
		JLabel label_1 = new JLabel("");
		add(label_1);
		
		JLabel label_2 = new JLabel("");
		add(label_2);
		
		JButton btnCalcularVentas = new JButton("Calcular Ventas");
		
		btnCalcularVentas.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
			
				float valor1 = 0;
				float valor2 = 0;
				float valor3 = 0;
				float Suma = 0;
				
				valor1 = Integer.parseInt(tfValor1.getText());
				valor2 = Integer.parseInt(tfValor2.getText());
				valor3 = Integer.parseInt(tfValor3.getText());
				
				Suma=valor1+valor2+valor3;
				
				tfCalcularVentas.setText(String.valueOf(Suma));
		
			}
		});
				
		add(btnCalcularVentas);
		
		tfCalcularVentas = new JTextField();
		add(tfCalcularVentas);
		tfCalcularVentas.setColumns(10);
		
		JLabel label = new JLabel("");
		add(label);
		
		JLabel label_3 = new JLabel("");
		add(label_3);
		
		JButton btnLimpiar = new JButton("Limpiar");
		
		btnLimpiar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				tfArticulo1.setText(null);
				tfArticulo2.setText(null);
				tfArticulo3.setText(null);				
				tfValor1.setText(null);
				tfValor2.setText(null);
				tfValor3.setText(null);
				tfCalcularVentas.setText(null);
			}
		});
		add(btnLimpiar);
		
		JButton btnSalir = new JButton("Salir");
		
		btnSalir.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				System.exit(WIDTH);
			}
		});
		add(btnSalir);

	}

}
