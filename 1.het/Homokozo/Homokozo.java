import java.io.File; 
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Homokozo{
    static void usage(){
        System.out.println("Usage: java Homokozo in_file out_file");
    }

    public static void main(String[] args) throws FileNotFoundException{
        if(args.length != 2){
            usage();
            System.exit(-1);
        }
        
        File file = new File(args[0]); 
        
        Scanner sc = new Scanner(file); 
        
         while (sc.hasNextLine()) 
            System.out.println(sc.nextLine()); 
        
        sc.close();
        

    
    }
}