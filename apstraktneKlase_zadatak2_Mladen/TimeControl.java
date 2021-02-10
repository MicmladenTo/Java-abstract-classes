package apstraktneKlase_zadatak2_Mladen;

public class TimeControl extends Control {
	
	private boolean fwd;

	public boolean isFwd() {
		return fwd;
	}

	public void setFwd(boolean fwd) {
		this.fwd = fwd;
	}

	public TimeControl(boolean fwd) {
		super();
		this.fwd = fwd;
	}

	@Override
	public void izvrsiAkciju(VideoPlayer videoplayer) {
		// TODO Auto-generated method stub
		
		double vreme = 0;
		
		if(this.fwd) {
			vreme = videoplayer.getTrenutnoVremeVidea() + 15;
		} else {
			vreme = videoplayer.getTrenutnoVremeVidea() - 15;		
		}
		
		
		if(vreme  < 0) {
			vreme = 0;
		} else if (vreme > videoplayer.getDuzinaVidea()) {
			vreme = videoplayer.getDuzinaVidea();
		}
		
		videoplayer.setTrenutnoVremeVidea(vreme);
	}
		
	
	
}
