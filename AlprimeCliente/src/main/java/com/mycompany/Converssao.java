package com.mycompany;

import java.util.ArrayList;
import java.util.List;
import oshi.util.FormatUtil;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gabriel Vieira
 */
public class Converssao {

    public static Double bytesParaGigabits(long bytes) {
        String restante = FormatUtil.formatBytes(bytes);
        String[] somenteNumero = restante.split(" ");
        String[] semVirgula = somenteNumero[0].split(",");
        String formatado = String.format("%s.%s", semVirgula[0], semVirgula[1]);
        return Double.valueOf(formatado);
    }

    public static List<String> dataHoraFormatoBrasileiro(String dataHora) {

        List<String> dataHoraFormatada = new ArrayList();
        System.out.println(dataHora);
        String data = dataHora.split("T")[0];
        String hora = dataHora.split("T")[1];

        String datas[] = data.split("-");
        String dataFormatada = String.format("%s/%s/%s", datas[2], datas[1], datas[0]);
        dataHoraFormatada.add(dataFormatada);
        String horas[] = hora.split(":");
        String horaFormatada = String.format("%s:%s", horas[0], horas[1]);
        dataHoraFormatada.add(horaFormatada);

        return dataHoraFormatada;
    }
}
