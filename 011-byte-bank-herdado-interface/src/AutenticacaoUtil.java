//Essa classe foi criada para que não haja repetição de classe no Cliente, Gerente 
//Adiministrador, pois os métodos assinados no contrato Autenticavel
//implementados nessas classe (Cleinte, Gerente e Administrador) tem o mesmo conteúdo.
//Se tem mesmo código, cheira mal!

public class AutenticacaoUtil{

    private int senha;

    public void setSenha(int senha){
        this.senha = senha;
    }

    public boolean autentica(int senha){
        if(this.senha == senha){
            return true;
        } else {
            return false;
        }
    }
}