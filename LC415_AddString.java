public class Solution {
	public String addStrings(String num1, String num2) {
		int carry = 0;
		int idx1 = num1.length() - 1, idx2 = num2.length() - 1;

		StringBuilder sumStr = new StringBuilder();

		while(idx1 >= 0 || idx2 >=0) {
			int n1 = 0, n2 = 0;

			// '0' in ASCII has 48 value, '1' - 49, etc... 
			if (idx1 >= 0) {
				n1 = num1.charAt(idx1) - '0';
			}
			
			if (idx2 >= 0) {
				n2 = num2.charAt(idx2) - '0';	
			}

			int sum = n1 + n2 + carry;
			carry = sum / 10;
			sumStr.append(sum % 10);

			idx1--;
			idx2--;
		}

		if (carry != 0) {
			sumStr.append(carry);
		}

		return sumStr.reverse().toString();
	}
}
