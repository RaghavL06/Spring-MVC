package productcrudapp.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import productcrud.model.Event;
import productcrud.model.User;

@Component
public class ProductDao{
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	//create User
	@Transactional
	public void createUser(User user) {
		this.hibernateTemplate.save(user);
	}
	
	
	//create Event
	@Transactional
	public void createEvent(Event event) {
		this.hibernateTemplate.save(event);
	}
	
	//get all events
	public List<Event> getEvents(){
		List<Event> events = this.hibernateTemplate.loadAll(Event.class);
		return events;
	}
	
	@Transactional
	//delete single event
	public void deleteEvent(int eid) {
		Event e = this.hibernateTemplate.load(Event.class,eid);
		this.hibernateTemplate.delete(e);
	}
	
	//get the single event
	public Event getEvent(int eid) {
		return this.hibernateTemplate.get(Event.class, pid);
	}
	
}