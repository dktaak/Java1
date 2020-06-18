package test;

public class test {

	public static void main(String[] args) {
		/*
		boolean x=true;
		boolean y=false;
		System.out.println(x && y);
		System.out.println(x || y);
	*/
		
		Object a[][]=new Object[3][2];
		a[0][0]= 10.25;
		a[0][1]="bhbhbh";
		a[1][0]='m';
		a[1][1]=false;
		a[2][0]=true;
		for(int i=0;i<3;i++)
		{		for(int j=0;j<2;j++)
		{
			System.out.println(a[i][j]+"  ");
		}
		}
		
	}

}
