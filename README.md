#@Component 已经可以支持声明一个 bean 了，为何还要再弄个 @Bean 出来？#
答: @Component和@Bean都会将生成的bean注册到Spring context中，但是两者的使用场景是不一样的。  
@Component注解的类会被Spring自动扫描到，并且Spring会管理该类生成的bean的生命周期。
但是这样会造成一个问题，就是当我们不需要使用某些类的时候，Spring的自动扫描机制还是会检测到
被@Component注解的类，并实例化产生bean，这样就造成了额外的资源浪费。  
@Bean可以自定义需要实例化的bean，如果有一些第三方的库需要使用，但这些第三方的库不是用spring写的，
仅仅只是普通的java类，为了能在我们的spring项目使用这些库，就可以通过@Bean注解自定义需要实例化的
bean，这样就在不造成额外的资源浪费的情况下将第三方的库注册到Spring context中，使得自定义化程度
更高。  
总结：使用第三方库最好用@Bean；在自己的项目中使用自己写的类最好用@Component。