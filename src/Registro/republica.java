package Registro;

import java.util.LinkedList;
import java.util.List;	
import javax.swing.JOptionPane;

public class republica {
	private List<alunos> Alunos;
	private List<Despesas> despesas;
	
	public republica() {
		Alunos = new LinkedList<alunos>();
		despesas = new LinkedList<Despesas>();	
	}
	
	
	public void cadastrarDespesa() {
		String nome = JOptionPane.showInputDialog("Informe o nome da despesa");
		String categoria = JOptionPane.showInputDialog("Informe a categoria");
		String totalDeDespesa = JOptionPane.showInputDialog("Informe o total da despesa");
		
		Despesas b = new Despesas(nome, categoria, totalDeDespesa);
		despesas.add(b);
	}
	}

