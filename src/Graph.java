import java.util.Arrays;

public class Graph {
    int[][] adjacencyMatrix;
    char[] nodeName;
    boolean[] visitedNode;
    public Graph(int size) {
        this.adjacencyMatrix = new int[size][size];
        this.nodeName = new char[size];
        this.visitedNode = new boolean[size];

        for (int i=0;i<this.nodeName.length;i++){
            this.nodeName[i]=(char)('A'+i);
        }
    }
    public void addVertex(char vertex1,char vertex2,int weight){
        int index1 = vertex1 - 'A';
        int index2 = vertex2 - 'A';
        this.adjacencyMatrix[index1][index2] = weight;
    }
    public  void printGraph(){
        System.out.print("\t ");
        for (int i=0;i<this.nodeName.length;i++)
            System.out.printf("[%2s] ", this.nodeName[i]);

        System.out.println();

        for (int i=0;i<this.nodeName.length;i++){
            System.out.printf("[%2s] ", this.nodeName[i]);
            for (int j=0;j<this.nodeName.length;j++){
                System.out.printf("[%2d] ", this.adjacencyMatrix[i][j]);
            }
            System.out.println();
        }
    }
    public void BFS(char vertex){
       int index = vertex - 'A' ;
       Arrays.fill(this.visitedNode, false);
       System.out.print("the shortest path");
       searchBFS(index,this.visitedNode);

    }
    // A-->B-->H-->E-->F-->D-->C-->G
    // Bu method yayılım öncelikli arama algoritmasına göre arama yaparak en kısa yolu bulur.
    public  void searchBFS(int startİndex,boolean[] visitedNode){
        int temp = -1; //bu değişken en kısa yolun  ağırlığını tutar
        int index = -1; //bu değişken en kısa yol bulunan vertexi tutar

        System.out.print("-->"+(char)('A'+startİndex));
        visitedNode[startİndex] = true;

        for (int i=0;i<this.nodeName.length;i++){

            if (temp ==-1 && this.visitedNode[i]==false && this.adjacencyMatrix[startİndex][i]>0){
                temp = this.adjacencyMatrix[startİndex][i];
                index = i;

            }else if (this.adjacencyMatrix[startİndex][i] < temp && this.visitedNode[i] != true&&this.adjacencyMatrix[startİndex][i]>0){
                temp = adjacencyMatrix[startİndex][i];
                index = i;
            }
        }
        if (index!=-1)
            searchBFS(index,visitedNode);




    }

}
