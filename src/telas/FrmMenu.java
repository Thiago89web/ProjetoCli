
package telas;

import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JInternalFrame;



public class FrmMenu extends javax.swing.JFrame {

    
    public FrmMenu() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        jlbHora.setText(MostraHora());
        jlbData.setText(MostraData());
        //this.setTitle("Menu Principal");
        
    }   
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        btnFuncionario = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnOrcamento = new javax.swing.JButton();
        btnAgenda = new javax.swing.JButton();
        btnBuscarAgenda = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnPaciente = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnSair1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btnPagamento = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jlbUSer = new javax.swing.JLabel();
        jlbData = new javax.swing.JLabel();
        jlbHora = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemPaciente = new javax.swing.JMenuItem();
        jMenuItemFunc = new javax.swing.JMenuItem();
        jMenuItemProcedi = new javax.swing.JMenuItem();
        jMenuItemEmp = new javax.swing.JMenuItem();
        jMenuItemUser = new javax.swing.JMenuItem();
        jMenuItemPergunta = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItemPagamento = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1395, 120));

        btnFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/User Accounts.png"))); // NOI18N
        btnFuncionario.setPreferredSize(new java.awt.Dimension(90, 74));
        btnFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuncionarioActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/procedimento.png"))); // NOI18N
        jButton2.setPreferredSize(new java.awt.Dimension(90, 74));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnOrcamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/orcamento.png"))); // NOI18N
        btnOrcamento.setPreferredSize(new java.awt.Dimension(90, 74));
        btnOrcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrcamentoActionPerformed(evt);
            }
        });

        btnAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/agenda.jpg"))); // NOI18N
        btnAgenda.setOpaque(false);
        btnAgenda.setPreferredSize(new java.awt.Dimension(90, 74));
        btnAgenda.setRequestFocusEnabled(false);
        btnAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendaActionPerformed(evt);
            }
        });

        btnBuscarAgenda.setBackground(new java.awt.Color(204, 204, 204));
        btnBuscarAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/buscar-agenda.png"))); // NOI18N
        btnBuscarAgenda.setAlignmentX(0.5F);
        btnBuscarAgenda.setPreferredSize(new java.awt.Dimension(90, 74));
        btnBuscarAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAgendaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Pacientes");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Funcionários");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Orçamento");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Pagamento");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Agendar Consulta");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Buscar Agenda");

        btnPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/paciente.png"))); // NOI18N
        btnPaciente.setPreferredSize(new java.awt.Dimension(90, 74));
        btnPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPacienteActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Procedimentos");

        btnSair1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N
        btnSair1.setPreferredSize(new java.awt.Dimension(90, 74));
        btnSair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSair1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Sair");

        btnPagamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pagamento.png"))); // NOI18N
        btnPagamento.setPreferredSize(new java.awt.Dimension(90, 74));
        btnPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(btnPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(btnAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(btnBuscarAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel12))
                    .addComponent(btnSair1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(276, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSair1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(jLabel8))
                    .addComponent(jLabel12)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Usuário:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Data:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Hora:");

        jlbUSer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlbUSer.setForeground(new java.awt.Color(153, 204, 255));
        jlbUSer.setText("Nome");

        jlbData.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlbData.setForeground(new java.awt.Color(153, 204, 255));
        jlbData.setText("jLabel13");

        jlbHora.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlbHora.setForeground(new java.awt.Color(153, 204, 255));
        jlbHora.setText("jLabel14");

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlbUSer, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlbData, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlbHora, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1337, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(368, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(359, 359, 359))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlbUSer)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlbData)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbHora)
                        .addGap(45, 45, 45))))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addGap(86, 86, 86)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jlbUSer)
                    .addComponent(jlbData)
                    .addComponent(jlbHora))
                .addContainerGap(243, Short.MAX_VALUE))
        );

        jMenu1.setText("Cadastros");
        jMenu1.setPreferredSize(new java.awt.Dimension(100, 35));
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItemPaciente.setText("Pacientes");
        jMenuItemPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPacienteActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemPaciente);

        jMenuItemFunc.setText("Funcionários");
        jMenuItemFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFuncActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemFunc);

        jMenuItemProcedi.setText("Procedimentos");
        jMenuItemProcedi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProcediActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemProcedi);

        jMenuItemEmp.setText("Empresas");
        jMenuItemEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEmpActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemEmp);

        jMenuItemUser.setText("Usuários");
        jMenuItemUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUserActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemUser);

        jMenuItemPergunta.setText("Perguntas");
        jMenuItemPergunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPerguntaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemPergunta);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Orçamentos");
        jMenu2.setPreferredSize(new java.awt.Dimension(100, 35));

        jMenuItem8.setText("Orçamento");
        jMenu2.add(jMenuItem8);

        jMenuItemPagamento.setText("Pagamentos");
        jMenuItemPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPagamentoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemPagamento);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Agenda");
        jMenu3.setPreferredSize(new java.awt.Dimension(100, 35));

        jMenuItem6.setText("Agendar Atendimento");
        jMenu3.add(jMenuItem6);

        jMenuItem7.setText("Visualizar agenda");
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Relatórios");
        jMenu4.setPreferredSize(new java.awt.Dimension(100, 35));

        jMenuItem9.setText("Agenda");
        jMenu4.add(jMenuItem9);

        jMenuItem10.setText("Procedimentos");
        jMenu4.add(jMenuItem10);

        jMenuItem11.setText("Paciente");
        jMenu4.add(jMenuItem11);

        jMenuItem12.setText("Funcionário");
        jMenu4.add(jMenuItem12);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void centralizaForm(JInternalFrame frame) {
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension jInternalFrameSize = frame.getSize();
        frame.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
          (desktopSize.height - jInternalFrameSize.height) / 2);
    }
    
    private String MostraData() {
        //pega data do computador
        Date data = new Date();
        //cria o formatador
        SimpleDateFormat dformatador = new SimpleDateFormat("dd/MM/yyyy");
        // cria a string para armazenar data
        String sData = dformatador.format(data);
        //retorna o pedido
        return sData;
    }

    private String MostraHora() {
        //pega data para converter em horas
        Date data = new Date();
        //cria o formatador
        SimpleDateFormat hformatador = new SimpleDateFormat("hh:mm:ss");
        // cria a string
        String sHora = hformatador.format(data);
        return sHora;
    }
    
    
    private void btnBuscarAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAgendaActionPerformed
        // TODO add your handling code here:
       FrmVisulizarAgenda frmVisuAgend = new FrmVisulizarAgenda();
        jDesktopPane1.add(frmVisuAgend);
        frmVisuAgend.setVisible(true);
        centralizaForm(frmVisuAgend);
        /*String a = getUser();
        System.out.println(a);
        String adm = "ODONTOLOGISTA";
        String adm2 = "ADMINISTRADOR";

        System.out.println(adm);

        if ((a == null ? adm == null : a.equals(adm)) || (a == null ? adm2 == null : a.equals(adm2))) {
            FrmVisulizarAgenda frm = null;
            try {
                frm = new FrmVisulizarAgenda();
            } catch (SQLException ex) {
                Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            frm.show();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Acesso Negado!! Você não possui permissão para acessar!!");
        }*/
    }//GEN-LAST:event_btnBuscarAgendaActionPerformed

    private void btnAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendaActionPerformed
        // TODO add your handling code here:
        FrmAtendimento frmAtend = new FrmAtendimento();
        jDesktopPane1.add(frmAtend);
        frmAtend.setVisible(true);
        centralizaForm(frmAtend);  
        
        /* String a = getUser();
        System.out.println(a);

        String adm = "ADMINISTRADOR";
        String adm2 = "SECRETARIA";
        System.out.println(adm);

        if ((a == null ? adm == null : a.equals(adm)) || (a == null ? adm2 == null : a.equals(adm2))) {

            FrmAtendimento frm = null;
            try {
                frm = new FrmAtendimento();
            } catch (SQLException ex) {
                Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            frm.show();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Acesso Negado!! Você não possui permissão para acessar!!");
        }*/
    }//GEN-LAST:event_btnAgendaActionPerformed

    private void btnFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuncionarioActionPerformed
        FrmCadFuncionario frmFunc = new FrmCadFuncionario();
        jDesktopPane1.add(frmFunc);
        frmFunc.setVisible(true);
        //chama esse método passando o JInternalFrame.
        centralizaForm(frmFunc);
