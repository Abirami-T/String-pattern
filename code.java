/*
QUESTION:
Pattern - String Alphabets
Given a string S as the input, the program must print the pattern as described in the Example Input/Output section.

Input Format:
The first line contains S.

Output Format:
The pattern as described in the Example Input/Output section.

Boundary Conditions:
2 <= Length of S <= 100

Example Input/Output 1:
Input:
EAGLE

Output:
EAGLE
AGLEE
GLEEA
LEEAG
EEAGL
EAGLE

Example Input/Output 2:
Input:
MORNING

Output:
MORNING
ORNINGM
RNINGMO
NINGMOR
INGMORN
NGMORNI
GMORNIN
MORNING

*/

import java.util.*;

public class Main
{
    static void rotate(String s){
        int len=s.length()+1;
        for(int i=0;i<=len;i++){
           if(i==0||i==len){
               System.out.println(s.substring(0));
           }
           else{
               System.out.println(s.substring(i)+s.substring(0,i));
           }
        }
    }
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		rotate(s);
	}
}
