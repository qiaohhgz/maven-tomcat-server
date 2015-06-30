package com.jim.demo;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by qiao on 15/6/30.
 */
public class ServerTimeServlet extends HttpServlet {
    private static final Logger logger = Logger.getLogger(ServerTimeServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("ServerTimeServlet do get...");

        Goodbaby goodbaby = new Goodbaby();
        goodbaby.init();

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String now = format.format(new Date());

        String responseMsg = "Server current time is " + now;

        resp.getWriter().write(responseMsg);
    }
}
