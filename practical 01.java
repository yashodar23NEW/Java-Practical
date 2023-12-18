01. 
        package com.mycompany.mavenproject2;


        public class Mavenproject2 {

        public static void main(String[] args) {
        System.out.println("Hello World!");
       }
    }

02. 

   package com.mycompany.mavenproject2;


   public class Mavenproject2 {

        public static void main(String[] args) {
        System.out.println("B.H.R Yashodara");
        System.out.println("BSc(Hons) Software Engineering");
    }
}


3. Using for loop

package com.mycompany.mavenproject2;
public class Mavenproject2 {
public static void main(String[] args) {
         for(int i=0;i<5;i++)
        {  System.out.println("Executing Loop"+i);
          }
       }
   }
 Using While



package com.mycompany.mavenproject2;


public class Mavenproject2 {

    public static void main(String[] args) {
        int i=0;
        while (i<5)
        {
            System.out.println("Executing Loop "+i);
            i++;
        }
    }
}

04. Result: 
10
20
I’m out of the Loop now.

Using continue instead of break,
10
20
40
50

05. Result:
Excellent!
Your grade is A

Removing the break in line number 6;
Excellent!
You passed
Your grade is A

*using if,else if

 package com.mycompany.mavenproject2;


public class Mavenproject2 {

    public static void main(String[] args) {
        char grade = 'A';

        if (grade == 'A') {
            System.out.println("Excellent!");
        } else if (grade == 'D') {
            System.out.println("You passed");
        } else if (grade == 'F') {
            System.out.println("Better try again");
        } else {
            System.out.println("Invalid grade");
        }

        System.out.println("Your grade is " + grade);
    }
}

06. 

package com.mycompany.mavenproject2;


public class Mavenproject2 {

    public static void main(String[] args) {
        int [] numbers = {10, 20, 30, 40, 50};

for(int x : numbers ){

System.out.print( x );

System.out.println(",");

}

System.out.print("\n");

String [] names ={"James", "Larry", "Tom", "Lacy"};

for( String name : names ) {

System.out.println(" name is "+name );
System.out.print(",");
}
    }
}

Result:
10,
20,
30,
40,
50,

 name is James
 name is Larry
 name is Tom
 name is Lacy


