import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Utilitarios 
{
	public static void CriarArquivo(File file)
	{
		    try 
		    {
		      if (file.createNewFile()) 
		      {
		        //System.out.println("Arquivo criado: " + file.getName());
		      } 
		      else 
		      {
		       // System.out.println("Arquivo ja existe em: " + file.getAbsolutePath());
		      }
		    } 
		    catch (IOException e) 
		    {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  }
		

	public static String LerAquivoTxt(File file)
	{
		String conteudo = "";
		String sub = "";
		String linhaAtual = "";

		try {
		      Scanner myReader = new Scanner(file);
		      while (myReader.hasNextLine()) 
		      {
		    	  //Salva o nextLine() para não ter que usa-lo novamente
		    	 linhaAtual = myReader.nextLine();
		    	 
		    	 //Linha atual não pode ter menos que 2 caracteres, senão quebra o substring
		    	 if(linhaAtual.length() < 2 || linhaAtual.isEmpty())
		    		 sub = "";
		    	else
		    		 sub = linhaAtual.substring(0, 2);

		    	 // Ao fazer os IFs, utilizar o .equals(), percebi que o == não funciona sei la pq
		    	 if(sub.equals("//"))
		    		  conteudo += "";
		    	 else
		    		 conteudo += linhaAtual;
		        //System.out.println(conteudo);
		      }
		      myReader.close();
		    } 
		catch (FileNotFoundException e) 
		{
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		}
		return conteudo;
	}

}
