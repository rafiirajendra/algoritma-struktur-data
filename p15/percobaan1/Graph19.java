package p15.percobaan1;

public class Graph19 {
    int vertex;
    DoubleLinkedLists list[];

    public Graph19(int v) {
        vertex = v;
        list = new DoubleLinkedLists[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedLists();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
        // Uncomment the line below if the graph is undirected
        // list[tujuan].addFirst(asal, jarak);
    }

    public void degree(int asal) throws Exception {
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            // inDegree
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == asal) {
                    ++totalIn;
                }
            }
            // outDegree
            for (k = 0; k < list[asal].size(); k++) {
                list[asal].get(k);
            }
            totalOut = k;
        }
        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + ": " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + ": " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + (totalIn + totalOut));

        // Uncomment the line below if the graph is undirected
        // System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + list[asal].size());
    }

    public void removeEdge(int asal, int tujuan) throws Exception {
        list[asal].remove(tujuan);
    }

    public void removeAllEdge() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Gedung " + (char) ('A' + i) + " terhubung dengan ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + " m), ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }

    // New method to check if there's a path between two nodes
    public boolean isPath(int start, int end) {
        boolean[] visited = new boolean[vertex];
        return dfs(start, end, visited);
    }

    private boolean dfs(int current, int target, boolean[] visited) {
        if (current == target) return true;
        visited[current] = true;
        Node19 tmp = list[current].head;
        while (tmp != null) {
            if (!visited[tmp.data] && dfs(tmp.data, target, visited)) {
                return true;
            }
            tmp = tmp.next;
        }
        return false;
    }
}