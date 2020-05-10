import java.awt.*;  
import javax.swing.*;  
import java.awt.event.*;  
@SuppressWarnings("serial")
public class StartState extends JFrame implements ActionListener{  
     JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,next;  
     String str = "";
     StartState(){  
	//super("Puzzle Game - JavaTpoint");    
	 b2=new JButton("1");  
	 b3=new JButton("2");  
	 b4=new JButton("3");  
	 b5=new JButton("4");  
	 b6=new JButton("5");  
	 b7=new JButton("6");  
	 b8=new JButton("7");  
	 b9=new JButton("8");  
	 b1=new JButton("0");
	 next=new JButton("ok"); 
 
	 b1.setBounds(10,30,50,40);  
	 b2.setBounds(70,30,50,40);  
	 b3.setBounds(130,30,50,40);  
	 b4.setBounds(10,80,50,40);  
	 b5.setBounds(70,80,50,40);  
	 b6.setBounds(130,80,50,40);  
	 b7.setBounds(10,130,50,40);  
	 b8.setBounds(70,130,50,40);  
	 b9.setBounds(130,130,50,40);  
	 next.setBounds(70,200,100,40); 

	add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9); add(next);  
	b1.addActionListener(this);  
	b2.addActionListener(this);  
	b3.addActionListener(this);  
	b4.addActionListener(this);  
	b5.addActionListener(this);  
	b6.addActionListener(this);  
	b7.addActionListener(this);  
	b8.addActionListener(this);  
	b9.addActionListener(this);  
	next.addActionListener(this);
	
	next.setBackground(Color.black);  
	next.setForeground(Color.green);  
	setSize(250,300);  
	setLayout(null);  
	setVisible(true);  
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }//end of constructor 
    public void actionPerformed(ActionEvent e){  
	if(e.getActionCommand().equals("0")){
	   setString("0");
	   b1.setBackground(Color.red);
	}
	if(e.getActionCommand().equals("1")){
	    setString("1");
	    b2.setBackground(Color.red);
	}
	if(e.getActionCommand().equals("2")){
	    setString("2");
	    b3.setBackground(Color.red);
	}
	if(e.getActionCommand().equals("3")){
	    setString("3");
	    b4.setBackground(Color.red);
	}
	if(e.getActionCommand().equals("4")){
	    setString("4");
	    b5.setBackground(Color.red);
	}
	if(e.getActionCommand().equals("5")){
	    setString("5");
	    b6.setBackground(Color.red);
	}
	if(e.getActionCommand().equals("6")){
	    setString("7");
	    b7.setBackground(Color.red);
	}
	if(e.getActionCommand().equals("7")){
	    setString("7");
	    b8.setBackground(Color.red);
	} 
	if(e.getActionCommand().equals("8")){
	    setString("8");
	    b9.setBackground(Color.red);
	}
	if(e.getActionCommand().equals("ok")){
		getString();
	}
   }//end of actionPerformed  
   public void setString(String s){
       str += s;
   }
   public String getString(){
       System.out.println("Click string is:"+str);
       return str;
   }
   /*public static void main(String[] args){  
	   StartState ob = new StartState();
	   //System.out.println("Test:"+ob.getString());
	   //ob.getString();
    //ob.dis();
   }//end of main */
  
}//end of class  