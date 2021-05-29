package com.vj.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/*")
public class PropertiesServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Properties commonProps = new Properties();
        Properties appProps = new Properties();
        try {
            commonProps.load(PropertiesServlet.class.getClassLoader().getResourceAsStream("common.properties"));
            appProps.load(request.getServletContext().getResourceAsStream("app.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        PrintWriter out = response.getWriter();
        out.println("Property from tomcat/lib: " + commonProps.getProperty("prop"));
        out.println("Property from app: " + appProps.getProperty("prop"));
    }

}
