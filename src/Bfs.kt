import java.util.LinkedList
import java.util.Queue

fun bfs(graph: Graph, startNode: Node) {
    val queue: Queue<Node> = LinkedList<Node>()
    val checkedNodes: ArrayList<Node> = ArrayList<Node>()

    queue.add(startNode)

    while (queue.isNotEmpty()) {
        val node = queue.poll()
        if (!checkedNodes.contains(node)) {
            println("$node")
            val neighbours = graph.adjList[node]
            if (neighbours != null) {
                for (neighbour in neighbours) {
                    queue.add(neighbour)
                }
            }
            checkedNodes.add(node)
        }
    }
}