public class Dijkstra {
    public static void main(String[] args) {
        int[][] graph = {
                {0,6,0,0,1},
                {6,0,5,2,2},
                {0,5,0,5,0},
                {0,2,5,0,1},
                {1,2,0,1,0}
        };

        int start = 0;
        int finish = 2;

        dijkstra(graph, start, finish);
    }

    public static void dijkstra(int[][] graph, int start, int finish) {
        int v = graph.length;
        int[] distance = new int[v];
        distance[0] = 0;

        for (int i = 0; i < v; i++) {
            distance[i] = Integer.MAX_VALUE;
        }

        boolean[] visited = new boolean[v];

        for (int i = 0; i < v; i++) {
            int minVertex = findMinVertex(distance, visited);
            System.out.println(minVertex);
            visited[minVertex] = true;

            //Tìm đỉnh kề với đỉnh vừa tìm
            for (int j = 0; j < v; j++) {
                if (graph[minVertex][i] != 0 && !visited[j] && distance[minVertex] != Integer.MAX_VALUE) {
                    int newDistance = distance[minVertex] + graph[minVertex][j];
                    if (newDistance < distance[j]) {
                        distance[j] = newDistance;

                    }
                }
            }
        }
        for (int i = 0; i < v; i++) {
            System.out.println(i + " - " + distance[i]);
        }
    }

    public static int findMinVertex(int[] distance, boolean[] visited) {
        int minVertex = -1;
        for (int i = 0; i < distance.length; i++) {
            if (!visited[i] && (minVertex == -1 || distance[i] < distance[minVertex])) {
                minVertex = i;
            }
        }

        return minVertex;
    }
}
