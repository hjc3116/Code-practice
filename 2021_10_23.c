#include <stdio.h>

int main()
{
	int x;
	int cnt = 0;
	double sum = 0;
	scanf_s("%d", &x);
	while (x != -1) {
		sum += x;
		cnt++;
		scanf_s("%d", &x);
	}
	if (cnt > 0) {
		printf("%f\n", sum / cnt);
	}
	return 0;
}
	
