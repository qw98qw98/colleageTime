def multi(*args):
    i=1
    for num in args:
        i*=num
    return i
if __name__ == '__main__':
    print(multi(1,2,3,4,5,6,7,2))