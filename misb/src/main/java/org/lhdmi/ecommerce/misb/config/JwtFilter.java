package org.lhdmi.ecommerce.misb.config;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.filter.GenericFilterBean;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.JwsHeader;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureException;

public class JwtFilter extends GenericFilterBean{
	
	public static String secret="CH33_Primera_Cohorte_De Mujeres 8 Dic 2023!#@";
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//RECIBE LA SOLICITUD Y DA LA AUTORIZACIÓN
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		String authHeader =  httpServletRequest.getHeader("authorization");
		if (
				("POST".equals(httpServletRequest.getMethod())) 
				&& 
				(! httpServletRequest.getRequestURI().contains("/api/usuarios/"))
				&& 
				(! httpServletRequest.getRequestURI().contains("/api/galeria/"))
				||
				(("GET".equals(httpServletRequest.getMethod())) 
				&& 
				(! httpServletRequest.getRequestURI().contains("/api/galeria/")) 
				&& 
				(! httpServletRequest.getRequestURI().contains("/api/secciones/")))
				||
				("PUT".equals(httpServletRequest.getMethod())) 
				||
				("DELETE".equals(httpServletRequest.getMethod()))
			
			) { 
				//VER SI HAY O NO UN TOKEN AQUÍ
				if  ( authHeader ==null || !authHeader.startsWith("Bearer: ") ) {
					//TOKEN QUE NO EXISTE
					throw new ServletException("1. Invalid Token");
				}// if authHedaer
				String token = authHeader.substring(7);
				try {
					//AQUÍ OBTENGO EL TOKEN
					Claims claims = Jwts.parser().setSigningKey(secret)
							.parseClaimsJws(token).getBody();
					//CON EL PARSER, FRASE SECRETA 
					JwsHeader<?> header = Jwts.parser().setSigningKey(secret)
							.parseClaimsJws(token).getHeader();
					System.out.println("header.getAlgorithm(): " + header.getAlgorithm());
					//RECOGE INFO DE USUARIO Y CUANDO SE CREO ETC... "jwt.io"
					claims.forEach((key, value)->{
						System.out.println("key: " + key + " value: " + value);
					});
				}catch (SignatureException | MalformedJwtException | ExpiredJwtException  e) {
						//ESTE ES UN TOKEN INVÁLIDO, YA EXPIRADO, O QUE NO ES REAL
						throw new ServletException("2. Invalid Token.");
					}//catch 
			}// if methods
			chain.doFilter(request, response);
	}//doFilter
	
}//class JwtFilter
