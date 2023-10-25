package Tasks.Medium;

//https://leetcode.com/problems/number-of-substrings-containing-all-three-characters

public class Task1358 {
    public Task1358(String s)
    {
        System.out.println(numberOfSubstrings(s));
    }

    //not mine
    public int numberOfSubstrings(String s) {

        int cnt_a=-1, cnt_b=-1, cnt_c=-1;

        int i=0, res=0;
        for(char ch : s.toCharArray()){
            if(ch == 'a') cnt_a = i;
            else if(ch == 'b') cnt_b = i;
            else cnt_c= i;

            if(i>1) res += (Math.min(cnt_a, Math.min(cnt_b, cnt_c)) +1);
            i++;
        }
        return res;
    }

    //it's mine
//    public int numberOfSubstrings(String s) {
//
//        int count = 0, j;
//        String str;
//
//        for(int i = 0; i < s.length(); i++)
//        {
//            str = "";
//            j = s.length();
//
//            while(j - i >= 3)
//            {
//                str = s.substring(i, j);
//
//                if(str.length() >= 3
//                        && str.contains("a")
//                        && str.contains("b")
//                        && str.contains("c"))
//                    count++;
//
//                j--;
//            }
//        }
//        return count;
//    }
}
