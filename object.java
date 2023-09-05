public class object{


	public static void main(String args[])
	{
		person p = new person();
		p.speak();
		p.cal(10);

	}


}
class person 
{
	String name;
	int age;
	public void speak()
	{
		System.out.println("l am a good man");
	}

	public void cal(int n)
	{

		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum = sum +i;
		}
		System.out.println("1 add to" +n+ "result is "+sum);
	}



}
