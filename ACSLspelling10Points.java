import java.util.Scanner;


public class ACSLspelling10Points {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your input");
		String input1 = in.nextLine();
		String input2 = in.nextLine();
		String input3 = in.nextLine();
		String input4 = in.nextLine();
		String input5 = in.nextLine();
		String input6 = in.nextLine();
		String input7 = in.nextLine();
		String input8 = in.nextLine();
		String input9 = in.nextLine();
		String input10 = in.nextLine();
		String[] x = { input1, input2, input3, input4, input5, input6, input7,
				input8, input9, input10 };

		for (int a = 0; a < 5; a++) {
			if (x[a].substring((x[a].length()) - 2, x[a].length()).equals("ch")
					|| x[a].substring(x[a].length() - 2, x[a].length()).equals(
							"sh")
					|| x[a].substring(x[a].length() - 1, x[a].length()).equals(
							"s")
					|| x[a].substring(x[a].length() - 1, x[a].length()).equals(
							"x")
					|| x[a].substring(x[a].length() - 1, x[a].length()).equals(
							"z")) {
				System.out.println(x[a] + "es");
			}

			else if (x[a].substring(x[a].length() - 2, x[a].length()).equals(
					"ay")
					|| x[a].substring(x[a].length() - 2, x[a].length()).equals(
							"ey")
					|| x[a].substring(x[a].length() - 2, x[a].length()).equals(
							"iy")
					|| x[a].substring(x[a].length() - 2, x[a].length()).equals(
							"oy")
					|| x[a].substring(x[a].length() - 2, x[a].length()).equals(
							"uy")) {
				System.out.println(x[a] + "s");
			}

			else if (x[a].substring(x[a].length() - 1, x[a].length()).equals(
					"y")) {
				System.out.println(x[a].substring(0, (x[a].length()) - 1)
						+ "ies");

			} else if (x[a].substring(x[a].length() - 1, x[a].length()).equals(
					"f")) {
				System.out.println(x[a].substring(0, (x[a].length()) - 1)
						+ "ves");
			}

			else if (x[a].substring(x[a].length() - 2, x[a].length()).equals(
					"fe")) {
				System.out.println(x[a].substring(0, (x[a].length()) - 2)
						+ "ves");
			} 
			else if (x[a].substring(x[a].length() - 2, x[a].length()).equals(
					"ao")
					|| x[a].substring(x[a].length() - 2, x[a].length()).equals(
							"eo")
					|| x[a].substring(x[a].length() - 2, x[a].length()).equals(
							"io")
					|| x[a].substring(x[a].length() - 2, x[a].length()).equals(
							"oo")
					|| x[a].substring(x[a].length() - 2, x[a].length()).equals(
							"uo")) {
				System.out.println(x[a] + "s");
			}
			
			else if ((!x[a].substring(x[a].length() - 2, x[a].length()).equals(
					"ao")
					|| !x[a].substring(x[a].length() - 2, x[a].length()).equals(
							"eo")
					|| !x[a].substring(x[a].length() - 2, x[a].length()).equals(
							"io")
					|| !x[a].substring(x[a].length() - 2, x[a].length()).equals(
							"oo")
					|| !x[a].substring(x[a].length() - 2, x[a].length()).equals(
							"uo")) && x[a].substring(x[a].length() - 1, x[a].length()).equals("o")) {
				System.out.println(x[a] + "es");
			}




			else {
				System.out.println(x[a] + "s");
			}

		}

		for (int a = 5; a < x.length; a++) {

			String[] prt = x[a].split(",");
			String root = prt[0];
			String suffix = prt[1];

			if (root.endsWith("e")) {
				if (suffix.startsWith("a") || suffix.startsWith("e")
						|| suffix.startsWith("i") || suffix.startsWith("o")
						|| suffix.startsWith("u")) {
					System.out.println(root.substring(0, (root.length() - 1))
							+ suffix);
				} else if (!suffix.startsWith("a") || !suffix.startsWith("e")
						|| !suffix.startsWith("i") || !suffix.startsWith("o")
						|| !suffix.startsWith("u")) {

					System.out.println(root + suffix);

				}
			}

			else if (root.endsWith("y")) {
				if (!suffix.startsWith("i")) {
					System.out.println(root.substring(0, (root.length() - 1))
							+ "i" + suffix);
				} else if (suffix.startsWith("i")) {

					System.out.println(root + suffix);

				}
			}

			else if ((!root.endsWith("a") || !root.endsWith("e")
					|| !root.endsWith("i") || !root.endsWith("o") || !root
						.endsWith("u"))
					&& (suffix.startsWith("a") || suffix.startsWith("e")
							|| suffix.startsWith("i") || suffix.startsWith("o") || suffix
								.startsWith("u"))) {
				if (root.substring(root.length() - 2, root.length() - 1)
						.equals("a")
						|| root.substring(root.length() - 2, root.length() - 1)
								.equals("e")
						|| root.substring(root.length() - 2, root.length() - 1)
								.equals("i")
						|| root.substring(root.length() - 2, root.length() - 1)
								.equals("o")
						|| root.substring(root.length() - 2, root.length() - 1)
								.equals("u")) {
					System.out.println(root
							+ root.substring(root.length() - 1, root.length())
							+ suffix);
				}
			}
			
			else{
				
				System.out.println(root + suffix);
			}

		}

	}

}
