package david.augusto.luan.atividadeabella.config;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.HashMap;
import java.util.Map;

public class MasterService {

    public static Map<Object, Object> getDataSourceHashMap() {

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/demo_database?createDatabaseIfNotExist=true");
        dataSource.setUsername("root");
        dataSource.setPassword("");


        DriverManagerDataSource dataSource1 = new DriverManagerDataSource();
        dataSource1.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource1.setUrl("jdbc:mysql://localhost:3306/demo_database2?createDatabaseIfNotExist=true");
        dataSource1.setUsername("root");
        dataSource1.setPassword("");

        DriverManagerDataSource dataSource2 = new DriverManagerDataSource();
        dataSource2.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource2.setUrl("jdbc:mysql://localhost:3306/demo_database3?createDatabaseIfNotExist=true");
        dataSource2.setUsername("root");
        dataSource2.setPassword("");

        DriverManagerDataSource dataSource3 = new DriverManagerDataSource();
        dataSource3.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource3.setUrl("jdbc:mysql://localhost:3306/demo_database4?createDatabaseIfNotExist=true");
        dataSource3.setUsername("root");
        dataSource3.setPassword("");

        HashMap hashMap = new HashMap();
        hashMap.put("tenantID1", dataSource);
        hashMap.put("tenantID2", dataSource1);
        hashMap.put("tenantID3", dataSource2);
        hashMap.put("tenantID3", dataSource3);

        return hashMap;
    }
}
