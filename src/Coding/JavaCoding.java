package Coding;

class JavaCoding extends Thread {

	public void run() {
		String s[] = { "S1", "S2", "S3" };
		String s2[] = { "S1", "S2", "S3" };

		String song4 = "S4";
		int i = 0;
		int temp = 0;

		System.out.println(PlaySong(s2[i])+"===Start====================");
		if (PlaySong(s2[i]).equals("played 1")) {
			statucOfCurrentSong(s);
			temp = i;
			i++;
			System.out.println(s2[temp] + " is Completed");
		}
		
		
		System.out.println(PlaySong(s2[i])+"===Start====================");
		if (PlaySong(s2[i]).equals("played 2")) {
			s = changeSong(s, song4);
			statucOfCurrentSong(s);
			temp = i;
			i++;
			System.out.println(s2[temp] + " is Completed");
		}
		
		
		System.out.println(PlaySong(s2[i])+"===Start====================");
		if (PlaySong(s2[i]).equals("played 3")) {
			s = changeSong(s, s2[temp]);
			statucOfCurrentSong(s);
			System.out.println(s2[i] + " is Completed");
		}
		System.out.println(PlaySong(song4)+"===Start====================");
		if (PlaySong(song4).equals("played 4")) {
			s = changeSong(s, s2[0]);
			statucOfCurrentSong(s);
            
			System.out.println("=======Playlist is complited=============");
		}

	}

	static String PlaySong(String song) {

		switch (song) {
		case "S1": {
			try {
				Thread.sleep(2300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "played 1";

		}
		case "S2": {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "played 2";
		}
		case "S3": {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "played 3";
		}
		case "S4": {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "played 4";
		}

		default: {
			System.out.println("Not Valid");
			break;
		}
		}
		return null;

	}

	public static String[] changeSong(String[] s, String newSong) {
		String z[] = new String[s.length];
		int i = 0;
		int y = 1;
		z[i++] = s[y++];
		z[i] = s[y];
		z[s.length - 1] = newSong;
		return z;
	}

	public void statucOfCurrentSong(String[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		 
	}

}
