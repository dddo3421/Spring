package aop_01.com.spring_aop.xml2;

public class Evaluation {
    private int kor;
    private int eng;
    private int math;

 
    public Evaluation() {}

  
    public Evaluation(int kor, int eng, int math) {
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

 
    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public void setMath(int math) {
        this.math = math;
    }

    // 총점
    public int getTotal() {
        return kor + eng + math;
    }

    // 평균
    public double getAverage() {
        return getTotal() / 3.0;
    }

    // 출력
    public void showEvaluationResult() {
        System.out.println("국어: " + kor);
        System.out.println("영어: " + eng);
        System.out.println("수학: " + math);
        System.out.println("총점: " + getTotal());
        System.out.println("평균: " + getAverage());
    }

}
