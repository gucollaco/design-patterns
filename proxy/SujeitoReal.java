package proxy;

public class SujeitoReal implements Sujeito {
	String thing;
	public SujeitoReal() {
		thing = "SujeitoReal";
	}
	public Object operacao() {
		return thing;
	}
}
