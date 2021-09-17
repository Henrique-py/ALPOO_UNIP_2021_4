package View;

import Model.Cliente;
import Model.Produto;
import Model.Tecnicos;

public class TelaCadastro extends javax.swing.JFrame {

    
    public TelaCadastro() {
        initComponents();
        tfCliNome.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnTitulo = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        lbLogo = new javax.swing.JLabel();
        pnButtons = new javax.swing.JPanel();
        btGravar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        tbTela = new javax.swing.JTabbedPane();
        pnCliente = new javax.swing.JPanel();
        lbCliNome = new javax.swing.JLabel();
        tfCliNome = new javax.swing.JTextField();
        lbCliCPF = new javax.swing.JLabel();
        lbCliFone = new javax.swing.JLabel();
        lbCliCelular = new javax.swing.JLabel();
        lbCliEmail = new javax.swing.JLabel();
        tfCliEmail = new javax.swing.JTextField();
        tfCliCPF = new javax.swing.JFormattedTextField();
        tfCliFone = new javax.swing.JFormattedTextField();
        tfCliCelular = new javax.swing.JFormattedTextField();
        pnProduto = new javax.swing.JPanel();
        lbProDescricao = new javax.swing.JLabel();
        tfProDescricao = new javax.swing.JTextField();
        lbProEstoque = new javax.swing.JLabel();
        spProEstoque = new javax.swing.JSpinner();
        cbAtivo = new javax.swing.JCheckBox();
        pnProPreco = new javax.swing.JPanel();
        lbProCusto = new javax.swing.JLabel();
        tfProCusto = new javax.swing.JTextField();
        lbProValor = new javax.swing.JLabel();
        tfProValor = new javax.swing.JTextField();
        pnServicos = new javax.swing.JPanel();
        pnTecnicos = new javax.swing.JPanel();
        lbTecNome = new javax.swing.JLabel();
        lbTecSal = new javax.swing.JLabel();
        lbTecVal = new javax.swing.JLabel();
        tfTecNome = new javax.swing.JTextField();
        tfTecSal = new javax.swing.JTextField();
        tfTecVal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnTitulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Cadastro");
        lbTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/InfoSysLogo-Pequeno.png"))); // NOI18N

        javax.swing.GroupLayout pnTituloLayout = new javax.swing.GroupLayout(pnTitulo);
        pnTitulo.setLayout(pnTituloLayout);
        pnTituloLayout.setHorizontalGroup(
            pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTituloLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lbLogo)
                .addGap(78, 78, 78)
                .addComponent(lbTitulo))
        );
        pnTituloLayout.setVerticalGroup(
            pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTituloLayout.createSequentialGroup()
                .addGroup(pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnTituloLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lbTitulo))
                    .addComponent(lbLogo))
                .addGap(11, 11, 11))
        );

        pnButtons.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btGravar.setText("Gravar");
        btGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGravarActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnButtonsLayout = new javax.swing.GroupLayout(pnButtons);
        pnButtons.setLayout(pnButtonsLayout);
        pnButtonsLayout.setHorizontalGroup(
            pnButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnButtonsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btGravar)
                .addGap(18, 18, 18)
                .addComponent(btLimpar)
                .addGap(42, 42, 42))
        );
        pnButtonsLayout.setVerticalGroup(
            pnButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btGravar)
                    .addComponent(btLimpar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbCliNome.setText("Nome:");

        lbCliCPF.setText("CPF:");

        lbCliFone.setText("Telefone:");

        lbCliCelular.setText("Celular:");

        lbCliEmail.setText("Email:");

        try {
            tfCliCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            tfCliFone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            tfCliCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout pnClienteLayout = new javax.swing.GroupLayout(pnCliente);
        pnCliente.setLayout(pnClienteLayout);
        pnClienteLayout.setHorizontalGroup(
            pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnClienteLayout.createSequentialGroup()
                        .addComponent(lbCliFone)
                        .addGap(18, 18, 18)
                        .addComponent(tfCliFone, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
                    .addGroup(pnClienteLayout.createSequentialGroup()
                        .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCliNome)
                            .addComponent(lbCliCPF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfCliNome, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(tfCliCPF)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnClienteLayout.createSequentialGroup()
                        .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCliEmail)
                            .addComponent(lbCliCelular))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfCliEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(tfCliCelular))))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        pnClienteLayout.setVerticalGroup(
            pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCliNome)
                    .addComponent(tfCliNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCliCPF)
                    .addComponent(tfCliCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCliFone)
                    .addComponent(tfCliFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCliCelular)
                    .addComponent(tfCliCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCliEmail)
                    .addComponent(tfCliEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        tbTela.addTab("Clientes", pnCliente);

        pnProduto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbProDescricao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbProDescricao.setText("Descrição:");

        tfProDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfProDescricaoActionPerformed(evt);
            }
        });

        lbProEstoque.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbProEstoque.setText("Estoque:");

        spProEstoque.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spProEstoqueStateChanged(evt);
            }
        });

        cbAtivo.setText("Ativo");

        pnProPreco.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Preço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        pnProPreco.setToolTipText("");
        pnProPreco.setName("Preço"); // NOI18N

        lbProCusto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbProCusto.setText("Custo:");

        lbProValor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbProValor.setText("Valor:");

        javax.swing.GroupLayout pnProPrecoLayout = new javax.swing.GroupLayout(pnProPreco);
        pnProPreco.setLayout(pnProPrecoLayout);
        pnProPrecoLayout.setHorizontalGroup(
            pnProPrecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProPrecoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbProCusto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfProCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(lbProValor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfProValor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        pnProPrecoLayout.setVerticalGroup(
            pnProPrecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProPrecoLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(pnProPrecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbProCusto)
                    .addComponent(tfProCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbProValor)
                    .addComponent(tfProValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnProdutoLayout = new javax.swing.GroupLayout(pnProduto);
        pnProduto.setLayout(pnProdutoLayout);
        pnProdutoLayout.setHorizontalGroup(
            pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnProPreco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnProdutoLayout.createSequentialGroup()
                        .addGroup(pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbProDescricao)
                            .addComponent(lbProEstoque))
                        .addGap(18, 18, 18)
                        .addGroup(pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnProdutoLayout.createSequentialGroup()
                                .addComponent(spProEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbAtivo))
                            .addComponent(tfProDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnProdutoLayout.setVerticalGroup(
            pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbProDescricao)
                    .addComponent(tfProDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbProEstoque)
                    .addComponent(spProEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAtivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnProPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbTela.addTab("Produtos", pnProduto);

        javax.swing.GroupLayout pnServicosLayout = new javax.swing.GroupLayout(pnServicos);
        pnServicos.setLayout(pnServicosLayout);
        pnServicosLayout.setHorizontalGroup(
            pnServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 426, Short.MAX_VALUE)
        );
        pnServicosLayout.setVerticalGroup(
            pnServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 252, Short.MAX_VALUE)
        );

        tbTela.addTab("Serviços", pnServicos);

        lbTecNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbTecNome.setText("Nome:");

        lbTecSal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbTecSal.setText("Sálario:");

        lbTecVal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbTecVal.setText("Valor da Hora:");

        javax.swing.GroupLayout pnTecnicosLayout = new javax.swing.GroupLayout(pnTecnicos);
        pnTecnicos.setLayout(pnTecnicosLayout);
        pnTecnicosLayout.setHorizontalGroup(
            pnTecnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTecnicosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnTecnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnTecnicosLayout.createSequentialGroup()
                        .addComponent(lbTecVal)
                        .addGap(12, 12, 12)
                        .addComponent(tfTecVal, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnTecnicosLayout.createSequentialGroup()
                        .addGroup(pnTecnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTecNome)
                            .addComponent(lbTecSal))
                        .addGap(52, 52, 52)
                        .addGroup(pnTecnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTecNome, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTecSal, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        pnTecnicosLayout.setVerticalGroup(
            pnTecnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTecnicosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnTecnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTecNome)
                    .addComponent(tfTecNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnTecnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTecSal)
                    .addComponent(tfTecSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnTecnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTecVal)
                    .addComponent(tfTecVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(145, Short.MAX_VALUE))
        );

        tbTela.addTab("Técnicos", pnTecnicos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tbTela)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbTela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void limpaCliente(){
        tfCliNome.setText("");
        tfCliCPF.setText("");
        tfCliFone.setText("");
        tfCliCelular.setText("");
        tfCliEmail.setText("");
        tfCliNome.requestFocus();
    }
    
    private void gravaCliente(){
        String nome = tfCliNome.getText();
        String cpf = tfCliCPF.getText();
        String fone = tfCliFone.getText();
        String celular = tfCliCelular.getText();
        String email = tfCliEmail.getText();
        System.out.println(new Cliente(nome, cpf, fone, celular, email));
        limpaCliente();
    }
    private void gravaProduto(){
        String descricao = tfProDescricao.getText();
        int estoque = (int) spProEstoque.getValue();
        double custo = Double.parseDouble(tfProCusto.getText());
        double valor = Double.parseDouble(tfProValor.getText());
        System.out.println(new Produto(descricao,estoque,custo,valor));
        limpaProduto();
    }
    private void limpaProduto(){
        tfProDescricao.setText("");
        spProEstoque.setValue(0);
        cbAtivo.setSelected(false);
        tfProCusto.setText("");
        tfProValor.setText("");
        tfProDescricao.requestFocus();
    }
    private void limpaTecnicos(){
        tfTecNome.setText("");
        tfTecSal.setText("");
        tfTecVal.setText("");
        tfTecNome.requestFocus();
    }
    
    private void gravaTecnicos(){
        String nome = tfTecNome.getText();
        String salario = tfTecSal.getText();
        String valorH = tfTecVal.getText();
        System.out.println(new Tecnicos(nome, salario, valorH));
        limpaTecnicos();
    }
    
    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        if (tbTela.getSelectedComponent() == pnCliente) limpaCliente();
        if (tbTela.getSelectedComponent() == pnTecnicos) limpaTecnicos();
        else if (tbTela.getSelectedComponent() == pnProduto) limpaProduto();
        
    }//GEN-LAST:event_btLimparActionPerformed

    private void btGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGravarActionPerformed
        if (tbTela.getSelectedComponent() == pnCliente) gravaCliente();
        if (tbTela.getSelectedComponent() == pnTecnicos) gravaTecnicos();
        else if (tbTela.getSelectedComponent() == pnProduto) gravaProduto();
    }//GEN-LAST:event_btGravarActionPerformed

    private void tfProDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfProDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfProDescricaoActionPerformed

    private void spProEstoqueStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spProEstoqueStateChanged
        int v = (int) spProEstoque.getValue();
        if (v < 0) spProEstoque.setValue(0);
    }//GEN-LAST:event_spProEstoqueStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGravar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JCheckBox cbAtivo;
    private javax.swing.JLabel lbCliCPF;
    private javax.swing.JLabel lbCliCelular;
    private javax.swing.JLabel lbCliEmail;
    private javax.swing.JLabel lbCliFone;
    private javax.swing.JLabel lbCliNome;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbProCusto;
    private javax.swing.JLabel lbProDescricao;
    private javax.swing.JLabel lbProEstoque;
    private javax.swing.JLabel lbProValor;
    private javax.swing.JLabel lbTecNome;
    private javax.swing.JLabel lbTecSal;
    private javax.swing.JLabel lbTecVal;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel pnButtons;
    private javax.swing.JPanel pnCliente;
    private javax.swing.JPanel pnProPreco;
    private javax.swing.JPanel pnProduto;
    private javax.swing.JPanel pnServicos;
    private javax.swing.JPanel pnTecnicos;
    private javax.swing.JPanel pnTitulo;
    private javax.swing.JSpinner spProEstoque;
    private javax.swing.JTabbedPane tbTela;
    private javax.swing.JFormattedTextField tfCliCPF;
    private javax.swing.JFormattedTextField tfCliCelular;
    private javax.swing.JTextField tfCliEmail;
    private javax.swing.JFormattedTextField tfCliFone;
    private javax.swing.JTextField tfCliNome;
    private javax.swing.JTextField tfProCusto;
    private javax.swing.JTextField tfProDescricao;
    private javax.swing.JTextField tfProValor;
    private javax.swing.JTextField tfTecNome;
    private javax.swing.JTextField tfTecSal;
    private javax.swing.JTextField tfTecVal;
    // End of variables declaration//GEN-END:variables
}
