package taa.poc.integrationtest.h2;

import com.zaxxer.hikari.HikariDataSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;

@Slf4j
@Configuration
public class RepositoryConfig {


    @Value("${spring.datasource.username}")
    private String dataSourceUser;
    @Value("${spring.datasource.password}")
    private String dataSourcePassword;
    @Value("${spring.datasource.url}")
    private String dataSourceUrl;

    @Bean("dataSource")
    @Profile("test")
    public DataSource dataSourceH2(){
        try {
            HikariDataSource hikariDataSource = new HikariDataSource();
            hikariDataSource.setUsername(dataSourceUser);
            hikariDataSource.setPassword(dataSourcePassword);
            hikariDataSource.setJdbcUrl(dataSourceUrl);
            return hikariDataSource;
        }catch (Exception e){
            log.error("Error occurred when configuring H2 DataSource with error cause: {}", e);
            throw e;
        }
    }

    @Autowired
    private DataSource dataSource;

    @Bean
    public NamedParameterJdbcTemplate namedParameterJdbcTemplate(){
        return new NamedParameterJdbcTemplate(dataSource);
    }

}
