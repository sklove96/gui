package gui;

//마우스 가져다댔을때 usa국기, 클릭했을때 germany 국기 나오도록


import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

class JButtonEvent extends JFrame{
	
	JButtonEvent(){
		
		//3개국 이미지 아이콘화
		ImageIcon korea = new ImageIcon("./images/korea1.gif");
		ImageIcon usa = new ImageIcon("./images/usa.gif");
		ImageIcon germany = new ImageIcon("./images/germany.gif");
		
		//1.korea 이미지 아이콘 버튼 생성
		JButton event = new JButton(korea);
		
		//2.버튼 오버시 usa 표시
		event.setRolloverIcon(usa);
		
		//3.버튼 클릭시 germany 표시
		event.setPressedIcon(germany);
		
		
		//Jframe 객체 생성
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		container.add(event);

		
		setTitle("JButton 자체 event 처리");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}

public class Swing05 {

	public static void main(String[] args) {
		
		new JButtonEvent();
		
	}

}
