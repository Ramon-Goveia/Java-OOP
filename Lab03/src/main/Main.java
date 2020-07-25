package main;

import model.Departamento;
import model.Funcionario;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Departamento departamento = new Departamento("financeiro", 1);
		Funcionario funcionario = new Funcionario(1, "joao", 1234, departamento);
		
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Matricula: " + funcionario.getMatricula());
		System.out.println("Ramal: " + funcionario.getRamal());
		System.out.println("Departamento: " + funcionario.getDepartamento().getNome());
	}

}
