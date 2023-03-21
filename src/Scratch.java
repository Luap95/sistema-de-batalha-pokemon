public class Scratch extends Move{
    public Scratch(){
        super.setNome("Scratch");
        super.setDescricao("Arranha o inimigo com garras afiadas.");
        super.setTipo(TipoPokemon.Normal);
        super.setCategoria(CategoriaMove.Fisico);
        super.setPp(35);
        super.setPoder(40);
        super.setAcuracidade(1.0);

    }
}
