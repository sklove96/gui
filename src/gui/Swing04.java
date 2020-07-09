package gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

//Swing03의 결과 화면에서 이미지 버튼 클릭하면 "대한민국 버튼 클릭"메시지 오른쪽에 표시되도록 이벤트 적용
//또한 프레임의 제목을 "여기는 대한민국 입니다."라고 변경

class Korea extends JFrame implements ActionListener{
	
	JLabel result;
	
	
	Korea(){
		
		ImageIcon ii = new ImageIcon("./images/korea.gif");
		
		JButton korea = new JButton("클릭", ii);
		
		Container container = getContentPane();
		
		JLabel label = new JLabel();
		result = new JLabel();
		
		
		container.setLayout(new FlowLayout());
		container.add(korea);
		container.add(result);
		
			
		
		korea.addActionListener(this);
		
		
		
		setTitle("여기는 대한민국 입니다");
		setSize(500, 180);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
				
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	 result.setText(e.getActionCommand());
	 result.setText("대한민국 버튼 클릭");
		
	}
}

public class Swing04 {		
	public static void main(String[] args) {
		
		new Korea();

	}

}
