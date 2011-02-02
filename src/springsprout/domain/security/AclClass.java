package springsprout.domain.security;

import javax.persistence.*;

@Entity(name="Acl_Class")
public class AclClass {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(columnDefinition="bigserial")
	private int id;
	@Column(name="class")
	private String className;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getClassName() {
		return className;
	}
	
	
}
