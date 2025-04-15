public class Main {
    public static void main(String[] args) {
        Pessoa []p = new Pessoa [2];
        Livro []l = new Livro[3];

        p[0] = new Pessoa("Gustavo", 20, "M");
        p[1] = new Pessoa("Maria", 45, "F");

        l[0] = new Livro("Aprender", "Eduarda", 20, p[1]);
        l[1] = new Livro("Cozinhar", "Karla", 60, p[1]);
        l[2] = new Livro("Doideiras", "Leonardo", 100, p[0]);

        System.out.println(l[0].detalhes());
    }
}
