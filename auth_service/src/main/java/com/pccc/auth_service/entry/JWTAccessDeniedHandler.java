package com.pccc.auth_service.entry;

import com.pccc.auth_service.enums.ResponseEnums;
import com.pccc.auth_service.utils.ServerletResponse;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class JWTAccessDeniedHandler implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AccessDeniedException e) throws IOException, ServletException {
        ServerletResponse.doResponse(httpServletResponse, HttpServletResponse.SC_FORBIDDEN, ResponseEnums.UNAUTHORIZED,"error",false);
    }
}
