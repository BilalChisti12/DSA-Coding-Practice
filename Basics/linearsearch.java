package basics;

public class linearsearch {
    static int linearSearch(int arr[], int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                key = i;
                break;

            }
        }
        return key;
    }
    public static void main(String[] args) {

    }
}
