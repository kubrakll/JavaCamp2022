package sesliHarfler;

public class Main {

	public static void main(String[] args) {

		char harf = 'E';
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kal�n sesli harf");
			break;
		default:
			System.out.println("�nce sesli harf");
			break;

		}

		String character = "E";
		String C = character.toLowerCase();
		switch (C) {
		case "a": {
			System.out.println(character + " is a vowel");
			break;
		}
		case "e": {
			System.out.println(character + " is a vowel");
			break;
		}
		case "�": {
			System.out.println(character + " is a vowel");
			break;
		}
		case "i": {
			System.out.println(character + " is a vowel");
			break;
		}
		case "o": {
			System.out.println(character + " is a vowel");
			break;
		}
		case "�": {
			System.out.println(character + " is a vowel");
			break;
		}
		case "u": {
			System.out.println(character + " is a vowel");
			break;
		}
		case "�": {
			System.out.println(character + " is a vowel");
			break;
		}
		default:
			System.out.println(character + " is not a vowel");
			break;
		}

	}

}
