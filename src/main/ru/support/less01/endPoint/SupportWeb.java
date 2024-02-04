package ru.support.less01.endPoint;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ru.support.less01.service.less01Service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

/**
 * @author Sitdikov I.F.
 * @version 1
 * @year 2024
 * @apiNote
 */
@WebServlet("/v1/support")
public class  SupportWeb extends HttpServlet
{
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);

    }

    @Override
    public void doGet(
            HttpServletRequest request, HttpServletResponse response)
            throws IOException
    {

        Locale.setDefault(Locale.ENGLISH);
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println(less01Service.getRandomVerbs());
        out.close();



    }
    @Override
    public void doPost(
            HttpServletRequest request, HttpServletResponse response)
            throws IOException
    {  PrintWriter out = response.getWriter();

        Locale.setDefault(Locale.ENGLISH);
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");

        try {
          String s =  request.getParameter("word");
          less01Service.setNewVerbs(s);

          out.println(s);
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }


        out.close();

    }




}