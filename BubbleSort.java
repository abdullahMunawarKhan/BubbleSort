public class BubbleSort{
    public static void main(String args[]){
        int A[]={25,87,65,14,21,12,35};
        // sorting array using bubble sort technique
        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++){
                int temp=0;
                if(A[i]>A[j]){
                    temp=A[i];
                    A[i]=A[j];
                    A[j]=temp;
                }
            }
        }
        //printing sorted array
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+"\t");        
        }
    }
}