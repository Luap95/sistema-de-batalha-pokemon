public class Ember extends Move{
    public Ember(){
        super.setNome("Ember");
        super.setDescricao("Um ataque de fogo fraco que pode infligir uma queimadura.");
        super.setTipo(TipoPokemon.Fogo);
        super.setCategoria(CategoriaMove.Especial);
        super.setPp(25);
        super.setPoder(40);
        super.setAcuracidade(1.0);

    }
}
