package interView.frequentlyAsked_by_kirill.spring;


import interView.frequentlyAsked_by_kirill.testClasses.BadHashDistribution;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

public class ConditionalOnBeanTestConfig {

    //TODO суть стартера == возьми из конфига my.custom.value такую-то переменную

    // conditional  The most common usage would be to include or exclude the whole
            // configuration class https://www.baeldung.com/spring-conditional-annotations

    //@ConditionalOnProperty(value = "my.custom.value", havingValue = "true")
    @Bean
    public BadHashDistribution badHashDistribution(){
        return new BadHashDistribution("Condition 1");
    }

    //@ConditionalOnMissingBean(value = BadHashDistribution.class)
    @Bean
    public BadHashDistribution otherbadHashDistribution(){
        return new BadHashDistribution("Condition 2");
    }
}