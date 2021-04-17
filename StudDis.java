import java.awt.*;
import java.awt.event.*;
class StudDis extends Frame implements ActionListener
{
	Label l1,l2,l3,l4,l5,l6,l7,l8;
	Label lt1,lt2,lt3,lt4,lt5,lt6,lt7;
   	Button back,cancel;
	
	StudDis(String a,String b,String c,String d,String e,String f,String g)
	{
		setLayout(null);
		l1=new Label("STUDENT INFORMTION");
		l2=new Label("Name : ");
		l3=new Label("EmailId : ");
		l4=new Label("DOB : ");
		l5=new Label("Department : ");
		l6=new Label("Address : ");
		l7=new Label("Contact No. : ");
		l8=new Label("Roll No. : ");

		lt1=new Label(a);
		lt2=new Label(b);
		lt3=new Label(c);
		lt4=new Label(d);
		lt5=new Label(e);
		lt6=new Label(f);
		lt7=new Label(g);
		
		cancel=new Button("CLOSE"); cancel.addActionListener(this);
        back=new Button("BACK"); back.addActionListener(this);

		l1.setFont(new Font("Serif",Font.BOLD,28));
		l1.setBounds(650,70,400,80);
		l2.setFont(new Font("Serif",Font.BOLD,25));
		l2.setBounds(540,180,140,50);
		lt1.setFont(new Font("Serif",Font.BOLD,20));
		lt1.setBounds(700,180,300,40);
		l3.setFont(new Font("Serif",Font.BOLD,25));
		l3.setBounds(540,240,140,50);
		lt2.setFont(new Font("Serif",Font.BOLD,20));
		lt2.setBounds(700,240,300,40);
		l4.setFont(new Font("Serif",Font.BOLD,25));
		l4.setBounds(540,300,140,50);
		lt3.setFont(new Font("Serif",Font.BOLD,20));
		lt3.setBounds(700,300,300,40);
		l5.setFont(new Font("Serif",Font.BOLD,25));
		l5.setBounds(540,360,145,50);
		lt4.setFont(new Font("Serif",Font.BOLD,20));
		lt4.setBounds(700,360,300,40);
		l6.setFont(new Font("Serif",Font.BOLD,25));
		l6.setBounds(540,420,140,50);
		lt5.setFont(new Font("Serif",Font.BOLD,20));
		lt5.setBounds(700,420,300,40);
		l7.setFont(new Font("Serif",Font.BOLD,25));
		l7.setBounds(540,480,145,50);
		lt6.setFont(new Font("Serif",Font.BOLD,20));
		lt6.setBounds(700,480,300,40);
		l8.setFont(new Font("Serif",Font.BOLD,25));
		l8.setBounds(540,530,140,50);
		lt7.setFont(new Font("Serif",Font.BOLD,20));
		lt7.setBounds(700,530,300,40);
		cancel.setBounds(650,610,120,50);
		cancel.setFont(new Font("Serif",Font.BOLD,28));
		cancel.setBackground(new Color (59,89,182));
		cancel.setForeground(Color.WHITE);
                back.setBounds(800,610,120,50);
		back.setFont(new Font("Serif",Font.BOLD,28));
		back.setBackground(new Color (59,89,182));
		back.setForeground(Color.WHITE);
		
		add(l1);add(l2);add(l3);add(l4);add(l5);add(l6);add(l7);add(l8);
		add(lt1);add(lt2);add(lt3);add(lt4);add(lt5);add(lt6);add(lt7);add(cancel);add(back);

		setTitle("Student Info");
		setVisible(true);
		setSize(2000,2000);
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		g.setColor(Color.BLACK);
		g.drawRect(420,170,680,510);
                g.setColor(Color.BLACK);
		g.drawRect(400,150,720,550);
	}
	public void actionPerformed(ActionEvent ae)
	{

		if(ae.getSource()==cancel)
		{
			System.exit(0);
		}
                if(ae.getSource()==back)
		{
			new Dis();
		}
	}


}
