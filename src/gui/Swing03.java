package gui;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

class JImageTest extends JFrame{
	
	JImageTest(){
		
		//1. 이미지 파일을 이용한 아이콘화
		//./는 디폴트 위치에서부터 시작하겠다 라는 뜻! (붙여도 되고 안붙여도 됨)
		ImageIcon ii = new ImageIcon("./images/korea.gif");
		
		//2. 버튼에 아이콘 삽입
		//"버튼 이름"과 이미지 아이콘으로 버튼 객체 생성
		JButton korea = new JButton("클릭", ii);
		
		Container container = getContentPane();
		
		container.setLayout(new FlowLayout());
		container.add(korea);
		//버튼 탑재
		
		setTitle("이미지 아이콘 실습");
		setSize(500, 180);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
}

public class Swing03 {

	public static void main(String[] args) {
		
		new JImageTest();
	}

}



