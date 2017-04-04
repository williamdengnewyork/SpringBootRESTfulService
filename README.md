**SpringBootRESTfulService**
----------------------------

### **Rest Service for US stock quote**

e.g.
http://localhost:8090/getQuote?symbol=MSFT

{"id":358464,"t":"MSFT","e":"NASDAQ","l":65.86,"l_fix":65.86,"l_cur":65.86,"s":"0","ltt":"4:00PM
EDT","lt":"Mar 31, 4:00PM
EDT","lt_dts":"2017-03-31T16:00:03Z","c":"+0.15","c_fix":"0.15","cp":"0.23","cp_fix":"0.23","ccol":"chg","pcls_fix":"65.71"}

http://localhost:8090/getQuote?symbol=AAPL

{"id":22144,"t":"AAPL","e":"NASDAQ","l":143.7,"l_fix":143.7,"l_cur":143.7,"s":"2","ltt":"4:00PM
EDT","lt":"Apr 3, 4:00PM
EDT","lt_dts":"2017-04-03T16:00:01Z","c":"+0.04","c_fix":"0.04","cp":"0.03","cp_fix":"0.03","ccol":"chg","pcls_fix":"143.66"}

 
http://localhost:8090/greeting?name=mike

### **Actuator Monitoring Endpoints**

/health – Shows application health information (a simple ‘status’ when accessed
over an unauthenticated connection or full message details when authenticated).
It is not sensitive by default.

/info – Displays arbitrary application info. Not sensitive by default.

/metrics – Shows ‘metrics’ information for the current application. It is also
sensitive by default.

/trace – Displays trace information (by default the last few HTTP requests).

 

http://localhost:8090/manage/trace

http://localhost:8090/manage/heapdump

http://localhost:8090/manage/beans http://localhost:8090/manage/loggers

http://localhost:8090/manage/health

http://localhost:8090/manage/metrics

http://localhost:8090/manage/info

http://localhost:8090/manage/dump

http://localhost:8090/manage/env

http://localhost:8090/manage/configprops

http://localhost:8090/manage/auditevents

http://localhost:8090/manage/mappings

http://localhost:8090/manage/autoconfig


### ** Spring WebSecurity Configurer Adapter**
 Custom security for REST endpoints

 
### **Technology Stacks**

Spring Boot

Sprint Actuator Monitoring

Jackson


