package com.hym.po;

import lombok.Data;

import java.io.Serializable;
@Data
public class Specil implements Serializable {
    private int spilinfoid;
    private int depinfoid;
    private String spilinfocode;
    private String spilinfoname;
    private String spilinfoaim;
    private String spilinfoprodire;



    @Override
    public String toString() {
        return "Specil{" +
                "spilinfoid=" + spilinfoid +
                ", depinfoid=" + depinfoid +
                ", spilinfocode='" + spilinfocode + '\'' +
                ", spilinfoname='" + spilinfoname + '\'' +
                ", spilinfoaim='" + spilinfoaim + '\'' +
                ", spilinfoprodire='" + spilinfoprodire + '\'' +
                '}';
    }
}
