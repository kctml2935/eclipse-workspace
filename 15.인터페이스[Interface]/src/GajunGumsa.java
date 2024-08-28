
public class GajunGumsa {
	
	private GajunOnOff[] gajuns;
	
	public GajunGumsa() {
	}

	public GajunGumsa(GajunOnOff[] gajuns) {
		super();
		this.gajuns = gajuns;
	}
	
	public void gumsa() {
		for (GajunOnOff gajunOnOff : gajuns) {
			gajunOnOff.on();
			GajunVolume tempGajun = (GajunVolume)gajunOnOff;
			tempGajun.up();
			tempGajun.down();
			gajunOnOff.off();
			System.out.println("-----검사끝 출고-----");
		}
	}
	
	public GajunOnOff[] getGajuns() {
		return gajuns;
	}
	public void setGajuns(GajunOnOff[] gajuns) {
		this.gajuns=gajuns;
	}
	
	
	
	
}
