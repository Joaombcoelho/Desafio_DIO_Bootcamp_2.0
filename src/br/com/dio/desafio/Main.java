package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
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
		
		//System.out.println(curso1);
		//System.out.println(curso2);
		//System.out.println(mentoria1);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Inicial");
		bootcamp.setDescricao("Conteudos iniciais para comecar a caminhada no Java");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(mentoria1);
		bootcamp.getConteudos().add(curso2);
		
		Dev devJoao = new Dev();
		devJoao.setNome("Joao");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos DevJoao" + devJoao.getConteudosInscritos());
		System.out.println("Conteudos Concluidos DevJoao" + devJoao.getConteudosConcluidos());
		System.out.println("Xp" + devJoao.calcularTotalXp());
		
		Dev devSamara = new Dev();
		devSamara.setNome("Samara");
		devSamara.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos DevSamara" + devSamara.getConteudosInscritos());
		devSamara.progredir();
		System.out.println("Conteudos Inscritos DevSamara" + devSamara.getConteudosInscritos());
		System.out.println("Conteudos Concluidos DevSamara" + devSamara.getConteudosConcluidos());
		devSamara.progredir();
		System.out.println("Conteudos Inscritos DevSamara" + devSamara.getConteudosInscritos());
		System.out.println("Conteudos Concluidos DevSamara" + devSamara.getConteudosConcluidos());
		
		System.out.println("Xp" + devSamara.calcularTotalXp());
		

		
	}

}
