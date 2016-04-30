
public class time {
	int hour;
	int minute;


void whattime(int h, int m) {
	hour = h;
	minute = m;
	System.out.println("Agora sao: "+hour+"h:"+minute+"min");
};

public static void main (String arg[]) {
	time t = new time();
	t.whattime(3, 25);
}
}