package com.world.repo;

import com.world.domain.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Roger Diller on 1/23/16.
 */

@Repository
public class CountryRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Country> findCountries(){

        List<Country> countries = jdbcTemplate.query("select code, name from country order by name", new RowMapper<Country>() {
            @Override
            public Country mapRow(ResultSet rs, int rowNum) throws SQLException {

                return toCountry(rs);
            }
        });

        return countries;
    }

    protected Country toCountry(ResultSet rs) throws SQLException {

        Country country = new Country();
        country.setCode(rs.getString("code"));
        country.setName(rs.getString("name"));

        return country;
    }

}
