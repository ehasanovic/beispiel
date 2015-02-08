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
		return name + "Otto";
	}
}
