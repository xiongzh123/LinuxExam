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

@WebServlet("/update/book")
public class UpdateServletBook extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sql="update book set bookName=? ,bookStatus=? where bookId=?";
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        Connection jdbcConnection = jdbcUtil.getJdbcConnection();
        String name = req.getParameter("name");
        String status = req.getParameter("status");
        Integer id = Integer.parseInt(req.getParameter("id"));
        PrintWriter writer = resp.getWriter();
        try {
            preparedStatement = jdbcConnection.prepareStatement(sql);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,status);
            preparedStatement.setInt(3,id);
            boolean execute = preparedStatement.execute();
            if (execute){
                writer.println("This is Update book NotSuccessfully");
            }else {
                writer.println("This is Update book Successfully");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            jdbcUtil.release(jdbcConnection,preparedStatement,resultSet);
        }
    }
}
