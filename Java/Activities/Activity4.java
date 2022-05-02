//
//
//In this activity, we will be implementing the Insertion Sort algorithm
//
//    Insertion sort works in the similar way as we sort cards in our hand in a card game.
//    We assume that the first card is already sorted then, we select an unsorted card.
//    If the unsorted card is greater than the card in hand, it is placed on the right otherwise, to the left.
//    In the same way, other unsorted cards are taken and put at their right place.
//
//
//
//    Add a class named Activity4.
//    In the main() method:
//        Initialize an array with numbers in random order
//        Use the insertion sort logic to sort the array in ascending order.
//        Display the array before and after sorting.
//
//
//
//Psuedocode for Insertion sort:
//
//        insertionSort(array)
//        mark first element as sorted
//        for each unsorted element X
//            'extract' the element X
//        for j <- lastSortedIndex down to 0
//            if current element j > X
//                move sorted element to the right by 1
//        break loop and insert X here
//    end insertionSort

package FST_Java;
//
//public class Activity4 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] num= {11,44,22,99,55,88};
//
//	}
//
//}




import java.util.Arrays;

class Activity4 {
    static void ascendingSort(int array[]) {
        int size = array.length, i;
        
        for (i = 1; i < size; i++) {
            int key = array[i];
            int j = i - 1;
            
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = key;
        }
    }
    
    public static void main(String args[]) {
        int[] data = { 9, 5, 1, 4, 3 };
        ascendingSort(data);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }
}
