import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		{
//      問① 下記の配列はInteger型しか格納できないように修正してください。
//		   現状は全てのクラスの継承元であるObject型を指定しているので、Stringもintも格納可能になっています。
	       List<Object> array = new ArrayList<>();
//	    <以下記述>
	      
//      問② 前から二つ目の要素を"bar"にしましょう。
//	　<以下記述>
	       array.add("smth");
	       array.add("bar");
	       array.add("foo");
//      問③ fooが格納されているインデックスを出力してください。
//	　<以下記述>
	       
	       System.out.println("fooのインデックス: " + array.indexOf("foo"));
		
		
		{
//      問④ キーがString型、バリューがObject型の要素を三つ格納しましょう。
		Map<String, Object> map = new HashMap<>();
//	　<以下記述>
		map.put("address", "////");
		map.put("name", "Schocolate");
		map.put("age", "25");

//      問⑤上記で格納したキーを繰り返し文で出力しましょう。
//	    <以下記述>
		
		for(String key : map.keySet()) {
			System.out.println("key: " + key);
		}

//      問⑥上記で格納したバリューを繰り返し文で出力しましょう。
//	    <以下記述>
		
		for(Object value : map.values()) {
			System.out.println("value: " + value);
		}

		}
		{
//      問⑦ 配列arrayDateに今の年・月・日を入れてください。
           Calendar cal = Calendar.getInstance();
//	    <以下記述>
           System.out.println(cal.get(Calendar.YEAR));
           System.out.println(cal.get(Calendar.MONTH) + 1);
           System.out.println(cal.get(Calendar.DATE));
           
          
         
//      問⑧ 配列arrayDateをList型に変更しましょう。
//	    <以下記述>
//      問⑨ 上記で格納した要素を繰り返しで出力しましょう。
//	    <以下記述>
		}
	}
	}
}
