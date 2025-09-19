package aop_01.com.spring_aop.annotationex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AopMain {

	public static void main(String[] args) {
		// 스프링 컨테이너 객체 생성
		AbstractApplicationContext context = new GenericXmlApplicationContext("application-config2_2.xml");
		
		//핵심기능 bean 등록되어 있음
		Evaluation evl = context.getBean("evaluation",Evaluation.class);
		evl.showEvlResult(); //메서드에 advice가 적용되어 있음 
		
		//핵심기능2
		Circle cle = context.getBean("circle" , Circle.class);
		cle.showResult();
		
		context.close();
	}

}
