import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    LinkedList<Integer>[] adj;

    public BFS(int nodes) {
        this.adj = new LinkedList[nodes];
        for (int i = 0; i < nodes; i++) {
            this.adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }

    public void bfs(int s) {
        int vertices = adj.length;
        boolean[] visited = new boolean[vertices];
        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.offer(s);
        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u + " ");
            for (int v : adj[u]) {
                if (!visited[v]) {
                    visited[v] = true;
                    q.offer(v);
                }
            }
        }
    }

    public static void main(String[] args) {
        BFS bfs = new BFS(6);
        bfs.addEdge(0, 1);
        bfs.addEdge(0, 2);
        bfs.addEdge(1, 3);
        bfs.addEdge(1, 4);
        bfs.addEdge(2, 4);
        bfs.addEdge(3, 5);
        bfs.addEdge(4, 5);

        System.out.println("BFS traversal:");
        bfs.bfs(0);
    }
}
