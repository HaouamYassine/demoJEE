package com.example.demojee.dao.dao.servlet;

import com.example.demojee.dao.dao.entities.Pastry;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/pastry-list")
public class PastryListServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Récupérer les patisseries avec JPA
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
        EntityManager em = emf.createEntityManager();


        TypedQuery<Pastry> query = em.createQuery("SELECT p FROM Pastry p",Pastry.class);
        List<Pastry> pastryList = query.getResultList();
        em.close();
        emf.close();

        //Mettre les données dans la vue
        req.setAttribute("pastries",pastryList);

        //Retourne la ressource (vue + données)
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/pastry-list.jsp");
        rd.forward(req,resp);

    }


}
