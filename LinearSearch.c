#include <stdio.h>
#include <stdlib.h>
#define max 20
//linear search
int main() {
	
	int i,j,search,index,n;
	int arr[max];
	int flag=0;
	
	printf("How many numbers do you want in array:");
	scanf("%d",&n);
	
	printf("Enter element in array :\n");
	
	for(i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("Enter element to search :");
	scanf("%d",&search);
	
	for (i=0;i<n;i++)
	{
		if(arr[i]==search)
		{
			index=i+1;
			flag=1;
			break;
		}
		
	}
		if(flag==1)
		{
			printf("Element found at %d location\n",index);
		}
		else
		{	
			printf("Element %d not found in list",search);
		}
	
	
	
	return 0;                      
}
