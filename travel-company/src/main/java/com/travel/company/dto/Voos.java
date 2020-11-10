package com.travel.company.dto;

public class Voos {
    private String empresa;

    private VooDto[] voos;

    public Voos() {
    }

    public Voos(String empresa, VooDto[] voos) {
        this.empresa = empresa;
        this.voos = voos;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public VooDto[] getVoos() {
        return voos;
    }

    public void setVoos(VooDto[] voos) {
        this.voos = voos;
    }
}
