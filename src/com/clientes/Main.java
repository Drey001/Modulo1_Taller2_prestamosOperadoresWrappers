package com.clientes;

import com.clases.BeneficiosCovid19;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code her
        BeneficiosCovid19[] beneficios;

        ArrayList<BeneficiosCovid19> lista1 = new ArrayList<BeneficiosCovid19>();
        ArrayList<BeneficiosCovid19> lista2 = new ArrayList<BeneficiosCovid19>();

        /**
         * Crear 2 lista de beneficios para clientes Lista 1 y Lista 2 por ejemplo
         * Ejemplo:
         * id:12121
         * nombre: Beneficiados que perdieron su trabajo por COVID19
         * valorSubsidio: 150000
         *
         * Ejemplo:
         * id:895656
         * Nombre: Beneficios para persona tercera edad dagnificados COVID
         * valorSubsidio:200000
         */
        BeneficiosCovid19 beneficioDesempleo = new BeneficiosCovid19(getIdBeneficio(),
                "Beneficio desempleados", (float) 1500000.00);
        BeneficiosCovid19 beneficioAdulto = new BeneficiosCovid19(getIdBeneficio(),
                "Beneficio adulto mayor", (float) 2300000.00);
        BeneficiosCovid19 beneficioLeyInsolvencia = new BeneficiosCovid19(getIdBeneficio(),
                "Beneficio insolvencia",(float) 4800000.00);
        BeneficiosCovid19 beneficioContagio = new BeneficiosCovid19(getIdBeneficio(),
                "Beneficio por contagio",(float) 3100000.00);
        lista1.add(beneficioAdulto);
        lista1.add(beneficioContagio);
        lista2.add(beneficioDesempleo);
        lista2.add(beneficioLeyInsolvencia);
        lista2.add(beneficioAdulto);

        // Imprmir diferencias
        System.out.println("Elementos en lista1 que NO están en lista 2");
        compararListas(lista1, lista2);
        System.out.println("Elementos en lista2 que NO están en lista 1");
        compararListas(lista2, lista1);

        }

    /**
     * Implementa un metodo que entregue un reporte de comparacion de las 2 listas este metodo solo imprimira regiostros
     * Cuando un metodo no retorna un tipo de datos se trabaja con la palabra clave VOID
     * Abarcar los operadores terniarios para condiciones logicas
     * Operadores logicos
     * Operacionres aritmeticos
     **/

    public static void compararListas(ArrayList<BeneficiosCovid19> lista1, ArrayList<BeneficiosCovid19> lista2){
        Float mejorValor=(float) 0.00;
        BeneficiosCovid19 mejorBeneficio = new BeneficiosCovid19();

        for ( int i = 0; i < lista1.size(); i++){
            char existe = 'N';
            if (lista1.get(i).getMejorbeneficios()>mejorValor){
                mejorValor = lista1.get(i).getMejorbeneficios();
                mejorBeneficio = lista1.get(i);
            }
            for ( int j=0; j < lista2.size(); j++){
                if (lista1.get(i).getId().equals(lista2.get(j).getId())){
                    existe = 'S';
                }
            }
            if (existe == 'N')
               System.out.println(lista1.get(i).toString());
        }
        System.out.println("El mejor beneficio de la lista es: \n" +
                mejorBeneficio.toString());
    }

    //Implementa un metodo que te entregue un numero aletorio para el ide de los beneficios usar el wrapper de Integer
    private static String getIdBeneficio(){
        //La Clase Math tiene varios metodos que te ayudaran
        return String.valueOf((int) (Math.random()*10000));
    }
}
