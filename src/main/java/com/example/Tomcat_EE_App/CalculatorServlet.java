package com.example.Tomcat_EE_App;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CalculatorServlet", urlPatterns = {"", "/"})
public class CalculatorServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String principleAmount = request.getParameter("principleAmount");
        String interestPercentage = request.getParameter("interestPercentage");
        String years = request.getParameter("years");
        String compoundingPeriod = request.getParameter("compoundingPeriod");

        Float.parseFloat(principleAmount);
        Float.parseFloat(interestPercentage);

        String error;

        if (principleAmount == null || interestPercentage == null || years == null ||
                compoundingPeriod == null || principleAmount.isBlank() ||
                interestPercentage.isBlank() || years.isBlank() || compoundingPeriod.isBlank()) {
            error = "One or more of the input boxes were blank. Try again.";

            request.setAttribute("error", error);
        } else {

            float result = Utils.calculateCompoundInterest(Float.parseFloat(principleAmount), (Float.parseFloat(interestPercentage) / 100), Integer.parseInt(years), Integer.parseInt(compoundingPeriod));

            request.setAttribute("result", result);
        }

        request.setAttribute("principleAmount", principleAmount);
        request.setAttribute("interestPercentage", interestPercentage);
        request.setAttribute("years", years);
        request.setAttribute("compoundingPeriod",compoundingPeriod);

        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);

    }
}
