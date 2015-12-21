import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class TestMain {

	public static void main(String[] args) {
		
		// 内存回收
		// 创建公共类Author，它的作用是覆盖finalize()函数：在finalize()中输出打印信息，方便追踪。
		// 说明：finalize()函数是在JVM回收内存时执行的，但JVM并不保证在回收内存时一定会调用finalize()。
		//情景1：清除对象，没有回收
//		Author author = new Author("黄浦", 25);
//		author = null;
		
		
		//情景2：显式调用垃圾回收，回收
//		Author author = new Author("黄浦", 25);
//		author = null;
//		System.gc();
		
		//情景3：隐式调用垃圾回收，模拟实际应用中jvm内存损耗
//		Author author = new Author("黄浦", 25);//强引用
//		author = null;
//		ConsumeMemory.drainMemory();//消耗大量内存，让author得以回收，如author不置空则不会被回收
		
		
		// Java对引用分类
		// 强引用 如果有引用，则不会被回收
//		Author author = new Author("黄浦", 25);
//		ConsumeMemory.drainMemory();
//		System.gc();
		
		// 软引用 当内存不足时，就会被回收
//		 SoftReference ref = new SoftReference(new Author("黄浦", 25));
//	     ConsumeMemory.drainMemory();
//		 System.gc();
		
		// 若引用 在JVM垃圾回收运行时，弱引用被终止.
		 WeakReference ref = new WeakReference(new Author("黄浦", 25));
	     System.gc();
		
		
	}
}
