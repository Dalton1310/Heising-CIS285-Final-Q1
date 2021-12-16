import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.TestCase;

public class testSelectionSort extends TestCase{
	private SelectionSort temp1;
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
	}

	public void testPositive() {
		int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        SelectionSort positive = new SelectionSort();
        positive.sort(arr);
        int[] arraySorted = arr;
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        assertEquals("Array is sorted", arraySorted[0], Sortedarr[0]);
        System.out.print("Expected positive array sorted: ");
        for (int element: Sortedarr) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
        System.out.print("Actual positive array sorted: ");
        for (int element: arraySorted) {
            System.out.print(element + " ");
        }
	}
	public void testNegative() {
		int[] arr = new int[5];
        arr[0] = -5;
        arr[1] = -15;
        arr[2] = -12;
        arr[3] = -19;
        arr[4] = -10;
        SelectionSort negative = new SelectionSort();
        negative.sort(arr);
        int[] arraySorted = arr;
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -19;
        Sortedarr[1] = -15;
        Sortedarr[2] = -12;
        Sortedarr[3] = -10;
        Sortedarr[4] = -5;
        assertEquals("Array is sorted", arraySorted[0], Sortedarr[0]);
        System.out.print("Expected negative array sorted: ");
        for (int element: Sortedarr) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
        System.out.print("Actual negative array sorted: ");
        for (int element: arraySorted) {
            System.out.print(element + " ");
        }
	}
	public void testMixed() {
		int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = -12;
        arr[2] = 7;
        arr[3] = 0;
        arr[4] = -2;
        SelectionSort mixed = new SelectionSort();
        mixed.sort(arr);
        int[] arraySorted = arr;
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -12;
        Sortedarr[1] = -2;
        Sortedarr[2] = 0;
        Sortedarr[3] = 7;
        Sortedarr[4] = 8;
        assertEquals("Array is sorted", arraySorted[0], Sortedarr[0]);
        System.out.print("Expected mixed array sorted: ");
        for (int element: Sortedarr) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
        System.out.print("Actual mixed array sorted: ");
        for (int element: arraySorted) {
            System.out.print(element + " ");
        }
	}
}
