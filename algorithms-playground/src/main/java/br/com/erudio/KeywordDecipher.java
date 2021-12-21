package br.com.erudio;

import java.util.TreeMap;

public class KeywordDecipher {
	
	private static String plaintext = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	// Function generates the encoded text
	private static String encoder(String key)
	{
		String encoded = "";
		boolean[] arr = {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};

		// This loop inserts the keyword
		// at the start of the encoded string
		for (int i = 0; i < key.length(); i++)
		{
			if (key.charAt(i) >= 'A' && key.charAt(i) <= 'Z')
			{
				// To check whether the character is inserted
				// earlier in the encoded string or not
				if (arr[key.charAt(i) - 65] == false)
				{
					encoded += key.charAt(i);
					arr[key.charAt(i) - 65] = true;
				}
			}
			else if (key.charAt(i) >= 'a' && key.charAt(i) <= 'z')
			{
				if (arr[key.charAt(i) - 97] == false)
				{
					encoded += key.charAt(i) - 32;
					arr[key.charAt(i) - 97] = true;
				}
			}
		}

		// This loop inserts the remaining
		// characters in the encoded string.
		for (int i = 0; i < 26; i++)
		{
			if (arr[i] == false)
			{
				arr[i] = true;
				encoded += (char)(i + 65);
			}
		}
		return encoded;
	}

	// This function will decode the message
	private static String decipheredIt(String msg, String encoded)
	{
		// Hold the position of every character (A-Z)
		// from encoded string
		TreeMap<Character,Integer> enc = new TreeMap<Character,Integer>();
		for (int i = 0; i < encoded.length(); i++)
		{
			enc.put(encoded.charAt(i), i);
		}

		String decipher = "";

		// This loop deciphered the message.
		// Spaces, special characters and numbers remain same.
		for (int i = 0; i < msg.length(); i++)
		{
			if (msg.charAt(i) >= 'a' && msg.charAt(i) <= 'z')
			{
				int pos = enc.get(msg.charAt(i) - 32);
				decipher += plaintext.charAt(pos);
			}
			else if (msg.charAt(i) >= 'A' && msg.charAt(i) <= 'Z')
			{
				var foo = msg.charAt(i);
				int pos = enc.get(foo);
				decipher += plaintext.charAt(pos);
			}
			else
			{
				decipher += msg.charAt(i);
			}
		}
		return decipher;
	}

	// Driver code
	public static void main(String[] args)
	{
		// Hold the Keyword
		String key;
		key = "Computer";
		System.out.print("Keyword : ");
		System.out.print(key);
		System.out.print("\n");

		// Function call to generate encoded text
		String encoded = encoder(key);

		// Message that need to decode
		String message = "EUUDN TIL EUUDN";
		System.out.print("Message before Deciphering : ");
		System.out.print(message);
		System.out.print("\n");

		// Function call to print deciphered text
		System.out.print("Deciphered Text : ");
		System.out.print(decipheredIt(message, encoded));
		System.out.print("\n");

	}
}