// TODO add your handling code here:
        /* String a = getUser();
        System.out.println(a);
        String adm = "ADMINISTRADOR";
        System.out.println(adm);

        if (a == null ? adm == null : a.equals(adm)) {
            FrmCadFuncionario frm = null;
            try {
                frm = new FrmCadFuncionario();
            } catch (SQLException ex) {
                Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            frm.show();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Acesso Negado!! Você não possui permissão para acessar!!");
        }*/
    }//GEN-LAST:event_btnFuncionarioActionPerformed

    private void btnPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagamentoActionPerformed
        // TODO add your handling code here:
        FrmCadPagamento frmPagamento = new FrmCadPagamento();
        jDesktopPane1.add(frmPagamento);
        frmPagamento.setVisible(true);
        centralizaForm(frmPagamento);
    }//GEN-LAST:event_btnPagamentoActionPerformed

    private void jMenuItemPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPacienteActionPerformed
         FrmCadPaciente frmPaciente = new FrmCadPaciente();        
         jDesktopPane1.add(frmPaciente);
         frmPaciente.setVisible(true);
         centralizaForm(frmPaciente);
         
    }//GEN-LAST:event_jMenuItemPacienteActionPerformed

    private void btnPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacienteActionPerformed
        // TODO add your handling code here:
        
        
        FrmCadPaciente frmPaciente = new FrmCadPaciente();
        jDesktopPane1.add(frmPaciente);
        frmPaciente.setVisible(true);
        //chama esse método passando o JInternalFrame.
        centralizaForm(frmPaciente);
        
        /* String a = getUser();
        System.out.println(a);

        String adm = "ADMINISTRADOR";
        String adm2 = "SECRETARIA";
        System.out.println(adm);

        if ((a == null ? adm == null : a.equals(adm)) || (a == null ? adm2 == null : a.equals(adm2))) {
            FrmCadPaciente frm = null;
            try {
                frm = new FrmCadPaciente();
            } catch (SQLException ex) {
                Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            frm.show();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Acesso Negado!! Você não possui permissão para acessar!!");
        }*/
    }//GEN-LAST:event_btnPacienteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        FrmCadProcedimento frmProced = new FrmCadProcedimento();               
        jDesktopPane1.add(frmProced);
        frmProced.setVisible(true);
        //chama esse método passando o JInternalFrame.
        centralizaForm(frmProced);
       
        /*String a = getUser();
        System.out.println(a);

        String adm = "ADMINISTRADOR";
        String adm2 = "ODONTOLOGISTA";
        System.out.println(adm);

        if ((a == null ? adm == null : a.equals(adm)) || (a == null ? adm2 == null : a.equals(adm2))) {

            FrmCadProcedimento frm = null;
            try {
                frm = new FrmCadProcedimento();
            } catch (SQLException ex) {
                Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            frm.show();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Acesso Negado!! Você não possui permissão para acessar!!");
        }*/
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnOrcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrcamentoActionPerformed
        // TODO add your handling code here:
        FrmCadOrcamento frmOrc = new FrmCadOrcamento();                    
        jDesktopPane1.add(frmOrc);
        frmOrc.setVisible(true);
        centralizaForm(frmOrc);
        /*String a = getUser();
        System.out.println(a);

        String adm = "ADMINISTRADOR";
        String adm2 = "ODONTOLOGISTA";
        System.out.println(adm);

        if ((a == null ? adm == null : a.equals(adm)) || (a == null ? adm2 == null : a.equals(adm2))) {

            FrmCadProcedimento frm = null;
            try {
                frm = new FrmCadProcedimento();
            } catch (SQLException ex) {
                Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            frm.show();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Acesso Negado!! Você não possui permissão para acessar!!");
        }*/
    }//GEN-LAST:event_btnOrcamentoActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItemUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUserActionPerformed
         FrmCadUsuario frmUser = new FrmCadUsuario();        
         jDesktopPane1.add(frmUser);
         frmUser.setVisible(true);
         centralizaForm(frmUser);
         
    }//GEN-LAST:event_jMenuItemUserActionPerformed

    private void jMenuItemFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFuncActionPerformed
        // TODO add your handling code here:       
        FrmCadFuncionario frmFunc = new FrmCadFuncionario();        
         jDesktopPane1.add(frmFunc);
         frmFunc.setVisible(true);
         centralizaForm(frmFunc);
    }//GEN-LAST:event_jMenuItemFuncActionPerformed

    private void jMenuItemProcediActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProcediActionPerformed
        // TODO add your handling code here:      
        FrmCadProcedimento frmProced = new FrmCadProcedimento();        
         jDesktopPane1.add(frmProced);
         frmProced.setVisible(true);
         centralizaForm(frmProced);
    }//GEN-LAST:event_jMenuItemProcediActionPerformed

    private void btnSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSair1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSair1ActionPerformed

    private void jMenuItemPerguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPerguntaActionPerformed
        // TODO add your handling code here:
        FrmCadPergunta frmPergunta = new FrmCadPergunta();        
         jDesktopPane1.add(frmPergunta);
         frmPergunta.setVisible(true);
         centralizaForm(frmPergunta);
    }//GEN-LAST:event_jMenuItemPerguntaActionPerformed

    private void jMenuItemPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPagamentoActionPerformed
        // TODO add your handling code here:
         FrmCadPagamento frmPagItem = new FrmCadPagamento();        
         jDesktopPane1.add(frmPagItem);
         frmPagItem.setVisible(true);
         centralizaForm(frmPagItem);
    }//GEN-LAST:event_jMenuItemPagamentoActionPerformed

    private void jMenuItemEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEmpActionPerformed
        // TODO add your handling code here:
        frmCadEmpresa frmEmpresa = new frmCadEmpresa();        
         jDesktopPane1.add(frmEmpresa);
         frmEmpresa.setVisible(true);
         centralizaForm(frmEmpresa);
    }//GEN-LAST:event_jMenuItemEmpActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgenda;
    private javax.swing.JButton btnBuscarAgenda;
    private javax.swing.JButton btnFuncionario;
    private javax.swing.JButton btnOrcamento;
    private javax.swing.JButton btnPaciente;
    private javax.swing.JButton btnPagamento;
    private javax.swing.JButton btnSair1;
    private javax.swing.JButton jButton2;
    public static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuItemEmp;
    private javax.swing.JMenuItem jMenuItemFunc;
    private javax.swing.JMenuItem jMenuItemPaciente;
    private javax.swing.JMenuItem jMenuItemPagamento;
    private javax.swing.JMenuItem jMenuItemPergunta;
    private javax.swing.JMenuItem jMenuItemProcedi;
    private javax.swing.JMenuItem jMenuItemUser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlbData;
    private javax.swing.JLabel jlbHora;
    private javax.swing.JLabel jlbUSer;
    // End of variables declaration//GEN-END:variables
}
