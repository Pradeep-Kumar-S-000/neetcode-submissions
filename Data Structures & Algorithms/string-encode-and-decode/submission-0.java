class Solution {

    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();
        for(String str : strs) {
            result.append(str.length()).append("#").append(str);
        }
        return result.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0, j = 0;

        while(i < str.length()) {
            while(j < str.length() && str.charAt(j) != '#') j++;
            int length = Integer.parseInt(str.substring(i,j));
            list.add(str.substring(j+1,j+1+length));
            i = j + 1 + length; j = i;
        }
        return list;

    }
}
