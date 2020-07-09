package gui;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class JFlowLayout extends JFrame{
	
	JFlowLayout(){
			
	//컨테이너에 대한 객체
	Container container = getContentPane();
	
	//1. 기본 정렬(중앙)
	//container.setLayout(new FlowLayout());
	
	//2. 왼쪽 정렬
	//container.setLayout(new FlowLayout(FlowLayout.LEFT));
	
	//3. 오른쪽 정렬
	//container.setLayout(new FlowLayout(FlowLayout.RIGHT));
	
	//4. 왼쪽 정렬 (정렬, 간격 지정(픽셀수))
	container.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 50)); //수평간격 10, 상하간격 50
	
	
	
	for(int i = 1; i <= 15; i++) {
		
	container.add(new JButton("버튼"+i));
	
	//계속 new해주고 container에다가 add해줄것임
	//15개 탑재됨 (15개 버튼 생성)
	//문자열 + 숫자 = 숫자를 문자열화해서 결합시켜줌
		
	}
		
	setTitle("FlowLayout 배치관리자 실습");
	setSize(400, 300); //400폭과 300높이
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	
	//실행해보면 실습창 크기 바뀌며 배치가 알아서 되는것 확인 가능
	
	}
}

public class Swing06 {

	public static void main(String[] args) {
		
		new JFlowLayout();

	}
}
