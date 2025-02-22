public class Replace_sp_char {
	public static void main(String[] args) {
		String str = "Aks!ha2@i";
		System.out.println(str.replaceAll("[^a-zA-Z]", ""));
		// It remoces all the special character and returns the aplabets only
	}

}