package apstraktneKlase_zadatak2_Mladen;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		VideoPlayer videoplayer = new VideoPlayer(120, 0, 50, 480);
		videoplayer.stampaj();
		
		System.out.println("----------------");
		
		Control audio = new AudioControl(true);
		Control audio1 = new AudioControl(true);
		Control netspeed = new QualityOptimizerControl(60);
		Control netspeed1 = new QualityOptimizerControl(80);
		Control timeControl = new TimeControl(true);
		Control timeControl1 = new TimeControl(true);
		
		Control [] nizKontrola = new Control [6];
		nizKontrola[0] = audio;
		nizKontrola[1] = netspeed;
		nizKontrola[2] = timeControl;
		nizKontrola[3] = audio1;
		nizKontrola[4] = netspeed1;
		nizKontrola[5] = timeControl1;
		

		for(int i = 0; i < nizKontrola.length; i++) {
			nizKontrola[i].izvrsiAkciju(videoplayer);
			videoplayer.stampaj();
			System.out.println("------------------");
		}
	}
}
