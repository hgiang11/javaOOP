package Point;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


                Scanner sc = new Scanner(System.in) ;

                int choice ;
                do {
                    System.out.println("1.Point2D");
                    System.out.println("2.Point3D");
                    System.out.println("0. Thoát");
                    System.out.print("Vui lòng chọn: ");
                    choice = sc.nextInt();

                    switch (choice){
                        case 1:
                            System.out.println("Point2D");
                            System.out.println("Nhập x : ");
                            float x = sc.nextFloat();
                            System.out.println("Nhập y : ");
                            float y = sc.nextFloat();
                            Point2D point2D = new Point2D(x,y);
                            System.out.println(point2D);
                            break;

                        case 2:
                            System.out.println("Point3D");
                            System.out.println("Nhập x : ");
                            float xPoint3D = sc.nextFloat();
                            System.out.println("Nhập y : ");
                            float yPoint3D = sc.nextFloat();
                            System.out.println("Nhập z : ");
                            float z = sc.nextFloat();
                            Point3D point3D = new Point3D(xPoint3D, yPoint3D, z);
                            System.out.println(point3D);
                            break;


                        case 0:
                            System.out.println("Thoát !");
                            break;
                        default:
                            System.out.println("Nhập sai!");
                    }
                } while ( choice != 0 );










            }
        }



