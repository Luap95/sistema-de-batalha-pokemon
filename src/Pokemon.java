import java.util.ArrayList;
import java.util.Collections;

public abstract class Pokemon {
    private int hp;
    private int spd;
    private int def;
    private int atk;
    private int spAtk;
    private int spDef;
    private int level;
    private String nome;
    private TipoPokemon tipo;
    private ArrayList<Move> moves = new ArrayList<>();
    private String descricao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoPokemon getTipo() {
        return tipo;
    }

    public void setTipo(TipoPokemon tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Move> getMoves() {
        return (ArrayList<Move>) Collections.unmodifiableList(moves);
    }

    public void setMoves(Move move) {
        this.moves.add(move);
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getSpd() {
        return spd;
    }

    public void setSpd(int spd) {
        this.spd = spd;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getSpAtk() {
        return spAtk;
    }

    public void setSpAtk(int spAtk) {
        this.spAtk = spAtk;
    }

    public int getSpDef() {
        return spDef;
    }

    public void setSpDef(int spDef) {
        this.spDef = spDef;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString(){
        return "Pokémon: " + this.nome + "\n" +
                "Tipo: " + this.tipo + "\n" +
                "Descrição: " + this.descricao + "\n" +
                "Moves: " + this.moves;


    }
}
