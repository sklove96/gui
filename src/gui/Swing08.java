package gui;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class JGridLayout extends JFrame{
		
	JGridLayout(){
	
		Container container = getContentPane();
		
		// GridLayout(행, 열)
		//container.setLayout(new GridLayout(3, 5)); //3행 5열
		container.setLayout(new GridLayout(4, 4)); //짝이 안맞더라도 실행됨
		
		// GridLayout(행, 열, 수평, 수직)
		container.setLayout(new GridLayout(3, 5, 5, 10));
		
		for(int i = 1; i <= 15; i++) {
		container.add(new JButton("버튼"+i));
		}
	
		setTitle("GridLayout 배치관리자 실습");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
}

public class Swing08 {

	public static void main(String[] args) {

		new JGridLayout();
		
	}

}
