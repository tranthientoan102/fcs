import java.util.ArrayList;
import java.util.List;

class Solution {

	public int singleNumber2(int[] nums) {
		String numberAppear = ",";
		String theOne = ",";

		for (int i = 0; i < nums.length; i++) {
			if (!numberAppear.contains("," + nums[i] + ",")) {
				numberAppear +=nums[i] + ",";
				theOne += nums[i] + ",";
				System.out.println("add -> theOne = " + theOne);
			} else {
				theOne = theOne.replaceAll("," + nums[i] + ",", ",");
				System.out.println("remove -> theOne = " + theOne);

			}
		}
		System.out.println("theOne = " + theOne);
		return Integer.parseInt(theOne.split(",")[1]);

	}
//	public int singleNumber(int[] nums) {
//     if(nums == null || nums.length == 0) return 0;
//
//     int n = nums.length;
//     int ans = 0;
//     for(int i=0; i<n; i++) {
//         ans ^= nums[i];
//		 System.out.println("ans = " + ans);
//     }
//
//     return ans;
// }

	public int singleNumber(int[] nums) {
		List<Integer> all = new ArrayList<>();
		List<Integer> result = new ArrayList<>();

		for (int i= 0; i < nums.length; i++){
			if (!all.contains(nums[i])){
				all.add(nums[i]);
				result.add(nums[i]);
		 	} else if (result.indexOf(nums[i])>=0) {
				result.remove((Integer) nums[i]);
			}
		}

		return result.get(0);
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println("result = " + s.singleNumber(new int[]{17,12,5,-6,12,4,17,-5,2,-3,2,4,5,16,-3,-4,15,15,-4,-5,-6}));


	}
}
