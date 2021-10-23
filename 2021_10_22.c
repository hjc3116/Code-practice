#include <stdio.h>

int main()
{
	int x;
	int cnt = 0;
	double sum = 0;
	int number[100];

	scanf_s("%d", &x);
	while (x != -1) {
		number[cnt] = x;
		{
			int i;
			printf("%d\t", cnt);
			for (i = 0; i <= cnt; i++) {
				printf(" %d\t", number[i]);
			}
			printf("\n");
		}
		sum += x;
		cnt++;
		scanf_s("%d", &x);
	}
	if (cnt > 0) {
		printf("%f\n", sum / cnt);
		int i;
		for (i = 0; i <= cnt; i++) {
			if (number[i] > sum / cnt) {
				printf(" %d\t", number[i]);
			}
		}
	}
	return 0;
}
//สýื้
	
