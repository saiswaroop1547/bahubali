

public class A {
	String fullName;
B b;
A()
{
	System.out.println("A is created");
}
public B getB()
{
	return b;
}
public String getFullName() {
	return fullName;
}
public void setFullName(String fullName) {
	this.fullName = fullName;
}
public void setB(B b)
{
	this.b=b;
}
void print()
{
	System.out.println("Hello Two"+fullName);
}
void display()
{
print();
b.print();
}
}

