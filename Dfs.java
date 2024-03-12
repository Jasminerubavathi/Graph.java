import java.util.LinkedList;
import java.util.Stack;

public class Dfs {
    LinkedList<Integer>[] adj;
    public Dfs(int nodes) {
        this.adj = new LinkedList[nodes];
        for (int i = 0; i < nodes; i++) {
            this.adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }

     

    public void dfs(int s) {
        int vertices = adj.length;
        boolean[] visited = new boolean[vertices];
        Stack<Integer> stack = new Stack<>();
        stack.push(s);
        while (!stack.isEmpty()) {
            int u = stack.pop();
            if (!visited[u]) {
                System.out.println(u + " ");
                visited[u] = true;
                for (int v : adj[u]) {
                    if (!visited[v]) {
                        stack.push(v);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Dfs dp = new Dfs(5);
        dp.addEdge(0, 1);
        dp.addEdge(1, 2);
        dp.addEdge(2, 3);
        dp.addEdge(3, 0);
    
        System.out.println("\nDFS traversal:");
        dp.dfs(0);
    }
}
