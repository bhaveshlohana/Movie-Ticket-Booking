import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class movieTicket extends Applet implements ActionListener,ItemListener
{
 	Label theatre,movie,date,time,ticket,quantity,stmt,stmt1,stmt2,stmt3;
	Button tick;
	Checkbox r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12;
	Checkbox g1,g2,g3,g4,g5,g6,g7,g8,g9,g10,g11,g12;
	Checkbox y1,y2,y3,y4,y5,y6,y7,y8,y9,y10,y11,y12;
	TextArea output;
	String th,mo,dom,tom,q,nos;
	String sr1,sr2,sr3,sr4,sr5,sr6,sr7,sr8,sr9,sr10,sr11,sr12;
	String sg1,sg2,sg3,sg4,sg5,sg6,sg7,sg8,sg9,sg10,sg11,sg12;
	String sy1,sy2,sy3,sy4,sy5,sy6,sy7,sy8,sy9,sy10,sy11,sy12;

int amount;
Choice t = new Choice();
Choice m = new Choice();
Choice d = new Choice();
Choice ti = new Choice();
Choice s = new Choice();

public void init()
{
	theatre = new Label("Theatre");
	movie = new Label("Movie");
	date = new Label("Date of Movie");
	time = new Label("Time of Movie");
	ticket = new Label("Ticket");
	quantity= new Label("No. of seats");
	stmt = new Label("*************Select Seats***********");
	stmt1 = new Label("Cost of Seats:                     Red seats:200");
	stmt2 = new Label("           Green seats:150");
	stmt3 = new Label("            Yellow seats:80");

	tick = new Button("Print");

	r1=new Checkbox("A1");
	g1=new Checkbox("B1");
	y1=new Checkbox("C1");
	r2=new Checkbox("A2");
	g2=new Checkbox("B2");
	y2=new Checkbox("C2");
	r3=new Checkbox("A3");
	g3=new Checkbox("B3");
	y3=new Checkbox("C3");
	r4=new Checkbox("A4");
	g4=new Checkbox("B4");
	y4=new Checkbox("C4");
	r5=new Checkbox("A5");
	g5=new Checkbox("B5");
	y5=new Checkbox("C5");
	r6=new Checkbox("A6");
	g6=new Checkbox("B6");
	y6=new Checkbox("C6");
	r7=new Checkbox("A7");
	g7=new Checkbox("B7");
	y7=new Checkbox("C7");
	r8=new Checkbox("A8");
	g8=new Checkbox("B8");
	y8=new Checkbox("C8");
	r9=new Checkbox("A9");
	g9=new Checkbox("B9");
	y9=new Checkbox("C9");
	r10=new Checkbox("A10");
	g10=new Checkbox("B10");
	y10=new Checkbox("C10");
	r11=new Checkbox("A11");
	g11=new Checkbox("B11");
	y11=new Checkbox("C11");
	r12=new Checkbox("A12");
	g12=new Checkbox("B12");
	y12=new Checkbox("C12");

	r1.setBackground(Color.red);
	g1.setBackground(Color.green);
	y1.setBackground(Color.yellow);
	r2.setBackground(Color.red);
	g2.setBackground(Color.green);
	y2.setBackground(Color.yellow);
	r3.setBackground(Color.red);
	g3.setBackground(Color.green);
	y3.setBackground(Color.yellow);
	r4.setBackground(Color.red);
	g4.setBackground(Color.green);
	y4.setBackground(Color.yellow);
	r5.setBackground(Color.red);
	g5.setBackground(Color.green);
	y5.setBackground(Color.yellow);
	r6.setBackground(Color.red);
	g6.setBackground(Color.green);
	y6.setBackground(Color.yellow);
	r7.setBackground(Color.red);
	g7.setBackground(Color.green);
	y7.setBackground(Color.yellow);
	r8.setBackground(Color.red);
	g8.setBackground(Color.green);
	y8.setBackground(Color.yellow);
	r9.setBackground(Color.red);
	g9.setBackground(Color.green);
	y9.setBackground(Color.yellow);
	r10.setBackground(Color.red);
	g10.setBackground(Color.green);
	y10.setBackground(Color.yellow);
	r11.setBackground(Color.red);
	g11.setBackground(Color.green);
	y11.setBackground(Color.yellow);
	r12.setBackground(Color.red);
	g12.setBackground(Color.green);
	y12.setBackground(Color.yellow);

	t.add("Select a theatre");
	t.add("Metro Big Cinema");
	t.add("Sterling");
	t.add("New Excelsior");
	t.add("PVR");

	m.add("Select a movie");
	m.add("Avenger Infinity War");
	m.add("The Nun");
	m.add("Me Before You");
	m.add("The Godfather");

	d.add("Select a date");
	d.add("26/10/19");
	d.add("27/10/19");
	d.add("28/10/19");
	d.add("29/10/19");

	ti.add("Select a time");
	ti.add("9.00am");
	ti.add("1.00pm");
	ti.add("5.00pm");
	ti.add("10.00pm");

	s.add("Select no. of seats");
	s.add("1");
	s.add("2");
	s.add("3");
	s.add("4");

	output = new TextArea(10,25);
	setLayout(new FlowLayout());

	add(theatre);
	add(t);
	add(movie);
	add(m);
	add(date);
	add(d);
	add(time);
	add(ti);
	add(quantity);
	add(s);
	add(stmt);
	add(stmt1);
	add(stmt2);
	add(stmt3);

	add(r1);add(r2);add(r3);add(r4);add(r5);add(r6);add(r7);add(r8);add(r9);add(r10);add(r11);add(r12);

	add(g1);add(g2);add(g3);add(g4);add(g5);add(g6);add(g7);add(g8);add(g9);add(g10);add(g11);add(g12);

	add(y1);add(y2);add(y3);add(y4);add(y5);add(y6);add(y7);add(y8);add(y9);add(y10);add(y11);add(y12);

	add(ticket);
	add(tick);
	add(output);

	r1.addItemListener(this);
	g1.addItemListener(this);
	y1.addItemListener(this);
	r2.addItemListener(this);
	g2.addItemListener(this);
	y2.addItemListener(this);
	r3.addItemListener(this);
	g3.addItemListener(this);
	y3.addItemListener(this);
	r4.addItemListener(this);
	g4.addItemListener(this);
	y4.addItemListener(this);
	r5.addItemListener(this);
	g5.addItemListener(this);
	y5.addItemListener(this);
	r6.addItemListener(this);
	g6.addItemListener(this);
	y6.addItemListener(this);
	r7.addItemListener(this);
	g7.addItemListener(this);
	y7.addItemListener(this);
	r8.addItemListener(this);
	g8.addItemListener(this);
	y8.addItemListener(this);
	r9.addItemListener(this);
	g9.addItemListener(this);
	y9.addItemListener(this);
	r10.addItemListener(this);
	g10.addItemListener(this);
	y10.addItemListener(this);
	r11.addItemListener(this);
	g11.addItemListener(this);
	y11.addItemListener(this);
	r12.addItemListener(this);
	g12.addItemListener(this);
	y12.addItemListener(this);

	tick.addActionListener(this);
}
 public void itemStateChanged(ItemEvent e)
{
	int r=0,g=0,y=0;
	nos = s.getItem(s.getSelectedIndex());
	int n = Integer.parseInt(nos);
	    if(r1.getState() == true)
	       {
		r=r+1;
		sr1=r1.getLabel();
	       }
	else sr1="";
	      if(r2.getState() == true)
	     {
	                   r=r+1;
                           sr2=r2.getLabel();
 	      }
	else sr2="";
	      if(r3.getState() == true)
	      {
	         	r=r+1;
	        sr3=r3.getLabel();
	      }
	else sr3="";
	      if(r4.getState() == true)
	      {
	         	r=r+1;
	        sr4=r4.getLabel();
	      }
	else sr4="";
	      if(r5.getState() == true)
	      {
	         	r=r+1;
	        sr5=r5.getLabel();
	      }
	else sr5="";
	      if(r6.getState() == true)
	      {
	         	r=r+1;
	        sr6=r6.getLabel();
	      }
	else sr6="";
	      if(r7.getState() == true)
	      {
	         	r=r+1;
	        sr7=r7.getLabel();
	      }
	else sr7="";
	      if(r8.getState() == true)
	      {
	         	r=r+1;
	        sr8=r8.getLabel();
	      }
	else sr8="";
	      if(r9.getState() == true)
	      {
	         	r=r+1;
	        sr9=r9.getLabel();
	      }
	else sr9="";
	      if(r10.getState() == true)
	      {
	         	r=r+1;
	        sr10=r10.getLabel();
	      }
	else sr10="";
	      if(r11.getState() == true)
	      {
	         	r=r+1;
	        sr11=r11.getLabel();
	      }
	else sr11="";
	      if(r12.getState() == true)
	      {
	         	r=r+1;
	        sr12=r12.getLabel();
	      }
	else sr12="";
	      if(g1.getState() == true)
	      {
	         	g=g+1;
	        sg1=g1.getLabel();
	      }
	else sg1="";
	      if(g2.getState() == true)
	      {
	         	g=g+1;
	        sg2=g2.getLabel();
	      }
	else sg1="";
	      if(g2.getState() == true)
	      {
	         	g=g+1;
	        sg2=g2.getLabel();
	      }
	else sg2="";
	      if(g3.getState() == true)
	      {
	         	g=g+1;
	        sg3=g3.getLabel();
	      }
	else sg3="";
	      if(g4.getState() == true)
	      {
	         	g=g+1;
	        sg4=g4.getLabel();
	      }
	else sg4="";
	      if(g5.getState() == true)
	      {
	         	g=g+1;
	        sg5=g5.getLabel();
	      }
	else sg5="";
	      if(g6.getState() == true)
	      {
	         	g=g+1;
	        sg6=g6.getLabel();
	      }
	else sg6="";
	      if(g7.getState() == true)
	      {
	         	g=g+1;
	        sg7=g7.getLabel();
	      }
	else sg7="";
	      if(g8.getState() == true)
	      {
	         	g=g+1;
	        sg8=g8.getLabel();
	      }
	else sg8="";
	      if(g9.getState() == true)
	      {
	         	g=g+1;
	        sg9=g9.getLabel();
	      }
	else sg9="";
	      if(g10.getState() == true)
	      {
	         	g=g+1;
	        sg10=g10.getLabel();
	      }
	else sg10="";
	      if(g11.getState() == true)
	      {
	         	g=g+1;
	        sg11=g11.getLabel();
	      }
	else sg11="";
	      if(g12.getState() == true)
	      {
	         	g=g+1;
	        sg12=g12.getLabel();
	      }
	else sg12="";
	      if(y1.getState() == true)
	      {
	         	y=y+1;
	        sy1=y1.getLabel();
	      }
	else sy1="";
	      if(y2.getState() == true)
	      {
	         	y=y+1;
	        sy2=y2.getLabel();
	      }
	else sy2="";
	      if(y3.getState() == true)
	      {
	         	y=y+1;
	        sy3=y3.getLabel();
	      }
	else sy3="";
	      if(y4.getState() == true)
	      {
	         	y=y+1;
	        sy4=y4.getLabel();
	      }
	else sy4="";
	      if(y5.getState() == true)
	      {
	         	y=y+1;
	        sy5=y5.getLabel();
	      }
	else sy5="";
	      if(y6.getState() == true)
	      {
	         	y=y+1;
	        sy6=y6.getLabel();
	      }
	else sy6="";
	      if(y7.getState() == true)
	      {
	         	y=y+1;
	        sy7=y7.getLabel();
	      }
	else sy7="";
	      if(y8.getState() == true)
	      {
	         	y=y+1;
	        sy8=y8.getLabel();
	      }
	else sy8="";
	      if(y9.getState() == true)
	      {
	         	y=y+1;
	        sy9=y9.getLabel();
	      }
	else sy9="";
	      if(y10.getState() == true)
	      {
	         	y=y+1;
	        sy10=y10.getLabel();
	      }
	else sy10="";
	      if(y11.getState() == true)
	      {
	         	y=y+1;
	        sy11=y11.getLabel();
	      }
	else sy11="";
	      if(y12.getState() == true)
	      {
	         	y=y+1;
	        sy12=y12.getLabel();
	      }
	else sy12="";
	      if(r+g+y == n)
	      {
	          r1.setEnabled(false);
	          g1.setEnabled(false);
	          y1.setEnabled(false);
	          r2.setEnabled(false);
	          g2.setEnabled(false);
	          y2.setEnabled(false);
	          r3.setEnabled(false);
	          g3.setEnabled(false);
	          y3.setEnabled(false);
	          r4.setEnabled(false);
	          g4.setEnabled(false);
	          y4.setEnabled(false);
	          r5.setEnabled(false);
	          g5.setEnabled(false);
	          y5.setEnabled(false);
	          r6.setEnabled(false);
	          g6.setEnabled(false);
	          y6.setEnabled(false);
	          r7.setEnabled(false);
	          g7.setEnabled(false);
	          y7.setEnabled(false);
	          r8.setEnabled(false);
	          g8.setEnabled(false);
	          y8.setEnabled(false);
	          r9.setEnabled(false);
	          g9.setEnabled(false);
	          y9.setEnabled(false);
	          r10.setEnabled(false);
	          g10.setEnabled(false);
	          y10.setEnabled(false);
	          r11.setEnabled(false);
	          g11.setEnabled(false);
	          y11.setEnabled(false);
	          r12.setEnabled(false);
	          g12.setEnabled(false);
	          y12.setEnabled(false);
	       }
	amount = (200*r)+(150*g)+(80*y);
}	

 public void actionPerformed(ActionEvent ae)
 {
	String buttonPressed = ae.getActionCommand();

	th = t.getItem(t.getSelectedIndex());
	mo = m.getItem(m.getSelectedIndex());
	dom = d.getItem(d.getSelectedIndex());
	tom = ti.getItem(ti.getSelectedIndex());
	nos = s.getItem(s.getSelectedIndex());

	if(buttonPressed.equals("Print"))
	{
	   output.setText("Theatre:"+th+"\nMovie:"+mo+"\nDate of  movie:"+dom+"\nTime:"+tom+"\nNo. of Seats:"+nos+"\nSeatNos :"+sr1+sr2+sr3+sr4+sr5+sr6+sr7+sr8+sr9+sr10+sr11+sr12+sg1+sg2+sg3+sg4+sg5+sg6+sg7+sg8+sg9+sg10+sg11+sg12+sy1+sy2+sy3+sy4+sy5+sy6+sy7+sy8+sy9+sy10+sy11+sy12+"\nTotalAmount:"+amount);
	}
  }
}