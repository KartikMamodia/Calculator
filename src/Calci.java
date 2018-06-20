import java.awt.*;
import java.awt.event.*;
import java.math.BigDecimal;
import java.io.File.*;
import javax.swing.*;
import java.sql.*;
import java.lang.*;
import java.text.*;
import java.util.Date;
public class Calci extends Frame implements ActionListener
{
	String cal=new String();
	
	int m=0;
	int mn=0;
	double number3=0;
	double number1=0;
	double number2=0;
	String check;
	JFrame f;
	JLabel la;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28;
	Label l;
	TextField tf;
	Calci(String s)
	{
		f= new JFrame(s);
		la=new JLabel("Kartik Mamodia");
		la.setBounds(180,380,200,10);
		
		
		la.setForeground(Color.GRAY);
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(la);
		
		tf= new TextField();
		tf.setBounds(40,30,220,50);
		f.add(tf);
		b1= new Button("Close");
		b1.setBounds(40,110,36,36);
		b1.setBackground(Color.yellow);
		f.add(b1);

		f.setLayout(null);
		b2= new Button("MR");
		b2.setBounds(86,110,36,36);
		f.add(b2);


		b3= new Button("Back");
		b3.setBounds(132,110,36,36);
		f.add(b3);


		b4= new Button("M+");
		b4.setBounds(178,110,36,36);
		f.add(b4);


		b5= new Button("^");
		b5.setBounds(224,110,36,36);
		f.add(b5);


		b6= new Button("Check");
		b6.setBounds(40,156,36,36);
		f.add(b6);


		b7= new Button("7");
		b7.setBounds(40,202,36,36);
		f.add(b7);

		b8= new Button("4");
		b8.setBounds(40,248,36,36);
		f.add(b8);

		b9= new Button("1");
		b9.setBounds(40,294,36,36);
		f.add(b9);

		b10= new Button("0");
		b10.setBounds(40,340,82,36);
		f.add(b10);

		b11= new Button("Binary");
		b11.setBounds(86,156,36,36);
		f.add(b11);

		b12= new Button("8");
		b12.setBounds(86,202,36,36);
		f.add(b12);

		b13= new Button("5");
		b13.setBounds(86,248,36,36);
		f.add(b13);

		b14= new Button("2");
		b14.setBounds(86,294,36,36);
		f.add(b14);

		b15= new Button("Clear");
		b15.setBounds(132,156,36,36);
		f.add(b15);

		b16= new Button("9");
		b16.setBounds(132,202,36,36);
		f.add(b16);


		b17= new Button("6");
		b17.setBounds(132,248,36,36);
		f.add(b17);

		b18= new Button("3");
		b18.setBounds(132,294,36,36);
		f.add(b18);


		b19= new Button(".");
		b19.setBounds(132,340,36,36);
		f.add(b19);


		b20= new Button("+ -");
		b20.setBounds(178,156,36,36);
		f.add(b20);


		b21= new Button("/");
		b21.setBounds(178,202,36,36);
		f.add(b21);


		b22= new Button("*");
		b22.setBounds(178,248,36,36);
		f.add(b22);


		b23= new Button("-");
		b23.setBounds(178,294,36,36);
		f.add(b23);


		b24= new Button("+");
		b24.setBounds(178,340,36,36);
		f.add(b24);


		b25= new Button("Root");
		b25.setBounds(224,156,36,36);
		f.add(b25);


		b26= new Button("%");
		b26.setBounds(224,202,36,36);
		f.add(b26);


		b27= new Button("1/x");
		b27.setBounds(224,248,36,36);
		f.add(b27);


		b28= new Button("=");
		b28.setBounds(224,294,36,82);
		f.add(b28);


		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		b17.addActionListener(this);
		b18.addActionListener(this);
		b19.addActionListener(this);
		b20.addActionListener(this);
		b21.addActionListener(this);
		b22.addActionListener(this);
		b23.addActionListener(this);
		b24.addActionListener(this);
		b25.addActionListener(this);
		b26.addActionListener(this);
		b27.addActionListener(this);
		b28.addActionListener(this);
		f.setSize(300,430);
		f.setVisible(true);
	}
	public static void main(String... q)
	{
		new Calci("Calculator!");

	}
	public void actionPerformed(ActionEvent e)
	{
		cal=tf.getText();

		if(e.getSource()==b1)
		System.exit(0);



		if(e.getSource()==b2)//MR
		tf.setText("OK");


		if(e.getSource()==b3)//◄
		{
			char[] back=new char[cal.length()];
			char[] back1=new char[cal.length()-1];
			try{
			back=cal.toCharArray();
			for(int i=0;i<back.length-1;i++)
			{
				back1[i]=back[i];
			}
			cal="";
			cal=String.valueOf(back1);
			}
			catch(Exception ee)
			{
				ee.printStackTrace();
			}
		}


		if(e.getSource()==b4)//M+
		tf.setText("OK");


		if(e.getSource()==b5)//^
		cal=cal.concat("^");
		tf.setText(cal);


		if(e.getSource()==b6)//CHECK
		{
			check=check+number3;
			tf.setText(check);
		}


		if(e.getSource()==b7)//7
		{
			cal=cal.concat("7");	
			tf.setText(cal);
		}
		if(e.getSource()==b8)//4
		{
			cal=cal.concat("4");
			tf.setText(cal);

		}

		if(e.getSource()==b9)//1
		{
			cal=cal.concat("1");
			tf.setText(cal);
		}

		if(e.getSource()==b10)//0
		{
			cal=cal.concat("0");
			tf.setText(cal);
		}


		if(e.getSource()==b11)//BINARY
		{
							
			if(number3==0)
			{

				int calint=Integer.valueOf(cal);	
				tf.setText(Integer.toBinaryString(calint));
			}
			
			else if(number3!=0)
			{
				tf.setText(Integer.toBinaryString((int)number3));
			}
			
		}


		if(e.getSource()==b12)//8
		{
			cal=cal.concat("8");
			tf.setText(cal);
		}


		if(e.getSource()==b13)//5
		{
			cal=cal.concat("5");
			tf.setText(cal);
		}

		if(e.getSource()==b14)//2
		{
			cal=cal.concat("2");
			tf.setText(cal);
		}

		if(e.getSource()==b15)//CLEAR
		{
			number3=0;
			cal="";
			tf.setText("");

		}

		if(e.getSource()==b16)//9
		{
			cal=cal.concat("9");
			tf.setText(cal);
		}

		if(e.getSource()==b17)//6
		{
			cal=cal.concat("6");
			tf.setText(cal);
		}

		if(e.getSource()==b18)//3
		{
			cal=cal.concat("3");
			tf.setText(cal);
		}

		if(e.getSource()==b19)//.
			cal=cal.concat(".");
			tf.setText(cal);


		if(e.getSource()==b20)//+-
		{
			cal="-"+cal;
			tf.setText(cal);
		}



		if(e.getSource()==b21)// /
		{
			cal=cal.concat("/");
			tf.setText(cal);
		}


		if(e.getSource()==b22)// *
		{
			cal=cal.concat("*");
			tf.setText(cal);
		}



		if(e.getSource()==b23)//-
		{
			cal=cal.concat("-");
			tf.setText(cal);
		}


		if(e.getSource()==b24)//+
		{
			cal=cal.concat("+");
			tf.setText(cal);
		}


		if(e.getSource()==b25)//ROOT
		{
			double roote = Double.parseDouble(cal);
			double rott=Math.sqrt(roote);
			String hell=Double.toString(rott);
			tf.setText(hell);
			/*
			try
			{
			Connection c=DB.getConnection();
			Statement st=c.createStatement();
			int rs=st.executeUpdate("INSERT into application values('root"+roote+"','"+hell+"')");
			c.close();
			
			}
			catch(Exception o)	
			{	
			o.printStackTrace();
			}
			*/	
		}

		if(e.getSource()==b26)//%
			tf.setText("%");



		if(e.getSource()==b27)//1/X
		{
			if(number3==0)
			{
				int calint=Integer.valueOf(cal);	
				double inverse=1.0/calint;
				String inversee=Double.toString(inverse);
				tf.setText(inversee);
			}
			else if(number3!=0)
			{
				int calint=(int)number3;	
				double inverse=1.0/calint;
				String inversee=Double.toString(inverse);
				tf.setText(inversee);
			}
		}



		if(e.getSource()==b28)//=
		{
			m=0;
			mn=0;
			number3=0;
			number1=0;
			number2=0;
			
			char[] ch={};
			ch=cal.toCharArray();
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]=='/' || ch[i]=='+' || ch[i]=='-' || ch[i]=='*' || ch[i]=='^')
				{
					char[] ch1=new char[i];
					char[] ch2=new char[ch.length-i-1];
					
				for(int j=0;j<i;j++)
				{
					ch1[m]=ch[j];
					m++;
				}
				for(int k=i+1;k<ch.length;k++)
				{
					ch2[mn]=ch[k];
					mn++;
				}
				
				number1 = Double.parseDouble(new String(ch1));
				number2 = Double.parseDouble(new String(ch2));

				if(ch[i]=='/')
				{
					number3=number1/number2;
				}
				else if(ch[i]=='*')
				{
					number3=number1*number2;
				}
				else if(ch[i]=='+')
				{
					number3=number1+number2;
				}
				else if(ch[i]=='-')
				{
					number3=number1-number2;
				}
				else if(ch[i]=='^')
				{
					number3=Math.pow((double)number1,(double)number2);
				}
				
				DecimalFormat df=new DecimalFormat(".##");
				String no3=df.format(number3);
				number3=Double.parseDouble(no3);
				/*
				try
				{
				Connection c=DB.getConnection();
				Statement st=c.createStatement();
				int rs=st.executeUpdate("INSERT into application values('"+cal+"','"+number3+"')");
			
				c.close();
			
				}
				catch(Exception o)	
				{
				o.printStackTrace();
				}
				*/
				check=cal;
				cal="";
				cal=String.valueOf(number3);
				tf.setText(cal);
				}
			}
		}
	}
}