package Tasks;

//https://leetcode.com/problems/1-bit-and-2-bit-characters

public class Task717 {
    public Task717(int[] bits)
    {
        System.out.println(isOneBitCharacter(bits));
    }

    public boolean isOneBitCharacter(int[] bits) {

        boolean isOneBitEnd = false;
        String strMain = "";
        int i = 0;

        for(var x: bits)
            strMain += Integer.valueOf(x);

        StringBuilder sb = new StringBuilder(strMain);

        while(sb.length() > 1)
        {
            String strTemp = sb.substring(i, i + 2);

            switch (strTemp){
                case "01", "00":
                    sb.deleteCharAt(i);
                    i = 0;
                    break;
                case "11", "10":
                    sb.deleteCharAt(i);
                    sb.deleteCharAt(i);
                    i = 0;
                    break;
                default:
                    i += 1;
            }
        }

        if(sb.length() == 1)
            isOneBitEnd = true;

        return isOneBitEnd;
    }

}
