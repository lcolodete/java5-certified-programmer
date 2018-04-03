public class TesteEquals1
{
	public static void main(String[] args)
	{
		Pessoa p1 = new Pessoa("123");
		Pessoa p2 = new Pessoa("123");

		System.out.println("p1.equals(p2)? "+ (p1.equals(p2)));
		System.out.println("p1 == p2? "+ (p1 == p2));

	}
}
class Pessoa
{
	private String cpf;
	Pessoa(String sCpf)
	{
		cpf = sCpf;
	}
	public String getCpf()
	{
		return cpf;
	}
}
