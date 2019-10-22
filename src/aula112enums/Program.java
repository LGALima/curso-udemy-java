package aula112enums;

import java.util.Date;

import aula112enums.entities.Pedido;
import aula112enums.enums.StatusPedido;

public class Program {
public static void main(String[] args) {
	
	Pedido pedido = new Pedido(1080, new Date(), StatusPedido.AGUARDANDO_PAGAMENTO);
	System.out.println(pedido);
	
	StatusPedido sp1 = StatusPedido.ENTREGUE;
	
	StatusPedido sp2 = StatusPedido.valueOf("ENTREGUE"); //como entrar um enum com string
	
	System.out.println(sp1);
	System.out.println(sp2);
}
	

}
