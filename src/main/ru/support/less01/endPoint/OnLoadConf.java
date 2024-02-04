package ru.support.less01.endPoint;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import ru.support.less01.service.less01Service;

import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "/dis", loadOnStartup = 1)
public class OnLoadConf extends HttpServlet
{
    public static List list = null;

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        list = new ArrayList<>();
        try
        {
            list = less01Service.getList();

        } catch (Exception e) {}

    }

    public static void add(String word)
    {
        list.add( word);
    }


}
