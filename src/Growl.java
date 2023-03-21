public class Growl extends Move{
    public Growl(){
        super.setNome("Growl");
        super.setDescricao("Reduz o Ataque do inimigo.");
        super.setTipo(TipoPokemon.Normal);
        super.setCategoria(CategoriaMove.Status);
        super.setPp(40);
        super.setPoder(0);
        super.setAcuracidade(1.0);

    }
}
