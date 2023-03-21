public abstract class Move {
    private String nome;
    private int pp;
    TipoPokemon tipo;
    CategoriaMove categoria;
    private int poder;
    private double acuracidade;
    private String descricao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPp() {
        return pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

    public TipoPokemon getTipo() {
        return tipo;
    }

    public void setTipo(TipoPokemon tipo) {
        this.tipo = tipo;
    }

    public CategoriaMove getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaMove categoria) {
        this.categoria = categoria;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public double getAcuracidade() {
        return acuracidade;
    }

    public void setAcuracidade(double acuracidade) {
        this.acuracidade = acuracidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return this.nome;
    }

}
