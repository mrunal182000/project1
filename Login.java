import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class InvalidPasswordException extends Exception
{
}

public class Login extends Frame implements ActionListener
{
        Label name, pass,header;
        TextField nameText;
        TextField passText;
        Button login, end;
        static int attempt=0;

        public Login()
        {
                setLayout(null);
                name = new Label("    Name:");
                pass = new Label("Password:");
               header= new Label("ADMIN LOGIN");

                nameText = new TextField();
                passText = new TextField();

                passText.setEchoChar('*');

                login = new Button("Login");
                end = new Button("Cancel");
				
				header.setFont(new Font("Serif",Font.BOLD,28));
				header.setBounds(600,90,200,50);
				name.setFont(new Font("Serif",Font.BOLD,25));
				name.setBounds(540,220,120,50);
				nameText.setBounds(680,220,190,40);
				pass.setFont(new Font("Serif",Font.BOLD,25));
				pass.setBounds(540,270,130,50);
				passText.setBounds(680,270,190,40);
				login.setBounds(550,380,100,50);
				end.setBounds(700,380,100,50);
				login.setFont(new Font("Serif",Font.BOLD,28));
				login.setBackground(new Color (59,89,182));
				login.setForeground(Color.WHITE);
				end.setForeground(Color.WHITE);
				end.setBackground(new Color (59,89,182));
				end.setFont(new Font("Serif",Font.BOLD,28));
				
                login.addActionListener(this);
                end.addActionListener(this);

				add(name);
				add(header);
                add(nameText);
                add(pass);
                add(passText);
                add(login);
                add(end);

                setTitle("Login Check");
                setSize(2000,2000);
                setVisible(true);
        }
		public void paint(Graphics g)
		{
			super.paint(g);
			g.setColor(Color.GREEN);
			g.drawRect(450,180,500,300);
                        g.setColor(Color.GREEN);
			g.drawRect(430,160,540,340);
		}

        public void actionPerformed(ActionEvent ae)
        {
                Button btn = (Button)ae.getSource();
                if(btn == end)
                {
                        System.exit(0);
                }
                if(btn == login)
                {
                        try
                        {
                                String user = nameText.getText();
                                String pass = new String(passText.getText());
								int u=user.length();
								int p=pass.length();
								if(u==0)
								{
									JOptionPane.showMessageDialog(null,"Check Login","Login",JOptionPane.INFORMATION_MESSAGE);
								}
								else if(p==0)
								{
									JOptionPane.showMessageDialog(null,"Check Login","Login",JOptionPane.INFORMATION_MESSAGE);
								}
                                else if(user.compareTo(pass)==0)
                                {
                                        JOptionPane.showMessageDialog(null,"Login Successful","Login",JOptionPane.INFORMATION_MESSAGE);
                                        new Display();
                                }
                                else
                                {
                                        throw new InvalidPasswordException();
                                }
                        }
                        catch(Exception e)
                        {
                                attempt++;
                                JOptionPane.showMessageDialog(null,"Login Failed","Login",JOptionPane.ERROR_MESSAGE);
                                nameText.setText("");
                                passText.setText("");
                                nameText.requestFocus();
                                if(attempt == 3)
                                {
                                        JOptionPane.showMessageDialog(null,"3 Attempts Over","Login",JOptionPane.ERROR_MESSAGE);
                                        System.exit(0);
                                }
                        }
                }
        }

        public static void main(String args[])
        {
                new Login();
        }
}


