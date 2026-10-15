class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ll = new ArrayList<>();
        ll.add(new ArrayList<>());
        ll.add(new ArrayList<>());

        Set<Integer> set1 = new HashSet<>();
        for(int n : nums1){
            set1.add(n);
        }
        Set<Integer> set2 = new HashSet<>();
         for(int n : nums2){
            set2.add(n);
        }

        for(int n : set1){
            if(!set2.contains(n)){
                ll.get(0).add(n);
            }
        }

        for(int n : set2){
            if(!set1.contains(n)){
                ll.get(1).add(n);
            }
        }
    return ll;
    }
}