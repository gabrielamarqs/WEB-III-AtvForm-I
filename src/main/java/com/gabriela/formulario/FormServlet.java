package com.gabriela.formulario;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@WebServlet(name = "cadastro_vaga", value = "/cadastro_vaga")
public class FormServlet extends HttpServlet {

    private DateTimeFormatter formatter;

    @Override
    public void init() throws ServletException {
        formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // formatador
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 1. obter essas informações de uma submissão
        // pegar os parâmetros
        String fieldNome = req.getParameter("field_nome");
        String stringDate = req.getParameter("field_data");
        LocalDate fieldData = LocalDate.parse(stringDate, formatter);
        String fieldIdioma = req.getParameter("field_idioma");
        String[] fieldHabilidades = req.getParameterValues("field_habilidades");
        // getParameterValues para pegar itens multivalorados


        // 2. adicionar essas informações à requisição
        req.setAttribute("attr_name", fieldNome);
        req.setAttribute("attr_data", fieldData);
        req.setAttribute("attr_idioma", fieldIdioma);
        req.setAttribute("attr_habilidades", fieldHabilidades);

        if (fieldNome.equals("")){
            resp.sendRedirect("http://localhost:8080/app_gabriela/index.jsp?msg=campo nome está em branco");
        } else {
        // 3. encaminhar essas informações para quem melhor sabe o que fazer com eles
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("tela_confirmacao.jsp");
        requestDispatcher.forward(req, resp); }


    }
}
