package gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

//화살표>> 메뉴항목 보여줌

class JComboBixTest extends JFrame implements ItemListener{
	
	JLabel jl;
	
	JComboBixTest(){
		
		ImageIcon ii = new ImageIcon("./images/banana.jpg");
		
		jl = new JLabel(ii);
		
		
		//콤보박스 객체 생성 및 항목(Item)추가.
		JComboBox<String> jc = new JComboBox<>();
		
		jc.addItem("banana");
		jc.addItem("pear");
		jc.addItem("apple");
		jc.addItem("grape");
		
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		container.add(jl);
		container.add(jc);

		
		//이벤트 리스너 등록 --이제 항목 선택할때마다 각각의 리스너 보임
		jc.addItemListener(this);
		
		
		
		setTitle("콤보박스 실습");
		setSize(350, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
		String fruit = (String)e.getItem();
		
		jl.setIcon(new ImageIcon("./images/"+fruit+".jpg"));
		//여기서 jl불러와야 하기 때문에 필드로 선언해줬음
		//이렇게 하면 각각의 과일이 저장되어있기 때문에 순간순간 아이콘화하여 이미지 보여짐
		
	}
}

public class Swing14 {

	public static void main(String[] args) {

		new JComboBixTest();
	}

}
