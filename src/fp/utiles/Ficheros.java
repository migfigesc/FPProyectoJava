package fp.utiles;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Ficheros {
	
	static final Charset ENCODING = StandardCharsets.UTF_8;
	
	public static List<String> leeFichero(String errMsg, String path) {
		List<String> res = null;
		try {
			res = Files.readAllLines(Paths.get(path), ENCODING);
		} catch (IOException e) {
			System.out.println(errMsg);
			e.printStackTrace();
			res = new ArrayList<String>();
		}
		return res;
	}

}
