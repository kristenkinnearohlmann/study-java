# Study Java

## Snippets

### Sorting 3 numbers
```Java
int x = 7;
int y = 5;
int z = 10;
//
int swap = 0;
//
if (x > z) {
    swap = x;
    x = z;
    z = swap;
}
if (x > y) {
    swap = x;
    x = y;
    y = swap;
}
if (y > z) {
    swap = y;
    y = z;
    z = swap;
}
System.out.println(y);
```