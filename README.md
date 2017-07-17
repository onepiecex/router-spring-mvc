# router-spring-mvc

    思想来源于[ninjaframework](https://github.com/ninjaframework/ninja)
    将@Controller 、 @RequestMapping 、 @GetMapping 、 @PostMapping  等 替换为统一地方配置url
    好处：统一地方管理url api
    
# 使用
## spring-boot
```
<dependency>
    <groupId>com.github.onepiecex</groupId>
    <artifactId>router-spring-mvc-spring-boot-starter</artifactId>
    <version>1.0</version>
</dependency>
```
# 示例
### 常规Controller
```java
@RestController("/hello2")
public class Hello2Controller {
    @GetMapping
    public String hello() {
        return "hello";
    }
    @GetMapping("/hello")
    public String hello2() {
        return "hello";
    }
}
```
### 本实例（等同于常规Controller）
```java
//Controller
public class HelloController {
    public String hello() {
        return "hello";
    }
    public String hello2() {
        return "hello";
    }
}

//Routes
public class MyRoutes implements Routes {
    @Override
    public void init(Router router) {
        router.route("/hello2").GET(HelloController::hello);
        router.route("/hello2/hello").POST(HelloController::hello2);
    }
}
//其他 route 示例 见 MyRoutes.java
```
