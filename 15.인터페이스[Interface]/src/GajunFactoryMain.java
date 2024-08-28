
public class GajunFactoryMain {

	public static void main(String[] args) {
		GajunTV tv1 = new GajunTV();
		GajunTV tv2 = new GajunTV();
		GajunTV tv3 = new GajunTV();

		GajunAudio audio1 = new GajunAudio();
		GajunAudio audio2 = new GajunAudio();
		
		GajunOnOff[] gajuns = new GajunOnOff[5];
		gajuns[0] = tv1;
		gajuns[1] = tv2;
		gajuns[2] = tv3;
		gajuns[3] = audio1;
		gajuns[4] = audio2;
		
		System.out.println("----------가전제품검사소--------");
		GajunGumsa gajunGumsa = new GajunGumsa();
		gajunGumsa.setGajuns(gajuns);
		gajunGumsa.gumsa();
		
		
		/*GajunOnOff[] recvGajun = gajuns;
		
		for (GajunOnOff gajunOnOff : recvGajun) {
			gajunOnOff.on();
			GajunVolume tempGajun = (GajunVolume)gajunOnOff;
			tempGajun.up();
			tempGajun.down();
			gajunOnOff.off();
			System.out.println("-----검사끝 출고-----");
		}*/
		
		
	}

}
