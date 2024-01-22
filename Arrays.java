package firstStep;

public class Arrays {
    public void arrays(){
        System.out.println("-------ARRAYS-------");

        int[] nums = new int[5];
        for (int i = 0; i< nums.length; i++) System.out.printf("%d element is: %d\n",i+1, nums[i]);
        float[] nums2 = new float[] {1.25f, 2.78f, 6.92f};
        nums2[2] = 3;
        for (int i = 0; i< nums2.length; i++) System.out.printf("%d element is: %.2f\n",i+1, nums2[i]);

        // char [][] syms = new char [3][2];
        // [[1,2],[3,4],[4,5]]
        // syms[0][0] = 1;
        // syms[0][1] = 2;
        // syms[1][0] = 3;

        byte[][] nums3 = new byte[][] {
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {10,11,12}
        };

        for(int i =0; i<nums3.length; i++) for (int j =0; j<nums3[i].length;j++) System.out.println(nums3[i][j]);
        
        for(Integer el : nums) System.out.println(el);
        for(Byte el : nums3[0]) System.out.println(el); // before for i
    }
}
