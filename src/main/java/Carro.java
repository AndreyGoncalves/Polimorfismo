public interface Carro {

    public static final String nome = "Carro";

    void frear(int intesidade);

    default void desligar(){
        System.out.println("Desligando carro.");
    }
}
