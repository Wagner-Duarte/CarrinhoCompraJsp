package com.wagner.carrinho.filter;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;


/**
 *
 *
 */
@WebFilter(urlPatterns = {"/*"})
public class FilterServlet implements Filter {


    private EntityManagerFactory entityManagerFactory;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        this.entityManagerFactory = Persistence.createEntityManagerFactory("CarrinhoPU");



    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        EntityManager entityManager = this.entityManagerFactory.createEntityManager();
        request.setAttribute("entityManager", entityManager);
        chain.doFilter(request, response);

        try {
            entityManager.getTransaction().commit();

        } catch (Exception e){
            e.printStackTrace();
            entityManager.getTransaction().rollback();

        } finally {
          entityManager.close();
        }

    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
