
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author GUSTAVO
 */
class CifraCesar {

    private String mensagem; 
    private String criptografia = "";
    private int chave;
    private List<Character> lista;

    public CifraCesar(String s, int i) {
        mensagem = s.toUpperCase();
        chave = i;
        criaArray();
        CriptografaMensagem();
    }

    public String retornaCifra() {
        return criptografia;
    }

    void criaArray() {
        lista = new ArrayList<Character>();

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            lista.add(Character.valueOf(ch));
        }
    }

    void CriptografaMensagem() {

        char[] t = mensagem.toCharArray();

        int a;
        
        for (int i = 0; i < t.length; i++) {

            if (!lista.contains(t[i])) {
                criptografia += t[i];
            } else {
                a = lista.indexOf(t[i]) + chave;
                while (a > 25) {
                    a -= 26;
                }
                criptografia += lista.get(a);
            }
        }
    }

}
