package gui;


import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class ButtonEvent extends JFrame implements ActionListener{
	
	JLabel result;
	//버튼 눌렸을때 메서드 실행해야 하기 때문에 소멸되면 안됨!
	//생성자에 정의되어있기 때문에 메서드로 넘어갈때 소멸되기때문
	
	//자바는 운영 체제에 의해 버튼이 클릭된 것을 인지, 우리는 보이지 않으면 모름 >> 액션을 만들어주자!
	
	ButtonEvent(){
		
		JButton male= new JButton("남자");
		JButton female= new JButton("여자");		
		JLabel label= new JLabel("당신의 성별은?");
		
		result = new JLabel();

		
		Container container = getContentPane();		
		FlowLayout layout = new FlowLayout();
	
		
		container.setLayout(layout);		
		container.add(male);
		container.add(female);
		container.add(label);
		
		container.add(result);
		
		//입력 개체 전달 
		//이벤트 처리를 위한 버튼에 리스너 등록
		male.addActionListener(this);
		female.addActionListener(this);
		
		
		
		setTitle("버튼 컴포넌트 테스트");
		setSize(300, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}

	//버튼이 눌렸을 때 이 메서드 호출하게끔 기능 구현
	@Override
	public void actionPerformed(ActionEvent e) {
		
	//System.out.println("버튼 클릭"); --잘 출력되는지 확인용 , 주석처리해버림
	//클릭한 버튼의 이름을 결과 레이블에 표시한다.
	result.setText(e.getActionCommand());

	//남자버튼 > 남자, 여자버튼 > 여자 return 해줌
	
		
	}
	
}

public class Swing02 {

	public static void main(String[] args) {

		new ButtonEvent();
		
	}

}

