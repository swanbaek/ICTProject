package ex06;
import java.util.*;
public class ServiceImpl implements Service {
	
	//property
	private List<String> list;
	private Map<String, Integer> map;
	private Set<String> set;
	private Properties prop;
	
	//setter, getter--
	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Map<String, Integer> getMap() {
		return map;
	}

	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}
	//--------------------------
	@Override
	public void test1() {
		System.out.println("-----list----------");
		for(String str: list) {
			System.out.println(str);
		}

	}

	@Override
	public void test2() {
		System.out.println("-----map--------------");
		Set<String> set=map.keySet();
		for(String str: set) {
			System.out.println(str+": "+map.get(str));
							//Key : 	Value
		}
	}
	@Override
	public void test3() {
		System.out.println("-----set----------------");
		for(String str:set)
			System.out.println(str);
	}

	@Override
	public void test4() {
		System.out.println("---prop-------------");
		String user=prop.getProperty("user");
		String pwd=prop.getProperty("pwd");
		System.out.println("user: "+user+", pwd: "+pwd);
	}
}
