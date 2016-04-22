/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T2;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
/**
 *
 * @author bernardo
 */
public class T2_Exercicio extends JFrame implements ListSelectionListener{
    JTextArea txt1,txt2;
    JTextField txt3;
    DefaultListModel opcoesLista;
    JList Estados;
    
    T2_Exercicio()
    {   
        String e[] = {"AC","AL","AP","AM","BA","CE","DF","ES","GO","MA","MT","MS"
        ,"MG","PA","PB","PR","PE","PI","RJ","RN","RS","RO","RR","SC","SP","SE","TO"};
        setSize(350, 150);
        setLayout(new GridLayout(2, 2));
        setTitle("Quarto Exercicio");
       
        txt1 = new JTextArea("Selecione o Estado:");
        txt2 = new JTextArea("O nome do estado é");
        txt3 = new JTextField();
        txt3.setEditable(false);
        opcoesLista = new DefaultListModel();
        Estados = new JList(e);
        Estados.addListSelectionListener(this);
        Estados.setSelectionMode(0);
        Estados.setVisibleRowCount(2);
        
        JScrollPane painel = new JScrollPane(Estados);
        
        add(txt1);
        add(txt2);
        add(painel);
        add(txt3);
    }
    
    public void valueChanged(ListSelectionEvent e) {
        if(e.getSource() == Estados)
            if(Estados.getSelectedValue() == "AC")
            {
                txt3.setText("AC - " + "Acre");
            }
            
            else if(Estados.getSelectedValue() == "AL")
            {
                txt3.setText("AL - " + "Alagoas");
            }
            else if(Estados.getSelectedValue() == "AP")
            {
                txt3.setText("AL - " + "Amapa");
            }
            else if(Estados.getSelectedValue() == "AM")
            {
                txt3.setText("AM - " + "Amazonas");
            }
            else if(Estados.getSelectedValue() == "BA")
            {
                txt3.setText("BA - " + "Bahia");
            }
            else if(Estados.getSelectedValue() == "CE")
            {
                txt3.setText("CE - " + "Ceara");
            }
            else if(Estados.getSelectedValue() == "DF")
            {
                txt3.setText("DF - " + "Destrito Federal");
            }
            else if(Estados.getSelectedValue() == "ES")
            {
                txt3.setText("ES - " + "Espirito Santo");
            }
            else  if(Estados.getSelectedValue() == "GO")
            {
                txt3.setText("GO - " + "Goias");
            }
            else if(Estados.getSelectedValue() == "MA")
            {
                txt3.setText("AC - " + "Maranhao");
            }
            else if(Estados.getSelectedValue() == "MT")
            {
                txt3.setText("MT - " + "Mato Grosso");
            }
            else if(Estados.getSelectedValue() == "MS")
            {
                txt3.setText("MS - " + "Mato Grosso do Sul");
            }
            else if(Estados.getSelectedValue() == "MG")
            {
                txt3.setText("MG - " + "Minas Gerais");
            }
            else if(Estados.getSelectedValue() == "PA")
            {
                txt3.setText("PA - " + "Para");
            }
            else if(Estados.getSelectedValue() == "PB")
            {
                txt3.setText("PB - " + "Paraiba");
            }
            else if(Estados.getSelectedValue() == "PR")
            {
                txt3.setText("PR - " + "Parana");
            }
            else if(Estados.getSelectedValue() == "PE")
            {
                txt3.setText("PE - " + "Pernambuco");
            }
            else if(Estados.getSelectedValue() == "PI")
            {
                txt3.setText("PI - " + "Piaui");
            }
            else if(Estados.getSelectedValue() == "RJ")
            {
                txt3.setText("RJ - " + "Rio de Janeiro");
            }
            else if(Estados.getSelectedValue() == "RO")
            {
                txt3.setText("RO - " + "Rondonia");
            }
            else if(Estados.getSelectedValue() == "RR")
            {
                txt3.setText("RR - " + "Roraima");
            }
            else if(Estados.getSelectedValue() == "SC")
            {
                txt3.setText("SC - " + "Santa Catarina");
            }
            else if(Estados.getSelectedValue() == "SP")
            {
                txt3.setText("SP - " + "São Paulo");
            }
            else if(Estados.getSelectedValue() == "SE")
            {
                txt3.setText("SE - " + "Sergipe");
            }
            else if(Estados.getSelectedValue() == "TO")
            {
                txt3.setText("TO - " + "Tocantins");
            }
    }
}
