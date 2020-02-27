package com.shishunan.common.utils;

import java.util.HashSet;
import java.util.Random;

/**
 * 
 * @ClassName: RandomUtil 
 * @Description: �����������
 * @author: ʦ����
 * @date: 2020��2��27�� ����4:29:43
 */
public class RandomUtil {
	//����1������min-max֮����������������min��maxֵ�������緵��1-3֮������������ô����1��2��3������ȷ�ģ�����4�Ͳ��ԡ� (5��)
	public static int random(int min, int max){
	
		//�������
		Random random=new Random();
		int i = random.nextInt(max - min + 1)+min;
		return i;
	}
	//����2������Сֵmin�����ֵmax֮���ȡsubs�����ظ����������������1-10֮��ȡ3�����ظ������������ô[2,6,9]�ǶԵģ�[3,5,5]�򲻶ԣ���Ϊ5�ظ��ˡ�Ӧ�ó�������100ƪ���������ȡ10ƪ���£��¿����ܻ�ʹ�õ��� (8��)
	public static int[] subRandom (int min, int max, int subs){
		int[] x=new int[subs];
		HashSet<Integer> set=new HashSet<Integer>();
		//set.size()����set���ϳ��Ȳ��������鳤��subs����ִ��while
		while (set.size()!=subs) {
			//�����ȡһ��������������÷���1
			int i = random(1, 10);
			//�ѻ�ȡ����������ӵ�set������
			set.add(i);
		}
		//��set�����е�ֵ������������
		int k=0;//k���������±�
		for (Integer value : set) {
			x[k]=value;
			k++;
		}
		//����һ������
		return x;
	}
	//����3������1��1-9,a-Z֮�������ַ��� (8��)
	public static char randomCharacter (){
		String str="123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		//charAt()�����±��ȡ��Ӧ��ֵ
		char c = str.charAt(random(0, str.length()-1));
		return c;
	}
	//����4�����ز���length���ַ���(5��)�������ڲ�Ҫ����randomCharacter()���� (4��)
	public static String randomString(int length){
		//�����ַ��������洢���ɵ�����ַ������൱����֤��
		String str="";
		//ѭ�����ɶ������ַ���
		for (int i = 0; i < length; i++) {
			//���÷���3��������ַ�
			//ƴ�ӳ�������һ����֤��
			str+=randomCharacter();
		}
		//�����ַ���
		return str;
	}
}
