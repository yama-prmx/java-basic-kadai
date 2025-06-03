package kadai_018;

public class KatoExec_Chapter18 {
	public static void main(String[] args) {

KatoTaro_Chapter18 KatoTaro = new KatoTaro_Chapter18();//インスタンス化
KatoHanako_Chapter18 KatoHanako = new KatoHanako_Chapter18();//インスタンス化
KatoIchiro_Chapter18 KatoIchiro = new KatoIchiro_Chapter18();//インスタンス化

KatoTaro.setGivenName();//メソッドの呼び出し
KatoTaro.execIntroduce();

KatoHanako.setGivenName();
KatoHanako.execIntroduce();

KatoIchiro.setGivenName();
KatoIchiro.execIntroduce();
}}
