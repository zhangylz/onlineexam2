package com.ylzh.onlineexam;
// import error indict MapperUtil<T> extends Mapper<T>, MySqlMapper<T>  error
import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ylzh.onlineexam.mapper")
public class OnlineexamApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineexamApplication.class, args);
	}
}

