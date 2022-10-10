


class sample
{
	double mark1,mark2,s;
	void read(double m1,double m2)
	{
		mark1=m1;
		mark2=m2;
		
	}
	void add()
	{
		s=mark1+mark2;
		System.out.println("sum of the mark is:"+s);
	}
	public static void main(String args[])
	{
		sample s1=new sample();
		s1.read(65.73, 78.9);
		s1.add();
		
		
	}
}