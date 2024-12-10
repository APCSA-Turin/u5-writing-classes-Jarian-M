public class Main7 {
    public static void main(String[] args) {
        System.out.println("Let's make some rent cars!");
        Cars car1 = new Cars("Impulse");
        Cars car2 = new Cars("Flash");
        Cars car3 = new Cars("Zoom");
        Cars car4 = new Cars("Savitar");
        Cars car5 = new Cars("Reverse Flash");  
        System.out.println("Number of cars made: " + Cars.getCars());  
        System.out.println("Let's print what the names of each car are!");
        System.out.println("Car 1: " + car1.getName());
        System.out.println("Car 2: " + car2.getName());
        System.out.println("Car 3: " + car3.getName());
        System.out.println("Car 4: " + car4.getName());
        System.out.println("Car 5: " + car5.getName());   
        System.out.println("Let's track the mileage of each car, as well as which drove the farthest!"); 
        car1.drive(50);
        System.out.println("Car 1 miles: " + car1.getMiles());  
        System.out.println("Car 1 longest distance driven: " + car1.getCarLongest());     
        System.out.println("Longest distance driven by any car: " + Cars.getLongest());  

        car2.drive(30);
        System.out.println("Car 2 miles: " + car2.getMiles());  
        System.out.println("Car 2 longest distance driven: " + car2.getCarLongest());     
        System.out.println("Longest distance driven by any car: " + Cars.getLongest());

        car3.drive(70);
        System.out.println("Car 3 miles: " + car3.getMiles());  
        System.out.println("Car 3 longest distance driven: " + car3.getCarLongest());     
        System.out.println("Longest distance driven by any car: " + Cars.getLongest());

        car4.drive(500);
        System.out.println("Car 4 miles: " + car4.getMiles());  
        System.out.println("Car 4 longest distance driven: " + car4.getCarLongest());     
        System.out.println("Longest distance driven by any car: " + Cars.getLongest());

        car5.drive(60);
        System.out.println("Car 5 miles: " + car5.getMiles());  
        System.out.println("Car 5 longest distance driven: " + car5.getCarLongest());     
        System.out.println("Longest distance driven by any car: " + Cars.getLongest());   

        System.out.println("Let's make sure we can track the longest distances driven by each car! Let's try driving a longer or shorter distance than the car drove originally!");
        car4.drive(10);
        System.out.println("Car 4 miles: " + car4.getMiles());  
        System.out.println("Car 4 longest distance driven: " + car4.getCarLongest());     
        System.out.println("Longest distance driven by any car: " + Cars.getLongest());  

        car1.drive(5000);
        System.out.println("Car 1 miles: " + car1.getMiles());  
        System.out.println("Car 1 longest distance driven: " + car1.getCarLongest());     
        System.out.println("Longest distance driven by any car: " + Cars.getLongest());     
        System.out.println("Let's track the total distance driven by all the cars in total!");
        System.out.println("Total distance driven: " + Cars.getTotal());
        System.out.println("Let's add another car into the mix! This time, one that has to travel very large distances!");
        Cars car6 = new Cars("Quick Silver");
        System.out.println("How many cars do we have in total now? Let's check!");
        System.out.println("Number of cars made: " + Cars.getCars());
        System.out.println("Let's track the name of this new long distance roadster!");
        System.out.println("Car 6: " + car6.getName());
        System.out.println("Let's take this long distance car for a ride shall we!");
        car6.drive(10000);
        System.out.println("Car 6 miles: " + car6.getMiles());  
        System.out.println("Car 6 longest distance driven: " + car6.getCarLongest());     
        System.out.println("Longest distance driven by any car: " + Cars.getLongest());
        System.out.println("Let's track the total distance driven by all the cars in total one more time!");
        System.out.println("Total distance driven: " + Cars.getTotal());
    }        
}