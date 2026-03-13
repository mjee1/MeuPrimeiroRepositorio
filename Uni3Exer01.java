public class Uni3Exer01 {

  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    System.out.print("Digite a largura(m): "); 
    float largura = leitor.nextFloat();
    System.out.print("Digite o comprimento(m): ");
    float compriemento = leitor.nextFloat();

    float area = largura * compriemento;

    System.out.println("Área = " + area + "m²");
  }
}
