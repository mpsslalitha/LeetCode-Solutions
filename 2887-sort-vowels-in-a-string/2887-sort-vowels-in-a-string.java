class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> a = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c== 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                a.add(c);
            }
        }
        Collections.sort(a);
        StringBuilder sb = new StringBuilder();
        int j = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c== 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                sb.append(a.get(j++));
            }
            else sb.append(c);
        }
        return sb.toString();
    }
}