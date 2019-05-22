# -*- coding:utf-8 -*-
import random
import time
import jieba
def home_work_1():
    strs="wertyuiopasdfghjklzxcvbnm123456789ZXCVBNMASDFGHJKLQWERTYUIOP"
    list=[]
    for i in strs:
        list.append(i)
    print(list)
    for _ in range(11):
        print("".join(random.sample(list,10)))
def home_work_2(list):
    for i in list:
        if list.count(i)>1:
            return True
        return False
def home_work_3(list):
    return len(list)==len(set(list))
def home_work_4(str):
    dic={}
    for i in str:
        dic[i] = dic.get(i,0) + 1
    items = list(dic.items())
    items.sort(key=lambda x: x[1], reverse=True)
    for i in range(len(items)):
        word, count = items[i]
        print(f"{word:<10}{count:>5}")
def home_work_5():
    times=100000
    count = 0
    people = 23
    peoplelist=[random.randint(1,365) for _ in range(1000)]
    for i in range(times):
        people_birth=random.sample(peoplelist,people)
        if home_work_3(people_birth):
            continue
        count+=1
    return count/times
def home_work_6():
    with open("红楼梦.txt","rb") as f:
        str=f.read()
        str=jieba.cut(str)
        namestr='林黛玉 薛宝钗 贾元春 贾迎春 贾探春 贾惜春 李纨 妙玉 史湘云 王熙凤 贾巧姐 秦可卿 晴雯 ' \
                 '麝月 袭人 鸳鸯 雪雁 紫鹃 碧痕 平儿 香菱 金钏 司棋 抱琴 赖大 焦大 王善保 周瑞 林之孝 ' \
                 '乌进孝 包勇 吴贵 吴新登 邓好时 王柱儿 余信 庆儿 昭儿 兴儿 隆儿 坠儿 喜儿 寿儿 丰儿 ' \
                 '住儿 小舍儿 李十儿 玉柱儿 氏：贾敬 贾赦 贾政 贾宝玉 贾琏 贾珍 贾环 贾蓉 贾兰 贾芸 ' \
                 '贾蔷 贾芹 琪官 芳官 藕官 蕊官 药官 玉官 宝官 龄官 茄官 艾官 豆官 葵官 妙玉 智能 ' \
                 '智通 智善 圆信 大色空 净虚 彩屏 彩儿 彩凤 彩霞 彩鸾 彩明 彩云 贾元春 贾迎春 贾探春 ' \
                 '贾惜春 贾宝玉 甄宝玉 薛宝钗 薛宝琴 薛蟠 薛蝌 薛宝钗 薛宝琴 王夫人 王熙凤 王子腾 王仁 ' \
                 '尤老娘 尤氏 尤二姐 尤三姐 贾蓉 贾兰 贾芸 贾芹 贾珍 贾琏 贾环 贾瑞 贾敬 贾赦 贾政 贾敏 ' \
                 '贾代儒 贾代化 贾代修 贾代善 晴雯 金钏 鸳鸯 司棋 詹光 单聘仁 程日兴 王作梅 石呆子 张华 冯渊 ' \
                 '张金哥 茗烟 扫红 锄药 伴鹤 小鹊 小红 小蝉 小舍儿 刘姥姥 马道婆 宋嬷嬷 张妈妈 秦锺 蒋玉菡 柳湘莲 ' \
                 '东平王 乌进孝 冷子兴 山子野 方椿 载权 夏秉忠 周太监 裘世安 抱琴 司棋 侍画 入画 珍珠 琥珀 玻璃 翡翠 '
        namelist=namestr.split()
        namedict={}
        for name in str:
            if name in namelist:
                namedict[name]=namedict.get(name,0)+1
        anslist=list(namedict.items())
        anslist.sort(key=lambda x:x[1],reverse=True)
        for i in anslist[:11]:
            print(f"{i[0]}:{i[1]}")


if __name__ == '__main__':
    print("作业一答案")
    home_work_1()
    print("作业二答案")
    print(home_work_2([1, 2, 3, 4, 5]))
    print("作业三答案")
    print(home_work_2([1,2,3,4,5,1]))
    print("作业四答案")
    print(home_work_4("aaaaaabbbbbbbbbvvvvvvvvfffffffffff"))
    print("作业五答案")
    print(home_work_5())
    print("作业六答案")
    print(home_work_6())
