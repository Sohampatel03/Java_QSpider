// pre decreament/post decreament - 
int x = 76; //75
int y = --x;  //75
System.out.print(x+y); // 150
// in order to predeacrement first we decreament the value then we perform the operation
// with respect to post decreament first we perform the operation then dereament the value by one
int x = 34; //33
int y = x--; //33
int z = --y; //33

--x = 32
y-- = 33 //32
--z = 32
y-- = 32 //31

int a = 40; //40
int b = ++a; //41
int c = --a; //40

++a = 41
--b = 40
++c = 41
a++ = 41 //42
--b = 39
--c = 40
a++ = 42 //43
answer = 284

//In-build function of string- 
// toUpperCase() - convert the string into upper case
toLowerCase() - convert the string into lower case
trim() - remove the extra space from the string
equals() - compare the string with another string it is case sensetive
equalsIgnoreCase() - it ignore the case of string and compare the string with another string
charAt(index) - gives the character that present on the perticular index
compareTo() - compare the string with another string and return the difference of first character of both string
startsWith() - check the string is start with the perticular character or not
endsWith() - check the string is end with the perticular character or not
substring(startIndex) - gives the substring from the start index to end of the string
substring(startIndex, endIndex) - gives the substring from the start index to end index of(exclusive)
concat() - combine the two string
length() - gives the size of string
what is object in java - object is a real world entity which has state and behavior. it is an instance of class. it is created from class. it is a physical entity. it is created at runtime. it is used to access the members of class. it is created using new keyword.

brand - fastrack
color - blue
type - smartWatch
price  -1299

1.identify entity(object) - smartWatch
2.prepare blue-print/plan
3.define data-member/attributes - brand, color, type, price
4.define member-function/behavior - displayDetails()
5.create object
6.assign values
7.print values
