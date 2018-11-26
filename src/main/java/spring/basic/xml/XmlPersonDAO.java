package spring.basic.xml;

import org.springframework.stereotype.Component;

public class XmlPersonDAO {
	XmlJdbcConnection xmlJdbcConnection;

	public void setXmlJdbcConnection(XmlJdbcConnection xmlJdbcConnection) {
		this.xmlJdbcConnection = xmlJdbcConnection;
	}

	public XmlJdbcConnection getXmlJdbcConnection() {
		return xmlJdbcConnection;
	}
}