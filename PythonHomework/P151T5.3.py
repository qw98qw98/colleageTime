def isNum(n):#异常连续捕获分阶段判断
    try:
        (complex)(n)
        return True
    except (TypeError,ValueError):
        try:
            (float)(n)
            return True
        except (TypeError,ValueError):
            try:
                (int)(n)
                return True
            except (TypeError,ValueError):
                return False
if __name__ == '__main__':
    print(isNum("asd"))
    print(isNum(1))
    print(isNum("1.2"))
    print(isNum("1.124+91j"))
    print(isNum("!@#"))
