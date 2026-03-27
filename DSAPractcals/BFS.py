from collections import deque
def bfs(graph,start):
    visited = set()
    queue = deque([start])
    visited.add(start)

    while queue:
        node = queue.popleft()
        print(node,end="")

        for neighbor in graph[node]:
             if neighbor not in visited:
                visited.add(neighbor)
                queue.append(neighbor)

graph = {
    'a' : ['b','c'],
    'b' : ['d','e'],
    'c' : ['f'],
    'd' : [],
    'e' : [],
    'f' : []
    
}    

bfs(graph,'a')