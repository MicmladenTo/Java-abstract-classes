package apstraktneKlase_zadatak2_Mladen;

public class QualityOptimizerControl extends Control {
			
		private double brzinaInterneta;

		public double getBrzinaInterneta() {
			return brzinaInterneta;
		}

		public void setBrzinaInterneta(double brzinaInterneta) {
			this.brzinaInterneta = brzinaInterneta;
		}
		
		

		public QualityOptimizerControl(double brzinaInterneta) {
			super();
			this.brzinaInterneta = brzinaInterneta;
		}

		@Override
		public void izvrsiAkciju(VideoPlayer videoplayer) {
			
			double kvalitetVeze = brzinaInterneta * 10.1;
				if(kvalitetVeze < 144) {
					videoplayer.setKvalitetVidea(144);
				} else if (kvalitetVeze < 240) {
					videoplayer.setKvalitetVidea(240);
				}
				else if (kvalitetVeze < 360) {
					videoplayer.setKvalitetVidea(360);
				}
				else if (kvalitetVeze < 480) {
					videoplayer.setKvalitetVidea(480);
				} 
				else if (kvalitetVeze < 720) {
					videoplayer.setKvalitetVidea(720);
				}
				else if (kvalitetVeze < 1080) {
					videoplayer.setKvalitetVidea(1080);
				}
				else {
					videoplayer.setKvalitetVidea(1920);
				}
			}
			
		}

