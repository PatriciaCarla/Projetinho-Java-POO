package projetinhojavapoo;
public class ProjetinhoJavaPoo {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula de JAVA");
        v[1] = new Video("Aula de PHP");
        v[2] = new Video("Aula de MySQL");
        
        Gafanhoto g[] = new Gafanhoto[3];
        g[0] = new Gafanhoto("Bruno",15,"M","brunocarloss");
        System.out.println(g[0].toString());
        Visualizacao vis[] = new Visualizacao[3];
        vis[0] = new Visualizacao(g[0],v[0]);
        vis[1] = new Visualizacao(g[0],v[1]);
        vis[2] = new Visualizacao(g[0],v[2]);
        vis[0].avaliar();
        
        //System.out.println(g[0].toString());
        System.out.println(vis[0].toString());
        //System.out.println(vis[1].toString());
        //System.out.println(vis[2].toString());
        
        /*System.out.println(v[0].toString());
         *System.out.println(v[1].toString());
         *System.out.println(v[2].toString());*/
        

    }
}