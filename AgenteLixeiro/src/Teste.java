import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        //String x = " git commit -m \"Teste Envio\" ";
        //String x = " git status";



        Process exet;
        try{
            exet = Runtime.getRuntime().exec(x);
            exet.waitFor();
            Scanner entrada = new Scanner(exet.getInputStream());

            String line;
            while((line = entrada.nextLine()) != null){
                System.out.println(line);
            }


        }catch (Exception e){

        }

    }
}
