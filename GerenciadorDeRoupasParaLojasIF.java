import java.util.List;

public interface GerenciadorDeRoupasParaLojasIF {
	public void cadastraRoupas(Roupas r);
	public List<Roupas> pesquisaRoupas();
	public List<Roupas> pesquisaRoupasDoFabricante(String fabricante);
	public List<Roupas> pesquisaRoupasPorTamanho(String tamanho);
	public List<Roupas> pesquisaRoupasPorSexo(String sexo);
	public List<Roupas> pesquisaRoupasPorTipo(String tipo);
	public int informaQuantidadeDeRoupasCadastradas();
	public void removeRoupas(String tipo, String fabricante, String sexo, String tamanho);
	
}
