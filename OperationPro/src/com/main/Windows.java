package com.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.JTextField;

public class Windows extends JFrame implements ActionListener{

	private JTextField tf1 =  new JTextField(15);
	private JTextField tf2 = new JTextField(15);
	private JTextField tf3 = new JTextField(15);
	private JTextField tf4 = new JTextField(15);
	private JButton btn = new JButton("开始生成");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Windows frame = new Windows();
	}

	/**
	 * Create the frame.
	 */
	public Windows() {
		getContentPane().setLayout(new BorderLayout());//添加监听事件
		btn.addActionListener(this);
		
		this.setTitle("自动生成小学四则运算");
		this.setSize(400,293);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(new GridLayout(2,1));//总布局
		
		JPanel jP1 = new JPanel();
		tf1.setText("请输入你要生成的题目数量:");
		jP1.add(tf1);
		jP1.add(tf2);
		tf3.setText("请输入你要生成的分式最大值：");
		jP1.add(tf3);
		jP1.add(tf4);
		getContentPane().add(jP1);
		
		
		JPanel jp2 = new JPanel();
		jp2.add(btn);
		getContentPane().add(jp2);
		
		this.setVisible(true);

	}
	
	public void actionPerformed(ActionEvent e){
		if("开始生成".equals(e.getActionCommand())){
			if("".equals(tf4.getText()) || tf4.getText() == null || "".equals(tf3.getText()) || tf3.getText() == null){
				JOptionPane.showMessageDialog(null, "输入不得为空", "alert", JOptionPane.ERROR_MESSAGE);
				return ;
			}
			
			int limit = Integer.valueOf(tf4.getText());
			int number = Integer.valueOf(tf2.getText());
			if(limit <=0 || number <=0){
				JOptionPane.showMessageDialog(null, "题目数量以及最大值必须大于0", "alert", JOptionPane.ERROR_MESSAGE);
				tf2.setText("");
				tf4.setText("");
			}else{
				Main main = new Main();
				main.toMain(limit, number);
				System.exit(0);//退出
			}
			
		}else{
			System.out.println("生成错误");
		}
		
	}
}
