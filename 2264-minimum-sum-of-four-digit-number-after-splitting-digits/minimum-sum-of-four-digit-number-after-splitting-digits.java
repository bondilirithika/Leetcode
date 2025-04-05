class Solution {
    public int minimumSum(int num) {
        int[] arr=new int[4];
        int i=0;
        while(num>0)
        {
            arr[i++]=num%10;
            num=num/10;
        }
        Arrays.sort(arr);
        int num1=0;
        num1=arr[0]*10;
        num1+=arr[3];
        int num2=arr[1]*10+arr[2];
        return num1+num2;

    }
}