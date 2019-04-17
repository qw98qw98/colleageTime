def height(n):
    print((f'| '+'   '*n)*n,end="")
    print(f'| ')
def wide(n):
    print((f'+ '+'—— '*n)*n,end="")
    print(f'+ ')
def printf():
    n=(int)(input('num:'))
    for i in range(n):
        wide(n)
        for j in range(n):
            height(n)
    wide(n)
while True:
    printf()
