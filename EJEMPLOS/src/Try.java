


public class Try {
 static final int LIMITE_SUPERIOR = 10;
 static final int LIMITE_INFERIOR = -10;
 static final String CARACTER_BASE = "*";
 
public static void main(String argumentos[]){
		
	System.out.println(generarBarraHorizontal(9));
	System.out.println(generarBarraHorizontal(-2));
	System.out.println(generarBarraHorizontal(4));
	System.out.println(generarBarraHorizontal(-6));
	System.out.println(generarBarraHorizontal(10));
	System.out.println(generarBarraHorizontal(0));
	System.out.println(generarBarraHorizontal(10));
	System.out.println(generarBarraHorizontal(-11));
	System.out.println(generarBarraHorizontal(11));
	
	}



 /**
 * @param tama�o
 * @param caracter
 * Produce fila de caracteres de un tama�o asignado
 * @return bloque
 */
static String generarBloqueCaracteres(int tama�o,String caracter) {
	 
	String bloque="";
	for(int i=0;i<tama�o;i++) {
		
		bloque += caracter ;
	}
	
	return bloque;
}
 /**
 * @param tama�o
 * produce una fila completa formada por distintos caracteres 
 * @return bloque
 */
static String generarBarraHorizontal(int tama�o) {
		
	String bloque="";
	//validar datos
	 if (tama�o>=LIMITE_INFERIOR&&tama�o<=LIMITE_SUPERIOR) {
		 if (tama�o>0) {
			 bloque=	generarBloqueCaracteres(LIMITE_SUPERIOR, " ")+
					 "|"+
					 generarBloqueCaracteres(tama�o, "*");
			 return bloque;
		 }
		 if (tama�o<0) {
			 bloque=	generarBloqueCaracteres(LIMITE_SUPERIOR+tama�o, " ")+
					 generarBloqueCaracteres(-tama�o, "*")+
					 generarBloqueCaracteres(1, "|");
			 return bloque;
		 }
		 if(tama�o==0) {
			 bloque= generarBloqueCaracteres(LIMITE_SUPERIOR, " ")+
					 generarBloqueCaracteres(1, "|");
			 return bloque;
		 }
		
	 }
		 else {
			 bloque="FUERA DE RANGO";
			 return bloque;
		 }
		
	 return bloque;
	}


}
