package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {

		HashMap<String,String>dic ;
		
		public Dictionary_Chapter21() {
			dic = new HashMap<String,String>();
			f();
		}
		
		public void f() {
		dic.put("apple","りんご");
		dic.put("peach","桃");
		dic.put("banana","バナナ");
		dic.put("lemon","レモン");
		dic.put("pear","梨");
		dic.put("kiwi","キウイ");
		dic.put("strawberry","いちご");
		dic.put("grape","ぶどう");
		dic.put("muscat","マスカット");
		dic.put("cherry","さくらんぼ");
	}
		
		public void syori(String[] wordArray) {
		for (String word : wordArray ) {
			 if (dic.containsKey(word)) {
	                System.out.println(word + "の意味は" + dic.get(word) + "です");
	            } else {
	                System.out.println(word + "は辞書に存在しません");
	            }
	}

		}
}