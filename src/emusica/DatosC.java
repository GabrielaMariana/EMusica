/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.musica;

import com.mycompany.musica.cancion.canc;

/**
 *
 * @author LENOVO
 */
public class DatosC extends canc{

    @Override
    public void datos(char dato) {
        System.out.println("incerte el titilo de la cancion");
        setTitulo(dato);
    }

    @Override
    public void datos(char dato, char tipo) {
        setComp(tipo);
        System.out.println("incerte el nombre del o los (en su caso) compositores");
        getComp();
    }

    @Override
    public void datos(char dato, int tipo) {
        System.out.println("incerte el nombre del album");
        setAlbum(dato); 
    }

    @Override
    public void datos(int tipo, char dato) {
        System.out.println("infreze el año de lanzamiento de la cancion:");
        setLanz((char) tipo);
    }

    @Override
    public void datos(char otro ,int tipo,char dato) {
        System.out.println("ingrese los genero(s) de la cancion");
        setGenero((char) tipo);
    }

    @Override
    public void datos(char dato, char tipo,char otro) {
        System.out.println("ingrese el nombre del artista");
        setArtista(dato);
    }

  
  
    
}
