package cloud.x2x.entities.base.generic;

import java.util.UUID;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

/**
 * A class to be used as a model for persistence entities
 * with UUID (use BINARY(16))
 * @author Giacomo Arru
 *
 */
@MappedSuperclass
public abstract class UUIDGenericEntity {

	@NotNull
	@Id
	protected UUID uuid;
	
	public UUIDGenericEntity() {
		this.uuid = UUID.randomUUID();
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((uuid == null) ? 0 : uuid.hashCode());
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
		UUIDGenericEntity other = (UUIDGenericEntity) obj;
		if (uuid == null) {
			if (other.uuid != null)
				return false;
		} else if (!uuid.equals(other.uuid)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "UUIDGenericEntity [uuid=" + uuid + "]";
	}
	
}
