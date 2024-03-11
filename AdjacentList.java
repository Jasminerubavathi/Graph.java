 
    import java.util.LinkedList;

    public class AdjacentList {
    LinkedList<Integer>[] adj;

    public AdjacentList(int nodes) {
        this.adj = new LinkedList[nodes];
        for (int i = 0; i < nodes; i++) {
            this.adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }
    public void print(){
        for(int i =0;i<adj.length;i++){
            System.out.println("vertex is connected to:");
            for(int adjacent:adj[i]){
                System.out.println("adjacent is:"+adjacent);
            }
        
        System.out.println("");
        }
    }

    public static void main(String[] args) {
        AdjacentList gp = new AdjacentList(4);
        gp.addEdge(0, 1);
        gp.addEdge(1, 2);
        gp.addEdge(2, 3);
        gp.addEdge(3, 0);
        gp.print();
    }
}

    

