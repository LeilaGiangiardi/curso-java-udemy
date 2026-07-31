package sc12_enumeracao_composicao.enum_exemplo1;

import java.util.Date;

import sc12_enumeracao_composicao.enum_exemplo1.entities.Pedido;
import sc12_enumeracao_composicao.enum_exemplo1.entities_enums.StatusPedido;

public class Program {
    static void main(String[] args) {

        Pedido pedido1 = new Pedido(1080,  new Date(), StatusPedido.pagamento_pendente);

        System.out.println(pedido1);
    
        StatusPedido sp1 = StatusPedido.entregue;
        StatusPedido sp2 = StatusPedido.valueOf("entregue");

        System.out.println(sp1);
        System.out.println(sp2);
    
    }
}
