package secao_9_construtores_this_sobrecarga_encapsulamento;

public class ModificadoresDeAcesso {

	/*
	 * Em Java, os modificadores de acesso são palavras-chave que controlam a
	 * visibilidade e acessibilidade de classes, métodos e variáveis. Existem quatro
	 * modificadores de acesso principais:
	 * 
	 * public: É o modificador de acesso mais aberto. Ele permite que membros
	 * (classes, métodos e variáveis) sejam acessados de qualquer lugar, dentro ou
	 * fora do pacote em que estão definidos.
	 * 
	 * protected: Os membros protegidos são acessíveis apenas dentro do mesmo pacote
	 * ou por subclasses, independentemente de estarem no mesmo pacote ou não. Ou
	 * seja, qualquer classe dentro do mesmo pacote ou qualquer subclasse (mesmo que
	 * esteja fora do pacote) pode acessar membros protegidos.
	 * 
	 * default (sem modificador): Também conhecido como "package-private" ou
	 * "package-local". Se um membro não tiver um modificador de acesso
	 * especificado, ele será acessível apenas dentro do mesmo pacote. Classes,
	 * métodos e variáveis sem modificador de acesso podem ser acessados ​​apenas
	 * por outras classes dentro do mesmo pacote.
	 * 
	 * private: É o modificador de acesso mais restrito. Membros privados só são
	 * acessíveis dentro da própria classe em que são definidos. Eles não podem ser
	 * acessados por outras classes, mesmo que estejam no mesmo pacote ou sejam
	 * subclasses.
	 */
	
	public int variavelPublica;
    protected int variavelProtegida;
    int variavelPadrao; // Sem modificador de acesso, portanto, padrão
    private int variavelPrivada;

    public void metodoPublico() {
        // corpo do método
    }

    protected void metodoProtegido() {
        // corpo do método
    }

    void metodoPadrao() {
        // corpo do método
    }

    private void metodoPrivado() {
        // corpo do método
    }

}
