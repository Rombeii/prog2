import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;



public class Homokozo{
	
	public static LZWBinFa binFa = new LZWBinFa();
	
	
    static void usage(){
        System.out.println("Usage: java Homokozo in_file out_file");
    }


    public static void main(String[] args) throws Exception{
        if(args.length != 2){
            usage();
            System.exit(-1);
        }
        
        File beFile = new File(args[0]); 
        File kiFile = new File(args[1]);
        
        int b;
        char c;
        //LZWBinFa binFa = new LZWBinFa();
        boolean kommentben = false;
        
        BufferedReader bufferedReader = new BufferedReader(new FileReader(beFile));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(kiFile));


        while((b = bufferedReader.read()) != -1){

        	c = (char)b;
        	//System.out.println(c);
        	
            if(c == '>'){
                kommentben = true;
                continue;
            }
                
            if(c == '\n'){
                kommentben = false;
                continue;
            }

            if(kommentben)
                continue;
            
            if(c == 'N')
                continue;

            for (int i = 0; i < 8; i++){
            	//System.out.println(c);
                if ((c & 0x80) == 0x80) {
                    binFa.insert('1');
                    System.out.print('1');
                }
                else {
                    binFa.insert('0');
                	System.out.print('0');
                }
                c <<= 1;
            }
                
                
        }
        
        bufferedReader.close();
        
        
        System.out.println();
        binFa.kiir(binFa.getGyoker(), bufferedWriter);
        System.out.println("depth = " + binFa.getMelyseg());
        System.out.println("mean = " + binFa.getAtlag());
        System.out.println("var = " + binFa.getSzoras());
        bufferedWriter.write("depth = " + binFa.getMelyseg());
        bufferedWriter.write("\nmean = " + binFa.getAtlag());
        bufferedWriter.write("\nvar = " + binFa.getSzoras());
        bufferedWriter.close();
    }
}