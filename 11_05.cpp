#include <stdio.h>
#include <stdlib.h>

//测试数据结构的 性能 for循环 和递归




void PrintN(int N)
{
	int i;
	for (i = 1; i <= N; i++) {
		printf("%d\n", i);
	}
	return;
}
int main()
{
	
	int N;
	scanf_s("%d", &N);
	PrintN(N);
	
	return 0;
}
