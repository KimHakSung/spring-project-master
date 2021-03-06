package com.green.test;
import java.sql.Connection;
import javax.sql.DataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:web/WEB-INF/spring/root-context.xml")
@Log4j

public class DataSourceTests {

    //주입
    @Autowired
    DataSource ds;

    @Test
    public void testConn() throws Exception{

        Connection con = ds.getConnection();
        log.info(con);
        con.close();
    }

}
