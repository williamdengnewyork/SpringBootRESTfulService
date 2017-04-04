SpringBootRESTfulService

- Rest Service for US stock quote, e.g.
  
http://localhost:8090/getQuote?symbol=MSFT
  
{"id":358464,"t":"MSFT","e":"NASDAQ","l":65.86,"l_fix":65.86,"l_cur":65.86,"s":"0","ltt":"4:00PM EDT","lt":"Mar 31, 4:00PM EDT","lt_dts":"2017-03-31T16:00:03Z","c":"+0.15","c_fix":"0.15","cp":"0.23","cp_fix":"0.23","ccol":"chg","pcls_fix":"65.71"}

http://localhost:8090/getQuote?symbol=AAPL

{"id":22144,"t":"AAPL","e":"NASDAQ","l":143.7,"l_fix":143.7,"l_cur":143.7,"s":"2","ltt":"4:00PM EDT","lt":"Apr 3, 4:00PM EDT","lt_dts":"2017-04-03T16:00:01Z","c":"+0.04","c_fix":"0.04","cp":"0.03","cp_fix":"0.03","ccol":"chg","pcls_fix":"143.66"}

- Actuator Monitoring 

http://127.0.0.1:9001 
{"timestamp":1491264707592,"status":404,"error":"Not Found","message":"No message available","path":"/"}

- Tech Stack:
Spring Boot
Sprint Actuator Monitoring 
Jackson
