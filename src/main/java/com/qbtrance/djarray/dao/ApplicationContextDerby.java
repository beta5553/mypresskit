package com.qbtrance.djarray.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.*;

@Component
public class ApplicationContextDerby {

    @Autowired
    private DataSource dataSource;

    /**
     *
     * @param args
     * @throws IllegalAccessException
     * @throws InstantiationException
     * @throws ClassNotFoundException
     */
    public static void main (String [] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException
    {

        try {
            ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
            ApplicationContextDerby dao = ctx.getBean("applicationContextDerby", ApplicationContextDerby.class);

            dao.getDjs();
        } catch (SQLException e) {
            e.printStackTrace();
        }

       /* try {
            dao.getDjs();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("User not found"  + e.getMessage());
        }*/
    }

    /**
                * .
     * @return
     * @throws SQLException
                * @throws ClassNotFoundException
                * @throws IllegalAccessException
                * @throws InstantiationException
                */
        public void getDjs() throws SQLException, IllegalAccessException, InstantiationException, ClassNotFoundException
        {
            Connection conn = dataSource.getConnection();
            /*String driver = "org.apache.derby.jdbc.ClientDriver";
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/db_djrank");*/
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM DJ");
            //ps.setInt(1, id);
            //Artist artist = null;
            ResultSet rs = ps.executeQuery();

        if(rs.next()) {
            System.out.println(rs.getString("fname"));
            System.out.println(rs.getString("lname"));
        }

        rs.close();
        ps.close();
    }
}
