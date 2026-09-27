package sc14_tratamento_excecoes.ex04_conta_bancaria.model.exceptions;

// estende runtimeexception para o compilador não obrigar o uso de 'throws' na assinatura dos métodos
public class DomainException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public DomainException(String msg) {
        super(msg);
    }
}