package fatec.poo.projeto.view;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;

public class GUICliente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JTextField txtIdCliente = null;
	private JPanel jPanel = null;
	private JPanel jPanel1 = null;
	private JPanel jPanel2 = null;
	private JPanel jPanel3 = null;
	private JLabel jLabel1 = null;
	private JLabel jLabel2 = null;
	private JTextField txtNome = null;
	private JTextField txtCPF = null;
	private JLabel jLabel3 = null;
	private JComboBox cmbUF = null;
	private JLabel jLabel14 = null;
	private JComboBox cmbCidade = null;
	private JLabel jLabel5 = null;
	private JTextField txtEndereco = null;
	private JLabel jLabel6 = null;
	private JLabel jLabel7 = null;
	private JComboBox cmbTelefoneDDD = null;
	private JTextField txtTelefoneNumero = null;
	private JLabel jLabel8 = null;
	private JTextField txtLimiteCredito = null;
	private JLabel jLabel9 = null;
	private JLabel lblLimiteDisponivel = null;
	private JButton btnConsultar = null;
	private JButton btnIncluir = null;
	private JButton btnAlterar = null;
	private JButton btnExcluir = null;
	private JButton btnSair = null;

	/**
	 * This is the default constructor
	 */
	public GUICliente() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(595, 475);
		this.setContentPane(getJContentPane());
		this.setTitle("Cadastro-Cliente");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(32, 25, 16, 16));
			jLabel.setText("Id:");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(getTxtIdCliente(), null);
			jContentPane.add(getJPanel(), null);
			jContentPane.add(getJPanel1(), null);
			jContentPane.add(getJPanel2(), null);
			jContentPane.add(getJPanel3(), null);
			jContentPane.add(getBtnConsultar(), null);
			jContentPane.add(getBtnIncluir(), null);
			jContentPane.add(getBtnAlterar(), null);
			jContentPane.add(getBtnExcluir(), null);
			jContentPane.add(getBtnSair(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes txtIdCliente	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtIdCliente() {
		if (txtIdCliente == null) {
			txtIdCliente = new JTextField();
			txtIdCliente.setBounds(new Rectangle(56, 23, 92, 23));
		}
		return txtIdCliente;
	}

	/**
	 * This method initializes jPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			jLabel2 = new JLabel();
			jLabel2.setBounds(new Rectangle(304, 31, 38, 16));
			jLabel2.setText("CPF:");
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(28, 31, 38, 16));
			jLabel1.setText("Nome:");
			jPanel = new JPanel();
			jPanel.setLayout(null);
			jPanel.setBounds(new Rectangle(32, 58, 491, 63));
			jPanel.setBorder(BorderFactory.createTitledBorder(null, "Dados Pessoais", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Dialog", Font.BOLD, 12), new Color(51, 51, 51)));
			jPanel.add(jLabel1, null);
			jPanel.add(jLabel2, null);
			jPanel.add(getTxtNome(), null);
			jPanel.add(getTxtCPF(), null);
		}
		return jPanel;
	}

	/**
	 * This method initializes jPanel1	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel1() {
		if (jPanel1 == null) {
			jLabel5 = new JLabel();
			jLabel5.setBounds(new Rectangle(28, 62, 63, 16));
			jLabel5.setText("Endereco:");
			jLabel14 = new JLabel();
			jLabel14.setBounds(new Rectangle(218, 30, 48, 16));
			jLabel14.setText("Cidade:");
			jLabel3 = new JLabel();
			jLabel3.setBounds(new Rectangle(67, 30, 24, 16));
			jLabel3.setText("UF:");
			jPanel1 = new JPanel();
			jPanel1.setLayout(null);
			jPanel1.setBounds(new Rectangle(32, 133, 491, 94));
			jPanel1.setBorder(BorderFactory.createTitledBorder(null, "Endereço", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Dialog", Font.BOLD, 12), new Color(51, 51, 51)));
			jPanel1.add(jLabel3, null);
			jPanel1.add(getCmbUF(), null);
			jPanel1.add(jLabel14, null);
			jPanel1.add(getCmbCidade(), null);
			jPanel1.add(jLabel5, null);
			jPanel1.add(getTxtEndereco(), null);
		}
		return jPanel1;
	}

	/**
	 * This method initializes jPanel2	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel2() {
		if (jPanel2 == null) {
			jLabel7 = new JLabel();
			jLabel7.setBounds(new Rectangle(207, 30, 38, 16));
			jLabel7.setText("Fone:");
			jLabel6 = new JLabel();
			jLabel6.setBounds(new Rectangle(54, 30, 38, 16));
			jLabel6.setText("DDD:");
			jPanel2 = new JPanel();
			jPanel2.setLayout(null);
			jPanel2.setBounds(new Rectangle(32, 241, 491, 68));
			jPanel2.setBorder(BorderFactory.createTitledBorder(null, "Contato", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Dialog", Font.BOLD, 12), new Color(51, 51, 51)));
			jPanel2.add(jLabel6, null);
			jPanel2.add(jLabel7, null);
			jPanel2.add(getCmbTelefoneDDD(), null);
			jPanel2.add(getTxtTelefoneNumero(), null);
		}
		return jPanel2;
	}

	/**
	 * This method initializes jPanel3	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel3() {
		if (jPanel3 == null) {
			lblLimiteDisponivel = new JLabel();
			lblLimiteDisponivel.setBounds(new Rectangle(362, 20, 116, 23));
			lblLimiteDisponivel.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
			lblLimiteDisponivel.setText("");
			jLabel9 = new JLabel();
			jLabel9.setBounds(new Rectangle(245, 24, 104, 16));
			jLabel9.setText("Limite Disponivel:");
			jLabel8 = new JLabel();
			jLabel8.setBounds(new Rectangle(8, 26, 89, 16));
			jLabel8.setText("Limite Credito:");
			jPanel3 = new JPanel();
			jPanel3.setLayout(null);
			jPanel3.setBounds(new Rectangle(32, 329, 491, 59));
			jPanel3.setBorder(BorderFactory.createTitledBorder(null, "Dados Financeiros", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Dialog", Font.BOLD, 12), new Color(51, 51, 51)));
			jPanel3.add(jLabel8, null);
			jPanel3.add(getTxtLimiteCredito(), null);
			jPanel3.add(jLabel9, null);
			jPanel3.add(lblLimiteDisponivel, null);
		}
		return jPanel3;
	}

	/**
	 * This method initializes txtNome	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtNome() {
		if (txtNome == null) {
			txtNome = new JTextField();
			txtNome.setBounds(new Rectangle(74, 27, 212, 23));
		}
		return txtNome;
	}

	/**
	 * This method initializes txtCPF	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtCPF() {
		if (txtCPF == null) {
			txtCPF = new JTextField();
			txtCPF.setBounds(new Rectangle(351, 28, 119, 23));
		}
		return txtCPF;
	}

	/**
	 * This method initializes cmbUF	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCmbUF() {
		if (cmbUF == null) {
			cmbUF = new JComboBox();
			cmbUF.setBounds(new Rectangle(98, 28, 76, 23));
		}
		return cmbUF;
	}

	/**
	 * This method initializes cmbCidade	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCmbCidade() {
		if (cmbCidade == null) {
			cmbCidade = new JComboBox();
			cmbCidade.setBounds(new Rectangle(279, 29, 189, 23));
		}
		return cmbCidade;
	}

	/**
	 * This method initializes txtEndereco	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtEndereco() {
		if (txtEndereco == null) {
			txtEndereco = new JTextField();
			txtEndereco.setBounds(new Rectangle(98, 59, 371, 23));
		}
		return txtEndereco;
	}

	/**
	 * This method initializes cmbTelefoneDDD	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCmbTelefoneDDD() {
		if (cmbTelefoneDDD == null) {
			cmbTelefoneDDD = new JComboBox();
			cmbTelefoneDDD.setBounds(new Rectangle(97, 29, 78, 23));
		}
		return cmbTelefoneDDD;
	}

	/**
	 * This method initializes txtTelefoneNumero	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtTelefoneNumero() {
		if (txtTelefoneNumero == null) {
			txtTelefoneNumero = new JTextField();
			txtTelefoneNumero.setBounds(new Rectangle(256, 29, 125, 23));
		}
		return txtTelefoneNumero;
	}

	/**
	 * This method initializes txtLimiteCredito	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtLimiteCredito() {
		if (txtLimiteCredito == null) {
			txtLimiteCredito = new JTextField();
			txtLimiteCredito.setBounds(new Rectangle(104, 20, 116, 23));
		}
		return txtLimiteCredito;
	}

	/**
	 * This method initializes btnConsultar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnConsultar() {
		if (btnConsultar == null) {
			btnConsultar = new JButton();
			btnConsultar.setBounds(new Rectangle(32, 401, 91, 23));
			btnConsultar.setText("Consultar");
		}
		return btnConsultar;
	}

	/**
	 * This method initializes btnIncluir	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnIncluir() {
		if (btnIncluir == null) {
			btnIncluir = new JButton();
			btnIncluir.setBounds(new Rectangle(133, 401, 91, 23));
			btnIncluir.setText("Incluir");
		}
		return btnIncluir;
	}

	/**
	 * This method initializes btnAlterar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnAlterar() {
		if (btnAlterar == null) {
			btnAlterar = new JButton();
			btnAlterar.setBounds(new Rectangle(230, 401, 91, 23));
			btnAlterar.setText("Alterar");
		}
		return btnAlterar;
	}

	/**
	 * This method initializes btnExcluir	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnExcluir() {
		if (btnExcluir == null) {
			btnExcluir = new JButton();
			btnExcluir.setBounds(new Rectangle(328, 401, 91, 23));
			btnExcluir.setText("Excluir");
		}
		return btnExcluir;
	}

	/**
	 * This method initializes btnSair	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnSair() {
		if (btnSair == null) {
			btnSair = new JButton();
			btnSair.setBounds(new Rectangle(424, 401, 91, 23));
			btnSair.setText("Sair");
		}
		return btnSair;
	}

}  //  @jve:decl-index=0:visual-constraint="21,16"
