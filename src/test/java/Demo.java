
public class Demo {

	public static void main(String[] args) {

		String str = "abc#&&(&(Agkjljl9O3OJL";

		char[] ch = str.toCharArray();

		String res = "";
		for (int i = 0; i < ch.length; i++) {

			if (ch[i] >= 'a' && ch[i] <= 'z') {

				char resChar = (char) (ch[i] - 32);

				res += resChar;

			} else {

				res += ch[i];
			}

		}
		
		System.out.println(res);

	}

}
