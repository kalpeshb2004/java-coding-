def dfs(graph,node,visited):
    if node not in visited:
        print(node , end="")
        visited.add(node)

        for neighbor in graph[node]:
            dfs(graph,neighbor,visited)

graph = {
    'a' : ['b','c'],
    'b' : ['d','e'],
    'c' : ['f'],
    'd' : [],
    'e' : [],
    'f' : []
    
}      

visited = set()
dfs(graph,'a',visited)