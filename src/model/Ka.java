package model;

import java.awt.Toolkit;

public class Ka extends Carros {

    private Boolean desembarcador;
    private Boolean rodasLiga;
    private Boolean somBluetooth;
    private final int VELOCIDADE_MAX = 160;

    public Ka() {
        this(false, false, false, "", "", "", false, "", "", "", 0, "", 0);

    }

    public Ka(boolean desembarcador, boolean rodasLiga, boolean somBluetooth,
            String cor, String modelo, String direcao, boolean ar, String tipoCombustivel,
            String motor, String banco, int portas, String placa, int velocidade) {
        super(cor, modelo, direcao, ar, tipoCombustivel, motor, banco, portas, placa, velocidade);
        this.desembarcador = desembarcador;
        this.rodasLiga = rodasLiga;
        this.somBluetooth = somBluetooth;

    }

    public boolean isDesembarcador() {
        return desembarcador;
    }

    public void setDesembarcador(boolean desembarcador) {
        this.desembarcador = desembarcador;
    }

    public boolean isRodasLiga() {
        return rodasLiga;
    }

    public void setRodasLiga(boolean rodasLiga) {
        this.rodasLiga = rodasLiga;
    }

    public boolean isSomBluetooth() {
        return somBluetooth;
    }

    public void setSomBluetooth(boolean somBluetooth) {
        this.somBluetooth = somBluetooth;
    }

    @Override
    public void acelera() {
        if (getVelocidade() < VELOCIDADE_MAX) {
            setVelocidade(getVelocidade() + 24);
        }
    }

    @Override
    public void buzina() {
        Toolkit.getDefaultToolkit().beep();
    }

    @Override
    public void freia() {
        if (getVelocidade() > 0) {
            setVelocidade(getVelocidade() - 24);
        }
    }

    @Override
    public String toString() {
        return "\nKa:"
                + "\n Placa: " + getPlaca()
                + "\n Modelo: " + getModelo()
                + "\n Cor: " + getCor()
                + "\n Direção: " + getDirecao()
                + "\n Ar Condicionado: " + (isAr() ? "sim" : "não")
                + "\n Tipo de Combustível: " + getCombustivel()
                + "\n Motor: " + getMotor()
                + "\n Banco: " + getBanco()
                + "\n Portas: " + getPortas()
                + "\n Desembarcador: " + (isDesembarcador() ? "sim" : "não")
                + "\n Rodas Liga: " + (isRodasLiga() ? "sim" : "não")
                + "\n Som Bluetooth: " + (isSomBluetooth() ? "sim" : "não")
                + "\n _________________________";

        /* + "\n Velocidade atual: " +getVelocidade()
                + "\n Velocidade máxima: " + VELOCIDADE_MAX; */
    }

}
