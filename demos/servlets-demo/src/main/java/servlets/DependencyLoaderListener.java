package servlets;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DependencyLoaderListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //add startup code here
        //similar to a constructor, do stuff that has to happen early
        System.out.println("Context is being initialized!");

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        //add teardown code here
        //similar to finalize() AKA destructor, do stuff that should happen just before termination
        System.out.println("Context is being destroyed.");
    }
}