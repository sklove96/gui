package gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;


class JTextFieldTextArea extends JFrame implements ActionListener{
	
	JTextField jtf;
	JTextArea jta;
	
	
	JTextFieldTextArea(){
	    jtf = new JTextField(10);
		//크기가 10인 텍스트 필드 객체 생성
		//10없애면 너무 작음
		
		jta = new JTextArea(7, 20);
		//약간 아쉬운 기능
		//7행 20열의 텍스트 입력할수 있게 생성
		
	    Container container = getContentPane();
	    container.setLayout(new FlowLayout());
	    
	    container.add(jtf);
	    container.add(jta);
	    
	    jtf.addActionListener(this);
	    
	    setTitle("텍스트 필드 & 텍스트 Area 실습");
		setSize(500, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("이벤트 처리");
		//텍스트필드에 있는 내용을 텍스트에이리어 영역으로 이동하고 텍스트 필드에 입력되어진 내용을 지운다
		
		//jta.setText(e.getActionCommand()); //바로바로 업데이트
		jta.append(e.getActionCommand()+"\n"); //줄바꿈해서 다음 데이터 입력받게끔 
		jtf.setText("");
	}
}


public class Swing11 {
	public static void main(String[] args) {
		
		new JTextFieldTextArea();
		
	}

}
