package gui;


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

class JMenuDemo extends JFrame implements ActionListener{
	JTextField jtf;
	
	JMenuDemo(){
		Container container = getContentPane();
		container.setLayout(new BorderLayout());
		
		jtf = new JTextField();
		
		container.add(jtf, BorderLayout.SOUTH);
		
		JMenu file = new JMenu("파일(F)");
		
		JMenuItem jmi = new JMenuItem("새로 만들기(N)");
		jmi.addActionListener(this);
		file.add(jmi);
		
		jmi = new JMenuItem("새 창(W)");
		jmi.addActionListener(this);
		file.add(jmi);

		jmi = new JMenuItem("열기");
		jmi.addActionListener(this);
		file.add(jmi);
		
		jmi = new JMenuItem("저장");
		jmi.addActionListener(this);
		file.add(jmi);
		
		jmi = new JMenuItem("끝내기");
		jmi.addActionListener(this);
		file.add(jmi);
		
		JMenu edit = new JMenu("편집");
		
		jmi = new JMenuItem("복사");
		jmi.addActionListener(this);
		edit.add(jmi);
		
		jmi = new JMenuItem("붙여넣기");
		jmi.addActionListener(this);
		edit.add(jmi);
		
		jmi = new JMenuItem("삭제");
		jmi.addActionListener(this);
		edit.add(jmi);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.add(file);
		menuBar.add(edit);
		
		setJMenuBar(menuBar);
		
		// 컨테이너 제목, 크기, 종료, 보이기
		setTitle("메뉴 실습");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		jtf.setText(e.getActionCommand());
		
		switch(e.getActionCommand()) {
			case "끝내기":
				break;
			case "새로 만들기(N)":
				break;
		}
	}
}

public class Swing18 {
	public static void main(String[] args) {
		new JMenuDemo();
	}
}
