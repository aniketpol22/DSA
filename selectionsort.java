public class selectionsort {
    
        public static void printarray(int array[]){
           for(int i=0;i<array.length;i++)
           {
            System.out.print(array[i]+" ");
           }
        }
        public static void main(String[] args) {
            
            int array[]={7,9,4,6,2,9};
            //selection sort
            for(int i=0;i<array.length-1;i++){
                int smallest=i;
                for(int j=i+1; j<array.length; j++){
                    if(array[smallest]>array[j]){
                        smallest=j;
                    }
                   
                }
                int temp=array[smallest];
                array[smallest]=array[i];
                array[i]=temp;

            }
           
            printarray(array);
    
        }
        
    }
    

