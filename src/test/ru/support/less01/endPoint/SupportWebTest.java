package ru.support.less01.endPoint;

import jakarta.servlet.ServletException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import static org.junit.jupiter.api.Assertions.assertTrue;

// Для меня тестирование в такаом формате ново
// Возможно что то я не понял в тестирвоание.


class SupportWebTest extends Mockito {

    private SupportWeb supportWeb;

    private HttpServletRequest request;

    private HttpServletResponse response;

    private StringWriter responseStringWriter;

    @BeforeEach
    public void setupTest() throws Exception
    {
        supportWeb = new SupportWeb();
        request = mock(HttpServletRequest.class);
        response = mock(HttpServletResponse.class);
        responseStringWriter = new StringWriter();
        PrintWriter outWriter = new PrintWriter(responseStringWriter);
        when(response.getWriter()).thenReturn(outWriter);
    }

    @Test
    public void testDoGetsupportWeb() throws ServletException, IOException {

        supportWeb.doGet(request, response);
         Mockito.verify(response).setContentType(Mockito.eq("text/plain;charset=UTF-8"));

    }

    @Test
    public void testDoPostsupportWeb() throws ServletException, IOException {
        Mockito.when(request.getParameter("word")).thenReturn("Test Phrase");
        supportWeb.doPost(request, response);
        //response.toString();
    }
}