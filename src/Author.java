
public class Author {
	private String name;
	private int age;
	
	public Author(String name, int age) {
		super();
		System.out.println("创建对象");
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("回收对象");
	}


}
