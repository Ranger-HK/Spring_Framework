package lk.ijse.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Created By Ravindu Prathibha
 * @created 6/10/2024 - 5:41 PM
 * @project Spring_Framework
 */
@Configuration
@Import(JPAConfig.class)
public class WebRootConfig {
}
