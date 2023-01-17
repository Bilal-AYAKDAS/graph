public class Main {

    public static void main(String[] args) {

        Graph graph =new Graph(8);
        // 0-->A, 1-->B, 2-->C, 3-->D
        // 4-->E, 5-->F, 6-->G, 7-->H

        //We add the weights between A and the adjancency  nodes
        graph.addVertex('A','B',12);
        graph.addVertex('A','C',17);
        graph.addVertex('A','D',20);
        //We add the weights between B and the adjancency  nodes
        graph.addVertex('B','A',12);
        graph.addVertex('B','C',21);
        graph.addVertex('B','H',19);
        //We add the weights between C and the adjancency  nodes
        graph.addVertex('C','A',17);
        graph.addVertex('C','D',4);
        graph.addVertex('C','E',88);
        graph.addVertex('C','B',21);
        graph.addVertex('C','G',6);
        //We add the weights between D and the adjancency  nodes
        graph.addVertex('D','A',20);
        graph.addVertex('D','C',4);
        graph.addVertex('D','F',15);
        graph.addVertex('D','G',13);
        //We add the weights between E and the adjancency  nodes
        graph.addVertex('E','C',88);
        graph.addVertex('E','F',30);
        graph.addVertex('E','G',37);
        graph.addVertex('E','H',19);
        //We add the weights between F and the adjancency  nodes
        graph.addVertex('F','D',15);
        graph.addVertex('F','E',30);
        graph.addVertex('F','G',44);
        //We add the weights between G and the adjancency  nodes
        graph.addVertex('G','C',6);
        graph.addVertex('G','D',13);
        graph.addVertex('G','E',37);
        graph.addVertex('G','F',44);
        //We add the weights between H and the adjancency  nodes
        graph.addVertex('H','B',20);
        graph.addVertex('H','E',15);


        graph.printGraph();


        graph.BFS('A');

    }
}
