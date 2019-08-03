package com.pccc.auth_service.entry;

import com.pccc.auth_service.enums.ResponseEnums;
import com.pccc.auth_service.utils.ServerletResponse;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class JWTAuthenticationEntryPoint implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        ServerletResponse.doResponse(httpServletResponse, HttpServletResponse.SC_UNAUTHORIZED, ResponseEnums.UNAUTHORIZED, "error", false);
    }
}

