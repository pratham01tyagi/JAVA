package Class_work;

public class printing_table {

public static void main(String args[]) {
int i = Integer.parseInt(args[0]);
System.out.println("Table for " + i + " is: ");
for (int j = 1; j <= 10; j++) {
System.out.println(i + "*" + j + "=" + (i * j));
}
}
}