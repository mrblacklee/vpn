package com.jorchi.elevator;



import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;

@RestController
@SpringBootApplication
@MapperScan({"com.jorchi.elevator.orm.mapper","com.jorchi.elevator.dao","com.jorchi.elevator.model"})
public class ElevatorApplication {

/*@RequestMapping(value = "/hello",method = RequestMethod.POST)
public String index(@RequestBody PrientText prientText){
		System.out.println(prientText.toString());
		MyWebSocket.sendMessageAll(prientText.toString());
	return "Hello world";
}*/
public static void main(String[] args) {
		SpringApplication.run(ElevatorApplication.class, args);
	}
    //destroy-method="close"的作用是当数据库连接不使用的时候,就把该连接重新放到数据池中,方便下次使用调用.
    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl("jdbc:mysql://jorchiout.mysql.rds.aliyuncs.com:3306/db_test01?useUnicode=true&characterEncoding=utf-8");
        dataSource.setUsername("db_test01");//用户名
        dataSource.setPassword("DB_test01");//密码
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setInitialSize(2);//初始化时建立物理连接的个数
        dataSource.setMaxActive(20);//最大连接池数量
        dataSource.setMinIdle(0);//最小连接池数量
        dataSource.setMaxWait(60000);//获取连接时最大等待时间，单位毫秒。
        dataSource.setValidationQuery("SELECT 1");//用来检测连接是否有效的sql
        dataSource.setTestOnBorrow(false);//申请连接时执行validationQuery检测连接是否有效
        dataSource.setTestWhileIdle(true);//建议配置为true，不影响性能，并且保证安全性。
        dataSource.setPoolPreparedStatements(false);//是否缓存preparedStatement，也就是PSCache
        return dataSource;
    }

}
