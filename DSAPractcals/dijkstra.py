import heapq

def dijkstra(graph,start):
    hist = {node: float('inf') for node in graph}
    hist[start] = 0

    pq = [(0,start)]

    while pq:
        d,node = heapq.heappop(pq)

        for neighbor , weight in graph[node]:
            if d + weight < hist[neighbor]:
                hist[neighbor] = d + weight
                heapq.heappush(pq, (hist[neighbor],neighbor))
    return hist

graph = {
    'a' : [('b',1),('c',4)],
    'b' : [('c',2),('d',5)],
    'c' : [('d',1)],
    'd' : []
}

print(dijkstra(graph,'a'))