package gui;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

class JBorderLayout extends JFrame{
	
	JBorderLayout(){
		
		Container container = getContentPane();
		
		//container.setLayout(new BorderLayout());
		container.setLayout(new BorderLayout(10, 10));
		
		container.add(new JButton("동쪽버튼"), BorderLayout.EAST);
		container.add(new JButton("서쪽버튼"), BorderLayout.WEST);
		container.add(new JButton("남쪽버튼"), BorderLayout.SOUTH);
		container.add(new JButton("북쪽버튼"), BorderLayout.NORTH);
		container.add(new JButton("중앙버튼"), BorderLayout.CENTER);
		
		setTitle("BorderLayout 배치관리자 실습");
		setSize(400, 300); //400폭과 300높이
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}

public class Swing07 {

	public static void main(String[] args) {
		
		new JBorderLayout();

	}

}
