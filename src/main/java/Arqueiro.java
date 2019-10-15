public class Arqueiro extends Personagem {
    private int habilidade;

    public Arqueiro(int id, String nome, int habilidade) {
        super(id, nome);
        this.habilidade = habilidade;
    }

    @Override
    public void atacar(float intensidade) {

    }

    @Override
    public void mover() {
        System.out.println("Movendo 2 unidades");
    }

}
