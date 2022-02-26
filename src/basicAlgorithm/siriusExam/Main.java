package basicAlgorithm.siriusExam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
      FastScanner scanner = new FastScanner();
      int n = scanner.nextInt();
      int m = scanner.nextInt();
      Graph graph = new Graph(n + 1);
      for (int i = 0; i < m; i++) {
          int a = scanner.nextInt();
          int b = scanner.nextInt();
          graph.addEdge(a, b);
      }
      if (graph.isCyclic())
          System.out.println("No");
      else
          System.out.println("Yes");
    }

    private static class Graph
    {
        private int V;
        private LinkedList<Integer> adj[];

        Graph(int v) {
            V = v;
            adj = new LinkedList[v];
            for(int i = 0; i < v; ++i)
                adj[i] = new LinkedList();
        }

        void addEdge(int v,int w) {
            adj[v].add(w);
            adj[w].add(v);
        }

        Boolean isCyclicUtil(int v, Boolean visited[], int parent)
        {
            visited[v] = true;
            Integer i;
            Iterator<Integer> it = adj[v].iterator();
            while (it.hasNext())
            {
                i = it.next();
                if (!visited[i])
                {
                    if (isCyclicUtil(i, visited, v))
                        return true;
                }
                else if (i != parent)
                    return true;
            }
            return false;
        }

        Boolean isCyclic()
        {
            Boolean visited[] = new Boolean[V];
            for (int i = 0; i < V; i++)
                visited[i] = false;
            for (int u = 0; u < V; u++)
                if (!visited[u])
                    if (isCyclicUtil(u, visited, -1))
                        return true;
            return false;
        }
    }

    private static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}