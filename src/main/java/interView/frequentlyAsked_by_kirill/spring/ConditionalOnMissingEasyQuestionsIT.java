package interView.frequentlyAsked_by_kirill.spring;



import interView.frequentlyAsked_by_kirill.testClasses.BadHashDistribution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;


//https://youtu.be/CVGmIp9Wv68?si=BM2i_AIVVxU3jWVx&t=1657


@ContextConfiguration(classes = ConditionalOnBeanTestConfig.class)
//@SpringBootTest(properties = {"my.custom.value=false"})
public class ConditionalOnMissingEasyQuestionsIT {
    @Autowired
    private BadHashDistribution bean;

    @Value("${my.custom.value}")
    private String value;

    @Test
    public void conditionalOn_Demo(){
        System.out.println(value);
        Assertions.assertEquals("Condition 2", bean.getName());
    }
}