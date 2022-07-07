package dsa_assignment_07;

/**
 *
 * @author 1999k
 */
public class sortingExamples {

    //selection sort sample code
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;//searching for lowest index  
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    //insertion sort sample code
    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }

    //heap sort sample code
    public static void sort(int A[]) {
        int n = A.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(A, n, i);   // To heapify a subtree rooted with node i which is
        }     // Heapify:- A process which helps regaining heap properties

        // One by one extract an element from heap
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            int temporary = A[0];
            A[0] = A[i];
            A[i] = temporary;

            // call max heapify on the reduced heap
            heapify(A, i, 0);
        }
    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    public static void heapify(int A[], int n, int i) {
        int largest = i; // Initialize largest as root
        int left_child = 2 * i + 1; // left = 2*i + 1
        int right_child = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (left_child < n && A[left_child] > A[largest]) {
            largest = left_child;
        }

        // If right child is larger than largest so far
        if (right_child < n && A[right_child] > A[largest]) {
            largest = right_child;
        }

        // If largest is not root
        if (largest != i) {
            int swap = A[i];
            A[i] = A[largest];
            A[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(A, n, largest);
        }
    }

    /* A utility function to print array of size n */
    static void print_array(int A[]) {
        int n = A.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }

    public static void main(String a[]) {
        System.out.println("");
        int[] arr1 = {9, 14, 3, 2, 43, 11, 58, 22};
        System.out.println("Before Selection Sort");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();

        selectionSort(arr1);//sorting array using selection sort  

        System.out.println("After Selection Sort");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println("");

        System.out.println("");

        System.out.println("Before Insertion Sort");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();

        insertionSort(arr1);//sorting array using insertion sort    

        System.out.println("After Insertion Sort");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println("");

        System.out.println("");
        int A[] = {22, 21, 3, 25, 26, 7};

        sort(A);

        System.out.println("Sorted array by heap sort is");
        print_array(A);
    }

}
