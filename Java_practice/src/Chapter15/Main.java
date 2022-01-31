package Chapter15;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		String s1 = "スッキリJava";
		String s2 = "Java";
		String s3 = "java";
		if (s2.equals(s3)) {
			System.out.println("s2とs3は等しい");
		}
		if (s2.equalsIgnoreCase(s3)) {
			System.out.println("s2とs3はケースを区別しなければ等しい");
		}
		System.out.println("s1の長さは" + s1.length() + "です");
		if (s1.isEmpty()) {
			System.out.println("s1はから文字です");
		}
			
		String s4 = "Java and JavaScript";
		if (s4.contains("Java")) {
			System.out.println("文字列s4は、Javaを含んでいます");
		}
		if (s4.endsWith("Java")) {
			System.out.println("文字列s4は、Javaが末尾にあります");
		}
		System.out.println("文字列s4で最初にJavaが登場する位置は" + s4.indexOf("Java"));
		System.out.println("文字列s4で最後にJavaが登場する位置は" + s4.lastIndexOf("Java"));
		
		String s5 = "Java programming";
		System.out.println("文字列s5の4文字目以降は" + s5.substring(3));
		System.out.println("文字列s5の4〜8字目以降は" + s5.substring(3,8));
		
		String s6 = "abc,def:ghi";
		String[] words = s6.split("[,:]");
		for (String w : words) {
			System.out.println(w + "->");
		}
		
		String w2 = s6.replaceAll("[beh]", "X");
		System.out.println(w2);
		
		System.out.printf("製品番号%s-%02d", "SJV", 3);
		System.out.println("");
		
		long end = System.currentTimeMillis();
		System.out.println("処理にかかった時間は…" + (end - start) + "ミリ秒でした");
		
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.getTime());
		Date past = new Date(1600705425827L);
		System.out.println(past);
		
		Calendar c = Calendar.getInstance();
		c.set(2022,8,22,1,23,45);
		c.set(Calendar.MONTH, 9);
		Date d = c.getTime();
		System.out.println(d);
		Date now2 = new Date();
		c.setTime(now2);
		int y = c.get(Calendar.YEAR);
		System.out.println("今年は" + y + "年です");
		
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//		Date d2 = f.parse("2020/9/22 01:23:45");
//		System.out.println(d2);
		Date now3 = new Date();
		String s = f.format(now3);
		System.out.println("現在は" + s + "です");
		
		LocalDateTime l1 = LocalDateTime.now();
		LocalDateTime l2 = LocalDateTime.of(2020, 1, 1, 9, 5, 0, 0);
		ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
		LocalDateTime l3 = z1.toLocalDateTime();
		System.out.println(l1);
		System.out.println(z1);
		System.out.println(l3);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate ldate = LocalDate.parse("2020/09/22", fmt);
		LocalDate ldatep = ldate.plusDays(1000);
		String str = ldatep.format(fmt);
		System.out.println("1000日後は" + str);
		
		LocalDate d1 = LocalDate.of(2020, 1, 1);
		LocalDate d2 = LocalDate.of(2020, 1, 4);
		Period p1 = Period.ofDays(3);
		Period p2 = Period.between(d1, d2);
		LocalDate d3 = d2.plus(p2);
		System.out.println(d3);
	}
}
