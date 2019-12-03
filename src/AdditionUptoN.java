import java.util.Scanner;
public class AdditionUptoN {
    int n;
    public void addition(){
        int sum = 0;
        for (int i=1; i<=n; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
    public AdditionUptoN(int n){
        this.n=n;
    }
}
class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number upto which you have to calculate the sum ");
        int num = scanner.nextInt();
        System.out.println("The sum of all natural number upto " + num + "-");
        AdditionUptoN additionUptoN = new AdditionUptoN(num);
        additionUptoN.addition();
    }
}
