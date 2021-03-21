package com.jini.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // JPA Autition 활성화
@SpringBootApplication // 이 위치부터 설정을 읽기 때문에 프로젝트 최상단에 있어야함
public class Application {
    public static void main(String[] args) {

        // 내장 WAS실행
        // 서버에 톰캣 설치 필요없이
        // Jar파일 (실행가능한 Java 패키징 파일)로 실행하면됨
        SpringApplication.run(Application.class, args);
    }
}
