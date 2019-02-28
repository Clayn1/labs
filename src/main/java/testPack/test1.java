package testPack;

public class test1 {
    public static void main(String[] args) {
        int[] qw = {2,3,4,1,2};
        for (int i = 0; i < qw.length; i++) {
            if(i!= qw.length-1 && qw[i] < qw[i+1]){
                int temp = qw[i];
                qw[i]=qw[i+1];
                qw[i+1]=temp;
                i=-1;
            }
        }
        for (int i = 0; i < qw.length; i++) {
            System.out.println(qw[i]);
        }
    }
}
