import datetime
import time
class MyCalender:
    def __init__(self,year,month):
        self.year=year
        self.month=month
        self.date=datetime.datetime(year,month,1)
    def daysOfmonth(self):
        if self.month!=12:
            x=datetime.datetime(self.year,self.month+1,1)- \
              datetime.datetime(self.year,self.month,1)
            return x.days
        else:
             x=datetime.datetime(self.year + 1, 1, 1) -\
               datetime.datetime(self.year,     12,1)
             return x.days
    def everyWeeksOfMonth(self):
        count=0
        oneweek = []
        for i in range(1,self.daysOfmonth()+1):
            today=datetime.datetime(self.year, self.month, i).weekday()
            oneweek.append(i)
            if today==6 or i==self.daysOfmonth():
                yield oneweek
                oneweek = []
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
    def __repr__(self):
        str=""
        str+=f"{self.date.strftime('%B     %Y'):>22}\n"
        str+='***************************\n'
        str+=f'Sun Mon Tue Wed Thu Fri Sat\n'
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
        str+='***************************\n'
        return str
for i in range(1,13):
    Calen=MyCalender(2018,i)
    print(Calen)
    time.sleep(0.8)
