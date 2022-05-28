package Exceptions;

import javax.swing.*;
import java.io.*;

public class CheckedExceptions {
    public static void main(String[] args)  {

        String nomeDoArquivo = "DailyScrumm.txt"; //! tratamento do nome do arquivo
        try {
            ImprimirquivoNoConsole(nomeDoArquivo);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado " + e.getCause());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro Inesperado " + e.getMessage());
        }

        finally {
            System.out.println("Rodou o Finally");
        }

    }


        public static void ImprimirquivoNoConsole(String nomeDoArquivo) throws IOException {
            File file = new File(nomeDoArquivo);

            BufferedReader br = new BufferedReader(new FileReader(file.getName()));
            String line = br.readLine();

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            do {
                bw.write(line);
                bw.newLine();
                line=br.readLine();
            } while(line != null);
            bw.flush();
            br.close();

        }
    }

