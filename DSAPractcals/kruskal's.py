def find(parent , i):
    if parent[i] != i:
        parent[i] = find(parent ,parent[i])
    return parent[i]   

def union(parent , x, y):
    parent[find(parent , x)] = find(parent ,y)

def kruskal(graph,nodes):
    edges = sorted(graph, key=lambda x: x[2])
    parent = {node: node for node in nodes}

    mst = []

    for u ,v, w in edges:
        if find(parent , u) != find(parent , v):
            union(parent , u, v)
            mst.append((u,v,w))
    return mst

edges = [
    ('A', 'B', 1),
    ('B', 'C', 2),
    ('A', 'C', 3),
    ('C', 'D', 4)
]

nodes = ['A', 'B', 'C', 'D']

print(kruskal(edges, nodes))