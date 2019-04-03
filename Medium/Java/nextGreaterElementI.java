// Solution: Keep a hashmap where the
//    keys: numbers that have a next greater element.
//    value: the value that is greater.
// Use the stack to check if I have a value that is greater then I add into my hashmap. Loop through first array and if the
// value is present in the map, it means it has a next greater element.
// Runtime: O(n)

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        
        for (int i = 0; i < nums2.length; i++) {
            while (!st.isEmpty() && st.peek() < nums2[i]) {
                map.put(st.pop(), nums2[i]);
            }
            
            st.push(nums2[i]);
        }
        
        for (int i = 0; i < nums1.length; i++) {
            if(map.get(nums1[i]) != null) {
                nums1[i] = map.get(nums1[i]);
            }
            else {
                nums1[i] = -1;
            }
        }
        
        return nums1;
    }
}
