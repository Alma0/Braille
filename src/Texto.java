/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import javax.swing.ImageIcon;
/**
 *
 * @author ANA
 * 
 */
public class Texto {
    private char[] abecedario={'a','b','c','d','e','f','g',
        'h','i','j','k','l','m','n','ñ','o','p','q','r','s',
        't','u','v','w','x','y','z','0','1','2','3','4','5',
        '6','7','8','9'};
    private String[] letraBraile={"a.jpg","b.jpg","c.jpg","d.jpg",
        "e.jpg","f.jpg","g.jpg","h.jpg","i.jpg","j.jpg","k.jpg","l.jpg",
        "m.jpg","n.jpg","ñ.jpg","o.jpg","p.jpg","q.jpg","r.jpg","s.jpg","t.jpg",
        "u.jpg","v.jpg","w.jpg","x.jpg","y.jpg","z.jpg","0.jpg","1.jpg","2.jpg",
        "3.jpg","4.jpg","5.jpg","6.jpg","7.jpg","8.jpg","9.jpg"};
    private char[] txtConvertir= new char[1000];
    private String[] paltraduc= new String[1000];
    
    
    public Texto(char[] txtConvertir) {
        this.txtConvertir = txtConvertir;
    }

    public char[] getAbecedario() {
        return abecedario;
    }

    public void setAbecedario(char[] abecedario) {
        this.abecedario = abecedario;
    }
    
   
    public String[] getLetraBraile() {
        return letraBraile;
    }

    public void setLetraBraile(String[] letraBraile) {
        this.letraBraile = letraBraile;
    }

    public char[] getTxtConvertir() {
        return txtConvertir;
    }

    public void setTxtConvertir(char[] txtConvertir) {
        this.txtConvertir = txtConvertir;
    }

    public String[] getPaltraduc() {
        String palabrast[]=new String[1000];
        int cont=0;
        char text[]=new char[10000];
        text=getTxtConvertir();
        for (int i = 0; i < text.length; i++) {
            for(int j=0; j< abecedario.length;j++){
                String c= ""+text[i];
                if(text[i]==abecedario[j] && c!=null && c!=""){
                        palabrast[cont]=letraBraile[j];   
                        cont++;
                }
            }
        }
        return palabrast; 
    }

    public void setPaltraduc(String[] paltraduc) {
        this.paltraduc = paltraduc;
    }

   
    
    
     
}
