package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

class JTableDemo extends JFrame implements MouseListener{
	
	JTableDemo(){
		
		String[] colHeads = {"학과", "학번", "이름"};
		
		Object[][] data = { //행과 열의 2차원 배열
				
				{ "IT응용공학전공", "201095029", "김지연" },
				{ "컴퓨터응용공학전공", "201195007", "김대연" },
				{ "인터넷응용공학전공", "201195072", "이현덕" },
				{ "멀티미디어공학전공", "201096041", "김기창" },
				{ "IT응용공학전공", "201198001", "이명찬" },
				{ "정보통신공학전공", "201198074", "강재근" },
				{ "인터넷응용공학전공", "201195012", "임자용" },
				{ "멀티미디어공학전공", "201196025", "문정숙" },
				{ "IT응용공학전공", "201198016", "하종섭" },
				{ "데이타베이스공학전공", "201197011", "안진숙" },
				{ "IT응용공학전공", "201198009", "서은실" },
				{ "데이타베이스공학전공", "201197008", "장희숙" },
				{ "멀티미디어공학전공", "201196033", "장현석" }
				};
		
		JTable table = new JTable(data, colHeads);
		JScrollPane jsp = new JScrollPane(table);
		
		Container container = getContentPane();
		container.setLayout(new BorderLayout()); //정렬하게끔
		
		container.add(jsp, BorderLayout.CENTER);
		
		
		
		//테이블 마우스 이벤트 생성
		table.addMouseListener(this);
		
		
		
		setTitle("JTable 실습");
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) { //클릭했을때
		
		System.out.println("mouseClicked()");
		
	}

	@Override
	public void mousePressed(MouseEvent e) { //마우스 눌린 상태
		
		System.out.println("mousePressed()");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) { //마우스 땠을때
		
		System.out.println("mouseReleased()");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) { //마우스 영역 안으로 들어왔을때
		
		System.out.println("mouseEntered()");
		
	}

	@Override
	public void mouseExited(MouseEvent e) { //마우스 영역 밖으로 벗어났을때
		
		System.out.println("mouseExited()");
		
	}
	
	
}


public class Swing17 {

	public static void main(String[] args) {

		new JTableDemo();
		
	}

}
