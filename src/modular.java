public class modular {
    public int power(int a,int n,int p){
        int  sum=1;
        for(int i=0;i<n;i++){
            sum*=a;
        }
        return sum%p;
    }
    public static void main(String[] args) {
        modular answer=new modular();
        System.out.println(answer.power(4,2,3));
    }
}