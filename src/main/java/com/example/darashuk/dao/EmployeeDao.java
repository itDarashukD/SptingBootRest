package com.example.darashuk.dao;


 import com.example.darashuk.entity.Employee;
//  import org.hibernate.Session;
//import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

 import javax.persistence.EntityManager;
 import javax.persistence.Query;
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
//        Session session = entityManager.unwrap(Session.class);//получили сессию из обертки над hibernate session
//
//        List<Employee>employeeList = session.createQuery("from Employee",Employee.class).getResultList();
        Query query = entityManager.createQuery("from Employee");
        List<Employee> employeeList = query.getResultList();

        return employeeList;
    }

    @Override
    public void save(Employee employee) {
//        Session session =  entityManager.unwrap(Session.class);
//        session.saveOrUpdate(employee);
       Employee employee1 =  entityManager.merge(employee);
       employee1.setId(new Employee().getId());

    }


    @Override
    public Employee getById(int id) {
//        Session session =  entityManager.unwrap(Session.class);
//        Employee employee = session.get(Employee.class,id);
        Employee employee = entityManager.find(Employee.class,id);

        return employee;

    }

    @Override
    public void delete(int id) {
//        Session session =  entityManager.unwrap(Session.class);
//        Employee employee = session.get(Employee.class,id);
//        session.delete(employee);
            Query query = entityManager.createQuery("delete from Employee where id =: employeeId");
            query.setParameter("employeeId",id);
            query.executeUpdate();
    }
}
