package beispiel;

public class Auto 
{
	private String name;
	public Auto(String name)
	{
		this.name=name;
	}
	@Override
	public String toString()
	{
		String a;
		return "Auto: " + name + 100;

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
