
//criando um contrato. Quem assinar esse contrato, está obrigado a implementar:
// > setsenha
// > autentica

public abstract interface Autenticavel {
	
//	int senha; // um contrato não pode ter nada de concreto, nem mesmo atributos!

	public void setSenha(int senha);
//    public void setSenha(int senha){
//        this.senha = senha;
//    }

	public boolean autentica(int senha);
//    public boolean autentica(int senha){
//        if(this.senha == senha){
//            return true;
//        } else {
//            return false;
//        }
//    }
}