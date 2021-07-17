package memoryleak;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class MemLeak {
	public final String key;

	public MemLeak(String key) {
		this.key = key;
	}

	public static void main(String args[]) {
		try {
			Map map = new HashMap<>();
			for (;;) {
				map.put(new MemLeak("aaa"), "abcd");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}