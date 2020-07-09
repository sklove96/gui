package gui;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * 문제) 5개의 과일 이미지(사과, 배, 감, 바나나, 포도)를 
 *     이용하여 이미지 버튼을 생성한 후, 3행2열 형태로 프레임에
 *     배치한다. 또한 특정 이미지 버튼을 클릭하는 이벤트가
 *     발생하면 3행 2열의 셀에 클릭한 버튼의 이름이 표시되도록
 *     하세요.
 *     
 */

class Banana extends JFrame implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent e) {
		result.setText(e.getActionCommand());
	}

	JLabel result;
	
	Banana(){
		
		ImageIcon aa = new ImageIcon("./images/apple.jpg");
		ImageIcon pp = new ImageIcon("./images/pear.jpg");
		ImageIcon bb = new ImageIcon("./images/banana.jpg");
		ImageIcon gg = new ImageIcon("./images/grape.jpg");
		ImageIcon ee= new ImageIcon("./images/persimmon.jpg");
		
		JButton apple = new JButton("사과", aa);
		JButton pear = new JButton("배", pp);
		JButton banana= new JButton("바나나", bb);
		JButton grape = new JButton("포도", gg);
		JButton perisim = new JButton("감", ee);	
		//JLabel label = new JLabel();
		result = new JLabel();
		
		Container container = getContentPane();
		container.setLayout(new GridLayout(3, 2));
		
		container.add(apple);
		container.add(pear);
		container.add(banana);
		container.add(grape);
		container.add(perisim);
		
		container.add(result);
		
	
		apple.addActionListener(this);
		pear.addActionListener(this);
		banana.addActionListener(this);
		grape.addActionListener(this);
		perisim.addActionListener(this);
		
		
		
		setTitle("과일 문제");
		setSize(200, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
}




public class Swing09 {

	public static void main(String[] args) {
		new Banana();
	}

}
