package com.mycompany.musica;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class musc extends cancion{

    @Override
    public void musica(char sub) {
        System.out.println("incerta una breve descripcion subjetiva de la cancion:");
        setSubje(sub);
       
    }

    @Override
    public void musica(int edad) {
        System.out.println("que edad tiene la cancion aproximadamente");
        setEdad(edad);
    }

    @Override
    public void musica(char gust, char tipo) {
        System.out.println("cres que entre en tus gustos personales");
        setGus(gust);
    }

    @Override
    public void musica(int otro, char viv) {
        System.out.println("te recuerda a alguna vivencia mencionala brebemente");
        setViv(viv);
    }

    @Override
    public void musica(char exper, int tipo) {
        System.out.println("crees que tiene se relacionaria de alguna manera con alguna experiencia que has tenido");
        setExper(exper);
    }

    @Override
    public void musica(char cult, char tipo, char otro) {
        System.out.println("crees que se relaciona a alguna cultura");
        setCult(cult);
    }

    @Override
    public void musica(int ubge, int otro, int tipo) {
        System.out.println("de que pais crees que es la cancion");
        setUbge((char) ubge);
    }

    @Override
    public void musica(int tipo, char dato, char estanim) {
        System.out.println("que emocion te transmite la cancion");
        setEstanim(estanim);
    }
    
}
