import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;


public class Principal 
{

	public static void main(String[] args) 
	{
		
		File txt = new File("D:\\Teste\\arquivo.txt");
		
		Utilitarios.CriarArquivo(txt);
		
		String conteudo = Utilitarios.LerAquivoTxt(txt);
		//String conteudoInputStream = "";
		
		InputStream inputStream = new ByteArrayInputStream(conteudo.getBytes(StandardCharsets.UTF_8));
		
        int i;
        try {
			while ((i = inputStream.read()) != -1)
			{
			    char getSingleChar = (char)i;
			    System.out.print(getSingleChar);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.out.println(conteudoInputStream);

	}

}
