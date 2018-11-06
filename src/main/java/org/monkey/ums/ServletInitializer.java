package org.monkey.ums;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        //、、、、、8、
	//asdfasdfasdfasdf:
	/*11111111*/
        return application.sources(UmsApplication.class);
	/*asdfasdf*/
    }

}
