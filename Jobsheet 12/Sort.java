public class Sort {
    public int [] data;
    public int jumData;

    public Sort(int Data[], int jmlData){
        jumData = jmlData;
        data= new int [jmlData];
        for (int i =0; i<jumData; i++){
            data[i]=Data[i];
        }
    }
    public void bubbleSort(){
        int temp=0;
        for(int i=0; i<(jumData-1);i++){
            for(int j=1; j<(jumData-i); j++){
                if(data[j-1]>data[j]){
                    temp=data[j];
                    data[j]=data[j-1];
                    data[j-1]=temp;
                }
            }
        }tampilData();
    }
    public void tampilData(){
        for(int i=0; i<jumData; i++){
            System.out.println(data[i]+ "  ");
        }System.out.println();
    } 
    public static void main(String[]args){
        int a[] = {15,10,7,22,5};
        Sort urut = new Sort(a,a.length);
        System.out.println("Data Sebelum di urutkan");
        urut.tampilData();
        System.out.println("Data Setelah di urutkan");
        urut.bubbleSort();
    }
}

