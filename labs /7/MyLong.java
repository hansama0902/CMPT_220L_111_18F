package Lab7;

public class MyLong {

private Long value;

public MyLong(Long value) {

this.value = value;

}

public Long getValue() {

return value;

}

public boolean isEven() {

if (value % 2 == 0)

return true;

else

return false;

}

public boolean isOdd() {

if (value % 2 == 0)

return false;

else

return true;

}

public boolean isPrime() {

// If the user entered number is '2' return true

if (value == 1)

return false;

for (int i = 2; i * i <= value; i++) {

if (value % i == 0)

return false;

}

return true;

}

public static boolean isEven(long value) {

if (value % 2 == 0)

return true;

else

return false;

}

public static boolean isOdd(long value) {

if (value % 2 == 0)

return false;

else

return true;

}

public static boolean isPrime(long value) {

// If the user entered number is '2' return true

if (value == 1)

return false;

for (int i = 2; i * i <= value; i++) {

if (value % i == 0)

return false;

}

return true;

}

public static boolean isEven(MyLong ml) {

if (ml.getValue() % 2 == 0)

return true;

else

return false;

}

public static boolean isOdd(MyLong ml) {

if (ml.getValue() % 2 == 0)

return false;

else

return true;

}

public static boolean isPrime(MyLong ml) {

// If the user entered number is '2' return true

if (ml.getValue() == 1)

return false;

for (int i = 2; i * i <= ml.getValue(); i++) {

if (ml.getValue() % i == 0)

return false;

}

return true;

}

public static long parseLong(char ch[]) {

String str = "";

for (int i = 0; i < ch.length; i++) {

str += ch[i];

}

return Long.parseLong(str);

}

public static long parseLong(String str) {

return Long.parseLong(str);

}

}
