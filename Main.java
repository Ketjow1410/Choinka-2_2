import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner wpisz = new Scanner(System.in);
    int w;
System.out.print(" podaj wysokosc");
    w=wpisz.nextInt();
  for(int b=0; b<4;b++){
    for(int i=w; i>0; i--){
        System.out.println();
      for(int j=i;j>0;j--)
        System.out.print(" ");
      for(int c=(w-i)+1; c>0; c--)
        System.out.print("*");
    }
   
      }}
}
