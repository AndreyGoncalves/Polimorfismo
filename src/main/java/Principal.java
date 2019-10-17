import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Arqueiro a = new Arqueiro(1,"Andrey",10);
        Cavaleiro c1 = new Cavaleiro(2,"Thiago");
        Cavaleiro vetc[] = new Cavaleiro[100];
        ArrayList<Personagem> personagems = new ArrayList<Personagem>();
        personagems.add(new Arqueiro(1,"xablau1",10));
        personagems.add(new Arqueiro(2,"xablau2",10));
        personagems.add(new Cavaleiro(10,"xablau10"));
        personagems.add(new Cavaleiro(20,"xablau20"));
        personagems.add(new Guerreiro(30,"Guerreiro"));
        personagems.add(new Guerreiro(40,"Guerreiro2"));
        personagems.add(new Guerreiro(50,"Guerreiro3"));

        for(Personagem p:personagems){
            p.mover();
        }


        /*
        for(int i=0;i<100;i++){
            vetc[i].mover();
        }

        a.mover();
        c1.mover();

*/

        /*Personagem vetP[] = new Personagem[4];
        vetP[1] = new Arqueiro();
        vetP[2] = new Cavaleiro();

        for(int i=0; i < 4; i++){
            vetP[i].mover();
             }*/
    }
}
