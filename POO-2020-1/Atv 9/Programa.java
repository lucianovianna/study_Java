public class Programa {
    public static void main(String[] args) 
    {
        System.out.println("ARQUIVO LIDO BYTE A BYTE:");
        CopiadorDeArquivos.PorBytes();

        System.out.println("\n\n\nARQUIVO LIDO POR LINHA:");
        CopiadorDeArquivos.PorLinha();
    }
}
