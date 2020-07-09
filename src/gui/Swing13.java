package gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


//선택했을때 선택하는 하나의 항목만 체크되는 예제
class JRadioButtonTest extends JFrame implements ActionListener{
	
	JTextField jtf;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		jtf.setText(e.getActionCommand());
		
	}

	//버튼 그룹 객체를 생성하여 그룹화할 컴포넌트 추가
	JRadioButtonTest(){
		
		ButtonGroup bg = new ButtonGroup();
		
		JRadioButton jrb1 = new JRadioButton("승마");
		JRadioButton jrb2 = new JRadioButton("골프");
		JRadioButton jrb3 = new JRadioButton("스쿠버");
		JRadioButton jrb4 = new JRadioButton("글라이딩");
		
		jtf = new JTextField(10);
		//10으로 하지않으면 너무 작기때문에!
		
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		bg.add(jrb4);
		
		Container container = getContentPane();
		container.setLayout(new FlowLayout()); //배치관리자
		
	    container.add(jrb1);
	    container.add(jrb2);
	    container.add(jrb3);
	    container.add(jrb4);
	    
	    container.add(jtf);
	    
	    jrb1.addActionListener(this);
	    jrb2.addActionListener(this);
	    jrb3.addActionListener(this);
	    jrb4.addActionListener(this);

	    
	    setTitle("JRadioButton 실습");
		setSize(350, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
		
	}
}


public class Swing13 {

	public static void main(String[] args) {
		
		new JRadioButtonTest();
	}

}
