class cons
{
int sum=0;

cons (int n,int m)
{
for(int i=0;i<=n;i++)
{
sum=sum+i;
}
}
void a()
{
System.out.println(sum);
}
public static void main(String geetu[])
{
cons obj=new cons(20,30);
obj.a();
}
}
