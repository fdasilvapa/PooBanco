public class ContaEstudantil extends ContaNormal {
    protected double emprestimo;
  
    protected void setEmprestimo(double value){
      emprestimo = value;
    }
  
    protected double getEmprestimo(){
      return emprestimo;
    } 
  
    public void creditar(double valor){
      saldo = saldo + valor;
    }
  
    public void debitar(double valor){
      if((saldo - valor + emprestimo) >= 0){
        saldo = saldo - valor;
      }
    }
  
  }