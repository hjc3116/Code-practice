#include<stdio.h>

int main() {
	int x;
	int count[10];
	int i;

	for (i = 0; i < 10; i++) {
		count[i] = 0;
	}

	scanf_s("%d", &x);
	while (x != -1) {
		if (x >= 0 && x <= 9) {
			count[x] ++;
		}
		scanf_s("%d", &x);
	}
	for (i = 0; i < 10; i++) {
		printf("%d;%d\n", i, count[i]);
	}
	return 0;
}