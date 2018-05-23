/*

Here is a list of all primitives in Java:

byte (number, 1 byte)
short (number, 2 bytes)
int (number, 4 bytes)
long (number, 8 bytes)
float (float number, 4 bytes)
double (float number, 8 bytes)
char (a character, 2 bytes)
boolean (true or false, 1 byte)

*/

class Variables {
  public static void main(String[ ] args) {
  
 // To declare and assign a number
 int myNumber;
 myNumber = 5;
 
 //or
 int myNumber = 5;
 
 //Define a double floating point number
 double d = 4.5;
 d = 3.0;
 
 //float
 float f = (float) 4.5;
 
 //or
 float f = 4.5f               // f is a shorter way of casting float
 
 //Character
 char = 'z';
 
 //String
 String name = "Nikos";
 
 //boolean
 boolean b = (true);
 
 
 
 //Examples
 
 
 //Strings
 
 // Create a string with a constructor
 String s1 = new String("Who let the dogs out?");
 // Just using "" creates a string, so no need to write it the previous way.
 String s2 = "Who who who who!";
 // Java defined the operator + on strings to concatenate:
 String s3 = s1 + s2;
 
 //Strings & int
 
 int num = 5;
 String s = "I have " + num + " cookies";






 

}
