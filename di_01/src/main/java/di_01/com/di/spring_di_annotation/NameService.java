package di_01.com.di.spring_di_annotation;

import di_01.com.di.spring_di_annotation.INameService;

//다른 사용자 정의 클래스를 의존하지 않음
public class NameService implements INameService{
	@Override
	public String showName(String name) {
		System.out.println("NameService showName() 메소드");
		String myName = "내이름은" + name + "입니다";
		return myName;
	}
}
