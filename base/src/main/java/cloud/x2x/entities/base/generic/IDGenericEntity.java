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
public class IDGenericEntity {

	@NotNull
	@Id
	@GeneratedValue
	private Integer id;
	
}
