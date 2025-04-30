import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> lista = new ArrayList<>();
        lista.add(new Produto(1, "A" , 10));
        lista.add(new Produto(2, "B" , 10));
        lista.add(0, new Produto(3, "C", 10));


        for(int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getId());
        }

        for (Produto p : lista) {
            System.out.println(p.getNome());
        }
        System.out.println(lista);  // ---> toString()

    }
}
