import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.util.regex.*;

class Dis extends Frame implements ActionListener
{
	Label l1,l2,l3,l4,l5,l6,l7,l8;
	TextField txt1,txt2,txt3,txt4,txt5,txt6,txt7;
	Button b1,b2,b3;
	String a,d,g,b,c;
	FileOutputStream fos;
	
			
	Dis() 
	{
		setLayout(null);
		try{
			fos=new FileOutputStream ("StudInfo.txt");
		}
		catch(Exception ae){System.out.println(ae.getMessage());}
		l1=new Label("ADD STUDENT");
		l2=new Label("Name : ");
		l3=new Label("EmailId : ");
		l4=new Label("DOB : ");
		l5=new Label("Department : ");
		l6=new Label("Address : ");
		l7=new Label("Contact No. : ");
		l8=new Label("Roll No. : ");
		
		txt1=new TextField();
		txt2=new TextField();
		txt3=new TextField();
		txt4=new TextField();
		txt5=new TextField();
		txt6=new TextField();
		txt7=new TextField();

		b1=new Button("Add Student");	
		b1.addActionListener(this);
		b2=new Button("Display");   
		b2.addActionListener(this);
		b3=new Button("Reset");   
		b3.addActionListener(this);

		l1.setFont(new Font("Serif",Font.BOLD,28));
		l1.setBounds(650,70,200,80);
		l2.setFont(new Font("Serif",Font.BOLD,25));
		l2.setBounds(540,180,140,50);
		txt1.setBounds(700,180,300,40);txt1.addActionListener(this);
		l3.setFont(new Font("Serif",Font.BOLD,25));
		l3.setBounds(540,240,140,50);
		txt2.setBounds(700,240,300,40);txt2.addActionListener(this);
		l4.setFont(new Font("Serif",Font.BOLD,25));
		l4.setBounds(540,300,140,50);
		txt3.setBounds(700,300,300,40);txt3.addActionListener(this);
		l5.setFont(new Font("Serif",Font.BOLD,25));
		l5.setBounds(540,360,145,50);
		txt4.setBounds(700,360,300,40);txt4.addActionListener(this);
		l6.setFont(new Font("Serif",Font.BOLD,25));
		l6.setBounds(540,420,140,50);
		txt5.setBounds(700,420,300,40);txt5.addActionListener(this);
		l7.setFont(new Font("Serif",Font.BOLD,25));
		l7.setBounds(540,480,145,50);
		txt6.setBounds(700,480,300,40);txt6.addActionListener(this);
		l8.setFont(new Font("Serif",Font.BOLD,25));
		l8.setBounds(540,530,140,50);
		txt7.setBounds(700,530,300,40);txt7.addActionListener(this);
		b1.setBounds(480,590,120,50);
		b2.setBounds(680,590,120,50);
		b3.setBounds(890,590,120,50);
		b1.setFont(new Font("Serif",Font.BOLD,15));
		b1.setBackground(new Color (59,89,182));
		b1.setForeground(Color.WHITE);
		b2.setForeground(Color.WHITE);
		b2.setBackground(new Color (59,89,182));
		b2.setFont(new Font("Serif",Font.BOLD,20));
		b3.setForeground(Color.WHITE);
		b3.setBackground(new Color (59,89,182));
		b3.setFont(new Font("Serif",Font.BOLD,20));
		
		add(l1);add(l2);add(l3);add(l4);add(l5);add(l6);add(l7);add(l8);
		add(txt1);add(txt2);add(txt3);add(txt4);add(txt5);add(txt6);add(txt7);add(b2);add(b1);add(b3);
                
                setTitle("Add Student");
		setVisible(true);
		setSize(2000,2000);
		
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		g.setColor(Color.RED);
		g.drawRect(430,170,680,500);
                g.setColor(Color.RED);
		g.drawRect(410,150,720,540);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		byte a1[],d1[],g1[];
		a="\nName:"+txt1.getText();
		b="\nDOB:"+txt3.getText();
		c="\nAddress:"+txt5.getText();
		d="\tDepartment:"+txt4.getText();
		g="\tRoll No.:"+txt7.getText();
		a1=a.getBytes();
		d1=d.getBytes();
		g1=g.getBytes();
		
		Button btn = (Button)ae.getSource();
		String num=txt6.getText();
		boolean valid=num.matches("[0-9]{10}");
		Pattern pattern;
		Matcher matcher;
		String EMAIL_PATTERN = 
        "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		pattern = Pattern.compile(EMAIL_PATTERN);
		matcher = pattern.matcher(txt2.getText());

		if(btn==b1)
		{
			if(matcher.matches()==false)
			{
				JOptionPane.showMessageDialog(null,"Please check EmailId","Email",JOptionPane.INFORMATION_MESSAGE);
			}
			else if(valid==false)
			{
				JOptionPane.showMessageDialog(null,"Please check contact no.","Contact",JOptionPane.INFORMATION_MESSAGE);
			}
			else
			{
				try
				{
					fos.write(a1);
					fos.write(d1);
					fos.write(g1);
					JOptionPane.showMessageDialog(null,"Student Added Successfully","Add Student",JOptionPane.INFORMATION_MESSAGE);
				}
				catch(Exception e){}
			}
		}
			if(btn==b2)
			{
				new StudDis(txt1.getText(),txt2.getText(),txt3.getText(),txt4.getText(),txt5.getText(),txt6.getText(),txt7.getText());
			}
			if(btn==b3)
			{
				txt1.setText("");
				txt3.setText("");
				txt2.setText("");
				txt4.setText("");
				txt5.setText("");
				txt6.setText("");
				txt7.setText("");
			
			}
			
		
	
	}
	public static void main(String args[])
	{
		Dis f=new Dis();
	}
}