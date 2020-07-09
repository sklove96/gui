package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;

//첫번째 탭 (성별)
class JRadioPanel extends JPanel implements ActionListener{
	
	JLabel jl2;
	
	
	JRadioPanel(){
		
		JLabel jl1 = new JLabel("당신의 성별은?");
		jl2 = new JLabel("");
		
		ButtonGroup bg = new ButtonGroup();
		
		JRadioButton jr1 = new JRadioButton("남자");
		JRadioButton jr2 = new JRadioButton("여자");
		
		bg.add(jr1);
		bg.add(jr2);
		
		//패널 컨테이너에 컴포넌트 추가
		add(jl1);
		
		add(jr1);
		add(jr2);
		
		add(jl2);
		
		jr1.addActionListener(this);
		jr2.addActionListener(this);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		jl2.setText(e.getActionCommand());
		
	}
}

//두번째 탭(혈액형)
class JComboBoxPanel extends JPanel implements ItemListener{
	
	JLabel jl2;
	
	JComboBoxPanel(){
		
		JLabel jl1 = new JLabel("당신의 혈액형은?");
		
		jl2 = new JLabel("");
		
		JComboBox<String> jcb = new JComboBox<String>();
		jcb.addItem("A형");
		jcb.addItem("B형");
		jcb.addItem("O형");
		jcb.addItem("AB형");
		
		add(jl1);
		add(jcb);
		
		add(jl2);
		
		//이벤트 리스너 등록
		jcb.addItemListener(this);
		
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
	  String item = (String)e.getItem();
	  
	  jl2.setText(item);
	  
	}

	
}

//두 개의 탭에 대해서 객체를 생성하고 JFrame에 탑재한다
class JTabbedPaneFrame extends JFrame{
		
	JTabbedPaneFrame(){
		
		JRadioPanel tab1 = new JRadioPanel();
		//첫번째 탭 객체 생성
		
		JComboBoxPanel tab2 = new JComboBoxPanel();
		//두번째 탭 객체 생성
		
		JTabbedPane jtp = new JTabbedPane();
		//탭 객체 생성
		
		jtp.addTab("성별", tab1);
		jtp.addTab("혈액형", tab2);
		
		
		Container container = getContentPane();
		
		container.add(jtp);
		
		setTitle("탭메뉴 실습");
		setSize(500, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	
}

public class Swing16 {

	public static void main(String[] args) {

		new JTabbedPaneFrame();
	}

}
