package cloud.x2x.entities.base.generic;

import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

/**
 * Generic sortable UUIDGenericEntity
 */
@MappedSuperclass
public abstract class SortableUUIDGenericEntity extends UUIDGenericEntity implements Comparable<SortableUUIDGenericEntity> {

	@NotNull
	protected Integer sort;

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((sort == null) ? 0 : sort.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		SortableUUIDGenericEntity other = (SortableUUIDGenericEntity) obj;
		if (sort == null) {
			if (other.sort != null) {
				return false;
			}
		} else if (!sort.equals(other.sort)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "SortableUUIDGenericEntity [sort=" + sort + "]";
	}
	
	@Override
	public int compareTo(SortableUUIDGenericEntity o) {
		return this.sort.compareTo(o.sort);
	}
	
}
