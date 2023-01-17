Graph class,
Three variables are assigned. nodeName keeps letters,adjacenyMatrix keeps the weight of the neighborhood, visited it makes true if the vertex is already traveled.

addVertex, takes 3 different parameters, the first node, its neighborhood, and the weight between them. İt change the letters to the index which takes letters.
And put weights on the index which is changed.

printGraph, with for loop prints to the screen that node names and weights of between them.

The Bfs, method first changes the node to index and makes false all visited node array. Then it send the index and visited node array to the searcBfs function.

searchBFS method :
We created 2 variables index and temp and assigned -1. Firstlynode is written on the screen then the visited node will be true in the visited node. 
Then the node which comes from for loop travels each node one by one if the temp variable is -1, the visited node is false it controls the link 
between them then it sent nodes that have links and make equal index node's index. İn if the situation there is another item which is smaller and not traveled 
takes this weight. İf index is found, it sent the visited node to searchBFS as recursive.

Main class:
To use matris and other methods in graph class we created 
an object.
We enter the weight of between them then with the 
printgraph method matrix will be printed.
To find short path we run findpath function then output will
