package com.selva.programs.graph;

import java.util.Stack;

public class AllPaths<Vertex> {

    private Stack<String> path  = new Stack<String>();   // the current path
    private SET<String> onPath  = new SET<String>();     // the set of vertices on the path

    public AllPaths(Graph G, String s, String t) {
        enumerate(G, s, t);
    }

    // use DFS
    private void enumerate(Graph G, String v, String t) {

        // add node v to current path from s
        path.push(v);
        onPath.add(v);

        // found path from s to t - currently prints in reverse order because of stack
        if (v.equals(t)) System.out.println(path);

        // consider all neighbors that would continue path with repeating a node
        else {
            for (String w : G.adjacentTo(v)) {
                if (!onPath.contains(w)) enumerate(G, w, t);
            }
        }

        // done exploring from v, so remove from path
        path.pop();
//        onPath.remove(v);
    }

    public static void main(String[] args) {
        Graph G = new Graph();
        G.addEdge("A", "B");
        G.addEdge("A", "C");
        G.addEdge("C", "D");
        G.addEdge("D", "E");
        G.addEdge("C", "F");
        G.addEdge("B", "F");
        G.addEdge("F", "D");
        G.addEdge("D", "G");
        G.addEdge("E", "G");
        System.out.println(G);
        AllPaths allpaths1 = new AllPaths(G, "A", "G");
        System.out.println();
        AllPaths allpaths2 = new AllPaths(G, "B", "F");
    }

}

