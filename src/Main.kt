fun main() {
    val graph = Graph()
    val me = Node("Me")
    val alice = Node("Alice")
    val bob = Node("Bob")
    val claire = Node("Claire")
    val tom = Node("Tom")
    val jonny = Node("Johny")
    val peggy = Node("Peggy")
    val anuj = Node("Anuj")

    graph.addNode(me)
    graph.addNode(alice)
    graph.addNode(bob)
    graph.addNode(claire)
    graph.addNode(tom)
    graph.addNode(jonny)
    graph.addNode(peggy)
    graph.addNode(anuj)

    graph.addEdge(me, alice)
    graph.addEdge(me, bob)
    graph.addEdge(me, claire)
    graph.addEdge(claire,tom)
    graph.addEdge(claire,jonny)
    graph.addEdge(alice, peggy)
    graph.addEdge(bob,peggy)
    graph.addEdge(bob,anuj)


    println(graph.toString())

    bfs(graph, me)

}