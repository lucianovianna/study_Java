import java.io.*;

public class CopiadorDeArquivos {
    public static void PorBytes() {
        String filename = "Arquivo.txt";
        String newFilename = "ArquivoCopiadoPorBytes.txt";

        try {
            File inputfile = new File(filename);
            File outputfile = new File(newFilename);

            FileInputStream in = new FileInputStream(inputfile);
            FileOutputStream out = new FileOutputStream(outputfile);

            int c;
            while ( (c = in.read()) != -1) {
                System.out.print(c);
                out.write(c);
            }

            in.close();
            out.close();
        } catch (IOException ex) {
            System.out.println( "Unable to open file '" + 
            filename + "' or to write on the new file."); 
        }
    }

    public static void PorLinha() {
        String filename = "Arquivo.txt";
        String newFilename = "ArquivoCopiadoPorLinha.txt";

        try {
            FileReader inputfile = new FileReader(filename);
            FileWriter outputfile = new FileWriter(newFilename);

            BufferedReader in = new BufferedReader(inputfile);
            PrintWriter out = new PrintWriter(outputfile);

            String s;
            while ((s = in.readLine()) != null) {
                System.out.println(s);
                out.println(s);
                out.flush();
            }

            in.close();
            out.close();
        } catch (IOException ex) {
            System.out.println( "Unable to open file '" + 
            filename + "' or to write on the new file."); 
        }
    }
}

