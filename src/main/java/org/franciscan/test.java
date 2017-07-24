package org.franciscan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class test {
    public static void main(String[] args) throws IOException, InterruptedException {
       System.setProperty("webdriver.chrome.driver", "D:\\selenium drivers\\chromedriver_win32new\\chromedriver.exe");
        WebDriver dr = new ChromeDriver();
        dr.manage().window().maximize();
        /* dr.get("https://www.microsoft.com/en-in/download/details.aspx?id=42299");
        dr.findElement(By.className("download-button")).click();
        dr.findElement(By.xpath("//*[@id=\"c3be6a19-ec3b-4b3b-c3f0-51317eccb8f8\"]/div/div/div[2]/div[1]/div[2]/div/table/tbody/tr[8]/td[1]/input")).click();
        //String sr=dr.findElement(By.className("download-button")).getAttribute("href");
        //System.out.println(sr);
        dr.findElement(By.id("5b70c241-07ba-40b9-c0c1-6aae74ab472b")).click();
        File f = new File("C:\\Users\\himanshu\\Downloads\\Unconfirmed 222962.crdownload");

        do {
            Thread.sleep(3000);
        } while (f.exists() && f.length() == 36600000);
        //String w_sr="cmd /d D:\\software\\wget.exe -P D:\\download --no-check-certificate" + sr;
        try {Process exec = Runtime.getRuntime().exec(w_sr);

            int exit=exec.waitFor();
            System.out.println("EXit value:"+exit);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        dr.get("http://qaerp.franciscanecare.net/Secure/#");
        dr.findElement(By.id("txtUserName")).sendKeys("admin");
        dr.findElement(By.id("txtPassword")).sendKeys("Admin#franciscan");
        dr.findElement(By.id("btnLogin")).click();
        dr.findElement(By.xpath("//img[@src=images/big/Fee-Manager.png]")).click();
        dr.findElement(By.xpath("//*[@id=\"form2\"]/div[4]/div/ul/li[2]/a/span"));
        dr.findElement(By.linkText("Define Bank")).click();
        dr.findElement(By.name("ctl00$ContentPlaceHolder1$BtnControls1$btnView")).click();
        String nw=dr.findElement(By.id("ContentPlaceHolder1_rptBank_lblAccNo_1")).getText();
        System.out.println(nw);
      /* WebElement wb= dr.findElement(By.xpath("//*[@id=\"example\"]/tbody"));
       List<WebElement> wv =wb.findElements(By.tagName("tr"));
       int row;
        for(row=0;row<wv.size();row++)
        {

        }
        */
dr.close();
    }
}
