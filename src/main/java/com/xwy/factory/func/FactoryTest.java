package com.xwy.factory.func;

public class FactoryTest {

	public static void main(String[] args) {
		
		//��������ģʽ
		//������Ʒ�������̣���ӵ�и��ԵĹ���
		//�������գ����ɵĸ߿Ƽ��̶ȶ��ǲ�һ����
		Factory factory = new AudiFactory();
		System.out.println(factory.getCar());
		
		//��Ҫ�û����ģ������Ʒ��������
		factory = new BmwFactory();
		System.out.println(factory.getCar());
		
		//���ӵĴ����ʹ�ø��Ӷ�
		
		
		//���󹤳�ģʽ
		
	}
	
}
