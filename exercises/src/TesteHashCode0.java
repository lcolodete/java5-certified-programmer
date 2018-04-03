public class TesteHashCode0
{
	public static void main(String[] args)
	{
		Pessoa p1 = new Pessoa("123");
		Pessoa p2 = new Pessoa("123");
		System.out.println("p1.equals(p2)? "+ (p1.equals(p2)));
		System.out.println("p1 == p2? "+ (p1 == p2));
		System.out.println("p1.hashCode() == p2.hashCode()? "+ (p1.hashCode() == p2.hashCode()));
		System.out.println("p1.hashCode() == "+ p1.hashCode());
		System.out.println("p2.hashCode() == "+ p2.hashCode());
	}
}
class Pessoa
{
	private String cpf;
	Pessoa(String sCpf) { cpf = sCpf; }
	public String getCpf() { return cpf; }
	public boolean equals(Object o)
	{
		if ((o instanceof Pessoa) && (((Pessoa)o).getCpf().equals(cpf)))
			return true;
		return false;
	}
}
