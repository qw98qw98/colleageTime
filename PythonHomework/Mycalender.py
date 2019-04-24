# def printCalender(self):
#     print(f"{self.date.strftime('%B     %Y'):>22}")
#     print('***************************')
#     print(f'Sun Mon Tue Wed Thu Fri Sat')
#     for i in self.everyWeeksOfMonth():
#         if i[-1] < 28:
#             y = ["" for x in range(7 - len(i))]
#             y.extend(i)
#             for i in y:
#                 print(f'{i:2}  ', end='')
#         else:
#             for j in i:
#                 print(f'{j:2}  ', end='')
#         print('\n')
#     print('***************************')
import datetime
import time
class MyCalender:
    """
      这是由我自己编写的MyCalender类,如果你想使用本类,请在实例化本类的时候调用Mycalender(年，月),本日历支持0-9998期间的十二个月的显示
    如果你想打印本类，只需要使用Print直接将类进行输出即可.
    method:
        daysOfmonth:返回本页日历的月份中一共有几天.
        everyWeeksOfMonth:一个迭代器,每次返回一周,返回的范围是[周一,周二,周三,周四,周五,周六,周日].若为开头或结尾,则列表有可能不满七
                          位(每月的开头或结尾不一定正好对应一周的开始或结束),此时显示为本周的前几天或后几天.可用for循环直接遍历迭代器.
        __repr__:为类的打印和str提供支持,本方法一开始的实现参见开头被注释掉的printCalender方法,本方法借助之前定义的daysOfmonth和
                 everyWeeksOfMonth方法对一个月的天数进行了格式化,最终返回一个str字符串.
    """
    def __init__(self,year,month):
        """
        Return: MyCalender对象,若范围超出0<=year<=9999或1<=month<=12则抛出TypeError异常.
        """
        if 0<=year<=9998 and 1<=month<=12:
            self.year=year
            self.month=month
            self.date=datetime.datetime(year,month,1)
        else:
            raise TypeError
    def daysOfMonth(self):
        """
        Return: 本页日历的月份中的天数
        """
        if self.month!=12:
            x=datetime.datetime(self.year,self.month+1,1)- \
              datetime.datetime(self.year,self.month,1)
            return x.days
        else:
            x=datetime.datetime(self.year + 1, 1, 1) - \
              datetime.datetime(self.year, 12,1)
            return x.days
    def everyWeeksOfMonth(self):
        """
        Return: 本月的迭代器,每次一周.返回的范围是[周一,周二,周三,周四,周五,周六,周日].
        """
        count=0
        oneweek = []
        for i in range(1,self.daysOfMonth()+1):
            today=datetime.datetime(self.year, self.month, i).weekday()
            oneweek.append(i)
            if today==6 or i==self.daysOfMonth():
                yield oneweek
                oneweek = []
    def __repr__(self):
        """
        Return: 返回一个本月的日历字符串.
        """
        str=""
        str+=f"{self.date.strftime('%B     %Y'):>22}\n"
        str+='***************************\n'
        str+=f'Mon Tue Wed Thu Fri Sat Sun\n'
        for i in self.everyWeeksOfMonth():
            if i[-1] < 28:
                y = ["" for x in range(7 - len(i))]
                y.extend(i)
                for i in y:
                    str+=f'{i:2}  '
            else:
                for j in i:
                    str+=f'{j:2}  '
            str=str+f'\n'
        str+='***************************'
        return str
if __name__ == '__main__':
    try:
        year=(int)(input("Plase input a year : "))
        month=(int)(input("Plase input a month : "))
        Calen=MyCalender(year,month)
        print(Calen)
    except TypeError:
        print("Error!请输入正确格式和范围!")
