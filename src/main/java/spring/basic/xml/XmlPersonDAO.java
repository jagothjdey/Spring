package spring.basic.xml;


public class XmlPersonDAO {
	XmlJdbcConnection xmlJdbcConnection;

	public void setXmlJdbcConnection(XmlJdbcConnection xmlJdbcConnection) {
		this.xmlJdbcConnection = xmlJdbcConnection;
	}

	public XmlJdbcConnection getXmlJdbcConnection() {
		return xmlJdbcConnection;
	}
}