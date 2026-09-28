
class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
/*  
    Challenge 1:
    1) Create the variables, ask the user for the variable values, write the equation in file EQ1-act6 and display the equation value.
*/
    System.out.println ("Enter x");    
    int x1 = Input.readInt ();

    int ex = 7;
    double y1 = Math.pow(x1,ex);
    System.out.println("y is "+ y1);

/*  
    Challenge 2:
    1) Create the variables, ask the user for the variable values, write the equation in fileEQ1.1-act6 and display the equation value.
*/
    System.out.println ("Enter z"); 
    int z1 = Input.readInt ();

    int ex2 = 3;
    int numb1 = 5;
    double q = Math.pow(z1,ex2)+ numb1;
    System.out.println("q is "+ q);

/*  
    Challenge 3:
    Create the variables, ask the user for the variable values, write the equation in file EQ2-act6 and display the equation value..
    
*/
    System.out.println ("Enter t"); 
    int t1 = Input.readInt();

    int ex3 = 5;
    int numb2 = 2;

    System.out.println ("Enter r"); 
    int r1 = Input.readInt();

    int ex4 = 4;
    double s = Math.pow(t1,ex3)*Math.pow(r1 + numb2, ex4);
    System.out.println("s is "+ s);

 

/*  
    Challenge 4:
    Create the variables, ask the user for the variable values, write the equation in file EQ3-act6 and display the equation value..
    
*/
    System.out.println ("Enter a"); 
    int a1 = Input.readInt();

    System.out.println ("Enter b"); 
    int b1= Input.readInt();

    double c = Math.sqrt (a1 + b1);
    System.out.println("c is "+ c);


/*  
    Challenge 5:
    Create the variables, ask the user for the variable values, write the equation in file EQ4-act6 and display the equation value..
    
*/

    int x2
    int y2
    int x3
    int y3




/*  
    Challenge 6:
    Create the variables, ask the user for the variable values, write the equation g=sin(deg) and display the equation value..
    
*/





/*  
    Challenge 7:
    Create the variables, ask the user for the variable values, write the equation in file EQ5-act6 and display the equation value.
    
*/




/*  
    *** Bonus Challenge ***:
    Create the variables, ask the user for the variable values, write the equation in file Ch-act6 and display the equation value.

    HINT: What does the "plus minus: after "-b" mean.
*/





    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}