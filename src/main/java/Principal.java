public class Principal {
    public static void main(String[] args) {
        Arqueiro a = new Arqueiro(1,"Andrey",10);
        Cavaleiro c1 = new Cavaleiro(2,"Thiago");

        a.mover();
        c1.mover();
    }
}
