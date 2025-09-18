package di_01.com.di.spring_di_annotation_component2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class NameMain {

	public static void main(String[] args) {

		//스프링 컨테이너 객체 생성
		AbstractApplicationContext context = new GenericXmlApplicationContext("application-config3.xml");
		
		//스프링 컨테이너위에서 컴포넌트 가져옴
		NameController control = context.getBean("nameController", NameController.class);
		control.show("홍길동");
		
		context.close();
	}

}
