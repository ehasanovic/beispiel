package beispiel;

public class Auto 
{

	/**
	 * 
	 * klasse auto ist super
	 * 
	 */
	private String name;
	public Auto(String name)
	{
		this.name=name;
	}
	public Auto()
	{
		
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Auto other = (Auto) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
