package lk.tdm.SpringJDBC.repository;

import lk.tdm.SpringJDBC.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AlienRepo {

    private JdbcTemplate template;

    public JdbcTemplate getTemplate() {
        return template;
    }

    @Autowired
    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public void save(Alien alien) {
//        System.out.println("Alien saved");

        String sql = "INSERT INTO alien (id, name, tech) VALUES(?,?,?)";

        template.update(sql, alien.getId(), alien.getName(), alien.getTech());
    }

    public List<Alien> findAll() {

        String sql = "SELECT * FROM alien";
        RowMapper<Alien> mapper = new RowMapper<Alien>() {
            @Override
            public Alien mapRow(ResultSet rs, int rowNum) throws SQLException {
                Alien a = new Alien();
                a.setId(rs.getInt(1));
                a.setName(rs.getString(2));
                a.setTech(rs.getString(3));
                return a;
            }
        };

        List<Alien> alienList = template.query(sql, mapper);
        return alienList;
    }

}
