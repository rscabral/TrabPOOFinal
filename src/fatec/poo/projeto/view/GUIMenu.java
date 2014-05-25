package fatec.poo.projeto.view;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class GUIMenu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JMenuBar jJMenuBar = null;
	private JMenu mnuCadastro = null;
	private JMenuItem mitmProduto = null;
	private JMenuItem mitmVendedor = null;
	private JMenuItem mitmCliente = null;
	private JMenuItem mitmSair = null;

	/**
	 * This is the default constructor
	 */
	public GUIMenu() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(300, 200);
		this.setJMenuBar(getJJMenuBar());
		this.setContentPane(getJContentPane());
		this.setTitle("Controle de Vendas");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jJMenuBar	
	 * 	
	 * @return javax.swing.JMenuBar	
	 */
	private JMenuBar getJJMenuBar() {
		if (jJMenuBar == null) {
			jJMenuBar = new JMenuBar();
			jJMenuBar.add(getMnuCadastro());
		}
		return jJMenuBar;
	}

	/**
	 * This method initializes mnuCadastro	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getMnuCadastro() {
		if (mnuCadastro == null) {
			mnuCadastro = new JMenu();
			mnuCadastro.setText("Cadastro");
			mnuCadastro.add(getMitmProduto());
			mnuCadastro.add(getMitmVendedor());
			mnuCadastro.add(getMitmCliente());
			mnuCadastro.add(getMitmSair());
			
		}
		return mnuCadastro;
	}

	/**
	 * This method initializes mitmProduto	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMitmProduto() {
		if (mitmProduto == null) {
			mitmProduto = new JMenuItem();
			mitmProduto.setText("Produto");
			mitmProduto.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					new GUIProduto().setVisible(true);
				}
			});
		}
		return mitmProduto;
	}

	/**
	 * This method initializes mitmVendedor	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMitmVendedor() {
		if (mitmVendedor == null) {
			mitmVendedor = new JMenuItem();
			mitmVendedor.setText("Vendedor");
			mitmVendedor.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					new GUIVendedor().setVisible(true);
				}
			});
			
		}
		return mitmVendedor;
	}

	/**
	 * This method initializes mitmCliente	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMitmCliente() {
		if (mitmCliente == null) {
			mitmCliente = new JMenuItem();
			mitmCliente.setText("Cliente");
			mitmCliente.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					new GUICliente().setVisible(true);
				}
			});
		}
		return mitmCliente;
	}

	/**
	 * This method initializes mitmSair	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMitmSair() {
		if (mitmSair == null) {
			mitmSair = new JMenuItem();
			mitmSair.setText("Sair");
			mitmSair.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					dispose();
				}
			});
		}
		return mitmSair;
	}

}
