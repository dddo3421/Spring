package di_01.com.di.spring_di_xml_constructor_ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVMain {

	public static void main(String[] args) {
		
		// 스프링 컨테이너 객체 생성
		AbstractApplicationContext context = new GenericXmlApplicationContext("application-context1_1.xml");
		
        // 컨테이너에서 TV 객체 꺼내오기
        TV tv = context.getBean("TV", TV.class);

        // 볼륨조절 실행
        tv.volumeUp();
        tv.volumeDown();
        
        //스프링 컨테이너 객체 컨텍스트 닫기
        context.close();
	}

}
