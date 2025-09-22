package com.andres.curso.springboot.app.aop.springboot_aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GreetingAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before("execution(* com.andres.curso.springboot.app.aop.springboot_aop.services.GreetingService.*(..))") //Podemos usar el * como comodín
    public void loggerBefore(JoinPoint joinPoint) {
        String metodo = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());

        logger.info("Antes ".concat(metodo).concat(" con los argumentos ".concat(args)));
    }

    @After("execution(* com.andres.curso.springboot.app.aop.springboot_aop.services.GreetingService.*(..))") //Podemos usar el * como comodín
    public void loggerAfter(JoinPoint joinPoint) {
        String metodo = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());

        logger.info("Después ".concat(metodo).concat(" con los argumentos ".concat(args)));
    }

    /*
     * Estos dos aspects envuelven al método sayHello del controlador.
     * También podemos envolverlo con Around
     */

    @Around("execution(* com.andres.curso.springboot.app.aop.springboot_aop.services.GreetingService.*(..))") //Podemos usar el * como comodín
    public void loggerAround(JoinPoint joinPoint) {
        String metodo = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());

        logger.info("Antes y después ".concat(metodo).concat(" con los argumentos ".concat(args)));
    }
}
