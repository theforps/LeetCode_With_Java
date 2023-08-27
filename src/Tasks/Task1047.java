package Tasks;

//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string

public class Task1047 {
    public Task1047(String s)
    {
        System.out.println(removeDuplicates(s));
    }

    public String removeDuplicates(String s) {

        var sb = new StringBuffer();

        for(var x : s.toCharArray())
        {
            if(!sb.isEmpty() && sb.charAt(sb.length() - 1) == x)
            {
                sb.deleteCharAt(sb.length() - 1);
            }
            else{
                sb.append(x);
            }
        }

        return new String(sb);
    }

    //Second variant
    /*
    public String removeDuplicates(String s) {

        var list = new ArrayList<Character>();

        for(var x : s.toCharArray())
        {
            if(list.size() > 0 && list.get(list.size() - 1) == x)
            {
                list.remove(list.size() - 1);
            }
            else{
                list.add(x);
            }
        }

        String str = new String();
        for(var x : list)
            str += x;

        return str;
    }
     */
}
