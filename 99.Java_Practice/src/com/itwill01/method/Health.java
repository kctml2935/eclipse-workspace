package com.itwill01.method;

public class Health {
	int height;
	int weight;
	char gender;
	String name;
	int age;
	String job;
	public void info(int height, int weight, char gender,String name,int age, String job) {
		this.height=height; this.weight=weight;this.gender=gender;
		this.name=name; this.age = age; this.job=job;
	}
	
	void print() {
		
		System.out.printf("키가 %d 이고  몸무게가 %d 킬로인  %c성, 이름은 %s이고 나이는 %d세이며 %s입니다 %n",this.height,this.weight,this.gender,this.name,this.age,this.job);
	}
}
