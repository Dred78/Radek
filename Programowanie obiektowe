Class 1

package pl.dom;

public class Home {

	public static void main(String[] args) 
	{
		TV nosy = new TV(45, "nosy123");
		TV sony = new TV(32, "sony5434");
		{	

System.out.println(sony.getName() + "   " + sony.getSize());
System.out.println(nosy.getName() + "   " + nosy.getSize());	
	
	
	sony.getonOff();
	sony.setOnOff(true);
	sony.getonOff();
	
	

		}}
}

Class 2

package pl.dom;

public class TV {

private int size ;
private String name;
private boolean onOff;

//public TV()
//{
//	}
public TV (int aSize, String name)
{
	size = aSize;
	this.name = name;
}

	public int getSize()
	{
		return size;
	}
	public String getName()
	{
		return name;
		
	}
	public void setOnOff(boolean a)
	{
		 onOff = a;
}
	public void getonOff()
	{
		
		if(onOff)
		{
			System.out.println("TV is on");
		}
		else
			System.out.println("TV is OFF");
	}
}
