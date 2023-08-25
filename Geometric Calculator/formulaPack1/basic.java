package formulaPack1;
import java.util.*;
import java.lang.Math;
public class basic
{
    Scanner sc=new Scanner(System.in);
    final double p=3.1416;
    public void circleArea()
    {
        int r;
        double a;
        System.out.println("Enter the radius of the circle: ");
        r = sc.nextInt();
        a = p*r*r;
        System.out.println("The Area of the circle with radius "+r+" is "+a);
    }
    public void sqArea()
    {
        int s;
        double a;
        System.out.println("Enter the side of the square: ");
        s = sc.nextInt();
        a = s*s;
        System.out.println("The Area of the Square with side "+s+" is "+a);
    }
    public void rectArea()
    {
        int l, b;
        double a;
        System.out.println("Enter the lenght of the rectangle: ");
        l = sc.nextInt();
        System.out.println("Enter the breadth of the rectangle: ");
        b = sc.nextInt();
        a = l*b;
        System.out.println("The Area of the Reactangle with lenght "+l+" and breadth "+b+" is "+a);
    }
    public void triArea()
    {
        int b,h;
        double a;
        System.out.println("Enter the height of the triangle: ");
        h = sc.nextInt();
        System.out.println("Enter the base of the triangle: ");
        b = sc.nextInt();
        a = b*h*0.5;
        System.out.println("The Area of the Triangle with height "+h+" and base "+b+" is "+a);
    }public void triArea2()
    {
        int a, b, c;
        double a0, s, s1, s2, s3;
        System.out.println("Enter the side1 of the triangle: ");
        a = sc.nextInt();
        System.out.println("Enter the side2 of the triangle: ");
        b = sc.nextInt();
        System.out.println("Enter the side3 of the triangle: ");
        c = sc.nextInt();
        s=(a+b+c)*0.5;
        s1=s-a;
        s2=s-b;
        s3=s-c;
        a0=(s*s1*s2*s3);  
        System.out.println("The Area of the Triangle is "+Math.sqrt(a0));
    }
    public void paralleloArea()
    {
        int b,h;
        double a;
        System.out.println("Enter the height of the parallelogram: ");
        h = sc.nextInt();
        System.out.println("Enter the breadth of the parallelogram: ");
        b = sc.nextInt();
        a = b*h;
        System.out.println("The Area of the Parallelogram with height "+h+" and breadth "+b+" is "+a);
    }
    public void trapezoidArea()
    {
        int b1,b2,h;
        double b, a;
        System.out.println("Enter the height of the trapezoid: ");
        h = sc.nextInt();
        System.out.println("Enter the base1 of the trapezoid: ");
        b1 = sc.nextInt();
        System.out.println("Enter the base2 of the trapezoid: ");
        b2 = sc.nextInt();
        b=(b1+b2)/2;
        a = b*h;
        System.out.println("The Area of the Trapezoid is "+a);
    }
    public void rhomArea1()
    {
        int h, b;
        double a;
        System.out.println("Enter the height of the rhombus: ");
        h = sc.nextInt();
        System.out.println("Enter the base of the rhombus: ");
        b = sc.nextInt();
        a = h*b;
        System.out.println("The Area of the Rhombus with height "+h+" and base "+b+" is "+a);
    }
    public void rhomArea2()
    {
        int d1, d2;
        double a;
        System.out.println("Enter the lenght of diagonal 1 of the rhombus: ");
        d1 = sc.nextInt();
        System.out.println("Enter the lenght of diagonal 2 of the rhombus: ");
        d2 = sc.nextInt();
        a = d1*d2*0.5;
        System.out.println("The Area of the Rhombus with lenght is "+a);
    }
    public void ellipseArea()
    {
        int x,y;
        double a;
        System.out.println("Enter the lenght of axis 1 of ellipse: ");
        x = sc.nextInt();
        System.out.println("Enter the lenght of axis 2 of ellipse: ");
        y = sc.nextInt();
        a = p*x*y;
        System.out.println("The Area of the Ellipse is "+a);
    }
    public void cylinderSArea()
    {
        int r, h;
        double a;
        System.out.println("Enter the height of Cylinder: ");
        h = sc.nextInt();
        System.out.println("Enter the radius of Cylinder: ");
        r = sc.nextInt();
        a = ((2*p*r*h)+(2*p*r*r));
        System.out.println("The Surface Area of the Cylinder is "+a);
    }
    public void sphereSArea()
    {
        int r;
        double a;
        System.out.println("Enter the radius of Sphere: ");
        r = sc.nextInt();
        a = 4*p*r*r;
        System.out.println("The Surface Area of the Sphere is "+a);
    }
    public void cubeSArea()
    {
        int e;
        double a;
        System.out.println("Enter the edge of the cube: ");
        e = sc.nextInt();
        a = 6*e*e;
        System.out.println("The Surface Area of the Cube is "+a);
    }
    public void cuboidSArea()
    {
        int l, h, b;
        double a;
        System.out.println("Enter the height of the cuboid: ");
        h = sc.nextInt();
        System.out.println("Enter the lenght of the cuboid: ");
        l = sc.nextInt();
        System.out.println("Enter the breadth of the cuboid: ");
        b = sc.nextInt();
        a = (2*((l*b)+(b*h)+(h*l)));
        System.out.println("The Surface Area of the Cuboid is "+a);
    }
    public void coneSArea()
    {
        int r,h;
        double a, c;
        System.out.println("Enter the radius of the Cone: ");
        r = sc.nextInt();
        System.out.println("Enter the height of the Cone: ");
        h = sc.nextInt();
        c=(h*h)+(r*r);
        a = p*r*(r+(Math.sqrt(c)));
        System.out.println("The Surface Area of the Cone is "+a);
    }
    public void pyramidSArea()
    {
        int l, w, h;
        double a, f, g;
        System.out.println("Enter the width of the Pyramid: ");
        w = sc.nextInt();
        System.out.println("Enter the height of the Pyramid: ");
        h = sc.nextInt();
        System.out.println("Enter the lenght of the Pyramid: ");
        l = sc.nextInt();
        f=Math.sqrt(((w/2)*(w/2))+(h*h));
        g=Math.sqrt(((l/2)*(l/2))+(h*h));
        a= (l*w)+(l*f)+(w*g);
        System.out.println("The Surface Area of the Cuboid is "+a);
    }
    public void hSphereSArea()
    {
        int r;
        double a;
        System.out.println("Enter the radius of Hemisphere: ");
        r = sc.nextInt();
        a = 3*p*r*r;
        System.out.println("The Surface Area of the Hemisphere is "+a);
    }
    public void cylinderVol()
    {
        int r, h;
        double a;
        System.out.println("Enter the radius of Cylinder: ");
        r = sc.nextInt();
        System.out.println("Enter the height of Cylinder: ");
        h = sc.nextInt();
        a = p*r*r*h;
        System.out.println("The Volume of the Cylinder is "+a);
    }
    public void sphereVol()
    {
        int r;
        double a;
        System.out.println("Enter the radius of Sphere: ");
        r = sc.nextInt();
        a = p*r*r*r*(4/3);
        System.out.println("The Volume of the Sphere is "+a);
    }
    public void cubeVol()
    {
        int e;
        double a;
        System.out.println("Enter the edge of the Cube: ");
        e = sc.nextInt();
        a = e*e*e;
        System.out.println("The Volume of the Cube is "+a);
    }
    public void cuboidVol()
    {
        int b,h,l;
        double a;
        System.out.println("Enter the height of the cuboid: ");
        h = sc.nextInt();
        System.out.println("Enter the lenght of the cuboid: ");
        l = sc.nextInt();
        System.out.println("Enter the breadth of the cuboid: ");
        b = sc.nextInt();
        a= b*h*l;
        System.out.println("The Volume of the Cuboid is "+a);
    }
    public void coneVol()
    {
        int r,h;
        double a;
        System.out.println("Enter the radius of Cone: ");
        r = sc.nextInt();
        System.out.println("Enter the height of Cone: ");
        h = sc.nextInt();
        a = p*r*r*r*(h/3);
        System.out.println("The Volume of the Sphere is "+a);
    }
    public void pyramidVol()
    {
        int b,h,l;
        double a;
        System.out.println("Enter the base Width of pyramid: ");
        b = sc.nextInt();
        System.out.println("Enter the height of pyramid: ");
        h = sc.nextInt();
        System.out.println("Enter the lenght of pyramid: ");
        l = sc.nextInt();
        a = (b*h*l)/3;
        System.out.println("The Volume of the Sphere is "+a);
    }
    public void hSphereVol()
    {
        int r;
        double a;
        System.out.println("Enter the radius of hemisphere: ");
        r = sc.nextInt();
        a = p*r*r*r*(2/3);
        System.out.println("The Volume of the Sphere is "+a);
    }
        public void ellipseVol()
    {
        int x,y,z;
        double a;
        System.out.println("Enter the axis 1 of the ellipse: ");
        x = sc.nextInt();
        System.out.println("Enter the axis 2 of the ellipse: ");
        y = sc.nextInt();
        System.out.println("Enter the axis 3 of the ellipse: ");
        z = sc.nextInt();
        a = p*x*y*z*(4/3);
        System.out.println("The Volume of the Sphere is "+a);
    }
    public void circlePeri()
    {
        int r;
        double a;
        System.out.println("Enter the radius of circle: ");
        r = sc.nextInt();
        a = 2*p*r;
        System.out.println("The Circumference of the circle is "+a);
    }
    public void rectPeri()
    {
        int l,w;
        double a;
        System.out.println("Enter the lenght of rectangle: ");
        l = sc.nextInt();
        System.out.println("Enter the width of rectangle: ");
        w = sc.nextInt();
        a = 2*(w+l);
        System.out.println("The Perimeter of the Rectangle is "+a);
    }
    public void trianglePeri()
    {
        int x,y,z;
        double a;
        System.out.println("Enter the side1 of triangle: ");
        x = sc.nextInt();
        System.out.println("Enter the side2 of triangle: ");
        y = sc.nextInt();
        System.out.println("Enter the side3 of triangle: ");
        z = sc.nextInt();
        a = x+y+z;
        System.out.println("The Perimeter of the Triangle is "+a);
    }
    public void trapezoidPeri()
    {
        int w,x,y,z;
        double a;
        System.out.println("Enter the side1 of trapezoid: ");
        x = sc.nextInt();
        System.out.println("Enter the side2 of trapezoid: ");
        y = sc.nextInt();
        System.out.println("Enter the side3 of trapezoid: ");
        z = sc.nextInt();
        System.out.println("Enter the side4 of trapezoid: ");
        w = sc.nextInt();
        a = w+x+y+z;
        System.out.println("The Perimeter of the Trapezoid is "+a);
    }
    public void sqPeri()
    {
        int s;
        double a;
        System.out.println("Enter the side of the Square: ");
        s = sc.nextInt();
        a=s*4;
        System.out.println("The Perimeter of the Square is "+a);
    }
    public void rhomPeri()
    {
        int s;
        double a;
        System.out.println("Enter the side of the Rhombus: ");
        s = sc.nextInt();
        a=s*4;
        System.out.println("The Perimeter of the Rhombus is "+a);
    }
    public void paralleloPeri()
    {
        int s,v;
        double a;
        System.out.println("Enter the side 1 of the Parallelogram: ");
        s = sc.nextInt();
        System.out.println("Enter the side 2 of the Parallelogram: ");
        v = sc.nextInt();
        a=2*(s+v);
        System.out.println("The Perimeter of the Parallelogram is "+a);
    }
    public void ellipsePeri()
    {
        int a,b,x,y;
        double c,z,d;
        System.out.println("Enter the lenght of axis 1 of the Ellipse: ");
        a = sc.nextInt();
        System.out.println("Enter the lenght of axis 2 of Ellipse: ");
        b = sc.nextInt();
        x=(a-b);
        y=(a+b);
        z=Math.sqrt((((x*x)/(y*y))*-3)+4);
        d=(x*x)/((y*y)*(z+10));
        c=(p*y)*((3*d)+1);
        System.out.println("The Circumference of the Ellipse is "+c);
    }
}
