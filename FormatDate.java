public class FormatDate{
	public static void AmericanFormat(String day, String month, int date, int year) {
		System.out.println(day +", "+ month +" " + date + ", " + year);
	}
	public static void EuropeanFormat(String day, String month, int date, int year) {
		System.out.println(day +" "+ date +" " + month + " " + year);
	}
	public static void main(String[] args){
		AmericanFormat("Thursday","September", 24, 2026);
		EuropeanFormat("Thursday","September", 24, 2026);
	 }
	
}
