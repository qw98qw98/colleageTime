from math import sqrt
def isPrime(n):
    try:
        if isinstance(n,int):#只支持整数。
            if n == 1:
                return False
            flag=True
            for i in range(2,(int)(sqrt(n))+1):
                if n%i==0:
                    flag=False
                    return False
            return flag
        else:
            print("请输入整数类型！")
    except (TypeError,ValueError):
        print("类型输入错误")
if __name__ == '__main__':
    prime = []
    isPrime(3.5)
    isPrime(123)
    isPrime(123.999)
    isPrime(123.999+10j)
    for i in range(1,101):
        flag=isPrime(i)
        print(f'{i}是素数吗？{flag}.')
        if flag:
            prime.append(i)
    print(prime)
