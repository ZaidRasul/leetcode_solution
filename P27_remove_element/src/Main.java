public class Main {
    public static void main(String[] args){
        int[] nums = {0,1,2,3,4,5,6,7};
        Solution sol = new Solution();
       int index = sol.removeElement(nums,3);
        System.out.println("Returned Index : " +index );
    }
}