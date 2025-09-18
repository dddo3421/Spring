package aop_01.com.spring_aop.xml2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class MainClass {

	public static void main(String[] args) {
		// 스프링 컨테이너 객체 생성
		AbstractApplicationContext context = new GenericXmlApplicationContext("application-config.xml");

		// 핵심기능 bean 등록되어 있음
		Evaluation eva = context.getBean("evaluation", Evaluation.class);
		eva.showEvaluationResult();

		Circle cc = context.getBean("circle", Circle.class);
		cc.showCircleResult();

	}

}
