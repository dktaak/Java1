package test;

public class test {

	public static void main(String[] args) {
		/*
		boolean x=true;
		boolean y=false;
		System.out.println(x && y);
		System.out.println(x || y);
	*/
		/*
		Object a[][]=new Object[3][2];
		a[0][0]= 10.25;
		a[0][1]="bhbhbh";
		a[1][0]='m';
		a[1][1]=false;
		a[2][0]=true;
		for(Object i[]:a)
		{		for(Object j:i)
		{
			System.out.println(j+"  ");
		}
		}
		*/
		/*
		Object a[][]=new Object[3][2];
		a[0][0]= 10.25;
		a[0][1]="bhbhbh";
		a[1][0]='m';
		a[1][1]=false;
		a[2][0]=true;
		for(Object i[]:a)
		{		for(Object j:i)
		{
			System.out.print(j+"  ");
		}
		}
		*/
		/*
		 int a[][]=new int[3][2];
		a[0][0]= 50;
		a[0][1]=40;
		a[1][0]=30;
		a[1][1]=20;
		a[2][0]=10;
		a[2][1]=10;
		for(int i[]:a)
		{		for(int j:i)
		{
			System.out.println(j);
		}
		*/
		int a[][]= { {1,2,3},{4,5,6} };
		
		for(int i[]:a)
		{		for(int j:i)
		{
			System.out.print(j+"gello  ");
		}
		}
	}

}
