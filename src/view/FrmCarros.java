package view;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import model.Carros;
import model.Civic;
import model.Ka;
import model.Corolla;
import model.Cruze;

public class FrmCarros extends javax.swing.JFrame {

    //Local onde serão armazenados os carros
    ArrayList<Carros> car = new ArrayList<>();

    public FrmCarros() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgAcessorios = new javax.swing.ButtonGroup();
        btgPortas = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        cmbCarros = new javax.swing.JComboBox<>();
        lblEscolha = new javax.swing.JLabel();
        pnlItens = new javax.swing.JPanel();
        chkAr = new javax.swing.JCheckBox();
        lblCor = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        lblDirecao = new javax.swing.JLabel();
        cmbDirecao = new javax.swing.JComboBox<>();
        lblPlaca = new javax.swing.JLabel();
        lblMotor = new javax.swing.JLabel();
        lblBancos = new javax.swing.JLabel();
        lblPortas = new javax.swing.JLabel();
        lblCombustivel = new javax.swing.JLabel();
        txtCor = new javax.swing.JTextField();
        txtMotor = new javax.swing.JTextField();
        txtBancos = new javax.swing.JTextField();
        txtCombustivel = new javax.swing.JTextField();
        txtPlaca = new javax.swing.JTextField();
        lblModelo = new javax.swing.JLabel();
        rdb2 = new javax.swing.JRadioButton();
        rbd4 = new javax.swing.JRadioButton();
        btnIncluir = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        pnlAcessorios = new javax.swing.JPanel();
        chkA1 = new javax.swing.JCheckBox();
        chkA2 = new javax.swing.JCheckBox();
        chkA3 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        btnListar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLista = new javax.swing.JTextArea();
        btnExcluir = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        cmbCarros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Civic", "Corola", "Cruze", "Ka" }));
        cmbCarros.setSelectedIndex(3);
        cmbCarros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCarrosActionPerformed(evt);
            }
        });

        lblEscolha.setText("Escolha um carro:");

        pnlItens.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Itens de Série:"));

        chkAr.setText("Ar Condicionado:");
        chkAr.setToolTipText("");
        chkAr.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblCor.setText("Cor:");

        lblDirecao.setText("Direção:");

        cmbDirecao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mecânica", "Hidráulica", "Elétrica" }));
        cmbDirecao.setToolTipText("");

        lblPlaca.setText("Placa:");

        lblMotor.setText("Motor:");

        lblBancos.setText("Bancos:");

        lblPortas.setText("Portas:");

        lblCombustivel.setText("Combustível:");

        lblModelo.setText("Modelo:");

        btgPortas.add(rdb2);
        rdb2.setText("2");

        btgPortas.add(rbd4);
        rbd4.setText("4");

        btnIncluir.setText("Incluir");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlItensLayout = new javax.swing.GroupLayout(pnlItens);
        pnlItens.setLayout(pnlItensLayout);
        pnlItensLayout.setHorizontalGroup(
            pnlItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItensLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlItensLayout.createSequentialGroup()
                        .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlItensLayout.createSequentialGroup()
                        .addGroup(pnlItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(pnlItensLayout.createSequentialGroup()
                                    .addComponent(lblPlaca)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlItensLayout.createSequentialGroup()
                                    .addGroup(pnlItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlItensLayout.createSequentialGroup()
                                            .addComponent(lblModelo)
                                            .addGap(18, 18, 18))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlItensLayout.createSequentialGroup()
                                            .addComponent(lblCor)
                                            .addGap(35, 35, 35)))
                                    .addGroup(pnlItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtCor, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                        .addComponent(txtModelo)
                                        .addComponent(txtMotor)))
                                .addComponent(lblMotor)
                                .addGroup(pnlItensLayout.createSequentialGroup()
                                    .addComponent(lblBancos)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtBancos))
                                .addGroup(pnlItensLayout.createSequentialGroup()
                                    .addComponent(lblPortas)
                                    .addGap(18, 18, 18)
                                    .addComponent(rdb2)
                                    .addGap(10, 10, 10)
                                    .addComponent(rbd4))
                                .addGroup(pnlItensLayout.createSequentialGroup()
                                    .addComponent(lblCombustivel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCombustivel)))
                            .addGroup(pnlItensLayout.createSequentialGroup()
                                .addComponent(lblDirecao)
                                .addGap(18, 18, 18)
                                .addComponent(cmbDirecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(chkAr))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlItensLayout.setVerticalGroup(
            pnlItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItensLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlaca)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModelo)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(pnlItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMotor)
                    .addComponent(txtMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(pnlItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBancos)
                    .addComponent(txtBancos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCombustivel))
                .addGap(18, 18, 18)
                .addGroup(pnlItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbd4)
                    .addGroup(pnlItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPortas)
                        .addComponent(rdb2)))
                .addGap(18, 18, 18)
                .addGroup(pnlItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbDirecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDirecao))
                .addGap(18, 18, 18)
                .addComponent(chkAr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(pnlItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar))
                .addContainerGap())
        );

        pnlAcessorios.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Acessórios:"));

        chkA1.setText("AirBag");

        chkA2.setText("Câmbio Automático");

        chkA3.setText("Trio Elétrico");

        javax.swing.GroupLayout pnlAcessoriosLayout = new javax.swing.GroupLayout(pnlAcessorios);
        pnlAcessorios.setLayout(pnlAcessoriosLayout);
        pnlAcessoriosLayout.setHorizontalGroup(
            pnlAcessoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAcessoriosLayout.createSequentialGroup()
                .addGroup(pnlAcessoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkA1)
                    .addComponent(chkA2)
                    .addComponent(chkA3))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlAcessoriosLayout.setVerticalGroup(
            pnlAcessoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAcessoriosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chkA1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkA2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkA3))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlItens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlAcessorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbCarros, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEscolha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEscolha, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbCarros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlItens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlAcessorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        btnListar.setText("Listar Todos");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        txtLista.setEditable(false);
        txtLista.setColumns(20);
        txtLista.setRows(5);
        jScrollPane1.setViewportView(txtLista);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 38, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnListar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                        .addGap(31, 31, 31))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListar)
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnAlterar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFechar)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        boolean campovazio = true;
        switch (cmbCarros.getSelectedIndex()) {

            case 0: //Civic INSERIR EM TODOS: COMBUSTIVEL, BANCOS, MOTOR, DIREÇÃO
                Civic civ = new Civic();
                civ.setModelo(txtModelo.getText());
                civ.setPlaca(txtPlaca.getText());
                civ.setCombustivel(txtCombustivel.getText());
                civ.setBanco(txtBancos.getText());
                civ.setMotor(txtMotor.getText());
                switch (cmbDirecao.getSelectedIndex()) {
                    case 0:
                        civ.setDirecao("Mecânica");
                        break;
                    case 1:
                        civ.setDirecao("Hidráulica");
                        break;
                    case 2:
                        civ.setDirecao("Elétrica");
                        break;
                }
                if (rdb2.isSelected()) {
                    civ.setPortas(2);
                } else {
                    civ.setPortas(4);

                }
                civ.setCor(txtCor.getText());
                civ.setAr(chkAr.isSelected());
                civ.setAirBag(chkA1.isSelected());
                civ.setCambioAutomatico(chkA2.isSelected());
                civ.setTrioEletrico(chkA3.isSelected());
                car.add(civ);
                campovazio = false;
                break;

            case 1: //Ka
                Ka ka = new Ka();
                ka.setModelo(txtModelo.getText());
                ka.setPlaca(txtPlaca.getText());
                ka.setCombustivel(txtCombustivel.getText());
                ka.setMotor(txtMotor.getText());
                ka.setBanco(txtBancos.getText());
                switch (cmbDirecao.getSelectedIndex()) {
                    case 0:
                        ka.setDirecao("Mecânica");
                        break;
                    case 1:
                        ka.setDirecao("Hidráulica");
                        break;
                    case 2:
                        ka.setDirecao("Elétrica");
                        break;
                }
                if (rdb2.isSelected()) {
                    ka.setPortas(2);

                } else {
                    ka.setPortas(4);
                }
                ka.setCor(txtCor.getText());
                ka.setAr(chkAr.isSelected());
                //complete aqui
                ka.setRodasLiga(chkA1.isSelected());
                ka.setDesembarcador(chkA2.isSelected());
                ka.setSomBluetooth(chkA3.isSelected());
                car.add(ka);
                campovazio = false;
                break;

            case 2: //Cruze
                Cruze cr = new Cruze();
                cr.setModelo(txtModelo.getText());
                cr.setPlaca(txtPlaca.getText());
                cr.setCombustivel(txtCombustivel.getText());
                cr.setMotor(txtMotor.getText());
                cr.setBanco(txtBancos.getText());
                switch (cmbDirecao.getSelectedIndex()) {
                    case 0:
                        cr.setDirecao("Mecânica");
                        break;
                    case 1:
                        cr.setDirecao("Hidráulica");
                        break;
                    case 2:
                        cr.setDirecao("Elétrica");
                        break;
                }
                if (rdb2.isSelected()) {
                    cr.setPortas(2);

                } else {
                    cr.setPortas(4);
                }
                cr.setCor(txtCor.getText());
                cr.setAr(chkAr.isSelected());
                //complete aqui
                cr.setSensorEstacionamento(chkA1.isSelected());
                cr.setCambioDualogic(chkA2.isSelected());
                cr.setBagageiroThule(chkA3.isSelected());
                car.add(cr);
                campovazio = false;
                break;

            case 3: //Corola
                Corolla co = new Corolla();
                co.setModelo(txtModelo.getText());
                co.setPlaca(txtPlaca.getText());
                co.setCombustivel(txtCombustivel.getText());
                co.setMotor(txtMotor.getText());
                co.setBanco(txtBancos.getText());
                switch (cmbDirecao.getSelectedIndex()) {
                    case 0:
                        co.setDirecao("Mecânica");
                        break;
                    case 1:
                        co.setDirecao("Hidráulica");
                        break;
                    case 2:
                        co.setDirecao("Elétrica");
                        break;
                }
                if (rdb2.isSelected()) {
                    co.setPortas(2);

                } else {
                    co.setPortas(4);
                }
                co.setCor(txtCor.getText());
                co.setAr(chkAr.isSelected());
                //complete aqui
                co.setAlarmeUltrassonico(chkA1.isSelected());
                co.setSoleira(chkA2.isSelected());
                co.setFrisoLateral(chkA3.isSelected());
                car.add(co);
                campovazio = false;
                break;
        }
        if (campovazio == false) {
            JOptionPane.showMessageDialog(this, "Carro cadastrado com sucesso!");
        }

        if (campovazio == true) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos");

        }

    }//GEN-LAST:event_btnIncluirActionPerformed

    private void cmbCarrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCarrosActionPerformed
        switch (cmbCarros.getSelectedIndex()) {
            case 0: //Civic
                chkA1.setText("Airbag");
                chkA2.setText("Câmbio Automático");
                chkA3.setText("Trio Elétrico");
                break;

            case 1: //Ka
                chkA1.setText("Rodas de Liga Leve");
                chkA2.setText("Desembarcador");
                chkA3.setText("Som Bluetooth");
                break;

            case 2: //Cruze
                chkA1.setText("Sensor Estacionamento");
                chkA2.setText("Câmbio Dualogic");
                chkA3.setText("Bagageiro Thule");
                break;
            case 3: //Corolla
                chkA1.setText("Alarme Ultrassônico");
                chkA2.setText("Soleira");
                chkA3.setText("Friso Lateral");
                break;

        }
    }//GEN-LAST:event_cmbCarrosActionPerformed
    private void formWindowOpened(java.awt.event.WindowEvent evt) {
        cmbCarrosActionPerformed(null);
    }

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        txtLista.setText("");
        String placaTemp = JOptionPane.showInputDialog(this, "informe o carro desejado:", "Pesquisa:", JOptionPane.QUESTION_MESSAGE);
        if (!(placaTemp == null)) {
            for (Carros carros : car) {
                if (carros.getPlaca().equals(placaTemp)) {
                    txtLista.setText(carros.toString());
                    return;
                }

            }
            JOptionPane.showConfirmDialog(this, "carro não encontrado!", "erro:", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed

        txtCombustivel.setText("");
        txtModelo.setText("");
        txtPlaca.setText("");
        txtLista.setText("");
        txtMotor.setText("");
        txtCor.setText("");
        txtBancos.setText("");
        chkAr.setSelected(false);
        chkA1.setSelected(false);
        chkA2.setSelected(false);
        chkA3.setSelected(false);
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        txtLista.setText("");
        for (Carros carros : car) {
            txtLista.setText(txtLista.getText() + carros.toString());
        }
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        txtLista.setText("");
        String placaTemp = JOptionPane.showInputDialog(this, "Informe a placa do carro"
                + " desejado:", "Confimar ação", JOptionPane.QUESTION_MESSAGE);
        if (!(placaTemp == null)) {
            for (Carros carros : car) {
                if (carros.getPlaca().equals(placaTemp)) {
                    car.remove(carros);
                    JOptionPane.showMessageDialog(this, "Carro deletado com sucesso!");
                    return;
                }
            }
            JOptionPane.showMessageDialog(this, "Carro não encontrado!");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Deseja mesmo sair?",
                "Atenção:", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)
                == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        txtLista.setText("");
        String id = JOptionPane.showInputDialog(this, "Informe a placa do Carro: ");
        if (!(id == null)) {
            for (Carros carros : car) {
                String nId = String.valueOf(carros.getPlaca());
                if (JOptionPane.showConfirmDialog(this, "Deseja relamente alterar o carro?")
                        == JOptionPane.YES_OPTION) {
                    if (carros instanceof Civic) {
                        car.remove(carros);
                        Civic objCivic = new Civic();
                        objCivic.setPlaca(id);
                        id = JOptionPane.showInputDialog(this, "Informe o modelo do carro: ");
                        objCivic.setModelo(id);
                        id = JOptionPane.showInputDialog(this, "Informe a cor do carro: ");
                        objCivic.setCor(id);
                        id = JOptionPane.showInputDialog(this, "Informe o tipo do motor do carro: ");
                        objCivic.setMotor(id);
                        id = JOptionPane.showInputDialog(this, "Informe o tipo do banco do carro: ");
                        objCivic.setBanco(id);
                        id = JOptionPane.showInputDialog(this, "Informe o tipo do combustível do carro: ");
                        objCivic.setCombustivel(id);

                        if (JOptionPane.showConfirmDialog(this, "Possui Ar Condicionado?")
                                == JOptionPane.YES_OPTION) {
                            objCivic.setAr(true);
                        } else {
                            objCivic.setAr(false);
                        }
                        if (JOptionPane.showConfirmDialog(this, "Possui Câmbio Automático?")
                                == JOptionPane.YES_OPTION) {
                            objCivic.setCambioAutomatico(true);
                        } else {
                            objCivic.setCambioAutomatico(false);
                        }
                        if (JOptionPane.showConfirmDialog(this, "Possui Trio Elétrico?")
                                == JOptionPane.YES_OPTION) {
                            objCivic.setTrioEletrico(true);
                        } else {
                            objCivic.setTrioEletrico(false);
                        }
                        if (JOptionPane.showConfirmDialog(this, "Possui Air Bag?")
                                == JOptionPane.YES_OPTION) {
                            objCivic.setAirBag(true);
                        } else {
                            objCivic.setAirBag(false);
                        }
                        car.add(objCivic);
                        return;
                    }
                    if (carros instanceof Cruze) {
                        car.remove(carros);
                        Cruze objCruze = new Cruze();
                        objCruze.setPlaca(id);
                        id = JOptionPane.showInputDialog(this, "Informe o modelo do carro: ");
                        objCruze.setModelo(id);
                        id = JOptionPane.showInputDialog(this, "Informe a cor do carro: ");
                        objCruze.setCor(id);
                        id = JOptionPane.showInputDialog(this, "Informe o tipo do motor do carro: ");
                        objCruze.setMotor(id);
                        id = JOptionPane.showInputDialog(this, "Informe o tipo do banco do carro: ");
                        objCruze.setBanco(id);
                        id = JOptionPane.showInputDialog(this, "Informe o tipo do combustível do carro: ");
                        objCruze.setCombustivel(id);
                         if (JOptionPane.showConfirmDialog(this, "Possui Ar Condicionado?")
                                == JOptionPane.YES_OPTION) {
                            objCruze.setAr(true);
                        } else {
                            objCruze.setAr(false);
                        }
                        if (JOptionPane.showConfirmDialog(this, "Possui Sensor de Estacionamento?")
                                == JOptionPane.YES_OPTION) {
                            objCruze.setSensorEstacionamento(true);
                        } else {
                            objCruze.setSensorEstacionamento(false);
                        }
                        if (JOptionPane.showConfirmDialog(this, "Possui Câmbio Dualogic?")
                                == JOptionPane.YES_OPTION) {
                            objCruze.setCambioDualogic(true);
                        } else {
                            objCruze.setCambioDualogic(false);
                        }
                        if (JOptionPane.showConfirmDialog(this, "Possui Bagageiro Thule?")
                                == JOptionPane.YES_OPTION) {
                            objCruze.setBagageiroThule(true);
                        } else {
                            objCruze.setBagageiroThule(false);
                        }

                        car.add(objCruze);
                        return;

                    }
                    if (carros instanceof Corolla) {
                        car.remove(carros);
                        Corolla objCorolla = new Corolla();
                        objCorolla.setPlaca(id);
                        id = JOptionPane.showInputDialog(this, "Informe o modelo do carro: ");
                        objCorolla.setModelo(id);
                        id = JOptionPane.showInputDialog(this, "Informe a cor do carro: ");
                        objCorolla.setCor(id);
                        id = JOptionPane.showInputDialog(this, "Informe o tipo do motor do carro: ");
                        objCorolla.setMotor(id);
                        id = JOptionPane.showInputDialog(this, "Informe o tipo do banco do carro: ");
                        objCorolla.setBanco(id);
                        id = JOptionPane.showInputDialog(this, "Informe o tipo do combustível do carro: ");
                        objCorolla.setCombustivel(id);
                         if (JOptionPane.showConfirmDialog(this, "Possui Ar Condicionado?")
                                == JOptionPane.YES_OPTION) {
                            objCorolla.setAr(true);
                        } else {
                            objCorolla.setAr(false);
                        }
                        if (JOptionPane.showConfirmDialog(this, "Possui Alarme Ultrassônico?")
                                == JOptionPane.YES_OPTION) {
                            objCorolla.setAlarmeUltrassonico(true);
                        } else {
                            objCorolla.setAlarmeUltrassonico(false);
                        }
                        if (JOptionPane.showConfirmDialog(this, "Possui Soleira?")
                                == JOptionPane.YES_OPTION) {
                            objCorolla.setSoleira(true);
                        } else {
                            objCorolla.setSoleira(false);
                        }
                        if (JOptionPane.showConfirmDialog(this, "Possui Friso Lateral?")
                                == JOptionPane.YES_OPTION) {
                            objCorolla.setFrisoLateral(true);
                        } else {
                            objCorolla.setFrisoLateral(false);
                        }
                        car.add(objCorolla);
                        return;
                    } else {
                        car.remove(carros);
                        Ka objKa = new Ka();
                        objKa.setPlaca(id);
                        id = JOptionPane.showInputDialog(this, "Informe o modelo do carro: ");
                        objKa.setModelo(id);
                        id = JOptionPane.showInputDialog(this, "Informe a cor do carro: ");
                        objKa.setCor(id);
                        id = JOptionPane.showInputDialog(this, "Informe o tipo do motor do carro: ");
                        objKa.setMotor(id);
                        id = JOptionPane.showInputDialog(this, "Informe o tipo do banco do carro: ");
                        objKa.setBanco(id);
                        id = JOptionPane.showInputDialog(this, "Informe o tipo do combustível do carro: ");
                        objKa.setCombustivel(id);
                         if (JOptionPane.showConfirmDialog(this, "Possui Ar Condicionado?")
                                == JOptionPane.YES_OPTION) {
                            objKa.setAr(true);
                        } else {
                            objKa.setAr(false);
                        }
                        if (JOptionPane.showConfirmDialog(this, "Possui Desembarcador?")
                                == JOptionPane.YES_OPTION) {
                            objKa.setDesembarcador(true);
                        } else {
                            objKa.setDesembarcador(false);
                        }
                        if (JOptionPane.showConfirmDialog(this, "Possui Rodas Liga?")
                                == JOptionPane.YES_OPTION) {
                            objKa.setRodasLiga(true);
                        } else {
                            objKa.setRodasLiga(false);
                        }
                        if (JOptionPane.showConfirmDialog(this, "Possui Som Bluetooth?")
                                == JOptionPane.YES_OPTION) {
                            objKa.setSomBluetooth(true);
                        } else {
                            objKa.setSomBluetooth(false);
                        }
                        car.add(objKa);
                        return;
                    }
                }
            }
        }


    }//GEN-LAST:event_btnAlterarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCarros.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCarros.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCarros.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCarros.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCarros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgAcessorios;
    private javax.swing.ButtonGroup btgPortas;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JCheckBox chkA1;
    private javax.swing.JCheckBox chkA2;
    private javax.swing.JCheckBox chkA3;
    private javax.swing.JCheckBox chkAr;
    private javax.swing.JComboBox<String> cmbCarros;
    private javax.swing.JComboBox<String> cmbDirecao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBancos;
    private javax.swing.JLabel lblCombustivel;
    private javax.swing.JLabel lblCor;
    private javax.swing.JLabel lblDirecao;
    private javax.swing.JLabel lblEscolha;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblMotor;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblPortas;
    private javax.swing.JPanel pnlAcessorios;
    private javax.swing.JPanel pnlItens;
    private javax.swing.JRadioButton rbd4;
    private javax.swing.JRadioButton rdb2;
    private javax.swing.JTextField txtBancos;
    private javax.swing.JTextField txtCombustivel;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextArea txtLista;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtMotor;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
