import java.util.Scanner;

public class linearSearchstr {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter String: ");
    String str= sc.nextLine();
    System.out.print("Enter character to be searched: ");
    String search=sc.next();

    int index=linsearch(str, search);
    System.out.println("Element found at "+index+" index position");
  }

  static int linsearch(String str, String search){
    for(int i=0; i< str.length(); i++){
      if(search.charAt(0)== str.charAt(i))
        return i;
    }
    return -1;
  }
}