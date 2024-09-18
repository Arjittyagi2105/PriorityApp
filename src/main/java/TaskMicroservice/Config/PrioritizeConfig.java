package TaskMicroservice.Config;


import TaskMicroservice.Service.DeadlinePrioritizer;
import TaskMicroservice.Service.Prioritize;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestParam;

@Configuration
public class PrioritizeConfig {
//    @Bean
//    public Prioritize getPrioritizer(@RequestParam String strategy) {
//        switch (strategy) {
//            case "deadline":
//                return new DeadlinePrioritizer();
////            case "eisenhower":
////                return eisenhowerPrioritizer;
//            default:
//                throw new IllegalArgumentException("Invalid strategy: " + strategy);
//        }
//    }
}
