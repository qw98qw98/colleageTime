# str1=input("请输入一个人的名字：")
# str2=input("请输入一个国家名字：")
# print(f"世界这么大,{str1}想去{str2}看看")

# n=input("请输入整数N:")
# sum=0
# for i in range(int(n)):
#     sum+=i+1
# print(f"1到N求和结果: {sum}")

# 思考与练习 3.12
# 一周连续工作4天
def total(n):
    dayup = 1.0
    N = n
    for i in range(365):
        if i%7 in [1,2,3,4,5]:
            dayup = dayup*(1+N)
    print("年终值：{:.2f}".format(dayup))

for i in range(1,11):
    print(i/1000)
    total(i/1000)
# Year=(int)(input("请输入年份: "))
# ani="猴 鸡 狗 猪 鼠 牛 虎 兔 龙 蛇 马 羊".split(" ")
# (print(ani[0]) if Year%12==0 else ...)
# (print(ani[1]) if Year%12==1 else ...)
# (print(ani[2]) if Year%12==2 else ...)
# (print(ani[3]) if Year%12==3 else ...)
# (print(ani[4]) if Year%12==4 else ...)
# (print(ani[5]) if Year%12==5 else ...)
# (print(ani[6]) if Year%12==6 else ...)
# (print(ani[7]) if Year%12==7 else ...)
# (print(ani[8]) if Year%12==8 else ...)
# (print(ani[9]) if Year%12==9 else ...)
# (print(ani[10]) if Year%12==10 else ...)
# (print(ani[11])if Year%12==11 else ...)

# origin=[chr(i) for i in range(ord("a"),ord("z")+1)]
# reverse=sorted(origin,key=lambda x:-ord(x))
# secret=dict(zip(origin,reverse))
# str1="study hard and make progress every day"
# print(str1)
# ans=""
# for i in str1:
#     ans+=secret.get(i," ")
# print(ans)
#
# peonum=int(input("请输入学生数量: "))
# peo=[int(input("学生成绩: ")) for _ in range(peonum)]
# max1,max2=peo[0],peo[1]
# for i in peo:
#     if i>max1:
#         max2=max1
#         max1=i
#     if max1>i>max2:
#         max2=i
# print(max1,max2)