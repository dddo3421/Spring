package aop_01.com.spring_aop.xml2;

public class Circle {
    private double radius;
    
    public Circle() {
    	
    }
    
    // 생성자
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // 면적
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // 둘레
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
    

    // 출력 메소드
    public void showCircleResult() {
        System.out.println("반지름: " + radius);
        System.out.println("원의 면적: " + getArea());
        System.out.println("원의 둘레: " + getCircumference());
    }

}
