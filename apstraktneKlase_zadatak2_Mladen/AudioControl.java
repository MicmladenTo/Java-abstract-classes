package apstraktneKlase_zadatak2_Mladen;

public class AudioControl extends Control{

	private boolean pojacajZvuk;
	
	
	public boolean isPojacajZvuk() {
		return pojacajZvuk;
	}

	public void setPojacajZvuk(boolean pojacajZvuk) {
		this.pojacajZvuk = pojacajZvuk;
	}

	public AudioControl(boolean pojacajZvuk) {
		super();
		this.pojacajZvuk = pojacajZvuk;
	}

	@Override
	public void izvrsiAkciju(VideoPlayer videoplayer) {
		
		int zvuk = 0;
		
		if (pojacajZvuk == true && videoplayer.getJacinaZvuka() < 100) {
			zvuk = videoplayer.getJacinaZvuka() + 1;
		} else if (pojacajZvuk == false && videoplayer.getJacinaZvuka() > 0)  {
			zvuk = videoplayer.getJacinaZvuka() - 1;
		}
		
		videoplayer.setJacinaZvuka(zvuk);
				
			}
	}
