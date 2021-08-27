package spring.jdbctemplate.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;
import spring.jdbctemplate.jdbctemplare.Jdbctemplates;

import javax.sql.DataSource;

/**
 * @author : zzc
 * @date: 2021-06-14 11:03
 **/
public class JdbcTemplateMy {
    private JdbcTemplate jdbcTemplate ;
    private DataSource dataSource ;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        if(jdbcTemplate == null)
            jdbcTemplate = new JdbcTemplate() ;

    }

    public static void main(String args[]) {

    }
}
