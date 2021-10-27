package lesson2;

import java.util.Scanner;

class Main {

 public static void main(String[] args) {
  Scanner sc = new Scanner (System.in);
  
    int store_money = 0;//创建一个detector来存储所有的钱并且判断现在的数是否是大于100或者小于零
  int jin = 0; //他自己的存钱数
  int ma = 0; //他妈妈的存钱数
  
  for(int i = 1; i <= 12; i++) { //循环十二个月份
   
   store_money += 300;
   int use = sc.nextInt();
   store_money -= use;
   
      if(store_money < 0){ //假设store_money小于零就直接输出目前的-i
    System.out.println(); //输出空格
    System.out.println(-i); //输出-i
    break;
   }
   
      else if(store_money >= 100){ //假设store_money现在大于100那么就把整百的给妈妈然后零钱自己留着
        int send = (store_money / 100)* 100; //取余数100然后再乘以100就是当前剩余整百的数字比如 290 / 100 * 100 = 200
        ma += send; //妈妈拿整百的钱
        jin += store_money - send; //他自己把剩余的零钱留着
      }

      else if(store_money < 100){
        jin += store_money; //最后一种情况就是如果剩余的是零钱那么直接自己留着
      }
   
   /*while(jin >= 100) {
   ma += (jin / 100*100);
   jin -= (jin / 100*100);    
   }*/
  }
   
  int ans = (int)(jin + ma * 1.2); //要在for循环外面计算
  
  System.out.println(ans);
  
 }
}