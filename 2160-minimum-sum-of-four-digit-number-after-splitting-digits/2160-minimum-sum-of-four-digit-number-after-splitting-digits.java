class Solution {
    public int minimumSum(int num) {
        int arr[]=new int[4];
        int i=0;
        int num2=num;
        while(num>0){
            arr[i]=num%10;
            num=num/10;
            i++;
        }
        Arrays.sort(arr);
        int n1=arr[3]+10*arr[0];
        int n2=arr[2]+ 10*arr[1];
        return n1+n2;
    }
}