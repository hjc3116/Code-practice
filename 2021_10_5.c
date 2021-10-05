#include <stdio.h>

int main()
{
	/*                               *********n！阶乘
	int n = 0;
	scanf_s("%d", &n);

	int i = 0;
	int fact = 1;

	for (i = n; i >= 1; i--) {            *也可改为 for( i = 2 ; i >=n ; i++){ fact *= i }
																	
		fact *= i;
	}
	printf("%d!=%d", n, fact);
	*/   
	
	
	/*                                ********素数判断
	int x;
	scanf_s("%d", &x);

	int i;
	int isPrime = 1;
	for (i = 2; i < x; i++) {
		if (x % i == 0) {
		isPrime = 0;
		}
		break;
	}
	if (isPrime == 1) {
		printf("是素数");
	}
	else {
		printf("不是素数");
	}
	*/
	
	/*                                *******输出 0-100 中的素数
	int y;
	for (y = 1; y <= 100; y++) {

		int i;
		int isPrime = 1;
		for (i = 2; i < y; i++) {
			if (y % i == 0) {
			isPrime = 0;
			}
			break;
			}
		if (isPrime == 1) {
		printf("%d\n",y);
		}
	}
	*/
	return 0;
}
