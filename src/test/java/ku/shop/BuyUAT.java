package ku.shop;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

// ให้รัน Cucumber โดยใช้ feature file ในโฟลเดอร์ใด และให้แสดงผลแบบใด

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features",
                 plugin = {"pretty", "html:target/cucumber.html"})
// 6410406703 นภสมล ศิริบรรจง
public class BuyUAT {
}

