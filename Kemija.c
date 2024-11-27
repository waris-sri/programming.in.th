#include <stdio.h>
#include <string.h>

int main() {
  char vowels[5] = {'a', 'e', 'i', 'o', 'u'};
  char str[100];
  fgets(str, 100, stdin);
  int len = strlen(str);

  for (int i = 0; i < len; i++) {
    for (int j = 0; j < 5; j++) {
      if (str[i] == vowels[j]) {
        str[i + 1] = 1;
        str[i + 2] = 1;
        break;
      }
    }
  }

  for (int i = 0; i < len; i++) {
    if (str[i] != 1) {
      printf("%c", str[i]);
    }
  }

  return 0;
}
