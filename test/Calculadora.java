
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gustavo
 */
class Calculadora {

    private LinkedList<Character> numeros = new LinkedList<Character>();
    private LinkedList<Character> op = new LinkedList<Character>();

    Calculadora(String formula) {

        LinkedList<Character> valores = new LinkedList<Character>();

        valores.add('1');
        valores.add('2');
        valores.add('3');
        valores.add('4');
        valores.add('5');
        valores.add('6');
        valores.add('7');
        valores.add('8');
        valores.add('9');
        valores.add('0');

        LinkedList opValidos = new LinkedList();
        opValidos.add('+');
        opValidos.add('-');
        opValidos.add('*');
        opValidos.add('/');

        for (int i = 0; i < formula.length(); i++) {

            if (valores.contains(formula.charAt(i))) {

                numeros.add(formula.charAt(i));

            } else if (opValidos.contains(formula.charAt(i))) {

                op.add(formula.charAt(i));

            }

        }

    }

    public double resolve() {

        if (op.contains('*') || op.contains('/')) {

            arrumaExpressao();

        }

        int resultado = Character.getNumericValue(numeros.get(0));

        for (int i = 0; i < op.size(); i++) {

            if (op.get(i) == '+') {

                resultado += Character.getNumericValue(numeros.get(i + 1));

            } else if (op.get(i) == '-') {

                resultado -= Character.getNumericValue(numeros.get(i + 1));

            } else if (op.get(i) == '*') {

                resultado *= Character.getNumericValue(numeros.get(i + 1));

            } else if (op.get(i) == '/') {

                resultado /= Character.getNumericValue(numeros.get(i + 1));

            }

        }

        return resultado;
    }

    public void arrumaExpressao() {

        for (Character op1 : op) {

            if (op.contains('*')) {
                int i = op.indexOf('*');
                
                Collections.swap(op, 0, i);
                Collections.swap(numeros, 0, i);
                Collections.swap(numeros, 1, i + 1);
            }

            if (op.contains('/')) {
                int i = op.indexOf('/');

                Collections.swap(op, 0, i);
                Collections.swap(numeros, 0, i);
                Collections.swap(numeros, 1, i + 1);
            }
        }
    }

}
