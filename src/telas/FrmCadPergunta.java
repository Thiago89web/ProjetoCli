
package telas;

import controller.QuestionarioControle;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import model.Questionario;


public class FrmCadPergunta extends javax.swing.JInternalFrame {
    QuestionarioControle questionarioControle;
    Questionario questionario;   
    DefaultTableModel tableModel;
    boolean verificaEditar = true;
    public FrmCadPergunta() {
        initComponents();
        questionario = new Questionario();
        questionarioControle = new QuestionarioControle();
        tableModel = (DefaultTableModel) jTableQuestionario.getModel();
        
        atualizarLista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabelObrigNome = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        jBtnSalvarQuestao = new javax.swing.JButton();
        jBtnLimpar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_descricao = new javax.swing.JTextArea();
        txt_codigo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableQuestionario = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        jBtnPesquisa = new javax.swing.JButton();
        jLabelObrigNome1 = new javax.swing.JLabel();
        jBtnEditar = new javax.swing.JButton();
        jBtnDeletar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nome..:");

        jLabelObrigNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelObrigNome.setForeground(new java.awt.Color(255, 51, 51));
        jLabelObrigNome.setText("*Obrigatorio");

        jBtnSalvarQuestao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar.png"))); // NOI18N
        jBtnSalvarQuestao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBtnSalvarQuestao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalvarQuestaoActionPerformed(evt);
            }
        });

        jBtnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/limpar.png"))); // NOI18N
        jBtnLimpar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimparActionPerformed(evt);
            }
        });

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        jBtnCancelar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Descrição..:");

        txt_descricao.setColumns(20);
        txt_descricao.setRows(5);
        jScrollPane2.setViewportView(txt_descricao);

        txt_codigo.setEditable(false);
        txt_codigo.setFocusable(false);
        txt_codigo.setRequestFocusEnabled(false);

        jTableQuestionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nome", "Descrição"
            }
        ));
        jScrollPane1.setViewportView(jTableQuestionario);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Cadastro de Perguntas");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Pesquisar.:");

        txt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscarActionPerformed(evt);
            }
        });

        jBtnPesquisa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnPesquisa.setText("ok");
        jBtnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisaActionPerformed(evt);
            }
        });

        jLabelObrigNome1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelObrigNome1.setForeground(new java.awt.Color(255, 51, 51));
        jLabelObrigNome1.setText("*Obrigatorio");

        jBtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar.png"))); // NOI18N
        jBtnEditar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBtnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jBtnEditarMousePressed(evt);
            }
        });
        jBtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditarActionPerformed(evt);
            }
        });

        jBtnDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir.png"))); // NOI18N
        jBtnDeletar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBtnDeletar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jBtnDeletarMousePressed(evt);
            }
        });
        jBtnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDeletarActionPerformed(evt);
            }
        });
        jBtnDeletar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jBtnDeletarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelObrigNome1))
                            .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(82, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel6))
                            .addComponent(txt_nome, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelObrigNome)
                        .addContainerGap(239, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnSalvarQuestao, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jBtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jBtnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jBtnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jBtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_buscar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelObrigNome)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_buscar)
                            .addComponent(jBtnPesquisa))
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelObrigNome1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBtnSalvarQuestao, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnSalvarQuestaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalvarQuestaoActionPerformed
        // TODO add your handling code here:
        popularQuestao();      
        if(verificaEditar==true ? questionarioControle.verificarDados(questionario) : 
            questionarioControle.verificarDadosEditar(questionario)){        
        limparCampos();
        atualizarLista();
        }     
    }//GEN-LAST:event_jBtnSalvarQuestaoActionPerformed

    private void jBtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimparActionPerformed
        // TODO add your handling code here:
        limparCampos();
    }//GEN-LAST:event_jBtnLimparActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void txt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscarActionPerformed

    private void jBtnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisaActionPerformed
        tableModel.setNumRows(0);
        questionarioControle.controlePesquisa(txt_buscar.getText(), tableModel);
    }//GEN-LAST:event_jBtnPesquisaActionPerformed

    private void jBtnEditarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnEditarMousePressed

    }//GEN-LAST:event_jBtnEditarMousePressed

    private void jBtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditarActionPerformed
        // TODO add your handling code here:
        if(jTableQuestionario.getSelectedRowCount()>0){
          // questionarioControle.verificarDadosEditar(questionario);
        questionario = questionarioControle.controlePreencherCampos(Integer.parseInt(tableModel.getValueAt(jTableQuestionario.getSelectedRow(), 0).toString()));
        txt_codigo.setText(questionario.getId_questionario() + "");
        txt_nome.setText(questionario.getNome() + "");
        txt_descricao.setText(questionario.getDescricao() + "");
        verificaEditar = false;
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha da tabela!");
        }
    }//GEN-LAST:event_jBtnEditarActionPerformed

    private void jBtnDeletarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnDeletarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnDeletarMousePressed

    private void jBtnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDeletarActionPerformed

        if(jTableQuestionario.getSelectedRow() >= 0 ){
            questionarioControle.ControleQuestionarioDeletar(Integer.parseInt(tableModel.getValueAt(jTableQuestionario.getSelectedRow(), 0).toString()));
          //  atualizarLista();
        }else{
            questionarioControle.ControleQuestionarioDeletar(0);
        }
    }//GEN-LAST:event_jBtnDeletarActionPerformed

    private void jBtnDeletarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBtnDeletarKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnDeletarKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnDeletar;
    private javax.swing.JButton jBtnEditar;
    private javax.swing.JButton jBtnLimpar;
    private javax.swing.JButton jBtnPesquisa;
    private javax.swing.JButton jBtnSalvarQuestao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelObrigNome;
    private javax.swing.JLabel jLabelObrigNome1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableQuestionario;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextArea txt_descricao;
    private javax.swing.JTextField txt_nome;
    // End of variables declaration//GEN-END:variables
    final void popularQuestao() {        
        questionario.setNome(txt_nome.getText());
        questionario.setDescricao(txt_descricao.getText());       
      }

      final void limparCampos(){
          txt_codigo.setText("");
          txt_nome.setText("");
          txt_descricao.setText("");
      }
      
     final void atualizarLista(){
     tableModel.setNumRows(0);
     questionarioControle.controleListaQuestionario(tableModel);
     
    }
              

}
