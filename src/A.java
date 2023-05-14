// duplicate elements in array
public class A {
	public static void main(String[] args) {
		int[] a = { 1, 2, 2, 3, 4, 5, 5 };
		int[] temp = new int[a.length];
		// This is Comment
		int j = 0;

		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != a[i + 1]) {
				temp[j] = a[i];
				j++;
			}
		}
		temp[j] = a[a.length - 1];

		for (int x = 0; x < temp.length; x++) {
			System.out.println(temp[x]);
		}
	}
}
