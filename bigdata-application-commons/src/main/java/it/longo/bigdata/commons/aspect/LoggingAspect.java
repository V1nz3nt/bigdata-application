package it.longo.bigdata.commons.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import ch.qos.logback.classic.Logger;

@Aspect
@Component
public class LoggingAspect {
	protected final Logger LOG = (Logger) LoggerFactory.getLogger(LoggingAspect.class);

	@Before("execution(* org.springframework.data.mongodb.repository.support.SimpleMongoRepository.*(..))")
	public void trackBeforeRepository(JoinPoint joinPoint) {
		LOG.info("{}.{}", joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName());
	}
	
	@Before("execution(* it.longo.bigdata.commons.service.*.*(..))")
	public void trackBeforeService(JoinPoint joinPoint) {
		LOG.info("{}.{}", joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName());
	}
	
	@Before("execution(* it.longo.bigdata.rest.DataRestController.*(..))")
	public void trackBeforeController(JoinPoint joinPoint) {
		LOG.info("{}.{}", joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName());
	}

}
