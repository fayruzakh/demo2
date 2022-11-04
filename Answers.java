package CodingBat;

public class Answers {

        //1 countEvensnewb
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
            boolean noOne = true, noFour = true;
            for(int i = 0; i < nums.length && (noOne || noFour); i++)
            {
                if(nums[i] == 1)
                    noOne = false;
                else if(nums[i] == 4)
                    noFour = false;
            }
            return (noOne || noFour);
        }
        //6
        public int matchUp(int[] nums1, int[] nums2)
        {
            int count = 0;
            int diff;
            for(int i = 0; i < nums1.length; i++)
            {
                diff = Math.abs(nums1[i] - nums2[i]);
                if(diff <= 2 && diff != 0)
                    count++;
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
        public boolean sameEnds(int[] nums, int len)
        {
            int start = 0;
            int end = nums.length-len;
            for(; len > 0; len--)
            {
                if(nums[start] != nums[end])
                    return false;
                else
                {
                    start++;
                    end++;
                }
            }
            return true;
        }
        //9
        public int[] shiftLeft(int[] nums)
        {
            if(nums.length >= 2)
            {
                int temp = nums[0];
                for(int i = 0; i < nums.length - 1; i++)
                    nums[i] = nums[i+1];
                nums[nums.length-1] = temp;
            }
            return nums;
        }
        //10
        public int[] post4(int[] nums)
        {
            int p = nums.length - 1;
            int[] arr;
            while(nums[p] != 4)
                p--;
            arr = new int[nums.length - 1 - p];
            for(int i = p + 1; i < nums.length; i++)
                arr[i - p - 1] = nums[i];
            return arr;
        }
        //11
        public int[] withoutTen(int[] nums)
        {
            int[] arr = new int[nums.length];
            int p = 0;
            for(int i = 0; i < nums.length; i++)
            {
                if(nums[i] != 10)
                {
                    arr[p] = nums[i];
                    p++;
                }
            }

            return arr;
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




