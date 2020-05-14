package br.com.alura.aluraviagens.util;

import android.support.annotation.NonNull;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DataUtil {

    public static final String DIA_E_MES = "dd/MM";

    @NonNull
    public static String periodoEmTexto(int dias) {
        Calendar dataIda = Calendar.getInstance();
        Calendar dataDeVolta = Calendar.getInstance();
        dataDeVolta.add(Calendar.DATE, dias);
        SimpleDateFormat formateBrasileiro = new SimpleDateFormat(DIA_E_MES);
        String dataFormatadaIda = formateBrasileiro.format(dataIda.getTime());
        String dataFormatadaVolta = formateBrasileiro.format(dataDeVolta.getTime());
        return dataFormatadaIda + " - " + dataFormatadaVolta +
                " de " + dataDeVolta.get(Calendar.YEAR);
    }

}
