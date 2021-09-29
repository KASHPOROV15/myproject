import java.util.Scanner;

public class begin {
    static class pr{
        void vz(int met, soldier[] s){

            Scanner sc = new Scanner(System.in);
            if(met==0){
                System.out.println(" Select  : \n" +
                        "1.Info \n" +
                        "2.Up sal \n" +
                        "Enter number: \n");
                met = sc.nextInt();
                if (met == 1 || met == 2) {
                    int a = 0;
                } else {
                    System.out.println(" Error, try again");
                    met = sc.nextInt();
                }
            }
            switch (met) {
                case 1:

                    for (int i = 0; i < 3; i++) {
                        System.out.print("Information about employees. " + (i + 1) + " man: \n");
                        System.out.print("Name: " + s[i].getName() + "\n");
                        System.out.print("Salary: " + s[i].getSalary() + "\n");
                        System.out.print("Date of Birth: " + s[i].getDate() + "\n");
                        System.out.print("------------------------------" + "\n");
                    }
                    System.out.print(" Would you like to continue" + "\n" +
                            "1.Yes. \n" +
                            "2.No \n");
                    int z= sc.nextInt();
                    if(z==2) {
                        break;
                    } else {
                        pr b=new pr();
                        b.vz(0,s);
                    }
                    break;
                case 2:
                    System.out.println("Up procente salary: ");
                    int k = sc.nextInt();
                    System.out.print("Salary with Up. \n");
                    for (int i = 0; i < 3; i++) {
                        System.out.print((i + 1) + " people: " + s[i].salary_up(k, s[i].getSalary()) + ".|  " + "\n");
                    }
                    System.out.print("------------------------------" + "\n");
                    System.out.print(" Would you like to continue" + "\n" +
                            "1.Yes. \n" +
                            "2.No \n");
                    int d= sc.nextInt();
                    if(d==2) {
                        break;
                    } else {
                        pr b=new pr();
                        b.vz(0, s);
                    }
                    break;
                default:
                    System.out.println("Error!");
                    break;
            }
        }
    }

    public static void main(String[] args) {

        soldier s[] = new soldier[3];
        for (int i = 0; i < 2; i++) {
            s[i] = new soldier();
        }
        s[0].setName("Ivanov");
        s[0].setSalary(50);
        s[0].setDate("15.04.1999");
        s[1].setName("Petkevich");
        s[1].setSalary(100);
        s[1].setDate("25.08.1997");
        s[2] = new member();
        s[2].setName("Davydov");
        s[2].setDate("29.03.1975");
        s[2].setSalary(120);
        Scanner sc = new Scanner(System.in);
        System.out.println(" Select  : \n" +
                "1.Info \n" +
                "2.Up sal \n" +
                "Enter number: \n");
        int met = sc.nextInt();
        if (met == 1 || met == 2) {
            int a = 0;
        } else {
            System.out.println(" Error, try again");
            met = sc.nextInt();
        }
        pr b=new pr();
        b.vz(met,s);

    }
}


