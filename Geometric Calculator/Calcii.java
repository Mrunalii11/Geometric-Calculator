import java.util.*;
import formulaPack1.basic;
import formulaPack1.conversion;
public class Calcii
{                                                                                   
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x;
        do
        {
            System.out.println("Formula of \n 1)Area \n2)Surface Area \n3)Volume \n4)Perimeter \n5) Conversions");
            System.out.println("Enter Your choice: ");
            System.out.println("\n");
            int a=sc.nextInt();
            basic r =new basic();
            switch(a)
            {
                case 1:
                System.out.println("Area of: \n1)Circle \n2)Rectangle \n3)Triangle (base and height) \n4)Triangle (sides) \n5)Square \n6)Trapezoid \n7)Parallelogram \n8)Rhombus (base and height) \n8)Rhombus (diagonals) \n10)Ellipse");
                System.out.println("Enter Your Choice: ");
                System.out.println("\n");
                int b=sc.nextInt();
                switch(b)
                {
                    case 1:
                    r.circleArea();
                    break;
                    case 2:
                    r.rectArea();
                    break;
                    case 3:
                    r.triArea();
                    break;
                    case 4:
                    r.triArea2();
                    break;
                    case 5:
                    r.sqArea();
                    break;
                    case 6:
                    r.trapezoidArea();
                    break;
                    case 7:
                    r.paralleloArea();
                    break;
                    case 8:
                    r.rhomArea1();
                    break;
                    case 9:
                    r.rhomArea2();
                    break;
                    case 10:
                    r.ellipseArea();
                    default :
                    System.out.println("INVALID INPUT");
                    break;
                }
                break;
                case 2:
                System.out.println("Surface Area of: \n1)Cylinder \n2)Sphere \n3)Cube \n4)Cuboid \n5)Cone \n6)Pyramid \n7)Hemisphere");
                System.out.println("Enter Your Choice: ");
                System.out.println("\n");
                int d=sc.nextInt();
                switch(d)
                {
                    case 1:
                    r.cylinderSArea();
                    break;
                    case 2:
                    r.sphereSArea();
                    break;
                    case 3:
                    r.cubeSArea();
                    break;
                    case 4:
                    r.cuboidSArea();
                    break;
                    case 5:
                    r.coneSArea();;
                    break;
                    case 6:
                    r.pyramidSArea();
                    break;
                    case 7:
                    r.hSphereSArea();
                    break;
                    default :
                    System.out.println("INVALID INPUT");
                    break;
                }
                break;
                case 3:
                System.out.println("Volume of: \n1)Cylinder \n2)Sphere \n3)Cube \n4)Cuboid \n5)Cone \n6)Pyramid \n7)Hemisphere \n8)Ellipse");
                System.out.println("Enter Your Choice: ");
                System.out.println("\n");
                int e=sc.nextInt();
                switch(e)
                {
                    case 1:
                    r.cylinderVol();
                    break;
                    case 2:
                    r.sphereVol();
                    break;
                    case 3:
                    r.cubeVol();
                    break;
                    case 4:
                    r.cuboidVol();
                    break;
                    case 5:
                    r.coneVol();;
                    break;
                    case 6:
                    r.pyramidVol();
                    break;
                    case 7:
                    r.hSphereVol();
                    break;
                    case 8:
                    r.ellipseVol();
                    break;
                    default :
                    System.out.println("INVALID INPUT");
                    break;
                }
                break;
                case 4:
                System.out.println("Perimeter/Circumference of: \n1)Circle \n2)Rectangle \n3)Triangle \n4)Square \n5)Trapezoid \n6)Parallelogram \n7)Rhombus \n8)Ellipse");
                System.out.println("Enter Your Choice: ");
                System.out.println("\n");
                int f=sc.nextInt();
                switch(f)
                {
                    case 1:
                    r.circlePeri();
                    break;
                    case 2:
                    r.rectPeri();
                    break;
                    case 3:
                    r.trianglePeri();
                    break;
                    case 4:
                    r.sqPeri();
                    break;
                    case 5:
                    r.trapezoidPeri();;
                    break;
                    case 6:
                    r.paralleloPeri();
                    break;
                    case 7:
                    r.rhomPeri();
                    break;
                    case 8:
                    r.ellipsePeri();
                    break;
                    default :
                    System.out.println("INVALID INPUT");
                    break;
                }
                break;
                case 5:
                conversion s =new conversion();
                System.out.println("1)Length \n2)Mass \n3)Volume");
                System.out.println("Enter you choice");
                System.out.println("\n");
                f=sc.nextInt();
                switch(f)
                {
                    case 1:
                    System.out.println("From \n1)Kilometer \n2)Hectometer \n3)Decameter \n4)Meter \n5)Decimeter \n6)Centimeter \n7)Millimeter");
                    System.out.println("Enter your choice: ");
                    System.out.println("\n");
                    int f1 = sc.nextInt();
                    switch(f1)
                    {
                        case 1:
                        System.out.println("To \n1)Kilometer \n2)Hectometer \n3)Decameter \n4)Meter \n5)Decimeter \n6)Centimeter \n7)Millimeter");                            
                            System.out.println("Enter your choice: ");
                            System.out.println("\n");
                            int t0 = sc.nextInt();
                            switch(t0)
                            {
                                case 1:
                                s.m();
                                break;
                                case 2:
                                s.g();
                                break;
                                case 3:
                                s.h();
                                break;
                                case 4:
                                s.i();
                                break;
                                case 5:
                                s.j();
                                break;
                                case 6:
                                s.k();
                                break;
                                case 7:
                                s.l();
                                break;
                                default :
                                System.out.println("INVALID INPUT");
                                break;
                            }
                            break;
                            case 2:
                            System.out.println("To \n1)Kilometer \n2)Hectometer \n3)Decameter \n4)Meter \n5)Decimeter \n6)Centimeter \n7)Millimeter");                            
                            System.out.println("Enter your choice: ");
                            System.out.println("\n");
                            int t1 = sc.nextInt();
                            switch(t1)
                            {
                                case 1:
                                s.a();
                                break;
                                case 2:
                                s.m();
                                break;
                                case 3:
                                s.g();
                                break;
                                case 4:
                                s.h();
                                break;
                                case 5:
                                s.i();
                                break;
                                case 6:
                                s.j();
                                break;
                                case 7:
                                s.k();
                                break;
                                default :
                                System.out.println("INVALID INPUT");
                                break;
                            }
                            break;
                            case 3:
                            System.out.println("To \n1)Kilometer \n2)Hectometer \n3)Decameter \n4)Meter \n5)Decimeter \n6)Centimeter \n7)Millimeter");                        
                            System.out.println("Enter your choice: ");
                            System.out.println("\n");
                            int t2 = sc.nextInt();
                            switch(t2)
                            {
                                case 1: s.b();
                                break;
                                case 2: s.a();
                                break;
                                case 3: s.m();
                                break;
                                case 4: s.g();
                                break;
                                case 5: s.h();
                                break;
                                case 6: s.i();
                                break;
                                case 7: s.j();
                                break;
                                default :
                                System.out.println("INVALID INPUT");
                                break;
                            }
                            break;
                            case 4:
                            System.out.println("To \n1)Kilometer \n2)Hectometer \n3)Decameter \n4)Meter \n5)Decimeter \n6)Centimeter \n7)Millimeter");                            
                            System.out.println("Enter your choice: ");
                            System.out.println("\n");
                            int t3 = sc.nextInt();
                            switch(t3)
                            {
                                case 1: s.c();
                                break;
                                case 2: s.b();
                                break;
                                case 3: s.a();
                                break;
                                case 4: s.m();
                                break;
                                case 5: s.g();
                                break;
                                case 6: s.h();
                                break;
                                case 7: s.i();
                                break;
                                default :
                                System.out.println("INVALID INPUT");
                                break;
                            }
                            break;
                            case 5:
                            System.out.println("To \n1)Kilometer \n2)Hectometer \n3)Decameter \n4)Meter \n5)Decimeter \n6)Centimeter \n7)Millimeter");                            
                            System.out.println("Enter your choice: ");
                            System.out.println("\n");
                            int t4 = sc.nextInt();
                            switch(t4)
                            {
                                case 1: s.d();
                                break;
                                case 2: s.c();
                                break;
                                case 3: s.b();
                                break;
                                case 4: s.a();
                                break;
                                case 5: s.m();
                                break;
                                case 6: s.g();
                                break;
                                case 7: s.h();
                                break;
                                default :
                                System.out.println("INVALID INPUT");
                                break;
                            }
                            break;
                            case 6:
                            System.out.println("To \n1)Kilometer \n2)Hectometer \n3)Decameter \n4)Meter \n5)Decimeter \n6)Centimeter \n7)Millimeter");                           
                            System.out.println("Enter your choice: ");
                            System.out.println("\n");
                            int t5 = sc.nextInt();
                            switch(t5)
                            {
                                case 1: s.e();
                                break;
                                case 2: s.d();
                                break;
                                case 3: s.c();
                                break;
                                case 4: s.b();
                                break;
                                case 5: s.a();
                                break;
                                case 6: s.m();
                                break;
                                case 7: s.g();
                                break;
                                default :
                                System.out.println("INVALID INPUT");
                                break;
                            }
                            break;
                            case 7:
                            System.out.println("To \n1)Kilometer \n2)Hectometer \n3)Decameter \n4)Meter \n5)Decimeter \n6)Centimeter \n7)Millimeter");                          
                            System.out.println("Enter your choice: ");
                            System.out.println("\n");
                            int t6 = sc.nextInt();
                            switch(t6)
                            {
                                case 1: s.f();
                                break;
                                case 2: s.e();
                                break;
                                case 3: s.d();
                                break;
                                case 4: s.c();
                                break;
                                case 5: s.b();
                                break;
                                case 6: s.a();
                                break;
                                case 7: s.m();
                                break;
                                default :
                                System.out.println("INVALID INPUT");
                                break;
                            }
                            break;
                            default :
                             System.out.println("INVALID INPUT");
                            break;
                        }
                        break;
                        case 2:
                        System.out.println("From \n1)Kilogram \n2)Hectogram \n3)Decagram \n4)Gram \n5)Decigram \n6)Centigram \n7)Milligram");
                        System.out.println("Enter your choice: ");
                        System.out.println("\n");
                        int f2 = sc.nextInt();
                    switch(f2)
                    {
                        case 1:
                        System.out.println("To \n1)Kilogram \n2)Hectogram \n3)Decagram \n4)Gram \n5)Decigram \n6)Centigram \n7)Milligram");                            
                            System.out.println("Enter your choice: ");
                            System.out.println("\n");
                            int t0 = sc.nextInt();
                            switch(t0)
                            {
                                case 1:
                                s.m();
                                break;
                                case 2:
                                s.g();
                                break;
                                case 3:
                                s.h();
                                break;
                                case 4:
                                s.i();
                                break;
                                case 5:
                                s.j();
                                break;
                                case 6:
                                s.k();
                                break;
                                case 7:
                                s.l();
                                break;
                                default :
                                System.out.println("INVALID INPUT");
                                break;
                            }
                            break;
                            case 2:
                            System.out.println("To \n1)Kilogram \n2)Hectogram \n3)Decagram \n4)Gram \n5)Decigram \n6)Centigram \n7)Milligram");                           
                            System.out.println("Enter your choice: ");
                            System.out.println("\n");
                            int t1 = sc.nextInt();
                            switch(t1)
                            {
                                case 1:
                                s.a();
                                break;
                                case 2:
                                s.m();
                                break;
                                case 3:
                                s.g();
                                break;
                                case 4:
                                s.h();
                                break;
                                case 5:
                                s.i();
                                break;
                                case 6:
                                s.j();
                                break;
                                case 7:
                                s.k();
                                break;
                                default :
                                System.out.println("INVALID INPUT");
                                break;
                            }
                            break;
                            case 3:
                            System.out.println("To \n1)Kilogram \n2)Hectogram \n3)Decagram \n4)Gram \n5)Decigram \n6)Centigram \n7)Milligram");                        
                            System.out.println("Enter your choice: ");
                            System.out.println("\n");
                            int t2 = sc.nextInt();
                            switch(t2)
                            {
                                case 1: s.b();
                                break;
                                case 2: s.a();
                                break;
                                case 3: s.m();
                                break;
                                case 4: s.g();
                                break;
                                case 5: s.h();
                                break;
                                case 6: s.i();
                                break;
                                case 7: s.j();
                                break;
                                default :
                                System.out.println("INVALID INPUT");
                                break;
                            }
                            break;
                            case 4:
                            System.out.println("To \n1)Kilogram \n2)Hectogram \n3)Decagram \n4)Gram \n5)Decigram \n6)Centigram \n7)Milligram");                            
                            System.out.println("Enter your choice: ");
                            System.out.println("\n");
                            int t3 = sc.nextInt();
                            switch(t3)
                            {
                                case 1: s.c();
                                break;
                                case 2: s.b();
                                break;
                                case 3: s.a();
                                break;
                                case 4: s.m();
                                break;
                                case 5: s.g();
                                break;
                                case 6: s.h();
                                break;
                                case 7: s.i();
                                break;
                                default :
                                System.out.println("INVALID INPUT");
                                break;
                            }
                            break;
                            case 5:
                            System.out.println("To \n1)Kilogram \n2)Hectogram \n3)Decagram \n4)Gram \n5)Decigram \n6)Centigram \n7)Milligram");                            
                            System.out.println("Enter your choice: ");
                            System.out.println("\n");
                            int t4 = sc.nextInt();
                            switch(t4)
                            {
                                case 1: s.d();
                                break;
                                case 2: s.c();
                                break;
                                case 3: s.b();
                                break;
                                case 4: s.a();
                                break;
                                case 5: s.m();
                                break;
                                case 6: s.g();
                                break;
                                case 7: s.h();
                                break;
                                default :
                                System.out.println("INVALID INPUT");
                                break;
                            }
                            break;
                            case 6:
                            System.out.println("To \n1)Kilogram \n2)Hectogram \n3)Decagram \n4)Gram \n5)Decigram \n6)Centigram \n7)Milligram");                           
                            System.out.println("Enter your choice: ");
                            System.out.println("\n");
                            int t5 = sc.nextInt();
                            switch(t5)
                            {
                                case 1: s.e();
                                break;
                                case 2: s.d();
                                break;
                                case 3: s.c();
                                break;
                                case 4: s.b();
                                break;
                                case 5: s.a();
                                break;
                                case 6: s.m();
                                break;
                                case 7: s.g();
                                break;
                                default :
                                System.out.println("INVALID INPUT");
                                break;
                            }
                            break;
                            case 7:
                            System.out.println("To \n1)Kilogram \n2)Hectogram \n3)Decagram \n4)Gram \n5)Decigram \n6)Centigram \n7)Milligram");                          
                            System.out.println("Enter your choice: ");
                            System.out.println("\n");
                            int t6 = sc.nextInt();
                            switch(t6)
                            {
                                case 1: s.f();
                                break;
                                case 2: s.e();
                                break;
                                case 3: s.d();
                                break;
                                case 4: s.c();
                                break;
                                case 5: s.b();
                                break;
                                case 6: s.a();
                                break;
                                case 7: s.m();
                                break;
                                default :
                                System.out.println("INVALID INPUT");
                                break;
                            }
                            break;
                            default :
                                System.out.println("INVALID INPUT");
                                break;
                        }
                    break;
                    case 3:
                    System.out.println("From \n1)Kilolitre \n2)Hectolitre \n3)Decalitre \n4)Litre \n5)Decilitre \n6)Centilitre \n7)Millilitre");
                    System.out.println("Enter your choice: ");
                    System.out.println("\n");
                    int f3 = sc.nextInt();
                    switch(f3)
                    {
                        case 1:
                        System.out.println("To \n1)Kilolitre \n2)Hectolitre \n3)Decalitre \n4)Litre \n5)Decilitre \n6)Centilitre \n7)Millilitre");                            
                            System.out.println("Enter your choice: ");
                            System.out.println("\n");
                            int t0 = sc.nextInt();
                            switch(t0)
                            {
                                case 1:
                                s.m();
                                break;
                                case 2:
                                s.g();
                                break;
                                case 3:
                                s.h();
                                break;
                                case 4:
                                s.i();
                                break;
                                case 5:
                                s.j();
                                break;
                                case 6:
                                s.k();
                                break;
                                case 7:
                                s.l();
                                break;
                                default :
                                System.out.println("INVALID INPUT");
                                break;
                            }
                            break;
                            case 2:
                            System.out.println("To \n1)Kilolitre \n2)Hectolitre \n3)Decalitre \n4)Litre \n5)Decilitre \n6)Centilitre \n7)Millilitre");                          
                            System.out.println("Enter your choice: ");
                            System.out.println("\n");
                            int t1 = sc.nextInt();
                            switch(t1)
                            {
                                case 1:
                                s.a();
                                break;
                                case 2:
                                s.m();
                                break;
                                case 3:
                                s.g();
                                break;
                                case 4:
                                s.h();
                                break;
                                case 5:
                                s.i();
                                break;
                                case 6:
                                s.j();
                                break;
                                case 7:
                                s.k();
                                break;
                                default :
                                System.out.println("INVALID INPUT");
                                break;
                            }
                            break;
                            case 3:
                            System.out.println("To \n1)Kilolitre \n2)Hectolitre \n3)Decalitre \n4)Litre \n5)Decilitre \n6)Centilitre \n7)Millilitre");                       
                            System.out.println("Enter your choice: ");
                            System.out.println("\n");
                            int t2 = sc.nextInt();
                            switch(t2)
                            {
                                case 1: s.b();
                                break;
                                case 2: s.a();
                                break;
                                case 3: s.m();
                                break;
                                case 4: s.g();
                                break;
                                case 5: s.h();
                                break;
                                case 6: s.i();
                                break;
                                case 7: s.j();
                                break;
                                default :
                                System.out.println("INVALID INPUT");
                                break;
                            }
                            break;
                            case 4:
                            System.out.println("To \n1)Kilolitre \n2)Hectolitre \n3)Decalitre \n4)Litre \n5)Decilitre \n6)Centilitre \n7)Millilitre");                           
                            System.out.println("Enter your choice: ");
                            System.out.println("\n");
                            int t3 = sc.nextInt();
                            switch(t3)
                            {
                                case 1: s.c();
                                break;
                                case 2: s.b();
                                break;
                                case 3: s.a();
                                break;
                                case 4: s.m();
                                break;
                                case 5: s.g();
                                break;
                                case 6: s.h();
                                break;
                                case 7: s.i();
                                break;
                                default :
                                System.out.println("INVALID INPUT");
                                break;
                            }
                            break;
                            case 5:
                            System.out.println("To \n1)Kilolitre \n2)Hectolitre \n3)Decalitre \n4)Litre \n5)Decilitre \n6)Centilitre \n7)Millilitre");                            
                            System.out.println("Enter your choice: ");
                            System.out.println("\n");
                            int t4 = sc.nextInt();
                            switch(t4)
                            {
                                case 1: s.d();
                                break;
                                case 2: s.c();
                                break;
                                case 3: s.b();
                                break;
                                case 4: s.a();
                                break;
                                case 5: s.m();
                                break;
                                case 6: s.g();
                                break;
                                case 7: s.h();
                                break;
                                default :
                                System.out.println("INVALID INPUT");
                                break;
                            }
                            break;
                            case 6:
                            System.out.println("To \n1)Kilolitre \n2)Hectolitre \n3)Decalitre \n4)Litre \n5)Decilitre \n6)Centilitre \n7)Millilitre");                          
                            System.out.println("Enter your choice: ");
                            System.out.println("\n");
                            int t5 = sc.nextInt();
                            switch(t5)
                            {
                                case 1: s.e();
                                break;
                                case 2: s.d();
                                break;
                                case 3: s.c();
                                break;
                                case 4: s.b();
                                break;
                                case 5: s.a();
                                break;
                                case 6: s.m();
                                break;
                                case 7: s.g();
                                break;
                                default :
                                System.out.println("INVALID INPUT");
                                break;
                            }
                            break;
                            case 7:
                            System.out.println("To \n1)Kilolitre \n2)Hectolitre \n3)Decalitre \n4)Litre \n5)Decilitre \n6)Centilitre \n7)Millilitre");                          
                            System.out.println("Enter your choice: ");
                            System.out.println("\n");
                            int t6 = sc.nextInt();
                            switch(t6)
                            {
                                case 1: s.f();
                                break;
                                case 2: s.e();
                                break;
                                case 3: s.d();
                                break;
                                case 4: s.c();
                                break;
                                case 5: s.b();
                                break;
                                case 6: s.a();
                                break;
                                case 7: s.m();
                                break;
                                default :
                                System.out.println("INVALID INPUT");
                                break;
                            }
                            break;
                            default :
                                System.out.println("INVALID INPUT");
                                break;
                        }
                    break;
                    default :
                    System.out.println("INVALID INPUT");
                    break;
                }
                break;
                default :
                System.out.println("INVALID INPUT");
                break;
            }
            System.out.println("\n");
            System.out.println("\n Do You Want To EXIT? \n 1)YES \n 2)NO\n");
            System.out.println("Enter Your choice: ");
            System.out.println("\n");
            x = sc.nextInt();
        }
        while(x==2);
        sc.close();
    }
}