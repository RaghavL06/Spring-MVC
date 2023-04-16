package productcrud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Event {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String Name;
	private String desc;
	private String price;
	private int max_ppl;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public int getMax_ppl() {
		return max_ppl;
	}
	public void setMax_ppl(int max_ppl) {
		this.max_ppl = max_ppl;
	}
	public Event(int id, String name, String desc, String price, int max_ppl) {
		super();
		this.id = id;
		Name = name;
		this.desc = desc;
		this.price = price;
		this.max_ppl = max_ppl;
	}
	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Event [id=" + id + ", Name=" + Name + ", desc=" + desc + ", price=" + price + ", max_ppl=" + max_ppl
				+ "]";
	}
	
	
}
