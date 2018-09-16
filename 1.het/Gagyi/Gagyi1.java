public class Gagyi1
{

public static void main (String[]args)
{

Integer x = -129;
Integer t = -129;

System.out.println (x);
System.out.println (t);

while (x <= t && x >= t && t != x);

}
}


/*public static Integer valueOf(int i) {

    if (i >= IntegerCache.low && i <= IntegerCache.high)

        return IntegerCache.cache[i + (-IntegerCache.low)];

    return new Integer(i);

}

vegyük a -129 esetet, ami fagy, azaz végtelen ciklus, ekkor
i-ben a -129 van

public static Integer valueOf(int i) {

amivel ez az if
if (i >= IntegerCache.low && i <= IntegerCache.high)
nem teljesül
tehát ez fog lefutni mindkét esetben, amikor a Gagyi progiban csináljuk a két Integert:

return new Integer(i);*/