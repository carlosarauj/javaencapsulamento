
public class Principal {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.nome = "Carlos";
		aluno.teste = 6;
		aluno.prova = 7;
		
		System.out.println(aluno.getNome());
		System.out.println(aluno.getMedia());

	}

}
