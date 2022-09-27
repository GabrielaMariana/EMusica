/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.musica;

/**
 *
 * @author LENOVO
 */
public abstract class cancion {
    public char subje, gus, viv, exper, cult, ubge, estanim;
    public int edad;
    public abstract void musica(char sub);
    public abstract void musica(int edad);
    public abstract void musica(char gust,char tipo);
    public abstract void musica(int otro,char viv);
    public abstract void musica(char exper, int tipo);
    public abstract void musica(char cult,char tipo, char otro);
    public abstract void musica(int ubge, int otro, int tipo);
    public abstract void musica(int tipo, char dato, char estanim);
    public void setSubje(char subje) {
        this.subje = subje;
    }

    public char getSubje() {
        return subje;
    }

    public void setGus(char gus) {
        this.gus = gus;
    }

    public char getGus() {
        return gus;
    }

    public void setViv(char viv) {
        this.viv = viv;
    }

    public char getViv() {
        return viv;
    }

    public void setExper(char exper) {
        this.exper = exper;
    }

    public char getExper() {
        return exper;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setCult(char cult) {
        this.cult = cult;
    }

    public char getCult() {
        return cult;
    }

    public void setUbge(char ubge) {
        this.ubge = ubge;
    }

    public char getUbge() {
        return ubge;
    }

    public void setEstanim(char estanim) {
        this.estanim = estanim;
    }

    public char getEstanim() {
        return estanim;
    }
    
    public abstract class canc {
    public char titulo, artista, genero,album,lanz,disq,comp;
         public abstract void datos(char dato);
         public abstract void datos(char dato,char tipo);
         public abstract void datos(char dato,int tipo);
         public abstract void datos(int tipo,char dato);
         public abstract void datos(char otro,int dato, char tipo);
         public abstract void datos(char dato,char tipo,char otro);
         
        public void setAlbum(char album) {
            this.album = album;
        }

        public char getAlbum() {
            return album;
        }

        public void setArtista(char artista) {
            this.artista = artista;
        }

        public char getArtista() {
            return artista;
        }

        public void setComp(char comp) {
            this.comp = comp;
        }

        public char getComp() {
            return comp;
        }

        public void setDisq(char disq) {
            this.disq = disq;
        }

        public char getDisq() {
            return disq;
        }

        public void setGenero(char genero) {
            this.genero = genero;
        }

        public char getGenero() {
            return genero;
        }

        public void setLanz(char lanz) {
            this.lanz = lanz;
        }

        public char getLanz() {
            return lanz;
        }

        public void setTitulo(char titulo) {
            this.titulo = titulo;
        }

        public char getTitulo() {
            return titulo;
        }
    
    
        
    }
}
