public class PasswordGenerator {

<<<<<<< HEAD
	public static void main(String[] xyz) {
		String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ", chars = "abcdefghijklmnopqrstuvwxyz", nums = "0123456789",
				symbols = "!@#$%^&*_=+-/.?<>(){}", password = "";

		java.util.Random rnd = new java.util.Random();

		for (int i = 0; i < 15; i++) {
			switch (i % 4) {
			case 0:
				password += CHARS.charAt(rnd.nextInt(CHARS.length()));
				break;
			case 1:
				password += chars.charAt(rnd.nextInt(chars.length()));
				break;
			case 2:
				password += nums.charAt(rnd.nextInt(nums.length()));
				break;
			case 3:
				password += symbols.charAt(rnd.nextInt(symbols.length()));
				break;
			}
		}
		System.out.println("Your Password : " + password);
	}
=======
    public static void main(String[] args) {
        int length = 12; // password length to be given by user
        System.out.println(generatePswd(length));
    }

    static String generatePswd(int len) {
        System.out.println("Your Password:");
        String charsCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String chars = "abcdefghijklmnopqrstuvwxyz";
        String nums = "0123456789";
        String symbols = "!@#$%^&*_=+-/�.?<>)";

        Random rnd = new Random();

        String password = "";

        int index = 0;

        int a[] = {0, 1, 2, 3}; // order is to be given by user

        for (int i = 0; i < len; i++) {
            switch (a[i % 4]) {
                case 0:
                    password = password + charsCaps.charAt(rnd.nextInt(charsCaps.length()));
                    break;
                case 1:
                    password = password + chars.charAt(rnd.nextInt(chars.length()));
                    break;
                case 2:
                    password = password + nums.charAt(rnd.nextInt(nums.length()));
                    break;
                case 3:
                    password = password + symbols.charAt(rnd.nextInt(symbols.length()));
                    break;
            }
        }
        return password;
    }
>>>>>>> 4d1cccb0929820a779501bd544eb3d506f76c6a3
}