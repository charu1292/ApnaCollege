package org.example.Arrays;

public class TrappedRainWater {


    public static int trappedRainWater(int[] height){
        int n=height.length;
        //calculate the left max boundary --array
        int[] leftMax=new int[n];
        leftMax[0] =height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        //calculate the right max boundary --array
        int[] rightMax=new int[n];
        rightMax[n-1]=height[n-1];
        for (int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }

        int tarppedwater=0;
        for(int i=0;i<n;i++) {
            //loop calculate the water level
           int waterlevel=Math.min(leftMax[i],rightMax[i]);
            //calculate the trapped rain water
            tarppedwater+=waterlevel-height[i];
        }
        return tarppedwater;
    }


    public static void main(String[] args) {
        int[] height={4,2,0,6,3,2,5};
        System.out.println((trappedRainWater(height)));
    }
}
