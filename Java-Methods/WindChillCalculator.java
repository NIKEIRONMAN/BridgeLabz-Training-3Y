import java.util.*;
public class WindChillCalculator {
    public double calculateWindChill(double temperature,double windSpeed){
        return 35.74 + 0.6215*temperature + (0.4275*temperature - 35.75)*Math.pow(windSpeed,0.16);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double t=sc.nextDouble(), v=sc.nextDouble();
        System.out.printf("Wind chill = %.2f%n", new WindChillCalculator().calculateWindChill(t,v));
    }
}
