
/**
 * CountryServiceCountryNotFoundExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */

package st.soa;

public class CountryServiceCountryNotFoundExceptionException extends java.lang.Exception {

    private static final long serialVersionUID = 1646659478372L;

    private st.soa.CountryServiceStub.CountryServiceCountryNotFoundException faultMessage;

    public CountryServiceCountryNotFoundExceptionException() {
	super("CountryServiceCountryNotFoundExceptionException");
    }

    public CountryServiceCountryNotFoundExceptionException(java.lang.String s) {
	super(s);
    }

    public CountryServiceCountryNotFoundExceptionException(java.lang.String s, java.lang.Throwable ex) {
	super(s, ex);
    }

    public CountryServiceCountryNotFoundExceptionException(java.lang.Throwable cause) {
	super(cause);
    }

    public void setFaultMessage(st.soa.CountryServiceStub.CountryServiceCountryNotFoundException msg) {
	faultMessage = msg;
    }

    public st.soa.CountryServiceStub.CountryServiceCountryNotFoundException getFaultMessage() {
	return faultMessage;
    }
}
