package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Botcamp");
		curso1.setDescricao("Desafio Extracao Bootcamp");
		curso1.setCargaHoraria(12);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso Java");
		curso2.setDescricao("Curso de Java");
		curso2.setCargaHoraria(8);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Apresentacao do Bootcamp 1");
		mentoria1.setDescricao("Apresentacao de como funcionara este bootcamp");
		mentoria1.setData(LocalDate.now());
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);
	}

}
