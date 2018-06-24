package juego;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.border.LineBorder;
import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TatetiWindow extends JFrame 
{

	private JPanel contentPane;
	
	private static JLabel lbl1_1, lbl1_2, lbl1_3;
	private static JLabel lbl2_1, lbl2_2, lbl2_3;
	private static JLabel lbl3_1, lbl3_2, lbl3_3;
	private static JLabel lblQuienJuega;
	private static ImageIcon iconoJugador1;
	private static ImageIcon iconoJugador2;
	private static ImageIcon miniIconoJugador1;
	private static ImageIcon miniIconoJugador2;
	private static boolean turno;
	private static int[][] Tateti;
	
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					TatetiWindow frame = new TatetiWindow();
					frame.setVisible(true);
				} 
				catch (Exception e) {e.printStackTrace();}
			}
		});
	}


	public TatetiWindow() 
	{
		
		// ---------------------------- //
		iconoJugador1 		= new ImageIcon(new ImageIcon("imagenes/equis.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		iconoJugador2 		= new ImageIcon(new ImageIcon("imagenes/circulo.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		miniIconoJugador1 	= new ImageIcon(new ImageIcon("imagenes/equis.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
		miniIconoJugador2 	= new ImageIcon(new ImageIcon("imagenes/circulo.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
		turno 				= true;
		Tateti 				= new int[3][3];
		// ---------------------------- //
				
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 657, 508);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1_1.setBounds(70, 66, 113, 109);
		panel_1_1.setLayout(new BorderLayout(0, 0));
		contentPane.add(panel_1_1);
		
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(Color.WHITE);
		panel_1_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1_2.setBounds(210, 66, 113, 109);
		panel_1_2.setLayout(new BorderLayout(0, 0));
		contentPane.add(panel_1_2);
		
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBackground(Color.WHITE);
		panel_1_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1_3.setBounds(350, 66, 113, 109);
		panel_1_3.setLayout(new BorderLayout(0, 0));
		contentPane.add(panel_1_3);
		
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_1.setBounds(70, 206, 113, 109);
		panel_2_1.setLayout(new BorderLayout(0, 0));
		contentPane.add(panel_2_1);
		
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBackground(Color.WHITE);
		panel_2_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_2.setBounds(210, 206, 113, 109);
		panel_2_2.setLayout(new BorderLayout(0, 0));
		contentPane.add(panel_2_2);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setBackground(Color.WHITE);
		panel_2_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_3.setBounds(350, 206, 113, 109);
		panel_2_3.setLayout(new BorderLayout(0, 0));
		contentPane.add(panel_2_3);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(Color.WHITE);
		panel_3_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3_1.setBounds(70, 346, 113, 109);
		panel_3_1.setLayout(new BorderLayout(0, 0));
		contentPane.add(panel_3_1);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBackground(Color.WHITE);
		panel_3_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3_2.setBounds(210, 346, 113, 109);
		panel_3_2.setLayout(new BorderLayout(0, 0));
		contentPane.add(panel_3_2);
		
		JPanel panel_3_3 = new JPanel();
		panel_3_3.setBackground(Color.WHITE);
		panel_3_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3_3.setBounds(350, 346, 113, 109);
		panel_3_3.setLayout(new BorderLayout(0, 0));
		contentPane.add(panel_3_3);
		
		JLabel lblJugador = new JLabel("Jugador 1");
		lblJugador.setVerticalAlignment(SwingConstants.BOTTOM);
		lblJugador.setFont(new Font("Serif", Font.BOLD, 18));
		lblJugador.setHorizontalAlignment(SwingConstants.LEFT);
		lblJugador.setBounds(70, 12, 113, 29);
		contentPane.add(lblJugador);
		
		JLabel lblJugador_1 = new JLabel("Jugador 2");
		lblJugador_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblJugador_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblJugador_1.setFont(new Font("Serif", Font.BOLD, 18));
		lblJugador_1.setBounds(325, 12, 113, 29);
		contentPane.add(lblJugador_1);
		
		JLabel lblJuega = new JLabel("Juega:");
		lblJuega.setVerticalAlignment(SwingConstants.BOTTOM);
		lblJuega.setHorizontalAlignment(SwingConstants.CENTER);
		lblJuega.setFont(new Font("Dialog", Font.BOLD, 14));
		lblJuega.setBounds(525, 80, 63, 29);
		contentPane.add(lblJuega);
		
		lblQuienJuega = new JLabel("");
		lblQuienJuega.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuienJuega.setFont(new Font("Dialog", Font.BOLD, 14));
		lblQuienJuega.setBounds(525, 106, 63, 54);
		lblQuienJuega.setIcon((Icon) miniIconoJugador1);
		contentPane.add(lblQuienJuega);
		
		JLabel lblJ1 = new JLabel("");
		lblJ1.setHorizontalAlignment(SwingConstants.CENTER);
		lblJ1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblJ1.setBounds(175, 12, 29, 39);
		lblJ1.setIcon((Icon) miniIconoJugador1);
		contentPane.add(lblJ1);
		
		JLabel lblJ2 = new JLabel("");
		lblJ2.setHorizontalAlignment(SwingConstants.CENTER);
		lblJ2.setFont(new Font("Dialog", Font.BOLD, 14));
		lblJ2.setBounds(435, 12, 29, 39);
		lblJ2.setIcon((Icon) miniIconoJugador2);
		contentPane.add(lblJ2);
		
		JButton btNuevoJuego = new JButton("Nuevo Juego");
		btNuevoJuego.setBounds(491, 222, 135, 25);
		contentPane.add(btNuevoJuego);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(491, 272, 135, 25);
		contentPane.add(btnSalir);
		
		// Labels con los iconos
		lbl1_1 = new JLabel("");
		lbl1_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1_1.add(lbl1_1);
		
		lbl1_2 = new JLabel("");
		lbl1_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1_2.add(lbl1_2);
		
		lbl1_3 = new JLabel("");
		lbl1_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1_3.add(lbl1_3);
		
		lbl2_1 = new JLabel("");
		lbl2_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2_1.add(lbl2_1);
		
		lbl2_2 = new JLabel("");
		lbl2_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2_2.add(lbl2_2);
		
		lbl2_3 = new JLabel("");
		lbl2_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2_3.add(lbl2_3);
		
		lbl3_1 = new JLabel("");
		lbl3_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3_1.add(lbl3_1);
		
		lbl3_2 = new JLabel("");
		lbl3_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3_2.add(lbl3_2);
		
		lbl3_3 = new JLabel("");
		lbl3_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3_3.add(lbl3_3);
		
		// Listeners 
		lbl1_1.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				actualizaTateti(0, 0);
				jugada(lbl1_1);
			}
		});
		
		lbl1_2.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				actualizaTateti(0, 1);
				jugada(lbl1_2);
			}
		});
		
		lbl1_3.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				actualizaTateti(0, 2);
				jugada(lbl1_3);
			}
		});
		
		lbl2_1.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				actualizaTateti(1, 0);
				jugada(lbl2_1);
			}
		});
		
		lbl2_2.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				actualizaTateti(1, 1);
				jugada(lbl2_2);
			}
		});
		
		lbl2_3.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				actualizaTateti(1, 2);
				jugada(lbl2_3);
			}
		});
		
		lbl3_1.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				actualizaTateti(2, 0);
				jugada(lbl3_1);
			}
		});
		
		lbl3_2.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				actualizaTateti(2, 1);
				jugada(lbl3_2);
			}
		});
		
		lbl3_3.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				actualizaTateti(2, 2);
				jugada(lbl3_3);
			}
		});
		
		btNuevoJuego.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				reiniciaJuego(2);
			}
		});
		
		btnSalir.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				dispose();
			}
		});
		
	}
	
	
	// ---------------------- METODOS ---------------------- //
	private static void actualizaTateti(int x, int y)
	{
		if (turno == true)
			Tateti[x][y] = 1;
		else
			Tateti[x][y] = 2;
	}
	
	private static void jugada(JLabel lbl)
	{
		if (lbl.getIcon() == null)
		{
			if (turno == true)
			{
				lbl.setIcon((Icon) iconoJugador1);
				lblQuienJuega.setIcon((Icon) miniIconoJugador2);
				turno = false;
			}
			else
			{
				lbl.setIcon((Icon) iconoJugador2);
				lblQuienJuega.setIcon((Icon) miniIconoJugador1);
				turno = true;
			}
		}
		triunfo();
	}
	
	
	private static boolean verificaTriunfo(int idJugador)
	{
		if 
		(
			// Comprueba vertical 
			(Tateti[0][0] == idJugador) && (Tateti[1][0] == idJugador) && (Tateti[2][0] == idJugador) || 
			(Tateti[0][1] == idJugador) && (Tateti[1][1] == idJugador) && (Tateti[2][1] == idJugador) || 
			(Tateti[0][2] == idJugador) && (Tateti[1][2] == idJugador) && (Tateti[2][2] == idJugador) ||
			// Comprueba horizontal 
			(Tateti[0][0] == idJugador) && (Tateti[0][1] == idJugador) && (Tateti[0][2] == idJugador) || 
			(Tateti[1][0] == idJugador) && (Tateti[1][1] == idJugador) && (Tateti[1][2] == idJugador) || 
			(Tateti[2][0] == idJugador) && (Tateti[2][1] == idJugador) && (Tateti[2][2] == idJugador) ||
			// Comprueba diagonal 
			(Tateti[0][0] == idJugador) && (Tateti[1][1] == idJugador) && (Tateti[2][2] == idJugador) || 
			(Tateti[0][2] == idJugador) && (Tateti[1][1] == idJugador) && (Tateti[2][0] == idJugador)
		)
		{
			return true;
		}
		else
			return false;
	}
	
	private static void triunfo()
	{
		if (verificaTriunfo(1))
		{
			JOptionPane.showMessageDialog(null, "El Jugador 1 ha ganado!!", "GANADOR!", JOptionPane.INFORMATION_MESSAGE);
			reiniciaJuego(1);
		}
		else 
		{
			if (verificaTriunfo(2))
			{
				JOptionPane.showMessageDialog(null, "El Jugador 2 ha ganado!!", "GANADOR!", JOptionPane.INFORMATION_MESSAGE);
				reiniciaJuego(2);
			}
			else
			{
				if (huboEmpate())
				{
					JOptionPane.showMessageDialog(null, "Ha habido un empate!!", "EMPATE!", JOptionPane.INFORMATION_MESSAGE);
					reiniciaJuego(2);
				}
			}
		}
	}
	
	private static void reiniciaJuego(int ganador)
	{
		// Dejamos la matriz tateti en cero
		for (int i=0; i<3; i++)
		{
			for (int j=0; j<3; j++)
			{
				Tateti[i][j] = 0;
			}
		}
		
		// Quitamos los iconos de todos los labels
		lbl1_1.setIcon(null);
		lbl1_2.setIcon(null); 
		lbl1_3.setIcon(null);
		lbl2_1.setIcon(null); 
		lbl2_2.setIcon(null); 
		lbl2_3.setIcon(null);
		lbl3_1.setIcon(null); 
		lbl3_2.setIcon(null); 
		lbl3_3.setIcon(null);
		
		// Pasamos el turno al jugador perdedor
		if (ganador == 1)
		{
			turno = false;
			lblQuienJuega.setIcon((Icon) miniIconoJugador2);
		}
		else
		{
			turno = true;
			lblQuienJuega.setIcon((Icon) miniIconoJugador1);
		}
	}
	
	private static boolean huboEmpate()
	{
		boolean empate = true;
		primerLoop:
		for (int i=0; i<3; i++)
		{
			for (int j=0; j<3; j++)
			{
				if (Tateti[i][j] == 0)
				{
					empate = false;
					break primerLoop;
				}
			}
		}
		return empate;
	}
	
}
