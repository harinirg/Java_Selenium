/*
 * This  program uses for loop to print alphabets as follows:
 * az by cx dw ev fu gt hs ir jq kp lo mn nm ol pk qj ri sh tg uf ve wd xc yb za
 */
package com.handsOn1;
public class E5AlphabetPair {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(char f='a',l='z';f<='z'&&l>='a';f++,l--) {
			System.out.print(f+""+l+" ");
		}
	}
}