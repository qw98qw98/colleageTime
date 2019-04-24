def move(A,B):
    print(f'{A} ———> {B}')
def hanoi(A,temp,B,n):
    if n==1:
        move(A,B)
        return
    hanoi(A,B,temp,n-1)
    move(A,B)
    hanoi(temp,A,B,n-1)
level=(int)(input("层数:"))
hanoi('A','B','C',level)
