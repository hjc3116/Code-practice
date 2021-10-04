#include <stdio.h>

int main()
{
	int x;
	int n = 0;
	
	scanf_s("%d", &x);
	
	while (x > 0) {
		n++;
		x = x / 10;
	}
	// printf("x=%d,n=%d",x.n)   调试 注意 特殊值：10的倍数，0 ，负数
	printf("%d", n);

	return 0;
}

