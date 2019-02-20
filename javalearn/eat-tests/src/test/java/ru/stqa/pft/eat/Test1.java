package ru.stqa.pft.eat;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        baseUrl = "https://www.katalon.com/";

    }

    @org.testng.annotations.Test
    public void testUntitledTestCase() throws Exception {

        String url1 ="jdbc:mysql://192.168.168.6:3306/magento2";
        String dbClass = "com.mysql.jdbc.Driver";
        Class.forName(dbClass).newInstance();
        Connection con = DriverManager.getConnection(url1, "root", "tmp");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from b2bclient_organization where organization_id = 919786;");



        while (rs.next()){ String organization_id = rs.getString(1);
           String inn = rs.getString(2);
           String ogrn = rs.getString(3);
            String name = rs.getString(4);
            System. out.println(organization_id+"  "+inn+"  "+ogrn+"  "+name);
        }
      // System.out.println(rs);

    }
}
