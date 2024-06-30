class Solution {
    
    // Works but terrible code
//     public int romanToInt(String s) {
//         HashMap<String, Integer> hm = new HashMap<>();
//         hm.put("I", 1);
//         hm.put("V", 5);
//         hm.put("X", 10);
//         hm.put("L", 50);
//         hm.put("C", 100);
//         hm.put("D", 500);
//         hm.put("M", 1000);
//         hm.put("IV", 4);
//         hm.put("IX", 9);
//         hm.put("XL", 40);
//         hm.put("XC", 90);
//         hm.put("CD", 400);
//         hm.put("CM", 900);
        
//         int ans = 0;
//         for (int i = 0; i < s.length(); i++) {
//             if( hm.get(s.substring(i,i+1)) < hm.get(s.substring(i+1 == s.length() ? i : i+1, i+2 > s.length() ? i+1 : i+2)) ) {
//                 ans += hm.get(s.substring(i,(++i)+1));
//             } else {
//                 ans += hm.get(s.substring(i,i+1));
//             }
//         }
        
//         return ans;
//     }
    
    // Code is easy to understand but not so efficient
//     public int romanToInt(String s) {
//         HashMap<Character, Integer> hm = new HashMap<>();
//         hm.put('I', 1);
//         hm.put('V', 5);
//         hm.put('X', 10);
//         hm.put('L', 50);
//         hm.put('C', 100);
//         hm.put('D', 500);
//         hm.put('M', 1000);
        
//         int ans = 0;
        
//         for (int i = 0; i < s.length(); i++) {
//             if (i < s.length()-1 && hm.get(s.charAt(i)) < hm.get(s.charAt(i+1))) {
//                 ans -= hm.get(s.charAt(i));
//             } else {
//                 ans += hm.get(s.charAt(i));
//             }
//         }
//         return ans;
//     }
    
    // Best Approach: Switch case
    public int romanToInt(String s) {
        int ans = 0, num = 0, prev = 0;
        
        for (int i = s.length()-1; i >=0; i--) {
            switch(s.charAt(i)) {
                    case('I') -> num = 1;
                    case('V') -> num = 5;
                    case('X') -> num = 10;
                    case('L') -> num = 50;
                    case('C') -> num = 100;
                    case('D') -> num = 500;
                    case('M') -> num = 1000;
            }
            if (num < prev) {
                ans -= num;
            } else {
                ans += num;
            }
            prev = num;
        }
        return ans;
    }
}