package cartao;

/**
 *
 * @author camil
 */
public class Bloqueado extends CartaoEstado {

    private Cartao cartao;
    
    
    Bloqueado(Cartao cartao) {
        this.cartao = cartao;        
    }

    @Override
    public void entrarPin(String pin) throws Exception {
        throw new Exception("Cartão Bloqueado.");
    }

    @Override
    public void fazerPagamento() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
