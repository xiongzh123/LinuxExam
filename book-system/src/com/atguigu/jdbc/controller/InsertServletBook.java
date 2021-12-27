package com.atguigu.jdbc.controller;



import com.atguigu.jdbc.util.jdbcUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/insert/book")
public class InsertServletBook extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Connection jdbcConnection = jdbcUtil.getJdbcConnection();
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        PrintWriter writer = resp.getWriter();
        String sql="insert into book values(default ,?,?,?)";
        String name = req.getParameter("name");
        String status = req.getParameter("status");
        String copyright = req.getParameter("copyright");
        try {
            preparedStatement = jdbcConnection.prepareStatement(sql);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,status);
            preparedStatement.setString(3,copyright);
            boolean execute = preparedStatement.execute();
            if (execute){
                writer.println("This is Insert book NotSuccessfully");
            }else {
                writer.println("This is Insert book Successfully");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            jdbcUtil.release(jdbcConnection,preparedStatement,resultSet);
        }

    }

}
