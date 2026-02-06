//TIP Para <b>executar</b> o código, pressione <shortcut actionId="Run"/> ou
// clique no ícone <icon src="AllIcons.Actions.Execute"/> no gutter.
public class Main {
    public static void main(String[] args) {
       int idade = 20;
       boolean  convite = true;
       String nome = "Lucas";

       if(idade < 18){
           System.out.println("Menor de idade não é permitido!");

        } else if (idade > 17 && convite){
           System.out.println("Bem-vindo(a) à festa,(" +nome+ "!");

       } else {
           System.out.println("Bloqueado. Você precisa de um convite.");

       }
    }
}