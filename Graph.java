public class Graph {
    int[][] adjMatrix;
    int n;

    

public Graph(int nodes){
    this.adjMatrix = new int[nodes][nodes];
}

public void addEdges(int u,int v){
    this.adjMatrix[u][v]=1;
    this.adjMatrix[v][u]=1;

}
 public void display(){
    for(int i=0;i<n;i++){
    
        for(int j=0;j<n;j++){
            System.out.println(adjMatrix [i][j]);
        }
    
    System.out.println("");
    }

 }

public static void main(String[] args) {
    Graph gp = new Graph(4);
    gp.addEdges(0, 1);
    gp.addEdges(1, 2);
    gp.addEdges(2, 3);
    gp.addEdges(3, 0);
    gp.display();
}
  
}
