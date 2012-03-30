import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import org.junit.Test;
import static org.junit.Assert.*;


public class PrintBalanceTest {
	Locale currentLocale;
	ResourceBundle messages;
	
	@Test
	public void testEnUSGreetings(){
		currentLocale = new Locale("en", "US");
		messages = ResourceBundle.getBundle("MessageBundle", currentLocale);
		assertEquals(messages.getString("greetings"), "Hello World");
	}
	
	@Test
	public void testEnUSInquiry(){
		currentLocale = new Locale("en", "US");
		messages = ResourceBundle.getBundle("MessageBundle", currentLocale);
		assertEquals(messages.getString("inquiry"), "Please enter your name");
	}
	
	@Test
	public void testEnUSNameStatement(){
		currentLocale = new Locale("en", "US");
		messages = ResourceBundle.getBundle("MessageBundle", currentLocale);
		assertEquals(messages.getString("nameStatement"), "I am pleased to meet you");
	}
	
	@Test
	public void testEnUSDateStatement(){
		currentLocale = new Locale("en", "US");
		messages = ResourceBundle.getBundle("MessageBundle", currentLocale);
		assertEquals(messages.getString("dateStatement"), "As of :");
	}
	
	@Test
	public void testEnUSBillStatement(){
		currentLocale = new Locale("en", "US");
		messages = ResourceBundle.getBundle("MessageBundle", currentLocale);
		assertEquals(messages.getString("billStatement"), "You owe the school");
	}
	
	@Test
	public void testEnUSDebt(){
		currentLocale = new Locale("en", "US");
		messages = ResourceBundle.getBundle("MessageBundle", currentLocale);
		NumberFormat numFormater = NumberFormat.getCurrencyInstance(currentLocale);
		String debtFormat = numFormater.format(Float.valueOf(messages.getString("debt")).floatValue());
		assertEquals(debtFormat, "$9,876,543.21");
	}
	
	@Test
	public void testEnUSFarewell(){
		currentLocale = new Locale("en", "US");
		messages = ResourceBundle.getBundle("MessageBundle", currentLocale);
		assertEquals(messages.getString("farewell"), "Goodbye");
	}
	
	@Test
	public void testFrFRGreetings(){
		currentLocale = new Locale("fr", "FR");
		messages = ResourceBundle.getBundle("MessageBundle", currentLocale);
		assertEquals(messages.getString("greetings"), "Bonjour tout le monde");
	}
	
	@Test
	public void testFrFRInquiry(){
		currentLocale = new Locale("fr", "FR");
		messages = ResourceBundle.getBundle("MessageBundle", currentLocale);
		assertEquals(messages.getString("inquiry"), "S'il vous plaît entrer votre nom");
	}
	
	@Test
	public void testFrFRNameStatement(){
		currentLocale = new Locale("fr", "FR");
		messages = ResourceBundle.getBundle("MessageBundle", currentLocale);
		assertEquals(messages.getString("nameStatement"), "Je suis heureux de vous rencontrer");
	}
	
	@Test
	public void testFrFRDateStatement(){
		currentLocale = new Locale("fr", "FR");
		messages = ResourceBundle.getBundle("MessageBundle", currentLocale);
		assertEquals(messages.getString("dateStatement"), "En date du:");
	}
	
	@Test
	public void testFrFRBillStatement(){
		currentLocale = new Locale("fr", "FR");
		messages = ResourceBundle.getBundle("MessageBundle", currentLocale);
		assertEquals(messages.getString("billStatement"), "Vous devez l'école");
	}
	
	@Test
	public void testFrFRDebt(){
		currentLocale = new Locale("fr", "FR");
		messages = ResourceBundle.getBundle("MessageBundle", currentLocale);
		NumberFormat numFormater = NumberFormat.getCurrencyInstance(currentLocale);
		String debtFormat = numFormater.format(Float.valueOf(messages.getString("debt")).floatValue());
		assertEquals(debtFormat, "9.876.543,21 €");
	}
	
	@Test
	public void testFrFRFarewell(){
		currentLocale = new Locale("fr", "FR");
		messages = ResourceBundle.getBundle("MessageBundle", currentLocale);
		assertEquals(messages.getString("farewell"), "au revoir");
	}
	
	@Test
	public void testDeDEGreetings(){
		currentLocale = new Locale("de", "DE");
		messages = ResourceBundle.getBundle("MessageBundle", currentLocale);
		assertEquals(messages.getString("greetings"), "Hallo Welt");
	}
	
	@Test
	public void testDeDEInquiry(){
		currentLocale = new Locale("de", "DE");
		messages = ResourceBundle.getBundle("MessageBundle", currentLocale);
		assertEquals(messages.getString("inquiry"), "Bitte geben Sie Ihren Namen");
	}
	
	@Test
	public void testDeDENameStatement(){
		currentLocale = new Locale("de", "DE");
		messages = ResourceBundle.getBundle("MessageBundle", currentLocale);
		assertEquals(messages.getString("nameStatement"), "Ich freue mich, Sie kennen zu lernen");
	}
	
	@Test
	public void testDeDEDateStatement(){
		currentLocale = new Locale("de", "DE");
		messages = ResourceBundle.getBundle("MessageBundle", currentLocale);
		assertEquals(messages.getString("dateStatement"), "Stand:");
	}
	
	@Test
	public void testDeDEBillStatement(){
		currentLocale = new Locale("de", "DE");
		messages = ResourceBundle.getBundle("MessageBundle", currentLocale);
		assertEquals(messages.getString("billStatement"), "Sie schulden die Schule");
	}
	
	@Test
	public void testDeDEDebt(){
		currentLocale = new Locale("de", "DE");
		messages = ResourceBundle.getBundle("MessageBundle", currentLocale);
		NumberFormat numFormater = NumberFormat.getCurrencyInstance(currentLocale);
		String debtFormat = numFormater.format(Float.valueOf(messages.getString("debt")).floatValue());
		assertEquals(debtFormat, "9 876 543,00 €");
	}
	
	@Test
	public void testDeDEFarewell(){
		currentLocale = new Locale("de", "DE");
		messages = ResourceBundle.getBundle("MessageBundle", currentLocale);
		assertEquals(messages.getString("farewell"), "Auf Wiedersehen");
	}
}
