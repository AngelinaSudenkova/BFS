class Graph {
    val adjList: HashMap<Node, MutableList<Node>> = HashMap()

    fun addNode(node: Node){
        if(!adjList.containsKey(node)) adjList[node] = mutableListOf()
    }

    fun deleteNode(node: Node){
        if(adjList.containsKey(node)){
            while(adjList[node]?.isNotEmpty() == true){
                val neighborNode = adjList[node]?.first()
                deleteEdge(node, neighborNode!!)
            }
            adjList.remove(node)
        }
    }

    fun addEdge(node1: Node, node2: Node){
        if(adjList.containsKey(node1) && adjList.containsKey(node2)){
            adjList[node1]?.add(node2)
            adjList[node2]?.add(node1)
        }
    }

    fun deleteEdge(node1: Node, node2: Node){
        if(adjList.containsKey(node1) && adjList.containsKey(node2)){
            adjList[node1]?.remove(node2)
            adjList[node2]?.remove(node1)
        }
    }

    override fun toString(): String {
        var graphString = ""
        for(node in adjList){
            graphString += "${node.key} : "
            for(neighbour in node.value){
                graphString += "$neighbour "
            }
            graphString += "\n"
        }
        return graphString;
    }
    }
