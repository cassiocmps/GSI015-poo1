import java.io.*;

public class GravarBinario {
	
	public static void gravarBinario (Object a, String arquivo ) {
		FileOutputStream escritorArquivo = null;
		ObjectOutputStream escritorObj = null;
		try {
			escritorArquivo = new FileOutputStream("Arquivo");
			escritorObj = new ObjectOutputStream(escritorArquivo);
			escritorObj.writeObject(a); //Tem que implementar a
			//interface Serializable!
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (escritorArquivo != null) escritorArquivo.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
