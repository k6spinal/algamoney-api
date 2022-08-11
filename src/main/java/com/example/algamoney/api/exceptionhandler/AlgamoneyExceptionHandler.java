package com.example.algamoney.api.exceptionhandler;

import java.util.Arrays;
import java.util.List;

import org.postgresql.util.PSQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

//@ControllerAdvice
public class AlgamoneyExceptionHandler extends ResponseEntityExceptionHandler {

//	@Autowired
//	private MessageSource messageSource;
//	
//	@Override
//	protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex,
//			HttpHeaders headers, HttpStatus status, WebRequest request) {
//		
//		String mensagemUsuario= messageSource.getMessage("mensagem.invalida", null, LocaleContextHolder.getLocale());
//		return handleExceptionInternal(ex, mensagemUsuario, headers, HttpStatus.BAD_REQUEST, request);
//	}
//	
//	@ExceptionHandler({PSQLException.class})
//	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//	public ResponseEntity<Object> handlePsqlException(PSQLException ps, WebRequest request) {
//		String mensagemUsuario = messageSource.getMessage("recurso.nao-encontrado", null, LocaleContextHolder.getLocale());
//		String mensagemDesenvolvedor = ps.toString();
//		return handleExceptionInternal(ps, mensagemDesenvolvedor, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, request);
//	}
	
}
