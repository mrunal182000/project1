import java.awt.*;
import java.awt.event.*;
class Display extends Frame implements ActionListener
{
	Label header;
	Button b1,b3;
	Display()
	{
		        setLayout(null);
				header= new Label("ADMIN SECTION");

                b1 = new Button("Add Student");
                b3 = new Button("Logout");
				
				header.setFont(new Font("Serif",Font.BOLD,28));
				header.setBounds(580,90,230,80);
				
				b1.setBounds(640,240,130,80);
				b3.setBounds(640,400,130,80);
				b1.setFont(new Font("Serif",Font.BOLD,20));
				b1.setBackground(new Color (59,89,182));
				b1.setForeground(Color.WHITE);
				b3.setForeground(Color.WHITE);
				b3.setBackground(new Color (59,89,182));
				b3.setFont(new Font("Serif",Font.BOLD,20));
				
                                b1.addActionListener(this);
				b3.addActionListener(this);

				add(header);add(b1);add(b3);

                setTitle("Admin Section");
                setSize(2000,2000);
                setVisible(true);
	}
        @Override
	public void paint(Graphics g)
	{
		super.paint(g);
		g.setColor(Color.BLUE);
		g.drawRect(590,200,220,300);
                g.setColor(Color.BLUE);
		g.drawRect(570,180,260,340);
	}
        @Override
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			new Dis();
		}
		if(ae.getSource()==b3)
		{
			System.exit(0);
		}
	}

 public static void  main(String args[])
 {
	new Display();
 }
}

