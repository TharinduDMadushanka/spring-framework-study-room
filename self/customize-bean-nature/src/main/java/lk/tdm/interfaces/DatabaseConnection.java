package lk.tdm.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class DatabaseConnection implements InitializingBean, DisposableBean {

    public void connect() {
        System.out.println(" 1 ");
        System.out.println("Database connection established.");

    }

    public void disconnect() {
        System.out.println("2 ");
        System.out.println("Database connection closed.");

    }

    @Override
    public void destroy() throws Exception {
        // This method is called after the properties have been set (i.e., after dependency injection)
        System.out.println("=============== 3 ==================");
        System.out.println("Custom init method: Preparing resources...");
        connect();
        System.out.println("=============== 3 ==================");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // This method is called just before the bean is destroyed
        System.out.println("=============== 4 ==================");
        System.out.println("Custom destroy method: Releasing resources...");
        disconnect();
        System.out.println("=============== 4 ==================");
    }
}

/**

 * afterPropertiesSet(): This method is part of the InitializingBean interface.
 * It is called by the Spring container after the bean's properties have been set and after dependency injection has been completed.
 * In this method, we establish the database connection.

 * destroy(): This method is part of the DisposableBean interface.
 * It is called just before the bean is destroyed by the Spring container. In this method, we close the database connection.

 */