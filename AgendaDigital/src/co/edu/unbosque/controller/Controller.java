package co.edu.unbosque.controller;

import co.edu.unbosque.model.*;
import co.edu.unbosque.model.persistence.*;
import co.edu.unbosque.view.*;

import java.util.List;
import java.util.Map;

public class Controller {

	private Procesos logica;

	public void setLogica(Procesos procesos) {
		this.logica = procesos;
	}

	/* Manejo de Ventajas */
	private VentanaPrincipal ventanaPrincipal;
	private VentanaListaAmigos ventanaListaAmigos;
	private VentanaListaContactos ventanaListaContactos;
	private VentanaEditarAmigo ventanaEditarAmigo;
	private VentanaEditarContacto ventanaEditarContacto;
	private VentanaAgregarAmigo ventanaAgregarAmigo;
	private VentanaAgregarContacto ventanaAgregarContacto;
	
	private VentanaResultadoAmigosPorPais ventanaResultadoAmigosPorPais;
	private VentanaResultadoContactosPorPais ventanaResultadoContactosPorPais;
	private VentanaResultadoAmigosPorDominio ventanaResultadoAmigosPorDominio;
	private VentanaResultadoContactosPorDominio ventanaResultadoContactosPorDominio;

	public void setVentanaPrincipal(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
	}

	public void mostrarVentanaPrincipal() {
		ventanaPrincipal.setVisible(true);
		ventanaPrincipal.campos();
	}

	public void setVentanaListaAmigos(VentanaListaAmigos ventanaListaAmigos) {
		this.ventanaListaAmigos = ventanaListaAmigos;
	}

	public void mostrarVentanaListaAmigos() {
		ventanaListaAmigos.setVisible(true);
		ventanaListaAmigos.llenarTabla();
	}

	public void setVentanaListaContactos(VentanaListaContactos ventanaListaContactos) {
		this.ventanaListaContactos = ventanaListaContactos;
	}

	public void mostrarVentanaListaContactos() {
		ventanaListaContactos.setVisible(true);
		ventanaListaContactos.llenarTabla();
	}

	public void setVentanaEditarAmigo(VentanaEditarAmigo ventanaEditarAmigo) {
		this.ventanaEditarAmigo = ventanaEditarAmigo;
	}

	public void mostrarVentanaEditarAmigo() {
		ventanaEditarAmigo.setVisible(true);
		ventanaEditarAmigo.limpiarCampos();
		ventanaEditarAmigo.cargarComboItems();
	}

	public void setVentanaEditarContacto(VentanaEditarContacto ventanaEditarContacto) {
		this.ventanaEditarContacto = ventanaEditarContacto;
	}

	public void mostrarVentanaEditarContacto() {
		ventanaEditarContacto.setVisible(true);
		ventanaEditarContacto.limpiarCampos();
		ventanaEditarContacto.cargarComboItems();
	}

	public void setVentanaAgregarAmigo(VentanaAgregarAmigo ventanaAgregarAmigo) {
		this.ventanaAgregarAmigo = ventanaAgregarAmigo;
	}

	public void mostrarVentanaAgregarAmigo() {
		ventanaAgregarAmigo.setVisible(true);
		ventanaAgregarAmigo.limpiarCampos();
		ventanaAgregarAmigo.cargarComboItems();
	}

	public void setVentanaAgregarContacto(VentanaAgregarContacto ventanaAgregarContacto) {
		this.ventanaAgregarContacto = ventanaAgregarContacto;
	}

	public void mostrarVentanaAgregarContacto() {
		ventanaAgregarContacto.setVisible(true);
		ventanaAgregarContacto.limpiarCampos();
		ventanaAgregarContacto.cargarComboItems();
	}
	
	/*****/
	public void setVentanaResultadoAmigosPorPais(VentanaResultadoAmigosPorPais ventanaResultadoAmigosPorPais) {
		this.ventanaResultadoAmigosPorPais = ventanaResultadoAmigosPorPais;
	}
	public void mostrarVentanaResultadoAmigosPorPais() {		
		ventanaResultadoAmigosPorPais.setVisible(true);
		ventanaResultadoAmigosPorPais.llenarTabla();
	}
	
	public void setVentanaResultadoContactosPorPais(VentanaResultadoContactosPorPais ventanaResultadoContactosPorPais) {
		this.ventanaResultadoContactosPorPais = ventanaResultadoContactosPorPais;
	}
	public void mostrarVentanaResultadoContactosPorPais() {
		ventanaResultadoContactosPorPais.setVisible(true);
		ventanaResultadoContactosPorPais.llenarTabla();
	}
	
	public void setVentanaResultadoAmigosPorDominio(VentanaResultadoAmigosPorDominio ventanaResultadoAmigosPorDominio) {
		this.ventanaResultadoAmigosPorDominio = ventanaResultadoAmigosPorDominio;
	}
	public void mostrarVentanaResultadoAmigosPorDominio() {
		ventanaResultadoAmigosPorDominio.setVisible(true);
		ventanaResultadoAmigosPorDominio.llenarTabla();
	}
	
	public void setVentanaResultadoContactosPorDominio(VentanaResultadoContactosPorDominio ventanaResultadoContactosPorDominio) {
		this.ventanaResultadoContactosPorDominio = ventanaResultadoContactosPorDominio;
	}
	public void mostrarVentanaResultadoContactosPorDominio() {
		ventanaResultadoContactosPorDominio.setVisible(true);
		ventanaResultadoContactosPorDominio.llenarTabla();
	}

	/* metodos logicos */
	public void cargarArchivo(String path) {
		this.logica.cargarArchivo(path);
	}
	
	public List<Pais> getPaises() {
		return this.logica.getPaises();
	}

	public List<Amigo> getAmigos() {
		return this.logica.getAmigos();
	}

	public List<Contacto> getContactos() {
		return this.logica.getContactos();
	}

	public Amigo getAmigo(int referencia) {
		return this.logica.getAmigo(referencia);
	}

	public Contacto getContacto(int referencia) {
		return this.logica.getContacto(referencia);
	}

	public void registrarAmigo(Amigo item) {
		this.logica.registrarAmigo(item);
	}

	public void registrarContacto(Contacto item) {
		this.logica.registrarContacto(item);
	}

	public void editarAmigo(Amigo item) {
		this.logica.editarAmigo(item);
	}
	
	public void editarContacto(Contacto item) {
		this.logica.editarContacto(item);
	}
	
	public void eliminarAmigo(Amigo item) {
		this.logica.eliminarAmigo(item);
	}
	
	public void eliminarContacto(Contacto item) {
		this.logica.eliminarContacto(item);
	}
	
	public float resultadoPorcentajeAmigosRegistrados () {
		return this.logica.resultadoPorcentajeAmigosRegistrados();		
	}
	
	public float resultadoPorcentajeContactosRegistrados () {
		return this.logica.resultadoPorcentajeContactosRegistrados();	
	}
	
	public Map<String, Integer> resultadoPorcentajeAmigosPorPais () {		
		return this.logica.resultadoPorcentajeAmigosPorPais();
	}
	
	public Map<String, Integer> resultadoPorcentajeContactosPorPais () {
		return this.logica.resultadoPorcentajeContactosPorPais();
	}
	
	public Map<String, Integer> resultadoPorcentajeAmigosDominio () {
		return this.logica.resultadoPorcentajeAmigosDominio();
	}
	

	public Map<String, Integer> resultadoPorcentajeContactosDominio () {
		return this.logica.resultadoPorcentajeContactosDominio();
	}
}
