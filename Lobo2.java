package avFormativa.desafios;

public class Lobo2 {
	public class Lobo extends Animal2 {
		public Lobo(String nome, String sexo,String raca) {
		super(nome, sexo, raca);
		}
		@Override
		public void EmitirSom() {
		System.out.println("O Lobo está uivando.");
		}

	}
}
