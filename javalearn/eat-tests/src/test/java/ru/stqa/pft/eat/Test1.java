package ru.stqa.pft.eat;

import com.mysql.jdbc.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

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

    @Test
    public void testUntitledTestCase() throws Exception {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy_hh:mm:ss");
        System. out.println (format.format(date));

        String url1 ="jdbc:mysql://192.168.168.5:3306/?useLegacyDatetimeCode=false&amp&serverTimezone=UTC";
        String username = "akeneo_pim_1";
        String password = "krlatq9bakd7e7pk";
        Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
        Connection conn = DriverManager.getConnection(url1, username, password);
        PreparedStatement stmt2 = conn.prepareStatement("SELECT id FROM akeneo_pim.pim_catalog_product where JSON_EXTRACT(raw_values, \'$.\"Product_name\".\"<all_channels>\".\"<all_locales>\"\') = \'Автотест_03.03.2019_02:06:42\'");
        stmt2.execute();
        ResultSet rs = stmt2.executeQuery();




     //   System.out.println(qa);
    //    JsonParser jp = new JsonParser();
        while (rs.next()) {
            System.out.println(rs.getString("id"));
        }
    /*    String url1 ="jdbc:mysql://192.168.168.6:3306/magento2";
        String dbClass = "com.mysql.jdbc.Driver";
        Class.forName(dbClass).newInstance();
        Connection con = DriverManager.getConnection(url1, "root", "tmp");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from b2bclient_organization where inn = 7702651292;");
        System. out.println (rs);






        while (rs.next()){ String organization_id = rs.getString(1);
           String inn = rs.getString(2);
           String ogrn = rs.getString(3);
            String name = rs.getString(4);
            System. out.println(organization_id+"  "+inn+"  "+ogrn+"  "+name);
        }   */
      // System.out.println(rs);

    }
}
