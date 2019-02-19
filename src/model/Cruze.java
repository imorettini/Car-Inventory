package model;

import java.awt.Toolkit;

public class Cruze extends Carros {

    private boolean sensorEstacionamento;

    private boolean cambioDualogic;

    private boolean bagageiroThule;

    private final int VELOCIDADE_MAX = 250;

    public Cruze() {
        this(false, false, false, "", "", "", false, "", "", "", 0, "", 0);

    }

    public Cruze(boolean sensorEstacionamento, boolean cambioDualogic, boolean bagageiroThule,
            String cor, String modelo, String direcao, boolean ar, String tipoCombustivel,
            String motor, String banco, int portas, String placa, int velocidade) {
        super(cor, modelo, direcao, ar, tipoCombustivel, motor, banco, portas, placa, velocidade);
        this.sensorEstacionamento = sensorEstacionamento;
        this.cambioDualogic = cambioDualogic;
        this.bagageiroThule = bagageiroThule;

    }

    public boolean isSensorEstacionamento() {
        return sensorEstacionamento;
    }

    public void setCambioDualogic(boolean airBag) {
        this.cambioDualogic = cambioDualogic;
    }

    public boolean isBagageiroThule() {
        return bagageiroThule;
    }

    public void setSensorEstacionamento(boolean sensorEstacionamento) {
        this.sensorEstacionamento = sensorEstacionamento;
    }

    public boolean isCambioDualogic() {
        return cambioDualogic;
    }

    public void setBagageiroThule(boolean bagageiroThule) {
        this.bagageiroThule = bagageiroThule;
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
        return "\nCruze:"
                + "\n Placa: " + getPlaca()
                + "\n Modelo: " + getModelo()
                + "\n Cor: " + getCor()
                + "\n Direção: " + getDirecao()
                + "\n Ar Condicionado: " + (isAr() ? "sim" : "não")
                + "\n Tipo de Combustível: " + getCombustivel()
                + "\n Motor: " + getMotor()
                + "\n Banco: " + getBanco()
                + "\n Portas: " + getPortas()
                + "\n Sensor Estacionamento: " + (isSensorEstacionamento() ? "sim" : "não")
                + "\n Câmbio Dualogic: " + (isCambioDualogic() ? "sim" : "não")
                + "\n Bagageiro Thule: " + (isBagageiroThule() ? "sim" : "não")
                + "\n _________________________";

        /* + "\n Velocidade atual: " +getVelocidade()
                + "\n Velocidade máxima: " + VELOCIDADE_MAX; */
    }

}
