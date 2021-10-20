package com.company.dao.impl;

import com.company.dao.inter.AbstractDao;
import com.company.dao.inter.EmploymentHistoryDaoInter;
import com.company.entity.EmploymentHistory;
import com.company.entity.User;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmploymentHistorylDaoImpl extends AbstractDao implements EmploymentHistoryDaoInter {

    @Override
    public List<EmploymentHistory> getAllEmploymentHistoryByUserId(int userId) {
        List<EmploymentHistory> result = new ArrayList<>();
        try (Connection c = connect()) {
            PreparedStatement stmt = c.prepareStatement("SELECT * from employment_history where user_id = ?");
            stmt.setInt(1, userId);

            stmt.execute();
            ResultSet rs = stmt.getResultSet();

            while (rs.next()) {
                EmploymentHistory employmentHistory = getEmploymentHistory(rs);
                result.add(employmentHistory);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private EmploymentHistory getEmploymentHistory(ResultSet rs) throws Exception {
        String header = rs.getString("header");
        String jobDesc = rs.getString("job_description");
        Date beginDate = rs.getDate("begin_date");
        Date endDate = rs.getDate("end_date");
        int userId = rs.getInt("user_id");

        EmploymentHistory employmentHistory = new EmploymentHistory(userId, header, beginDate, endDate, jobDesc, new User(userId));
        return employmentHistory;
    }

}
