public class BinarySearchTreeMain {

	public static void main(String[] args) {
		int[] a = {2,4,6,8,12,15,19};
		System.out.println(bSearch(a, 0, a.length, 4));
	}
	
	private static int bSearch(int[] arr, int l, int r, int k) {
		if(r>l) {
			int mid = (l+r)/2;
			if(arr[mid] == k) {
				return mid;
			}else if(arr[mid]<k) {
				return bSearch(arr, mid+1, r, k);
			}
			else if(arr[mid]>k) {
				return bSearch(arr, l, mid-1, k);
			}
		}
		return -1;
	}

}
