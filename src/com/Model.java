package com;

import java.util.Random;

public class Model {

	public static void main(String[] args) {
		//ģ���Լ����ŵ��ı���
		int num = (int)(Math.random() * 100)+1;
		num =51;
		String numToStr = ""+num;
		//�趨���1�����ֵ
		String sb = numToStr;
		//�趨���2�����ֵ
		String sb2 = numToStr;
		String sb3 = numToStr;
		//�ж��������
		if(num%3 == 0&& num%5 !=0){
			sb2 = sb="Fizz";
		}else if(num%3 != 0&& num%5 ==0){
			sb2 =sb="Buzz";
		}else if(num%3 == 0&& num%5 ==0){
			sb2 =sb="FizzBuzz";
		}
		//�ж�
		if(sb2.contains("Buzz")&&iscontains(sb3,'3')){
				sb2 = "FizzBuzz";
		}else if(sb2.contains("Fizz")&&iscontains(sb3,'5')){
				sb2 = "FizzBuzz";
		}
		System.out.println("Number :"+num);
		System.out.println("Your should say : "+sb);
		System.out.println("#Stage2 Your should say : "+sb2);
		
	}
	
	public static boolean iscontains(String str,char num){
		boolean flag = false;
		char[] strlist = str.toCharArray();
		 for(char x : strlist){
			 if (x==num){
				 flag = true;
			 }
		 }
		return flag;
	}

}
