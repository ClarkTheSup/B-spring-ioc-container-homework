1. 每次调用greet()方法就new GreetingService()  
2. 使用切面。创建一个GreetingControllerAspect，并在该类里定义GreetingService对象
GreetingController中定义GreetingControllerAspect，每次调用greet()方法之前new GreetingService()