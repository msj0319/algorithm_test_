#include <stdio.h>

int main() {
	int num=0;
	int i = 0, a = 0, b = 0;
	scanf("%d", &num);
	for (i = 1; i < num + 1; i++) {
		scanf("%d %d", &a, &b);
		printf("Case #%d: %d\n", i, a + b);
	}
}