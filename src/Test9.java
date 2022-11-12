import java.util.HashMap;

public class Test9 {

    /*
    HashMap <- Map interface implement
    Key Value
    index 0 1 2 3
    hashcode rastgele dizileme sahip
     */
    public static void main(String[] args) {

        HashMap<String,String> mapList = new HashMap<>();

        mapList.put("01","Adana");
        mapList.put("06","Ankara");
        mapList.put("34","İstanbul");

        mapList.get("01"); // Adana

        mapList.size(); // kactane eleman soyler

        mapList.isEmpty(); // içerisinde eleman var mı yok

        //mapList.clear(); // elemanları temizler

        mapList.replace("01","Adanax");

        mapList.keySet(); // String elemnaları dönen liste 01,06,34 ....

        for(String key : mapList.keySet()) {

            System.out.println(mapList.get(key));

        }






    }
}
