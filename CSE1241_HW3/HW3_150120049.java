/** I wrote a program that draws the coordinate system and some geometric shapes on the console screen ,such as Line,Rectangle,Triangle,Parabola,Circle,
 * according to user's choice.*/

import java.util.Scanner;

public class HW3_150120049 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Which shape would you like to draw? \n1. Line \n2. Triangle \n3. Rectangle \n4. Parabola \n5. Circle \n6. Exit" );
		int shape = input.nextInt();
		//System.out.println();

		// I used switch case option and opened new method for each different drawing. Because of readability, I choice to opened new method.
		switch (shape) {
		
		//I asked the coefficients, a and b, of the line , and I left a empty row.
		case 1:
			 System.out.print("Line formula is y = ax + b \nPlease Enter the coefficients a and b:");
			 int a= input.nextInt();
			 int b = input.nextInt();
			 System.out.println();
			 DrawTheLineGraph(a,b);
			 break;
			
		//I asked three vertices point of the rectangle ((a,b), (c, d), (e,f)), and I left a empty row.
		case 2:
			System.out.println("For triangle, we need the coordinates of the points for three vertices." +
					"\nPlease enter the coordinates of 3 vertices a, b, c, d, e, f:");
			a = input.nextInt();
			b = input.nextInt();
			int c = input.nextInt();
			int d = input.nextInt();
			int e = input.nextInt();
			int f = input.nextInt();
			System.out.println();
			DrawTheTriangleGraph(a,b,c,d,e,f);
			break;
			
		//I asked three vertices point of the rectangle ((a,b), (c, d), (e,f)), and I calculate the fourth vertices.
		case 3:
            System.out.println("For rectangle, we need the coordinates of the points for three vertices." +
					"\nPlease enter the coordinates of 3 vertices a, b, c, d, e, f:");
            a = input.nextInt();
            b = input.nextInt();
            c = input.nextInt();
            d = input.nextInt();
            e = input.nextInt();
            f = input.nextInt();
            int g = c+e-a; //I calculate the fourth vertices according to formula, the sum of x and y of opposite points vertices is equal the the the other the sum of x and y of opposite points.
            int h = d+f-b;
            System.out.println();
            DrawTheRectangle (a,b,c,d,e,f,g,h);
            break;
            
          //I asked the coefficients, a,b and c, of the parabola , and I left a empty row.  
		case 4: 
			System.out.println("Parabola formula is y = ax^2 + bx + c \nPlease enter the coefficients a, b and c:");
			a = input.nextInt();
			b = input.nextInt();
			c = input.nextInt();
			System.out.println();
			DrawTheParabola (a,b,c);
			break;
			
		//I asked the points of the center point and radius of circle, a,b and radius, of the parabola , and I left a empty row.
		case 5:
			System.out.println ("Circle formula is (x-a)^2 + (y-b)^2 = r^2");
			System.out.print("Please enter the coordinates of the center (a,b) and the radius:");
			a =  input.nextInt();
			b =  input.nextInt();
			int radius =  input.nextInt();
			DrawTheCircle (a,b,radius);
			break;
		//If user press "6" number, the program is ended.	
		case 6:
			break;
		}
	}
	/**I bounded x and y points according to task sheet. I controlled if value of x, y is provide below formulas.The structure of if-else order is "*","y", "|", "empty" respectively,
	if y does not equal 0. The structure of if-else order is "*", "x", "-", "empty" respectively, if y equals 0*/
	public static void DrawTheLineGraph (int a, int b) {
		
		 for(int y = 12 ; y > -13 ; y--) {
		//I found instant value of x and y from y = ax + b, and I multiply the up section with 1.0 to give double division.
			for(int x = -12 ; x < 13 ; x++) { 	
				double valueOfY = a*x + b;
				if (y!=0) {
					if (y == valueOfY) {
						System.out.print("*");
					}
					else if (x==0) { 
						if (y == 12)
							System.out.print("y");
						else
							System.out.print("|");
					}
					else {
						System.out.print(" "); 
					}
				}
				else {
					if(y == valueOfY)
						 System.out.print("*");
					else if (x == 12)
						 System.out.print("x");
				    else if (x == 0)
						 System.out.print("|");
				    else
						 System.out.print("-");
			    }
			}
			System.out.println();
		 }
	}
	/**I bounded x and y points according to task sheet thanks to method of Math.max and Math.min. I controlled if value of x and y is provide below formulas. The order of if-else structure
	is "*","y", "|", "empty" respectively, if y does not equal 0. The structure of if-else order is "*", "y", "-", "empty" respectively, if y equals 0*/
	public static void DrawTheTriangleGraph(int a, int b, int c, int d, int e, int f ) {
		int x1Max = Math.max(a,c);
		int x1Min = Math.min(a,c);
		
		int y1Max = Math.max(b,d);
		int y1Min = Math.min(b,d);
		
		int x2Max = Math.max(c,e);
		int x2Min = Math.min(c,e);
		
		int y2Max = Math.max(d,f);
		int y2Min = Math.min(d,f);
		
		int x3Max = Math.max(e,a);
		int x3Min = Math.min(e,a);
		
		int y3Max = Math.max(f,b);
		int y3Min = Math.min(f,b); 
		
		for (int y= 12; y>-13;y--) {
			//I found instant value of x and y in the Line1, Line2, Line3 from the equation whose two points are known, and I multiply the up section with 1.0 to give double division.
			double valueOfX1 = (y-b)*(c-a)*1.0 / (d-b) + a;
			double valueOfX2 = (y-d)*(e-c)*1.0 / (f-d) + c;
			double valueOfX3 = (y-b)*(e-a)*1.0 / (f-b) + a;

			for (int x = -12; x <13; x++) {
				double valueOfY1 = (x-a)*(d-b)*1.0 / (c-a) + b;
				double valueOfY2 = (x-c)*(f-d)*1.0 / (e-c) + d; 
				double valueOfY3 = (x-a)*(f-b)*1.0 / (e-a) + b;
				
				if (y!= 0) {
			
					if ((x1Min <= x && x<= x1Max) && (y1Min <= y && y<= y1Max) && ((x == valueOfX1)||(y == valueOfY1))) {
						System.out.print("*");
					}
					else if((x2Min <= x && x<= x2Max) && (y2Min <= y && y<= y2Max) && ((x == valueOfX2)||(y == valueOfY2))){
						System.out.print("*");
					}
					else if ((x3Min <= x && x<= x3Max) && (y3Min <= y && y<= y3Max) && ((x == valueOfX3)||(y == valueOfY3))) {
						System.out.print("*"); 
					}
					else if (y == 12 && x == 0) {
						System.out.print("y");
					} 
					else if (x == 0) {
						System.out.print("|");
					}
					else {
						System.out.print(" ");
					}
				}
				else {
					if ((x1Min <= x && x<= x1Max) && (y1Min <= y && y<= y1Max) && ((x == valueOfX1)||(y == valueOfY1))) {
						System.out.print("*");
					}
					else if((x2Min <= x && x<= x2Max) && (y2Min <= y && y<= y2Max) && ((x == valueOfX2)||(y == valueOfY2))){
						System.out.print("*");
					}
					else if ((x3Min <= x && x<= x3Max) && (y3Min <= y && y<= y3Max) && ((x == valueOfX3)||(y == valueOfY3))) {
						System.out.print("*"); 
					}
					else if (x==12) {
						System.out.print("x");							}
					else if (x == 0) 
						System.out.print("|");
					else {
						System.out.print("-");
						}
					}	
			}
			System.out.println();
		}
	}
	/**I bounded x and y points according to task sheet thanks to method of Math.max and Math.min.Firstly, I controlled if it is rectangle by controlling equality of hypotenuses.
	I controlled if value of x and y is provide below formulas. The structure of if-else order is "*","y", "|", "empty" respectively, if y does not equal 0.
	The structure of if-else order is "*", "x", "-", "empty" respectively, if y equals 0*/
	public static void DrawTheRectangle (int a, int b, int c, int d, int e, int f, int g, int h) {
		
        if (-(c-a)*(g-c) == (d-b)*(h-d) && (h-d)*(h-f) == -(g-c)*(g-e) &&(h-f)*(b-f) == -(a-e)*(g-e) && (d-b)*(b-f) == -(a-e)*(c-a)) {

        	int xMax = Math.max(a, Math.max(g,Math.max(c, e)));
        	int xMin = Math.min(a, Math.min(g,Math.min(c, e)));

        	int yMax = Math.max(b, Math.max(h,Math.max(d, f)));
        	int yMin = Math.min(b, Math.min(h,Math.min(d, f)));

        	for (int y = 12; y > -13; y--) {
        		//I found instant value of x and y in the Line1, Line2, Line3, Line3 from the equation whose two points are known, and I multiply the up section with 1.0 to give double division.
        		double valueOfX1 = (y - b) * (c - a) * 1.0 / (d - b) + a;
        		double valueOfX2 = (y - d) * (g - c) * 1.0 / (h - d) + c;
        		double valueOfX3 = (y - f) * (g - e) * 1.0 / (h - f) + e;
        		double valueOfX4 = (y - b) * (e - a) * 1.0 / (f - b) + a;

        		for (int x = -12; x < 13; x++) {
        			double valueOfY1 = (x - a) * (d - b) * 1.0 / (c - a) + b;
        			double valueOfY2 = (x - c) * (h - d) * 1.0 / (g - c) + d;
        			double valueOfY3 = (x - e) * (h - f) * 1.0 / (g - e) + f;
        			double valueOfY4 = (x - a) * (f - b) * 1.0 / (e - a) + b;

        			if (y != 0) {
        				if (xMin <= x && x <= xMax && yMin <= y && y <= yMax) {
        					if (x==valueOfX1 || x==valueOfX2 || x==valueOfX3 || x==valueOfX4 || y==valueOfY1 || y==valueOfY2 || y==valueOfY3 ||y==valueOfY4) {
        						System.out.print("*");
        					}
        					else if (y == 12 && x == 0) {
            					System.out.print("y");
            				}
        					else if (x == 0) {
        						System.out.print("|");
        					}
        					else {
        						System.out.print(" ");
        					}
        				}
        				else if (y == 12 && x == 0) {
        					System.out.print("y");
        				}
        				else if (x == 0) {
        					System.out.print("|");
        				}
        				else {
        					System.out.print(" ");
        				}
        			}
        			else {
        				if (xMin <= x && x <= xMax && yMin <= y && y <= yMax) {
        					if (x==valueOfX1 || x==valueOfX2 || x==valueOfX3 || x==valueOfX4 || y==valueOfY1 || y==valueOfY2 || y==valueOfY3 ||y==valueOfY4) {
        						System.out.print("*");
        					}
        					else if (x == 12) {
            					System.out.print("x");
            				}
        					else if (x == 0) {
        						System.out.print("|");
        					}
        					else {
                            System.out.print("-");
        					}
        				}
        				else if (x == 0) {
        					System.out.print("|");
        				}
        				else if (x == 12) {
        					System.out.print("x");
        				}
        				else{
        					System.out.print("-");
        				}
        			}
        		}
        		System.out.println();
        	}
        }
        else {
        	System.out.println("These points can't compose a rectangle");
        }
	}
	/**I bounded x and y points according to task sheet. I controlled if value of x is provide below formulas.The structure of if-else order is "*","y", "|", "empty" respectively,
	if y does not equal 0. The structure of if-else order is "*", "x", "-", "empty" respectively, if y equals 0*/
	
	public static void DrawTheParabola (int a, int b, int c) {
		for (int y= 12; y>-13;y--) {
			//I found value of x values from y =ax^2 + b*x +c,and I multiply the up section with 1.0 to give double division.
			double valueOfX1 = (-b+(Math.sqrt((Math.pow(b,2)-4*a *(c-y))))*1.0)/(2*a);
			double valueOfX2 = (-b-(Math.sqrt((Math.pow(b,2)-4*a*(c-y))))*1.0)/(2*a);
			for (int x = -12; x <13; x++) {
				if (y!= 0) {
					if (x == valueOfX1 || x == valueOfX2) {
						System.out.print("*");
					}
					else if (y==12 && x ==0) {
						System.out.print("y");
					}
					else if (x == 0) {
						System.out.print("|");
					}
					else {
						System.out.print(" ");
					}
				}
				else {
					if (x == valueOfX1 || x == valueOfX2) {
						System.out.print("*");
					}
					else if (x==12) {
						System.out.print("x");
					}
					else if (x == 0) {
						System.out.print("|");
					}
					else {
						System.out.print("-");
					}
					
				}
			}
			System.out.println();
		}
	}
	/**I bounded x and y points according to task sheet. I controlled if value of x is provide below formulas.The structure of if-else order is "*","y", "|", "empty" respectively,
	if y does not equal 0. The structure of if-else order is "*", "x", "-", "empty" respectively, if y equals 0*/
	public static void DrawTheCircle(int a, int b, int radius) {
		for (int y = 12; y>-13; y--) {
			//I found value of x values from (x-a)^2+(y-a)^2 = r^2 ,and I multiply the up section with 1.0 to give double division.
			double valueOfX1 = a + Math.sqrt(Math.pow(radius, 2) - Math.pow((y-b), 2));
			double valueOfX2 = a - Math.sqrt(Math.pow(radius, 2) - Math.pow((y-b), 2));
			for (int x = -12; x < 13; x++) {
				if (y!= 0) {
					if (x == valueOfX1 || x == valueOfX2) {
						System.out.print("*");
					}
					else if (y==12 && x == 0) {
						System.out.print("y");
					}
					else if (x == 0) {
						System.out.print("|");
					}
					else {
						System.out.print(" ");
					}
				}
				else {
					if (x == valueOfX1 || x == valueOfX2) {
						System.out.print("*");
					}
					else if (x ==12) {
						System.out.print("x");
					}
					else if (x == 0) {
						System.out.print("|");
					}
					else {
						System.out.print("-");
					}
				}
			}
			System.out.println();
	}
	
	} 
}