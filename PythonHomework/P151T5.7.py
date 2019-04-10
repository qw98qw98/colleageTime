def move(A,B):
    print(f'{A}————>{B}')
def hanoi(A,temp,B,n):
    if n==1:
        return
    hanoi(A,B,temp,n-1)
    move(A,B)
    hanoi(temp,A,B,n-1)
hanoi('A','B','C',99)

