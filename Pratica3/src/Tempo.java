
public class Tempo {
	Integer hora;
	Integer minuto;
	Integer segundo;
	
public Tempo(Tempo t) {
		
		hora = t.hora;
		minuto = t.minuto;
		segundo = t.segundo;
		
	}
	
	public Tempo(int h, int m, int s) {
		
		if (h>0 && h<24) {
			hora = h;
		}
		else hora = 0;
		
		if (m>0 && m<60) {
			minuto = m;
		}
		else minuto = 0;
		
		if (s>0 && s<60) {
			segundo = s;
		}
		else segundo = 0;
	}
	
	public Tempo(int h, int m) {
		
		if (h>0 && h<24) {
			hora = h;
		}
		else hora = 0;
		
		if (m>0 && m<60) {
			minuto = m;
		}
		else minuto = 0;
		
		segundo = 0;
	}
	
public Tempo(int h) {
		
		if (h>0 && h<24) {
			hora = h;
		}
		else hora = 0;
		
		minuto = 0;
		
		segundo = 0;
	}

public String getTempo() {
	return String.format("%02d", hora)+":"+String.format("%02d", minuto)+":"+String.format("%02d", segundo);
}

public void incrementaMinuto() {
	minuto++;
	if (minuto==60) {
		hora++;
		minuto=0;
	}
}

public void decrementaMinuto() {
	minuto--;
	if (minuto<0) {
		hora--;
		minuto=59;
	}
}

}




