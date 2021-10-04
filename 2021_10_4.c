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
	printf("%d", n);

	return 0;
}

