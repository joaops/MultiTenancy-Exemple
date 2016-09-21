package com.saas.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import com.saas.dao.StaffDAO;
import com.saas.po.Staff;


public class StaffDAOImpl extends HibernateDaoSupport implements StaffDAO {
    
    @Override
    public void add(Staff staff) {
        this.getHibernateTemplate().save(staff);
    }
    
    @Override
    public void update(Staff staff) {
        this.getHibernateTemplate().update(staff);
    }
    
    @Override
    public void delete(Staff staff) {
        this.getHibernateTemplate().delete(staff);
    }
    
    @Override
    public Staff getStaff(Integer staffId) {
        return this.getHibernateTemplate().get(Staff.class, staffId);
    }
    
    @Override
    public List<Staff> getAllStaff() {
        String hql = "from  Staff";
        Query query = this.currentSession().createQuery(hql);
        return query.list();
    }
    
}