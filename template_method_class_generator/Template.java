package template_method_class_generator;

public abstract class Template {
	public abstract void message();
	private String name;
	
	public void templateMethod() {
		message();
	}
	
	public void setName(String name) {
		this.name = name;
	};
	
	public String getName() {
		return name;
	};
}
