package com.development;

import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

public class App 
{
    public static void main( String[] args )
    {
        Calcula anguloPonteiros = new Calcula();
        GregorianCalendar horario = new GregorianCalendar();
        int hora = Integer.parseInt(JOptionPane.showInputDialog("Qual é a hora?"));
        int minuto = Integer.parseInt(JOptionPane.showInputDialog("Qual é o minuto?"));
        horario.set (0, 0, 0, hora, minuto);
        long angulo = anguloPonteiros.retornaAnguloRelogio(horario);
        if (angulo<= 0) {
        System.out.println(angulo * (-1));
        } else {
            System.out.println(angulo);
        }
        
    }
}
