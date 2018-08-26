package cn.xxm.springcloud.vo;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author xxm
 * @create 2018-08-20 21:23
 */
@Data
@Slf4j
public class Person {
    private String  id;
    private String username;
    private String password;


    public static void main(String[] args) {
           Person person = new Person();
           person.setId("1");
           person.setUsername("xxm");
        person.setPassword("123456");

        System.out.println(person);
        log.error(person.getId()+"---"+person.getUsername()+"---"+person.getPassword());
    }
}
