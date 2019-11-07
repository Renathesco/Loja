
public class Produto {
	public String nome;
	public String tipo;
	public int disponibilidade;
	public ColecaoManual produtos;
	String[] naipes = {"Mesa", "Cadeira", "PS$", "Monitor","Mouse", "Teclado", "Garrafa", "Fone","MacBook", "CPU"};
	

	public ColecaoManual Produtos() {
		for(int i = 0; i < 10; i++) {
			this.produtos.push(this.naipes[i]);
			System.out.println(this.produtos.getCollection()[0]);
		}
		return produtos;
	}
	
	public void listarProdutos() {
		
	}

}
