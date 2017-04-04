package rest.service;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.ObjectMapper;
import service.bean.StockQuote;

@RestController
public class StockQuoteController {
    private static final String template = "[%s]";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/getQuote")
    public StockQuote getQuote(@RequestParam(value="symbol", defaultValue="AMZN") String symbol) {
        System.out.println("arg == " + symbol); 
        
        RestTemplateBuilder builder = new RestTemplateBuilder();        
//    	StockQuote quote = builder.build().getForObject(
//				"https://www.google.com/finance/info?q="+symbol.trim().toUpperCase() , StockQuote.class);
//    	System.out.println("Google finance " + quote.toString() );
    	String  response = builder.build().getForObject(
				"https://www.google.com/finance/info?q="+symbol.trim().toUpperCase() , String.class);
    	
    	ObjectMapper mapper = new ObjectMapper();
    	//Object to JSON in file
    	StockQuote	quote = new StockQuote();
    	try {
    	    quote = mapper.readValue(response.substring(5, response.length()-3), StockQuote.class);
		} catch (IOException e) {
			e.printStackTrace();
		}    	
    	//System.out.println("Google finance " + response.substring(5, response.length()-3) );    	
    	System.out.println("Google finance:: " + quote.toString() );    	
    	return quote;
    }

    
//    @Bean
//    public RestTemplate restTemplate() {
//        RestTemplate template = new RestTemplate(clientHttpRequestFactory());
//        List<HttpMessageConverter<?>> converters = template.getMessageConverters();
//        for(HttpMessageConverter<?> converter : converters){
//            if(converter instanceof MappingJackson2HttpMessageConverter){
//                try{
//                converter.setSupportedMediaTypes(MediaType.TEXT_HTML);
//                }catch(Exception e){
//                    e.printStackTrace();
//                }
//            }
//        }
//        return template;
//    }
    
    
}


