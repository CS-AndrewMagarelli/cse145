// Andrew Magarelli
package ball;
import java.util.Scanner;

public class BallVelocity {
  public static final double A = 9.8;
  public static void main(String[] args){ 
	
    Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Finding a ball's final velocity and distance traveled");
	
	//double initial speed(12 m/s)
	System.out.println("Enter the initial velocity of the ball (in meters per second) at point A:");
	//asks user to input the initial velocity and assigns it to u
	double u = keyboard.nextDouble();
	
	//System.out.println(u);
	
	System.out.println("Enter the amount of time it took the ball (in seconds) to reach point B:");
	//asks user to input the time traveled and assigns it to t
	double t = keyboard.nextDouble();
	
	
	
	
	//set v as the velocity and input the equation to find v
	double v = u + A * t;
	System.out.println("The final velocity of the ball = " + v + " m/s ");
	
	//set s as the distance and input the equation to find the distance traveled
	double s = u * t + 0.5 * A * Math.pow(t, 2);
	System.out.println("The distance the ball traveled = " + s + " m ");
  }
}
