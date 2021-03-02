package com.example.darashuk.dao;


 import com.example.darashuk.entity.Employee;
  import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

 import javax.persistence.EntityManager;
 import java.util.List;

@Repository
public class EmployeeDao implements IEmployeeDao {

    private EntityManager entityManager;

    @Autowired
    public EmployeeDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> getAll() {
        Session session = entityManager.unwrap(Session.class);//получили сессию из обертки над hibernate session

        List<Employee>employeeList = session.createQuery("from Employee",Employee.class).getResultList();

        return employeeList;
    }

    @Override
    public void save(Employee employee) {
        Session session =  entityManager.unwrap(Session.class);
        session.saveOrUpdate(employee);
    }

    @Override
    public Employee getById(int id) {
        Session session =  entityManager.unwrap(Session.class);
        Employee employee = session.get(Employee.class,id);
        return employee;

    }

    @Override
    public void delete(int id) {
        Session session =  entityManager.unwrap(Session.class);
        Employee employee = session.get(Employee.class,id);
        session.delete(employee);

    }
}
