package pl.javastart.first;

public class Mathematics {

public static void main (String args[]) 
{
	
Mathematics m = new Mathematics();
m.className();
System.out.println(m.aqrt(5));
System.out.println(m.aqrt(55));
System.out.println(m.aqrt(10));
System.out.println(m.aqrt(10.5));
System.out.println(m.aqrt(15.5));
System.out.println(m.aqrt(20.5));
}
public void className() {
}
{
	System.out.println("Mathematics");
}

public int aqrt(int a)
{
	return a*a;
}
public double aqrt(double a)
{
	return a*a;
}

	}
