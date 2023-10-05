/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author 0068961
 */
public class controlGame {

    DefaultListModel<String> listaGanhador = new DefaultListModel<>();
    static int pontoPlayer = 0;
    static int pontoCPU = 0;
    
    public controlGame() {
    }

    public void rodada(int jogadaPlayer, int jogadaCPU, JLabel jogadaPlayerTxt, 
            JLabel jogadaCPUTxt, JList rodadaList, String nomePlayer,
            JLabel placarPlayer, JLabel placarCPU) {

        
        rodadaList.setModel(listaGanhador);
        
        switch (jogadaPlayer) {
            case 1:
                jogadaPlayerTxt.setText("Pedra");
                switch (jogadaCPU) {
                    case 1:
                        jogadaCPUTxt.setText("Pedra");
                        JOptionPane.showMessageDialog(null, "Resultado: Empate!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 2:
                        jogadaCPUTxt.setText("Papel");
                        JOptionPane.showMessageDialog(null, "Resultado: CPU VENCEU!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                        pontoCPU++;
                        listaGanhador.addElement("CPU");
                        break;
                    case 3:
                        jogadaCPUTxt.setText("Tesoura");
                        JOptionPane.showMessageDialog(null, "Resultado: PLAYER VENCEU!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                        listaGanhador.addElement(nomePlayer);
                        pontoPlayer++;
                        break;
                }
                break;
            case 2:
                jogadaPlayerTxt.setText("Papel");
                switch (jogadaCPU) {
                    case 1:
                        jogadaCPUTxt.setText("Pedra");
                        JOptionPane.showMessageDialog(null, "Resultado: PLAYER VENCEU!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                        listaGanhador.addElement(nomePlayer);
                        pontoPlayer++;
                        break;
                    case 2:
                        jogadaCPUTxt.setText("Papel");
                        JOptionPane.showMessageDialog(null, "Resultado: EMPATE!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 3:
                        jogadaCPUTxt.setText("Tesoura");
                        JOptionPane.showMessageDialog(null, "Resultado: CPU VENCEU!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                        listaGanhador.addElement("CPU");
                        pontoCPU++;
                        break;
                }
                break;
            case 3:
                jogadaPlayerTxt.setText("Tesoura");
                switch (jogadaCPU) {
                    case 1:
                        jogadaCPUTxt.setText("Pedra");
                        JOptionPane.showMessageDialog(null, "Resultado: CPU VENCEU!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                        listaGanhador.addElement("CPU");
                        pontoCPU++;
                        break;
                    case 2:
                        jogadaCPUTxt.setText("Papel");
                        JOptionPane.showMessageDialog(null, "Resultado: PLAYER VENCEU!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                        listaGanhador.addElement(nomePlayer);
                        pontoPlayer++;
                        break;
                    case 3:
                        jogadaCPUTxt.setText("Tesoura");
                        JOptionPane.showMessageDialog(null, "Resultado: EMPATE!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
                break;
        }
        placarPlayer.setText(String.valueOf(pontoPlayer));
        placarCPU.setText(String.valueOf(pontoCPU));
        
    }
}
