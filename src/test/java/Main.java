import org.junit.Test;

import java.util.*;

/**
 * 描述 腾讯笔试题
 *
 * @author 王祁
 * 时间：2021/4/18 下午 4:27
 */
public class Main{
    //对于每组数据，输出一个整数，代表最少需要删除的字符个数。
    @Test
    public void test1(){
        //输入一个字符串 1<=s.length<=1000.
//        String str = new Scanner(System.in).nextLine();
        String str = "abcadsesa";
        System.out.println(str);
        //从前往后找与当前字母一样的字符，然后得到两个字符的下标，继续从前边的下标开始到另外一个下标结束，
        //循环前边的方法，循环次数一直到第一个下标到另外一个下标的个数除以2（i<=(m-n)/2）
        //然后算出每个回文的字符个数，找出字符长度最长的那个回文串，
        //输出原字符串的长度和那个回文串的差
        Map<Integer, Integer> map = xunhuan(str);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
    }

    /**
     * 循环找相同字符的方法
     * @param str 接受一个字符串
     * @return 返回数组，里边有两个值，分别是第一个字母的下标和下一个相同字母的下标
     */
    public static Map<Integer,Integer> xunhuan(String str){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < str.length()-1 ; i++){
            for(int j = i+1 ; j < str.length() ; j++){
                //从前往后找与当前字母一样的字符，然后得到两个字符的下标
                char s1 = str.charAt(i);
                char s2 = str.charAt(j);
                if(s1 == s2){
                    //两个字符相同，得到下标
//                    System.out.println("第一个字符："+s1+"->"+i+",第二个字符："+s2+"->"+j);
                    map.put(i,j);
                }
            }
        }

        return map;
    }
}
