package com.projetEbilleterie.ebilleterie.exposition.authentication;

import com.projetEbilleterie.ebilleterie.config.JwtTokenUtil;
//import com.devglan.model.*;
//import com.devglan.service.UserService;
import com.projetEbilleterie.ebilleterie.config.JwtTokenUtil;
//import com.projetEbilleterie.ebilleterie.domain.customer.Customer;
import com.projetEbilleterie.ebilleterie.domain.user.ApiResponse;
import com.projetEbilleterie.ebilleterie.domain.user.AuthToken;
import com.projetEbilleterie.ebilleterie.domain.user.LoginUser;
import com.projetEbilleterie.ebilleterie.domain.user.UserRepository;
import com.projetEbilleterie.ebilleterie.infrastructure.customerJPA.CustomerJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/token")
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private UserRepository userService;

    @RequestMapping(value = "/generate-token", method = RequestMethod.POST)
    public ApiResponse<AuthToken> register(@RequestBody LoginUser loginUser) throws AuthenticationException {

        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginUser.getUsername(), loginUser.getPassword()));
        final CustomerJPA user = userService.findOne(loginUser.getUsername());
        final String token = jwtTokenUtil.generateToken(user);
        return new ApiResponse<>(200, "success",new AuthToken(token, user.getEmail()));
    }

}
