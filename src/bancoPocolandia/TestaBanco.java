package bancoPocolandia;

public class TestaBanco {
	
	public static void main(String[] args) {
		Conta miguel = new Conta(2272, 6545);
		miguel.deposita(10000.00);
		
		
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Miguel Luis de França");
		cliente1.setCpf("555.555.555-55");
		cliente1.setProfissao("Mucius imperialus");
		
		miguel.setCliente(cliente1);
		
		System.out.println(miguel.getCliente().getNome());
	}

}
