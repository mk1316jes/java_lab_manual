import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class fifth {
    public static void main(String[] args) throws IOException 
    {
        
        
       String upperCase ;
        String fileToConvert;
        
        
        //Creats Scanner Object for keyboard input
        
        Scanner keyboard = new Scanner (System.in);

        // get 1st file name

        System.out.print(" Enter the Filename : ");
        String filename1 =keyboard.nextLine();
        
         // get 2nd file name
         System.out.print(" Enter the Filename : ");
         String filename2 =keyboard.nextLine();
        
         // Make sure File does not exist
         
         File file2 =new File (filename2);
         if (file2.exists())
         { System.out.println( " The file " + filename2 + " already exist. ");
         System.exit(0);
         }
         

        // open file
        File file = new File (filename1 );
        Scanner inputFile = new Scanner (file);
        PrintWriter outputFile = new PrintWriter(filename2);
        
           fileToConvert =inputFile.nextLine();
           upperCase =fileToConvert.toUpperCase();
         
          
       
         
         while (inputFile.hasNext())
        {
            // Read the next line.
            fileToConvert =inputFile.nextLine();
            //Convert to upper case
            upperCase =fileToConvert.toUpperCase();
            //Outputs to file
            outputFile.println(upperCase); 
           
            // Code used to test the output
             System.out.println(upperCase);
        }
          // Closes input and output file
             inputFile.close();
             outputFile.close(); 
             
    }
}
           