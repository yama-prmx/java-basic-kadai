package kadai_018;

public abstract class Kato_Chapter18 {
	public String familyName = "加藤" ;
	public String givenName ;
	public String address = "東京都中野区○×";
	
	public void commonIntroduce() {
		System.out.println("名前："+ familyName + "" + givenName);
		System.out.println("住所：" + address);
	}
	public abstract void eachIntroduce();
	public void execIntroduce() {
	commonIntroduce();
	eachIntroduce();

}
}