def preorder(root):
    print(root, end="")
    if binary_tree[root][0] != ".":
        preorder(binary_tree[root][0])
    if binary_tree[root][1] != ".":
        preorder(binary_tree[root][1])

def inorder(root):

    if binary_tree[root][0] != ".":
        inorder(binary_tree[root][0])
    print(root, end="")
    if binary_tree[root][1] != ".":
        inorder(binary_tree[root][1])

def postorder(root):

    if binary_tree[root][0] != ".":
        postorder(binary_tree[root][0])
    if binary_tree[root][1] != ".":
        postorder(binary_tree[root][1])
    print(root, end="")

N = int(input())

binary_tree = {}
root = None

for i in range(N):
    tmp = input().split()
    if(i == 0):
        root = tmp[0]
    binary_tree[tmp[0]]=[tmp[1],tmp[2]]

preorder(root)
print()
inorder(root)
print()
postorder(root)







