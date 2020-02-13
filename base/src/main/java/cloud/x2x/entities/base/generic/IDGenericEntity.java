package cloud.x2x.entities.base.generic;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

/**
 * A class to be used as a model for persistence entities
 * with autoincrement ID (USE int)
 * @author Giacomo Arru
 *
 */
@MappedSuperclass
public abstract class IDGenericEntity {

	@NotNull
	@Id
	@GeneratedValue
	protected Integer id;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IDGenericEntity other = (IDGenericEntity) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "IDGenericEntity [id=" + id + "]";
	}
	
}
