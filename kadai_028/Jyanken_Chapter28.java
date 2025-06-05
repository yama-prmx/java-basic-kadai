package kadai_028;
import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	public String getMyChoice(){
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		Scanner scanner = new Scanner(System.in);
		
		
		while(true) {
		String input = scanner.next();
		if(input.equals("r") || input.equals("s") || input.equals("p") ) {
		return input;	
		}else {
			System.out.println("正しいじゃんけんの手を入力しましょう");
		}
		}
	}
	public String getRandom(){
		String[] aite = {"r","p","s"};
		int i = (int) Math.floor(Math.random()*3);
		return aite[i];
		}
	
	public void playGame(){
		HashMap<String,String> jyanken = new HashMap<String,String>();
		jyanken.put("r","グー");
		jyanken.put("s","チョキ");
		jyanken.put("p","パー");
		
		String my = getMyChoice();
		String aite = getRandom();
	
		
		System.out.println("自分の手は"+jyanken.get(my)+"相手の手は"+jyanken.get(aite));
		
		if(my.equals(aite)) {
			System.out.println("あいこです");
		}else if((my.equals("r")&&aite.equals("s")) || (my.equals("s")&&aite.equals("p")) || (my.equals("p")&&aite.equals("r"))) {
			System.out.println("自分の勝ちです");
		}else{
			System.out.println("自分の負けです");
			
		}
	}
}
