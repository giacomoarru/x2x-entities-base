package cloud.x2x.entities.base.generic;

import javax.persistence.MappedSuperclass;

/**
 * Positionable SortableUUIDGenericEntity
 * @author Giacomo Arru
 *
 */
@MappedSuperclass
public abstract class PositionableSortableUUIDGenericEntity extends SortableUUIDGenericEntity {

	protected int positionX;
	protected int positionY;

	public int getPositionX() {
		return positionX;
	}
	
	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}
	
	public int getPositionY() {
		return positionY;
	}
	
	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + positionX;
		result = prime * result + positionY;
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
		PositionableSortableUUIDGenericEntity other = (PositionableSortableUUIDGenericEntity) obj;
		if (positionX != other.positionX) {
			return false;
		}
		if (positionY != other.positionY) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "PositionableSortableUUIDGenericEntity [positionX=" + positionX + ", positionY=" + positionY + "]";
	}
	
}
