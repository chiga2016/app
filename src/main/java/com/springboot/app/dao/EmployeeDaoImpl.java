package com.springboot.app.dao;
import com.springboot.app.dao.EmployeeDao;
import com.springboot.app.entity.Employee;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDaoImpl  implements EmployeeDao {

    @Autowired
    private EntityManager entityManager;

    @Override
    //@Transactional
    public List<Employee> getAllEmployees() {
        Session session = entityManager.unwrap(Session.class);
//        List<Employee> allEmployee = session.createQuery("from Employee ", Employee.class).getResultList();
        Query<Employee> query =  session.createQuery("from Employee ", Employee.class);
        List<Employee> list = query.getResultList();
        return list;
    }

//    @Override
//    public void saveEmployee(Employee employee) {
//        Session session = sessionFactory.getCurrentSession();
//        session.saveOrUpdate(employee);
//    }
//
//    @Override
//    public Employee getEmployee(int id) {
//        Session session = sessionFactory.getCurrentSession();
//        return session.get(Employee.class, id);
//    }
//
//    @Override
//    public void deleteEmployee(int id) {
//        Session session = sessionFactory.getCurrentSession();
//
//        Query<Employee> query = session.createQuery("delete  from Employee where id=:employeeId");
//        query.setParameter("employeeId", id);
//        query.executeUpdate();
//
//       // return session.delete(session.get(Employee.class, id));
//    }
}
