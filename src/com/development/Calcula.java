package com.development;

import java.util.GregorianCalendar;

public class Calcula {
    public long retornaAnguloRelogio(GregorianCalendar horario){
        int hora = horario.getTime().getHours();
        int minuto = horario.getTime().getMinutes();
        int anguloHora = hora * 30;
        int anguloMinuto = minuto * 6;

        //System.out.println(anguloHora);
        //System.out.println(anguloMinuto);
        
        return (((11 * minuto) - (60 * hora)) / 2);
    }
}
