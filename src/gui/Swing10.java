package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class JPanelTest extends JFrame{
	
	JPanelTest(){ 
		Container container = getContentPane();
		container.setLayout(new BorderLayout());
		
		
		//첫번째 패널 객체 생성 및 컴포넌트 추가
		JPanel jp1 = new JPanel();
		jp1.setLayout(new GridLayout(5, 1));
		jp1.add(new JButton("JAVA"));
		jp1.add(new JButton("R"));
		jp1.add(new JButton("PYTHON"));
		jp1.add(new JButton("DB"));
		jp1.add(new JButton("WEB"));
		
		//두번째 패널 객체 생성 및 컴포넌트 추가
		JPanel jp2 = new JPanel();
		jp2.setLayout(new GridLayout(4, 1));
		jp2.add(new JRadioButton("java"));
		jp2.add(new JRadioButton("r"));
		jp2.add(new JRadioButton("python"));
		jp2.add(new JRadioButton("db"));
		

		//2개의 패널을 J프레임컨테이너에 탑재
		container.add(jp1, BorderLayout.WEST);
		container.add(jp2, BorderLayout.EAST);

		
		setTitle("패널 컨테이너 실습");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}



public class Swing10 {
	public static void main(String[] args) {
		
		new JPanelTest();

	}

}
