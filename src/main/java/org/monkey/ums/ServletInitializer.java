package org.monkey.ums;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		//、、、、、8、
        return application.sources(UmsApplication.class);
		//asdfasdfasdfasdf:
    }

}
