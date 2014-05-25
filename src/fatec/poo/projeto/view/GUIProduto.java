package fatec.poo.projeto.view;

import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;

public class GUIProduto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JPanel jPanel = null;
	private JLabel jLabel1 = null;
	private JTextField txtDescricao = null;
	private JLabel jLabel2 = null;
	private JTextField txtQtDisponivel = null;
	private JLabel jLabel3 = null;
	private JTextField txtEstoqueMinimo = null;
	private JLabel jLabel4 = null;
	private JTextField txtPrecoUnit = null;
	private JButton btnConsultar = null;
	private JButton btnIncluir = null;
	private JButton btnAlterar = null;
	private JButton btnExcluir = null;
	private JButton btnSair = null;
	private JLabel jLabel5 = null;
	private JTextField txtIdProduto = null;

	/**
	 * This is the default constructor
	 */
	public GUIProduto() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(568, 269);
		this.setContentPane(getJContentPane());
		this.setTitle("Cadastro - Produto");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel5 = new JLabel();
			jLabel5.setBounds(new Rectangle(32, 25, 16, 16));
			jLabel5.setText("Id:");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(getJPanel(), null);
			jContentPane.add(getBtnConsultar(), null);
			jContentPane.add(getBtnIncluir(), null);
			jContentPane.add(getBtnAlterar(), null);
			jContentPane.add(getBtnExcluir(), null);
			jContentPane.add(getBtnSair(), null);
			jContentPane.add(jLabel5, null);
			jContentPane.add(getTxtIdProduto(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			jLabel4 = new JLabel();
			jLabel4.setBounds(new Rectangle(17, 61, 78, 16));
			jLabel4.setText("Preço Unit:");
			jLabel3 = new JLabel();
			jLabel3.setBounds(new Rectangle(13, 88, 82, 16));
			jLabel3.setText("Estoque Mín:");
			jLabel2 = new JLabel();
			jLabel2.setBounds(new Rectangle(226, 61, 97, 16));
			jLabel2.setText("Qtd.Disponível:");
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(28, 31, 67, 16));
			jLabel1.setText("Descrição:");
			jPanel = new JPanel();
			jPanel.setLayout(null);
			jPanel.setBounds(new Rectangle(32, 55, 496, 123));
			jPanel.setBorder(BorderFactory.createTitledBorder(null, "Dados do Produto", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Dialog", Font.BOLD, 12), new Color(51, 51, 51)));
			jPanel.add(jLabel1, null);
			jPanel.add(getTxtDescricao(), null);
			jPanel.add(jLabel2, null);
			jPanel.add(getTxtQtDisponivel(), null);
			jPanel.add(jLabel3, null);
			jPanel.add(getTxtEstoqueMinimo(), null);
			jPanel.add(jLabel4, null);
			jPanel.add(getTxtPrecoUnit(), null);
		}
		return jPanel;
	}

	/**
	 * This method initializes txtDescricao	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtDescricao() {
		if (txtDescricao == null) {
			txtDescricao = new JTextField();
			txtDescricao.setBounds(new Rectangle(103, 27, 349, 23));
		}
		return txtDescricao;
	}

	/**
	 * This method initializes txtQtDisponivel	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtQtDisponivel() {
		if (txtQtDisponivel == null) {
			txtQtDisponivel = new JTextField();
			txtQtDisponivel.setBounds(new Rectangle(328, 58, 123, 23));
		}
		return txtQtDisponivel;
	}

	/**
	 * This method initializes txtEstoqueMinimo	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtEstoqueMinimo() {
		if (txtEstoqueMinimo == null) {
			txtEstoqueMinimo = new JTextField();
			txtEstoqueMinimo.setBounds(new Rectangle(103, 88, 92, 23));
		}
		return txtEstoqueMinimo;
	}

	/**
	 * This method initializes txtPrecoUnit	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtPrecoUnit() {
		if (txtPrecoUnit == null) {
			txtPrecoUnit = new JTextField();
			txtPrecoUnit.setBounds(new Rectangle(103, 58, 91, 23));
		}
		return txtPrecoUnit;
	}

	/**
	 * This method initializes btnConsultar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnConsultar() {
		if (btnConsultar == null) {
			btnConsultar = new JButton();
			btnConsultar.setBounds(new Rectangle(32, 193, 91, 23));
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
			btnIncluir.setBounds(new Rectangle(131, 193, 91, 23));
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
			btnAlterar.setBounds(new Rectangle(232, 193, 91, 23));
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
			btnExcluir.setBounds(new Rectangle(333, 193, 91, 23));
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
			btnSair.setBounds(new Rectangle(433, 193, 91, 23));
			btnSair.setText("Sair");
		}
		return btnSair;
	}

	/**
	 * This method initializes txtIdProduto	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtIdProduto() {
		if (txtIdProduto == null) {
			txtIdProduto = new JTextField();
			txtIdProduto.setBounds(new Rectangle(56, 23, 92, 23));
		}
		return txtIdProduto;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
