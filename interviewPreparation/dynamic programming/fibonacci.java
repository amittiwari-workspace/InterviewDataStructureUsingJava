
public class fibonacci {

    private static int recursiveCalls=0;
    private static int recursiveCallsTopDown=0;
    private static int recursiveCallsBottonUp=0;
    private static int t[]=new int[102];
    private static int r[]=new int[102];
    
private static int calculatefiboRecursion(int number)
{
    recursiveCalls++;
    if(number==0)return 0;
    if(number==1)return 1;
    else return calculatefiboRecursion(number-1) + calculatefiboRecursion(number-2);
}

private static int topdownDP(int number)
{
    recursiveCallsTopDown++;
    if(number==0)return t[number];
    if(number==1)return t[number];
    if(t[number]>0) return t[number];
    else
     return t[number]= bottomUpDP(number-1) + bottomUpDP(number-2);

}

private static int bottomUpDP(int number)
{
    recursiveCallsBottonUp++;
    if(number==0)return r[number];
    if(number==1)return r[number];
    
    for (int i = 2; i <=number; i++) {
        r[i]=r[i-1]+r[i-2];
    }
    return r[number];
}
private static int calculateUsing3Variables(int number)
{
    int count=2;
    int a=0;
    int b=1;
    int c=0;
    while (count<=number) {
        c=a+b;
        a=b;
        b=c;
        count++;
    }
    return c;
}
private static int constantTimeSoln(int number)
{
    double phi=(1+Math.sqrt(5))/2;
    return (int) Math.round((Math.pow(phi,number)/Math.sqrt(5)));
}
    public static void main(String args[])
    {
        int number=11;
        
        //Recursion
       System.out.println(calculatefiboRecursion(number) + " " +recursiveCalls);
       
       //DP-Memiozation
       t[0]=0;
       t[1]=1;
        System.out.println(topdownDP(number) + " " +recursiveCallsTopDown);
        
        //Tabulation
        r[0]=0;
        r[1]=1;
        System.out.println(bottomUpDP(number) + " " +recursiveCallsBottonUp);

        //Space Optimizatation
        System.out.println(calculateUsing3Variables(number));

        //O(1)
        System.out.println(constantTimeSoln(number));

    }



}