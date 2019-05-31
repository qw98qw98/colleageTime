每一行代码顺序执行,叫做顺序结构.
在真正的开发过程中不会只用顺序结构.
所以我们要学习流程控制
#流程控制与数组
- 顺序结构
- 分支结构
   - **if分支**
    如果花括号中只有一行代码,那么这个花括号可以省略.
    如果是多行代码就不能省略了.
     - 典型的 *if else*分支。
     - 只有*If*的分支结构。
     - *if else的串联使用*方式。
   - **switch分支**
     - case只能是byte.short.int.char.[string(After:1.7)]
     - break退出
     - default缺省执行
- 循环结构
  - while循环:
  先判断表达式是否成立再执行循环体
    - 让条件不成立跳出:在while后面()放入适当的条件
    - 主动跳出:break跳出当前循环.
  - do while循环
    先执行后判断.
  ~~~java 
  do{
      //循环体,反复执行的代码;
  }while(statement);
  ~~~
   - for循环
  ~~~java
  for(初始化部分;条件部分;最后执行部分){
      //循环体
  }
  ~~~
    - foreach循环
    - fori循环
  ### Break
  break语句表示跳出当前循环.
  ### Continue
  continue语句表示略过本次循环.
  ### Return
  1. 返回数据.
  2. 退出当前方法.
#数组
数组,一组数据
Java提供了一种能操作相同类型的多个数据的机制:数组.

>数组是编程语言中最常见的一种数据结构，可以存储多个相同类型的数据，每个数组元素存
放一个数据,通过数组元素的索引来访问数组元素。数组也是一种类型，他是引用类型。数组
使用中括号[]来定义,在Java中，当定义一个数组类型时，会像JVM申请地址空间，这时JVM
会分配一块连续的内存单元来存储数组中的各个元素.

### 数组的初始化:
~~~java
//向JVM发出了一个申请,申请一块内存空间,内存空间要十个长度,四个字节.
//隐含的操作,是针对于每个引用类型来说的,对象创建完成后,要执行对象的初始化操作.
//对象创建完成后JVM会立刻为创建的对象进行默认的赋值操作(堆内存)
//数值：0；引用:null；布尔:false.
public void main(String[] args){
    int[] nums=new int[10];
    boolean[] bools=new boolean[10];
    Test[] tests=new tests[10];
    int[] num1=new int[]{1,4,5,6,1,6,4,6,6,1,6,8,63};//动态初始化
    int[] num2=new {1,5,6,4,6,7,6,1,6,4,6,2,6,8,4,6};
    int[] num3=new int[10];//静态初始化
}
for(int num:nums){
    System.out.println(num);//输出10次0;
}
for(boolean bool:bools){
    System.out.println(bool);//输出10次false;
}
for(Test test:tests){
    System.out.println(test);//输出10次null;
}
~~~
