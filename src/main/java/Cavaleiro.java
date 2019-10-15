public class Cavaleiro extends Personagem {

    public Cavaleiro(int id, String nome) {
        super(id, nome);
    }

    @Override
    public void atacar(float intensidade) {

    }

    @Override
    public void mover() {
        System.out.println("Movendo 10 unidades");
    }
}
