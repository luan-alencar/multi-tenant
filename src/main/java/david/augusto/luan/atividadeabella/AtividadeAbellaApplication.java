package david.augusto.luan.atividadeabella;

import david.augusto.luan.atividadeabella.config.CustomRoutingDataSource;
import david.augusto.luan.atividadeabella.config.MasterService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = "david.augusto.luan.config")
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "david.augusto.luan.repository")
public class AtividadeAbellaApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(AtividadeAbellaApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(AtividadeAbellaApplication.class);
    }

    @Bean
    public DataSource dataSource() {
        CustomRoutingDataSource customRoutingDataSource = new CustomRoutingDataSource();
        customRoutingDataSource.setTargetDataSources(MasterService.getDataSourceHashMap());
        return customRoutingDataSource;
    }

}
