class Node:
    def __init__(self,val):
        self.val = val
        self.left = None
        self.right = None

def inorder(root):
    if root:
        inorder(root.left)
        print(root.val , end="")
        inorder(root.right)
        
def preorder(root):
    if root:
        print(root.val , end="")
        preorder(root.left)
        preorder(root.right)

def postorder(root):
    if root:
        postorder(root.left)
        postorder(root.right)
        print(root.val , end="")
    
        

root = Node(1)
root.left = Node(2)
root.right = Node(3)

print("inorder")
inorder(root)

print("\npreorder")
preorder(root)

print("\npostorder")
postorder(root)