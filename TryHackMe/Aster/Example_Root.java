import java.io.IOException;
import java.io.FileWriter;
import java.io.File;

// 
// Decompiled by Procyon v0.5.36
// 

public class Example_Root
{
    public static boolean isFileExists(final File file) {
        return file.isFile();
    }
    
    public static void main(final String[] array) {
        final File file = new File("/tmp/flag.dat");
        try {
            if (isFileExists(file)) {
                final FileWriter fileWriter = new FileWriter("/home/harry/root.txt");
                fileWriter.write("my secret <3 baby");
                fileWriter.close();
                System.out.println("Successfully wrote to the file.");
            }
        }
        catch (IOException ex) {
            System.out.println("An error occurred.");
            ex.printStackTrace();
        }
    }
}
