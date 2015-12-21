
public class ConsumeMemory {

	public ConsumeMemory() {
	}

	// 消耗大量内存
	public static void drainMemory() {
		String[] array = new String[1024 * 1024 * 1024];
		for (int i = 0; i < 1024 * 1024 * 1024; i++) {
			for (int j = 'a'; j <= 'z'; j++) {
				array[i] += (char) j;
			}
		}
	}
}
