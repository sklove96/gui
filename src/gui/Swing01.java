package gui;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class ButtonTest extends JFrame{ //swing으로 넘어오면서 jframe 제공
	
	ButtonTest(){
		
	//버튼, 레이블 객체 생성
	JButton male = new JButton("남자"); //남자버튼
	JButton female = new JButton("여자"); //여자버튼
	
	JLabel label = new JLabel("당신의 성별은?");
	
	
    Container container = getContentPane();
	//컨테이너 객체 생성
    //이 메서드 안에서 new하면서 컨테이너 객체 생성 & 우리에게 시작주소값 반환해줌 (캘린더의 형태와 동일)
    
    FlowLayout layout = new FlowLayout();
    //배치 관리자 생성
    //컨테이너에게 자동으로 배치해줘! 라는 인폼 전달
    
    container.setLayout(layout);
    //레이아웃의 지정자를 layout지정자로 사용해라!
    //자동 배치해줌
    
    container.add(male);
    container.add(female);
    container.add(label);
    //컨테이너에 컴포넌트 추가
	//추가 순서대로 적절하게 배치해줌
 
    
    //마지막 단계)) 컨테이너 제목, 크기, 종료, 보이기
    setTitle("버튼 컴포넌트 테스트");
    setSize(300, 100); //픽셀단위 (창 크기)
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x누르면 종료되도록   
    setVisible(true); //화면상 보이게 만들기
    
	
	}
}

public class Swing01 {

	public static void main(String[] args) {
		
		new ButtonTest();
		

	}

}
