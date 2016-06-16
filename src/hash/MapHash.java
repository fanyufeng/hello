package hash;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class MapHash {
	Map<String,String> addMap=new HashMap<String,String>();
	List<String> addList=new ArrayList<String>();
	Set<String>  addSet=new HashSet<String>();
	
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
	
	public List<String> getAddList(){
		addList.add("fanyufeng");
		addList.add("hyrgdg");
		addList.add("ehrutg");
		System.out.println(addList);
		for(String addListNumer:addList){
			System.out.println(addListNumer);
		}
		for(int i=0;i<addList.size();i++){
			System.out.println(i+"->"+addList.get(i));
		}
		return addList;
	}
	
	public Set<String> getAddSet(){
		addSet.add("nrut");
		addSet.add("dgud");
		addSet.add("ehtu");
		addSet.add("ehtu");
		System.out.println(addSet);
		Iterator<String> it=addSet.iterator();
		while(it.hasNext()){
			String o=it.next();
			System.out.println(o);
		}
		return addSet;
	}
	public  static void main(String[] args){
		
			MapHash fan_result=new MapHash();
			Map<String,String> mapResult=fan_result.getAddMap();
			System.out.println(mapResult);
			List<String> listResult=fan_result.getAddList();
			System.out.println(listResult);
			Set<String> setResult=fan_result.getAddSet();
			System.out.println(setResult);
	}

}
