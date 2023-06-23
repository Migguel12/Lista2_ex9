public class App {
    public static void main(String[] args) throws Exception {

        int n1 = 1;
        int n2 = 3;
        int n3 = 2;
        
        if(n1<n2 && n1<n3 && n2<n3){
            System.out.printf("%d, %d, %d", n3,n2,n1);
        }

        else if(n1<n2 && n1<n3 && n3<n2){
            System.out.printf("%d, %d, %d", n2,n3,n1);
        }

        else if(n2<n1 && n2<n3 && n3<n1){
            System.out.printf("%d, %d, %d", n1,n3,n2);
        }

        else if(n2<n1 && n2<n3 && n1<n3){
            System.out.printf("%d, %d, %d", n3,n1,n2);
        }

        else if(n3<n1 && n3<n2 && n2<n1){
            System.out.printf("%d, %d, %d", n1,n2,n3);
        }

        else{
            System.out.printf("%d, %d, %d", n2,n1,n3);
        }

    }
}
