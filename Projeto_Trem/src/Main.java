//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locomotiva locomotiva1 = new Locomotiva(1, "Loc1", 1, 200);
        Locomotiva locomotiva2 = new Locomotiva(2, "Loc2", 2, 300);

        Farol farol1 = new Farol(1, "Lumina 1", 100, 1);
        Farol farol2 = new Farol(2, "Lumina 2", 150, 1);
        Farol farol3 = new Farol(3, "Lumina 3", 300, 1);
        Farol farol4 = new Farol(4, "Lumina 4", 200, 1);

        Vagao vagao1 = new Vagao(1, "Vagão 1", 1);
        Vagao vagao2 = new Vagao(2, "Vagão 2", 1);
        Vagao vagao3 = new Vagao(2, "Vagão 3", 2);

        locomotiva1.farois.add(farol1);
        locomotiva2.farois.add(farol2);

        vagao2.farois.add(farol3);
        vagao3.farois.add(farol4);

        Trem trem1 = new Trem(1, "Modelo 1", "Vale", locomotiva1);
        Trem trem2 = new Trem(2, "Modelo 2", "Samarco", locomotiva2);

        trem1.ConectarVagao(vagao1);
        trem1.ConectarVagao(vagao2);
        trem2.ConectarVagao(vagao3);
    }
}