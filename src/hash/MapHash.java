package hash;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class MapHash {
	Map<String,String> addMap=new HashMap<String,String>();
	
	public Map<String,String> getAddMap(){
		addMap.put("username", "fanyufeng");
		addMap.put("userpassword", "123");
		/*first method*/
		for(String key: addMap.keySet()){
			System.out.println("key"+key+"value"+addMap.get(key));
		}
		/*second method*/
		Iterator<Map.Entry<String,String>> it=addMap.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<String, String> entry =it.next();
			System.out.println("key="+entry.getKey()+ "value=" + entry.getValue());
		}
		/*third method*/
		for(Map.Entry<String,String> entry:addMap.entrySet()){
			System.out.println("key"+entry.getKey()+"value"+entry.getValue());
			
		}
		/* fourth method*/
		for(String v:addMap.values()){
			System.out.println("value"+v);
		}
		
		return addMap;
	}
	public  static void main(String[] args){
		
			MapHash fan_result=new MapHash();
			Map<String,String> mapResult=fan_result.getAddMap();
			System.out.println(mapResult);
	
	}

}
