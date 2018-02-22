package com.risingdevs.ds.graph;
/**
 * 
 * @author krishna kumar
 * 
 *         This is a basic Implementation of Graph using Adjacency matrix.
 *
 */
public class Graph {
    private int[] costs;
    private int[][] adjacencyMatrix;
    private int size; // number of nodes in the graph

    public Graph(int size) {
        this.size = size;
        costs = new int[size]; //Initialized with all 0s
        adjacencyMatrix = new int[size][size];//Initialized with all 0s
    }

    public void addNode(int name, int cost) {
        costs[name - 1] = cost;
    }

    public void addEdge(int sourceName, int destinationName, int weight) {
        int sourceIndex = sourceName - 1;
        int destinationIndex = destinationName - 1;
        adjacencyMatrix[sourceIndex][destinationIndex] = weight;
        /*
         * In case we would have had non directional graph [ or bidirectional
         * graph with both the edges between two nodes, n1 and n2 having same
         * weight and this statement being true for all the pair of connected
         * nodes], we just need to add(uncomment) below statement
         */
        //adjacencyMatrix[destinationIndex][sourceIndex] = weight;
    }
    
    public void printState(){
        for(int i = 0 ; i < size; i++){
            for(int j = 0 ; j < size ; j++){
                if(adjacencyMatrix[i][j] != 0){
                    System.out.println("name:"+(i+1)+",cost:"+costs[i]+" is connected with "+"name:"+(j+1)+",cost:"+costs[j] +" with edge-weight as "+adjacencyMatrix[i][j]);
                }
            }
        }
    }
    public static void main(String[] args) {
        Graph graph = new Graph(4);
        graph.addNode(1, 2);
        graph.addNode(2, 10);
        graph.addNode(3, 19);
        graph.addNode(4, 3);

        graph.addEdge(1, 2, 4);
        graph.addEdge(1, 3, 5);
        graph.addEdge(3, 4, 100);
        graph.addEdge(4, 2, 90);
        graph.addEdge(4, 3, 2);
        graph.addEdge(4, 2, 2);

        graph.printState();
    }

}