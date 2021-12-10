class TestaAlunoETurma{
	public static void main(String[] args){
		Turma t1 = new Turma();
		t1.periodo = "manhã";
		t1.serie = "1 ano";
		t1.sigla = "M1";
		
		Aluno a1 = new Aluno();
		a1.rg = 32878969;
		a1.dataNascimento = "01/05/1987";
		a1.turma = t1;
		
		System.out.println(a1.turma.serie);
		System.out.println(a1.turma.periodo);
		System.out.println(a1.turma.sigla);
	}// Fim da função main
}// Fim da classe TestaAlunoETurma