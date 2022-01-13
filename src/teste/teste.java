package teste;

import javax.swing.*;
import java.awt.event.*;

public class teste extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;

    public teste() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }


    public static void main(String[] args) {

        System.out.println("prepos");
        prepos();
        System.out.println("aritimético");
        aritimético();
        System.out.println("atribuição");
        atribuição();
        System.out.println("Precedência");
        precedência();
    }

    private static void prepos() {
        int k = 10;
        int i = ++k;
        int j = k--;
        int x = k;


        System.out.println("k: " + k);
        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("x: " + x);
    }


    private static void precedência() {

        int i = 10;
        int j = 20;
        int k = 30;

        int a = i++ + --j * k; //10+19*30 => 10+570 = 580

        System.out.println("i++ + --j * k: " + a);

        System.out.println("i: " + i); // 11

        int b = k / --i % 3 + 1; //30 / 10 % 3 + 1 => 1

        System.out.println("k / --i % 3 + 1: " + b);

        System.out.println("i: " + i); // 10

        int c = 2;

        c *= i += 5; // c = 2 * i; i = i + 5 => i = 10 + 5 = 15 => c = 2 * i => c = 2 * 15 = 30

        System.out.println("c *= i += 5: " + c);



    }

    private static void aritimético() {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        int r1 = a + b;
        int r2 = c - a;
        int r3 = d * b;
        int r4 = e / a;
        int r5 = c % b;

        System.out.println("a+b: " + r1);
        System.out.println("c-a: " + r2);
        System.out.println("d*b: " + r3);
        System.out.println("e/a: " + r4);
        System.out.println("c%b: " + r5);


    }

    private static void atribuição() {
        int i = 1500;
        short j = 15;
        long l = 500l;
        int k = 35;
        float f = 3.5f;
        double d = f;

        System.out.println("d: " + d);

        i += 5; // i = i+5
        j -= 3; // j = j-3
        d /= 2.7d; //d = d/2.7d
        l *= 3; //l = l * 3
        k %= 2; // k = k%2

        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("d: " + d);
        System.out.println("l: " + l);
        System.out.println("k: " + k);

        i = k = j;

        System.out.println("k: " + k);
        System.out.println("i: " + i);



    }


}

