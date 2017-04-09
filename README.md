## **Spring-json-rpc**
   
  基于 [jsonrpc4j](https://github.com/briandilley/jsonrpc4j#json-rpc-for-java) 的service层独立部署方案

###  基于json的rpc的好处
  
- 调试方便
- 跟spring-mvc整合 可以针对某些服务通过Controller单独定制服务，
  或者说可以不影响现有的http服务的前提下提供service的独立部署。
- http的服务可以利用lvs ，nginx实现服务化的高可用。
- 服务端升级 返回结果中的变动不会导致 服务完全不可用。

### 缺点

- 对读取多的服务的性能比较差，json的冗余数据，序列号反序列化都会影响性能。
- 应用到项目并不是很多。

### 其他类似的框架
- [Thrift](http://thrift.apache.org/)，多语言的支持，要先写描述文件，感觉对纯java的项目就不是很友好了。
- [protobuf](https://github.com/google/protobuf/)，跟thrift差不多，也是要写描述文件。
- [dubbo](https://github.com/alibaba/dubbo),严格上说dubbo跟上面的不是属于一类的框架，上面的那些更像是某种通信协议。dubbo更主要是服务发现和治理相关的框架吧。
- RMI、Hessian、Burlap、Httpinvoker、WebService 等。