package avFormativa.desafios;

public class Animal2 {
		private String nome;
		private String sexo;
		private String raca;
		public Animal2(String nome, String sexo, String raca) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.raca = raca;
		}
		public String getNome() {
		return nome;
		}
		public void setNome(String nome) {
		this.nome = nome;
		}
		public String getSexo() {
		return sexo;
		}
		public void setSexo(String sexo) {
		this.sexo = sexo;
		}
		public String getRaca() {
		return raca;
		}
		public void setRaca(String raca) {
		this.raca = raca;
		}
		public void dormir() {
		System.out.println("Dormindo");
		}
		public void caminhar() {
		System.out.println("Caminhando");
		}
		public void correr() {
		System.out.println("Correndo");
		}
		public void EmitirSom() {
		System.out.println("Emitindo som");
		
		}
	}
