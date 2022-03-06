package Sort;

public class StructuresSort {

//    B1: Chạy từ đầu đến cuối mảng
//    B2: Nếu phần tử đứng trước mà lớn hơn phần từ đứng sau thì đổi chỗ
//    B3: Sau mỗi vòng lặp thì phần tử lớn nhất sẽ trôi xuống dưới
    public void bubbleSort(int[] arr){
       for (int i = 0; i < arr.length ; i++){
           for(int j = 0 ; j < arr.length-i-1; j++){
               if(arr[j] > arr[j + 1]){
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j +1] = temp;
               }
           }
       }
       printArray(arr);
    }

    public void  insertionSort(int[] arr){

    }

    public  static  void printArray(int[] arr){
        for (int i = 0 ; i< arr.length ; i++){
            System.out.printf(arr[i] + " ");
        }
    }

}
