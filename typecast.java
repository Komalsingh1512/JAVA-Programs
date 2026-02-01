public class typecast {
    public static void main (String[] args){
        System.out.println("Performing Typecasting:");
        int myInt = 9;
        int myInt2 = 10;
        String name = String.valueOf(myInt2);
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println(myInt);   
        System.out.println(myDouble); 
        System.out.println(name);
    }
}
