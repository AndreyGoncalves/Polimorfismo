public class Guerreiro extends Personagem {

    public Guerreiro(int id, String nome) {
        super(id, nome);
    }

    @Override
    public void atacar(float intensidade) {

    }

    @Override
    public void mover() {
        System.out.println("Guerreiro se movimentando");
    }
}
