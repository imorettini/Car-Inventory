package model;

import java.awt.Toolkit;

public class Carros {

    private String cor;

    private String modelo;

    private String direcao;

    private Boolean ar;

    private String Combustivel;

    private String motor;

    private String banco;

    private int portas;

    private String placa;

    private final int VELOCIDADE_MAX = 140;

    private int velocidade;

    public Carros() {
        this("", "", "", false, "", "", "", 0, "", 0);
    }

    public Carros(String cor, String modelo, String direcao, boolean ar, String tipoCombustivel,
            String motor, String banco, int portas, String placa, int velocidade) {
        this.cor = cor;
        this.modelo = modelo;
        this.direcao = direcao;
        this.ar = ar;
        this.Combustivel = tipoCombustivel;
        this.motor = motor;
        this.banco = banco;
        this.portas = portas;
        this.placa = placa;
        this.velocidade = velocidade;
    }

    public boolean isAr() {
        return ar;
    }

    public void setAr(boolean ar) {
        this.ar = ar;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public String getCombustivel() {
        return Combustivel;
    }

    public void setCombustivel(String Combustivel) {
        this.Combustivel = Combustivel;
    }

    public int getVelocidade() {
        return velocidade;
    }

    protected void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void acelera() {
        if (getVelocidade() < VELOCIDADE_MAX) {
            setVelocidade(getVelocidade() + 14);// Adiciona 10% da velocidade max.
        }
    }

    public void buzina() {
        Toolkit.getDefaultToolkit().beep();
    }

    public void freia() {
        if (getVelocidade() > 0) {
            setVelocidade(getVelocidade() - 14);// reduz 0% a velocidade
        }
    }

    @Override
    public String toString() {
        return "Carros:"
                + "\n Placa: " + getPlaca()
                + "\n Modelo: " + getModelo()
                + "\n Cor: " + getCor()
                + "\n Direção: " + getDirecao()
                + "\n Ar condicionado: " + (isAr() ? "sim" : "não")
                + "\n Tipo de combustivel: " + getCombustivel()
                + "\n Motor: " + getMotor()
                + "\n Banco: " + getBanco()
                + "\n Portas: " + getPortas()
                + "\n _________________________";
        /* + "\n Velocidade atual: " + getVelocidade()
                + "\n Velocidade máxima: " + VELOCIDADE_MAX; */
    }

    public String ToString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
