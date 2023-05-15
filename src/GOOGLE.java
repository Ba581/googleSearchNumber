import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
public class GOOGLE extends PARAMETER{
@Test(priority=1)
public void  verify_the_search_results_bayan () {
	driver.findElement(By.name("q")).sendKeys("bayan"+Keys.ENTER);
	driver.findElement(By.xpath("//*[@id=\"Rzn5id\"]/div/a[2]")).click();
	String search_results = driver.findElement(By.id("result-stats")).getText();
	String splitedText[] = search_results.split(" ");
	String theNumberOfTheSearchResult = splitedText[1];
	String theNumberOfTheSearchResultApdated = theNumberOfTheSearchResult.replace(",","");
	int ActualResultNumber = Integer.parseInt(theNumberOfTheSearchResultApdated);
	int ExpectedResultNumber = 10 ;

	myAssertion.assertEquals(ActualResultNumber, ExpectedResultNumber);
	myAssertion.assertAll();

}
@Test(priority=2 , groups="long")
public void verify_the_search_results_cat () {
	driver.get("https://www.google.com");
	driver.findElement(By.name("q")).sendKeys("cat"+Keys.ENTER);
	String search_results = driver.findElement(By.id("result-stats")).getText();
	String[] split = search_results.split(" ");
	String numbersearhresult= split[1];
	String newnumbersearhresult = numbersearhresult.replace(",", "");
	long actualresult = Long.parseLong(newnumbersearhresult);
	long expextedresult = 10;
	myAssertion.assertEquals(actualresult, expextedresult);
	myAssertion.assertAll();
	
	

}



}
