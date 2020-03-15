### 什么是委派模式
虽然说委派模式不属于Gof23中设计模式，但这并不影响它成为一种经典的设计模式。

“委派”字面意思就是指派一件事情给某人。类比到生活中的场景，比如项目leader指派开发任务给下面的猿猿们。这听起来有点像静态代理，不过还是不一样的，你品，你细品！代理强调的是过程，主要是要在代理过程中加入一些动作的，而委派主要是分配和分发。

### 代码实现
我们先新建一个业务处理接口BusinessService

```java
public interface BusinessService {
    void doService();
}
```

新建两个实现类LoginService和OrderService

```java
public class LoginService implements BusinessService{
    public void doService() {
        System.out.println("处理登录相关业务");
    }
}

public class OrderService implements BusinessService{
    public void doService() {
        System.out.println("订单业务模块");
    }
}
```

新建一个枚举类，表示不同的业务类型，这里假设就两个，login和order

```java
public enum ServerType {
    LOGIN,ORDER;
}
```

新建一个业务查找类，主要是用于根据不用的业务类型选择不同的业务组件提供服务。

```java
public class BussinessLookup {
    private OrderService orderService;

    private LoginService loginService;

    /**
     * 查找对应的服务
     * @param serverType
     * @return
     */
    public BusinessService getBusinessService(ServerType serverType){
        if(serverType.equals(ServerType.LOGIN)){
            return loginService;
        }else{
            return orderService;
        }
    }

    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }
}
```

接下来，关键的类来了，委派类。做的工作主要是分发。

```java
public class BusinessDelegate {
    private BussinessLookup bussinessLookup;

    private BusinessService businessService;

    private ServerType serverType;

    public void setBussinessLookup(BussinessLookup bussinessLookup) {
        this.bussinessLookup = bussinessLookup;
    }

    public void setServerType(ServerType serverType) {
        this.serverType = serverType;
    }

    /**
     * 委派方法，其实最终调用的是业务类的方法
     */
    public void doTask(){
        businessService = bussinessLookup.getBusinessService(serverType);
        businessService.doService();
    }
}
```

我们再来个客户端类，也就是请求类，它通过委派类完成工作。就是说我不需要知道在幕后到底是哪个业务组件在处理，我只需要给你请求，你帮我完成好任务就OK.。说明白点，委派类就是做了一层封装和抽象，不将业务处理的大量组件暴露给请求层或者说是视图层。

```java
public class Client {
    private BusinessDelegate businessDelegate;

    public Client(BusinessDelegate businessDelegate) {
        this.businessDelegate = businessDelegate;
    }

    public void doTask(){
        businessDelegate.doTask();
    }
}
```

好了，我们写个Main测试一下。

```java
public class AppMain {
    public static void main(String[] args) {
        BusinessDelegate businessDelegate = new BusinessDelegate();
        BussinessLookup bussinessLookup = new BussinessLookup();
        bussinessLookup.setLoginService(new LoginService());
        bussinessLookup.setOrderService(new OrderService());

        businessDelegate.setBussinessLookup(bussinessLookup);
        businessDelegate.setServerType(ServerType.LOGIN);
        Client client = new Client(businessDelegate);
        client.doTask();

//        businessDelegate.setServerType(ServerType.ORDER);
//        client.doTask();
    }
}
```

结果：

```bash
处理登录相关业务
```

在这里，非常有必要看下类图

![在这里插入图片描述](https://img-blog.csdnimg.cn/20200314224840372.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L20wXzM3OTY1MDE4,size_16,color_FFFFFF,t_70)
### 在Spring源码中应用
在Spring源码中我们可以搜索一下，使用delegate关键词模糊查找下，但凡以Delegate结尾的都是委派模式的应用。

比如：BeanDefinitionParserDelegate、ConstructorDelegate、MultipartResolutionDelegate、TypeConverterDelegate等。

当然了，我们熟知的DispatcherServlet 虽然没带delegate，但也是委派模式的一种实现。

前端请求都统一走到DispatcherServlet 的doService()方法中，然后在doService()方法中调用doDispatch()方法，在doDispatch()方法中，会获取业务处理的handler，执行handle()方法处理请求。

doDispatch()方法核心源码截图

![doDispatch](https://img-blog.csdnimg.cn/20200314231942431.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L20wXzM3OTY1MDE4,size_16,color_FFFFFF,t_70)

### 应用场景

1. 当你要实现表现层和业务层之间的松耦合的时候。
2. 当你想要编排多个服务之间的调用的时候。
3. 当你想要再封装一层服务查找和调用时候

>公众号：二营长的笔记
>免费领资料：公众号内回复“二营长”


