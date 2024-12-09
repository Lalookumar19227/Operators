//Print last two digit
class Program3
{
	public static void main(String[] args)
	{
		int x=5847;
		int digit1=x%10;
		x=x/10;
		int digit2=x%10;
		x=x/10;
		int digit3=x%10;
		x=x/10;
		int digit4=x%10;
		int sum=digit1+digit2+digit3+digit4;
		System.out.println(sum);
	}
}




