/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.disenio.patrones.creacionales.builder;

/**
 *
 * @author jcs
 */
public class Automovil {
    private String tipoAutomovil;
    private String tipoTransmision;
    private String color;
    private String tipoMotor;
    private String tipoFaros;
    private String tipoTapiceria;
    private String tipoCarroceria;

    public String getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(String tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public String getTipoFaros() {
        return tipoFaros;
    }

    public void setTipoFaros(String tipoFaros) {
        this.tipoFaros = tipoFaros;
    }

    public String getTipoTapiceria() {
        return tipoTapiceria;
    }

    public void setTipoTapiceria(String tipoTapiceria) {
        this.tipoTapiceria = tipoTapiceria;
    }

    public String getTipoCarroceria() {
        return tipoCarroceria;
    }

    public void setTipoCarroceria(String tipoCarroceria) {
        this.tipoCarroceria = tipoCarroceria;
    }

    @Override
    public String toString() {
        return "Automovil{" + "tipoAutomovil=" + tipoAutomovil + ", tipoTransmision=" + tipoTransmision + ", color=" + color + ", tipoMotor=" + tipoMotor + ", tipoFaros=" + tipoFaros + ", tipoTapiceria=" + tipoTapiceria + ", tipoCarroceria=" + tipoCarroceria + '}';
    }
    
    
    
    
}
