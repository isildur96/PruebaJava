package co.edu.unbosque.controller;

import java.io.IOException;

import co.edu.unbosque.model.persistence.*;
import co.edu.unbosque.view.*;

public class AplMain {

    public static void main(String[] args) throws IOException {
        new AplMain().relaciones();
    }

    private void relaciones() throws IOException {
        /**
         * Se instancian las clases
         */
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        VentanaListaAmigos ventanaListaAmigos = new VentanaListaAmigos();
        VentanaListaContactos ventanaListaContactos = new VentanaListaContactos();
        VentanaEditarAmigo ventanaEditarAmigo = new VentanaEditarAmigo();
        VentanaEditarContacto ventanaEditarContacto = new VentanaEditarContacto();
        VentanaAgregarAmigo ventanaAgregarAmigo = new VentanaAgregarAmigo();
        VentanaAgregarContacto ventanaAgregarContacto = new VentanaAgregarContacto();
        
        VentanaResultadoAmigosPorPais ventanaResultadoAmigosPorPais = new VentanaResultadoAmigosPorPais();
        VentanaResultadoContactosPorPais ventanaResultadoContactosPorPais = new VentanaResultadoContactosPorPais();
        VentanaResultadoAmigosPorDominio ventanaResultadoAmigosPorDominio = new VentanaResultadoAmigosPorDominio();
        VentanaResultadoContactosPorDominio ventanaResultadoContactosPorDominio = new VentanaResultadoContactosPorDominio();

        Procesos procesos = new Procesos();
        Controller coordinador = new Controller();

        /**
         * Se establecen las relaciones entre clases
         */
        ventanaPrincipal.setCoordinador(coordinador);
        ventanaListaAmigos.setCoordinador(coordinador);
        ventanaListaContactos.setCoordinador(coordinador);
        ventanaEditarAmigo.setCoordinador(coordinador);
        ventanaEditarContacto.setCoordinador(coordinador);
        ventanaAgregarAmigo.setCoordinador(coordinador);
        ventanaAgregarContacto.setCoordinador(coordinador);
        
        ventanaResultadoAmigosPorPais.setCoordinador(coordinador);
        ventanaResultadoContactosPorPais.setCoordinador(coordinador);
        ventanaResultadoAmigosPorDominio.setCoordinador(coordinador);
        ventanaResultadoContactosPorDominio.setCoordinador(coordinador);
        procesos.setCoordinador(coordinador);

        /**
         * Se establecen relaciones con la clase coordinador
         */
        coordinador.setVentanaPrincipal(ventanaPrincipal);
        coordinador.setVentanaListaAmigos(ventanaListaAmigos);
        coordinador.setVentanaListaContactos(ventanaListaContactos);
        coordinador.setVentanaEditarAmigo(ventanaEditarAmigo);
        coordinador.setVentanaEditarContacto(ventanaEditarContacto);
        coordinador.setVentanaAgregarAmigo(ventanaAgregarAmigo);
        coordinador.setVentanaAgregarContacto(ventanaAgregarContacto);
        
        coordinador.setVentanaResultadoAmigosPorPais(ventanaResultadoAmigosPorPais);
        coordinador.setVentanaResultadoContactosPorPais(ventanaResultadoContactosPorPais);
        coordinador.setVentanaResultadoAmigosPorDominio(ventanaResultadoAmigosPorDominio);
        coordinador.setVentanaResultadoContactosPorDominio(ventanaResultadoContactosPorDominio);
        coordinador.setLogica(procesos);

        coordinador.mostrarVentanaPrincipal();
    }
}
