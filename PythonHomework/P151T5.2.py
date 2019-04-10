def isOdd(n):
    return True if n%2!=0 else False
if __name__ == '__main__':
    x=(int)(input("num:"))
    print(f'{x}是奇数吗? {isOdd(x)}')