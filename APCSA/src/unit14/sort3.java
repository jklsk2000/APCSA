package unit14;

import java.util.Arrays;

public class sort3 {
	public static void main (String[] args){
		Comparable[] list = {3,15,61,11,7,9,2,33};
		sort3(list);
	}
	public static void sort3(Comparable[] list )
	{
		sort3(list, 0, list.length);
	}
	private static void sort3( Comparable[] list, int front, int back)
	{
	int mid = (front+back)/2;
	if( mid==front) return;
	sort3(list, front, mid);
	sort3(list, mid, back);
	help(list, front, back);
	System.out.println(Arrays.toString(list));

	}
	private static void help(Comparable[] list, int front, int back)
	{
	Comparable[] temp = new Comparable[back-front];
	int i = front, j = (front+back)/2, k =0;
	int mid =j;
	while(i < mid && j < back)
	{
	if(list[i].compareTo(list[j]) < 0)
	temp[k++]=list[i++];
	else
	temp[k++]=list[j++];
	}
	while(i < mid)
	temp[k++]=list[i++];
	while(j<back)
	temp[k++]=list[j++];
	for(i = 0;i < back-front; ++i)
	list[front+i]=temp[i];
	}	
}
