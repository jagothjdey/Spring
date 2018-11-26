package spring.basic.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ComponentDao {
	@Autowired
	ComponentJDBCConnection componentjdbcconnection;

	public ComponentJDBCConnection getJdbcconnection() {
		return componentjdbcconnection;
	}

	public void setcomponentjdbcconnection(ComponentJDBCConnection componentjdbcconnection) {
		this.componentjdbcconnection = componentjdbcconnection;
	}

	public ComponentJDBCConnection getComponentjdbcconnection() {
		return componentjdbcconnection;
	}
	
	
}
