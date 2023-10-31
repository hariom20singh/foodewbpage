#include <stdio.h>
#include <stdbool.h>
#include <string.h>
#include <limits.h>
 
#define N 6
 
int min(int a, int b) {
    return a < b ? a : b;
}
 
bool bfs(int rGraph[N][N], int s, int t, int parent[]) {
    bool visited[N];
    memset(visited, 0, sizeof(visited));
    visited[s] = true;
    parent[s] = -1;
    int queue[N];
    int front = 0, rear = 0;
    queue[rear++] = s;
    while (front < rear) {
        int u = queue[front++];
        for (int v = 0; v < N; v++) {
            if (!visited[v] && rGraph[u][v] > 0) {
                visited[v] = true;
                parent[v] = u;
                queue[rear++] = v;
            }
        }
    }
    return visited[t];
}
 
int fordFulkerson(int graph[N][N], int s, int t) {
    int rGraph[N][N];
    for (int u = 0; u < N; u++)
        for (int v = 0; v < N; v++)
            rGraph[u][v] = graph[u][v];
    int parent[N];
    int max_flow = 0;
    while (bfs(rGraph, s, t, parent)) {
        int path_flow = INT_MAX;
        for (int v = t; v != s; v = parent[v]) {
            int u = parent[v];
            path_flow = min(path_flow, rGraph[u][v]);
        }
        for (int v = t; v != s; v = parent[v]) {
            int u = parent[v];
            rGraph[u][v] -= path_flow;
            rGraph[v][u] += path_flow;
        }
        max_flow += path_flow;
    }
    return max_flow;
}
 
int main() {
    int graph[N][N] = {
        {0, 16, 13, 0, 0, 0},
        {0, 0, 10, 12, 0, 0},
        {0, 4, 0, 0, 14, 0},
        {0, 0, 9, 0, 0, 20},
        {0, 0, 0, 7, 0, 4},
        {0, 0, 0, 0, 0, 0}
    };
    int s = 0, t = 5;
    printf("Max Flow: %d\n", fordFulkerson(graph, s, t));
    return 0;
}
