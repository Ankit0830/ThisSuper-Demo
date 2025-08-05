package thissuper;

class Rectangle
{
    int length;
    int breath;
    int x = 10;
    Rectangle (int l, int b)
    {
        this.length = l;
        this.breath = b;
    }
}

class Cuboid extends Rectangle
{
    int height;
    int x = 20;
    
    Cuboid (int l, int b, int h)
    {
        super (l,b);
        this.height = h;
    }
    void Display()
    {
        System.out.println(super.x);
        System.out.println(x);
    }
}


public class ThisSuper 
{
   public static void main(String[] args) 
   {
       Cuboid c =  new Cuboid(5,10,15);
       c.Display();
   }
    
}
