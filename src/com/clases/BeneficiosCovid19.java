package com.clases;

import java.util.List;

public class BeneficiosCovid19 {
    //Debe ser el numero entero aleatorio puedes usar la funcion ramdom para esto
    private String id;
    private String nombre;
    private Float valorSubsidio;

    //Completar clase
    public BeneficiosCovid19(){
    }
    public BeneficiosCovid19(String id, String nombre, Float valorSubsidio){
        this.id = id;
        this.nombre = nombre;
        this.valorSubsidio = valorSubsidio;
    }
    public String getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public Float getValorSubsidio() {
        return valorSubsidio;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setValorSubsidio(Float valorSubsidio) {
        this.valorSubsidio = valorSubsidio;
    }
    //Implementar un metodo que retorne el mejor beneficio comparando los valores de todos los beneficios
    public Float getMejorbeneficios(){
        return Float.valueOf(valorSubsidio);
    }
    @Override
    public String toString() {
        return "BeneficiosCovid19{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", valorSubsidio=" + valorSubsidio +
                '}';
    }
}
