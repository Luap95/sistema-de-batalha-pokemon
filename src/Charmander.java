public class Charmander extends Pokemon {
    public Charmander(){
        super.setNome("Charmander");
        super.setTipo(TipoPokemon.Fogo);
        super.setDescricao("A chama na ponta de sua cauda emite um som enquanto queima. " +
                "Você só pode ouvi-lo em lugares silenciosos.");
        super.setHp(39);
        super.setAtk(52);
        super.setDef(43);
        super.setSpAtk(60);
        super.setSpDef(50);
        super.setSpd(65);

        super.setMoves(new Ember());
    }

}
