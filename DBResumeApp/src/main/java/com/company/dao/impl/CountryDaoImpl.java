package com.company.dao.impl;

import com.company.dao.inter.AbstractDao;
import com.company.dao.inter.CountryDaoInter;
import com.company.entity.Country;
import java.util.List;

public class CountryDaoImpl extends AbstractDao implements CountryDaoInter {

    @Override
    public List<Country> getAllCountry() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
