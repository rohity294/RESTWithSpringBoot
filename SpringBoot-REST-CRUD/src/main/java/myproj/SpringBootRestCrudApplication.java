package myproj;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class SpringBootRestCrudApplication {
	
	@Autowired
	SimpleCORSFilter simpleCORSFilter;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestCrudApplication.class, args);
	}
	
}


@Component
@Order(1)
class SimpleCORSFilter implements Filter {
public SimpleCORSFilter() {
    System.out.println("***********************************************SimpleCORSFilter init");
}

@Override
public void doFilter(ServletRequest req, ServletResponse res, FilterChain filterChain) throws IOException, ServletException {
	System.out.println("***********************************************SimpleCORSFilter doFilter started");
    HttpServletRequest request = (HttpServletRequest) req;
    HttpServletResponse response = (HttpServletResponse) res;

    response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
    response.setHeader("Access-Control-Allow-Credentials", "true");
    response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
    response.setHeader("Access-Control-Max-Age", "3600");
    response.setHeader("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With, remember-me");
   
    Enumeration<String> temp = request.getHeaderNames();
    while(temp.hasMoreElements()) {
    	System.out.println(temp.nextElement().toString());
    }
    
    String temp2 = request.getMethod();
    System.out.println(temp2);
    
    if ("OPTIONS".equals(request.getMethod())) {
        response.setStatus(HttpServletResponse.SC_OK);
    } else { 
        filterChain.doFilter(request, response);
    }
    
    System.out.println("***********************************************SimpleCORSFilter doFilter completed");
}

@Override
public void init(FilterConfig filterConfig) {
}

@Override
public void destroy() {
}

}