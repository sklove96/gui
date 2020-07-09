package gui;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

class JListTest extends JFrame{
	
	String[] sports = {"농구","축구","배구","야구","테니스","핸드볼"};
	
	JListTest(){
		
		JList<String> jl = new JList<String>(sports);
		
		jl.setVisibleRowCount(4);
		//화면에 보여줄 행 수
		
		JScrollPane jp = new JScrollPane(jl);
		//스크롤 바 적용
		
		Container container = getContentPane();
		
		container.setLayout(new FlowLayout());
		
		container.add(jp);
		//스크롤바가 적용된 리스트 추가
		
		setTitle("리스트 상자 실습");
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}


public class Swing15 {

	public static void main(String[] args) {
		
		new JListTest();
		
	}

}
