package CodingBat;

public class Answers {

        //1 countEven
        public int countEvens(int[] nums) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] % 2 == 0)
                    count++;
            }
            return count;
        }
        //2 sum13
        public int sum13(int[] nums)
        {
            int sum = 0;
            for(int i = 0; i < nums.length; i++)
            {
                if(nums[i] == 13)
                    i++;
                else
                    sum += nums[i];
            }
            return sum;
        }
        //3 lucky13
        public boolean lucky13(int[] nums)
        {
            for(int i = 0; i < nums.length; i++)
            {
                if(nums[i] == 1 || nums[i] == 3)
                    return false;
            }
            return true;
        }
        //4 fizzArray
        public int[] fizzArray(int n) {
            int[] result = new int[n];
            for (int i = 0; i < n; i++)
                result[i] = i;
            return result;
        }

        //5 no14
        public boolean no14(int[] nums)
        {
            boolean no1 = false, no4 = false;
            for(int i = 0; i < nums.length; i++)
            {
                if(nums[i] == 1)
                    no1 = true;
                if(nums[i] == 4)
                    no4 = true;
            }
            if(no1&&no4)
                return false;
            return true;
        }
        //6
        public int matchUp(int[] nums1, int[] nums2) {
            //initializing
            int count = 0;
      //going through the arr
            for(int i = 0; i < nums1.length; i++){
                //checking the conditions
                if( (Math.abs(nums1[i] - nums2[i] ) <= 2) && nums1[i] != nums2[i] ){
                    count ++;

                }
            }
            return count;
        }

        //7
        public boolean modThree(int[] nums)
        {
            for(int i = 0; i < nums.length - 2; i++)
            {
                if(nums[i] % 2 == nums[i+1] % 2 && nums[i] % 2 == nums[i+2] % 2)
                    return true;
            }
            return false;
        }
        //8
        public boolean sameEnds(int[] nums, int len){
// look at the n # instead of  running it through the whole loop
//set distance between the 1st one and the last one (move up by one bc i++)
            for(int i=0; i<len; i++){
                //check the last and 1st besed on the length of the n and arr
                if(nums[i]!=nums[nums.length-len+i]){
                    return false;
                }
            }
            return true;
        }
        //9
        public int[] shiftLeft(int[] nums)
        {
            // if the arr is consist of 1 element then return that arr
            if(nums.length==0) return nums;
            //1st element keeping track at index 0
            int temp = nums[0];

            for(int i = 0; i < nums.length - 1; i++){
                //num on the left changed into the number on the right of it ex:6 to 2
                nums[i] = nums[i+1];
            }
//after we run through the for loop we add the 1st element back to the arr
            nums[nums.length-1] = temp;

            return nums;
        }
        //10
        public int[] post4(int[] nums){
//to keep track of where the last 4 is
            int index=0;
            for (int i=0; i<nums.length; i++) {
                //if the # @ i is equal to 4
                if (nums[i] == 4){
                    //change the index so that its equal to the index of that 4
                    //add 1 bc we want the arr to include the # after 4
                    index=i+1; }
            }
            // 4 at index 1
            //int index at 2 bc of +i
            //length = 4
            //therefore 4-2=2
            //setting the size
            int[]result=new int[nums.length-index];
            for(int i=0;i<nums.length-index; i++){
                // adds the last numbers into the resulting arr
                //+ index starts 1st # after 4
                result[i]=nums[i+index];
            }
            return result;
        }
        //11
        public int[] withoutTen(int[] nums) {
            //check for none10 values there are
            //put elements that are not 10 into the top of the
            int  index =0;
            for(int i=0; i< nums.length; i++) {
                //takes the non10 vales and puts them to le left side of the array
                if( nums[i]!=10) {
                    nums[index] = nums[i];
                    index++;
                }
            }
            for(int i=index; i<nums.length; i++) {
                nums[i]=0;
            }
            return nums;
        }

    //12
        public String[] fizzBuzz(int start, int end) {
            int n = end - start;
            String[] result = new String[n];
            int pos = 0;
            for (int i = start; i < end; i++) {
                boolean fizz = i % 3 == 0;
                boolean buzz = i % 5 == 0;
                if (fizz && buzz) result[pos] = "FizzBuzz";
                else if (fizz) result[pos] = "Fizz";
                else if (buzz) result[pos] = "Buzz";
                else result[pos] = String.valueOf(i);
                pos++;
            }
            return result;
        }


    }




