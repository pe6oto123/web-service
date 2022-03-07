
/**
 * CountryServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package st.soa;

/*
*  CountryServiceStub java implementation
*/

public class CountryServiceStub extends org.apache.axis2.client.Stub {
    protected org.apache.axis2.description.AxisOperation[] _operations;

    // hashmaps to keep the fault mapping
    private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
    private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
    private java.util.HashMap faultMessageMap = new java.util.HashMap();

    private static int counter = 0;

    private static synchronized java.lang.String getUniqueSuffix() {
	// reset the counter if it is greater than 99999
	if (counter > 99999) {
	    counter = 0;
	}
	counter = counter + 1;
	return java.lang.Long.toString(java.lang.System.currentTimeMillis()) + "_" + counter;
    }

    private void populateAxisService() throws org.apache.axis2.AxisFault {

	// creating the Service with a unique name
	_service = new org.apache.axis2.description.AxisService("CountryService" + getUniqueSuffix());
	addAnonymousOperations();

	// creating the operations
	org.apache.axis2.description.AxisOperation __operation;

	_operations = new org.apache.axis2.description.AxisOperation[2];

	__operation = new org.apache.axis2.description.OutInAxisOperation();

	__operation.setName(new javax.xml.namespace.QName("http://soa.st", "getAllCountries"));
	_service.addOperation(__operation);

	_operations[0] = __operation;

	__operation = new org.apache.axis2.description.OutInAxisOperation();

	__operation.setName(new javax.xml.namespace.QName("http://soa.st", "getCitiesByCountryName"));
	_service.addOperation(__operation);

	_operations[1] = __operation;

    }

    // populates the faults
    private void populateFaults() {

	faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
		new javax.xml.namespace.QName("http://soa.st", "CountryServiceCountryNotFoundException"),
		"getCitiesByCountryName"), "st.soa.CountryServiceCountryNotFoundExceptionException");
	faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
		new javax.xml.namespace.QName("http://soa.st", "CountryServiceCountryNotFoundException"),
		"getCitiesByCountryName"), "st.soa.CountryServiceCountryNotFoundExceptionException");
	faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
		new javax.xml.namespace.QName("http://soa.st", "CountryServiceCountryNotFoundException"),
		"getCitiesByCountryName"), "st.soa.CountryServiceStub$CountryServiceCountryNotFoundException");

    }

    /**
     * Constructor that takes in a configContext
     */

    public CountryServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
	    java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
	this(configurationContext, targetEndpoint, false);
    }

    /**
     * Constructor that takes in a configContext and useseperate listner
     */
    public CountryServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
	    java.lang.String targetEndpoint, boolean useSeparateListener) throws org.apache.axis2.AxisFault {
	// To populate AxisService
	populateAxisService();
	populateFaults();

	_serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext, _service);

	_serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(targetEndpoint));
	_serviceClient.getOptions().setUseSeparateListener(useSeparateListener);

	// Set the soap version
	_serviceClient.getOptions()
		.setSoapVersionURI(org.apache.axiom.soap.SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);

    }

    /**
     * Default Constructor
     */
    public CountryServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext)
	    throws org.apache.axis2.AxisFault {

	this(configurationContext,
		"http://localhost:8080/countries-service/services/CountryService.CountryServiceHttpSoap12Endpoint/");

    }

    /**
     * Default Constructor
     */
    public CountryServiceStub() throws org.apache.axis2.AxisFault {

	this("http://localhost:8080/countries-service/services/CountryService.CountryServiceHttpSoap12Endpoint/");

    }

    /**
     * Constructor taking the target endpoint
     */
    public CountryServiceStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
	this(null, targetEndpoint);
    }

    /**
     * Auto generated method signature
     * 
     * @see st.soa.CountryService#getAllCountries
     * @param getAllCountries0
     * 
     */

    public st.soa.CountryServiceStub.GetAllCountriesResponse getAllCountries(

	    st.soa.CountryServiceStub.GetAllCountries getAllCountries0)

	    throws java.rmi.RemoteException

    {
	org.apache.axis2.context.MessageContext _messageContext = null;
	try {
	    org.apache.axis2.client.OperationClient _operationClient = _serviceClient
		    .createClient(_operations[0].getName());
	    _operationClient.getOptions().setAction("urn:getAllCountries");
	    _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

	    addPropertyToOperationClient(_operationClient,
		    org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

	    // create a message context
	    _messageContext = new org.apache.axis2.context.MessageContext();

	    // create SOAP envelope with that payload
	    org.apache.axiom.soap.SOAPEnvelope env = null;

	    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getAllCountries0,
		    optimizeContent(new javax.xml.namespace.QName("http://soa.st", "getAllCountries")),
		    new javax.xml.namespace.QName("http://soa.st", "getAllCountries"));

	    // adding SOAP soap_headers
	    _serviceClient.addHeadersToEnvelope(env);
	    // set the message context with that soap envelope
	    _messageContext.setEnvelope(env);

	    // add the message contxt to the operation client
	    _operationClient.addMessageContext(_messageContext);

	    // execute the operation client
	    _operationClient.execute(true);

	    org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
		    .getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
	    org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

	    java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
		    st.soa.CountryServiceStub.GetAllCountriesResponse.class, getEnvelopeNamespaces(_returnEnv));

	    return (st.soa.CountryServiceStub.GetAllCountriesResponse) object;

	} catch (org.apache.axis2.AxisFault f) {

	    org.apache.axiom.om.OMElement faultElt = f.getDetail();
	    if (faultElt != null) {
		if (faultExceptionNameMap
			.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getAllCountries"))) {
		    // make the fault by reflection
		    try {
			java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
				.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getAllCountries"));
			java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
			java.lang.reflect.Constructor constructor = exceptionClass
				.getConstructor(java.lang.String.class);
			java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
			// message class
			java.lang.String messageClassName = (java.lang.String) faultMessageMap
				.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getAllCountries"));
			java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
			java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
			java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
				new java.lang.Class[] { messageClass });
			m.invoke(ex, new java.lang.Object[] { messageObject });

			throw new java.rmi.RemoteException(ex.getMessage(), ex);
		    } catch (java.lang.ClassCastException e) {
			// we cannot intantiate the class - throw the original Axis fault
			throw f;
		    } catch (java.lang.ClassNotFoundException e) {
			// we cannot intantiate the class - throw the original Axis fault
			throw f;
		    } catch (java.lang.NoSuchMethodException e) {
			// we cannot intantiate the class - throw the original Axis fault
			throw f;
		    } catch (java.lang.reflect.InvocationTargetException e) {
			// we cannot intantiate the class - throw the original Axis fault
			throw f;
		    } catch (java.lang.IllegalAccessException e) {
			// we cannot intantiate the class - throw the original Axis fault
			throw f;
		    } catch (java.lang.InstantiationException e) {
			// we cannot intantiate the class - throw the original Axis fault
			throw f;
		    }
		} else {
		    throw f;
		}
	    } else {
		throw f;
	    }
	} finally {
	    if (_messageContext.getTransportOut() != null) {
		_messageContext.getTransportOut().getSender().cleanup(_messageContext);
	    }
	}
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see st.soa.CountryService#startgetAllCountries
     * @param getAllCountries0
     * 
     */
    public void startgetAllCountries(

	    st.soa.CountryServiceStub.GetAllCountries getAllCountries0,

	    final st.soa.CountryServiceCallbackHandler callback)

	    throws java.rmi.RemoteException {

	org.apache.axis2.client.OperationClient _operationClient = _serviceClient
		.createClient(_operations[0].getName());
	_operationClient.getOptions().setAction("urn:getAllCountries");
	_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

	addPropertyToOperationClient(_operationClient,
		org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

	// create SOAP envelope with that payload
	org.apache.axiom.soap.SOAPEnvelope env = null;
	final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

	// Style is Doc.

	env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getAllCountries0,
		optimizeContent(new javax.xml.namespace.QName("http://soa.st", "getAllCountries")),
		new javax.xml.namespace.QName("http://soa.st", "getAllCountries"));

	// adding SOAP soap_headers
	_serviceClient.addHeadersToEnvelope(env);
	// create message context with that soap envelope
	_messageContext.setEnvelope(env);

	// add the message context to the operation client
	_operationClient.addMessageContext(_messageContext);

	_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
	    public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
		try {
		    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

		    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
			    st.soa.CountryServiceStub.GetAllCountriesResponse.class, getEnvelopeNamespaces(resultEnv));
		    callback.receiveResultgetAllCountries((st.soa.CountryServiceStub.GetAllCountriesResponse) object);

		} catch (org.apache.axis2.AxisFault e) {
		    callback.receiveErrorgetAllCountries(e);
		}
	    }

	    public void onError(java.lang.Exception error) {
		if (error instanceof org.apache.axis2.AxisFault) {
		    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
		    org.apache.axiom.om.OMElement faultElt = f.getDetail();
		    if (faultElt != null) {
			if (faultExceptionNameMap.containsKey(
				new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getAllCountries"))) {
			    // make the fault by reflection
			    try {
				java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
					.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
						"getAllCountries"));
				java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
				java.lang.reflect.Constructor constructor = exceptionClass
					.getConstructor(java.lang.String.class);
				java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
				// message class
				java.lang.String messageClassName = (java.lang.String) faultMessageMap
					.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
						"getAllCountries"));
				java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
				java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
				java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
					new java.lang.Class[] { messageClass });
				m.invoke(ex, new java.lang.Object[] { messageObject });

				callback.receiveErrorgetAllCountries(new java.rmi.RemoteException(ex.getMessage(), ex));
			    } catch (java.lang.ClassCastException e) {
				// we cannot intantiate the class - throw the original Axis fault
				callback.receiveErrorgetAllCountries(f);
			    } catch (java.lang.ClassNotFoundException e) {
				// we cannot intantiate the class - throw the original Axis fault
				callback.receiveErrorgetAllCountries(f);
			    } catch (java.lang.NoSuchMethodException e) {
				// we cannot intantiate the class - throw the original Axis fault
				callback.receiveErrorgetAllCountries(f);
			    } catch (java.lang.reflect.InvocationTargetException e) {
				// we cannot intantiate the class - throw the original Axis fault
				callback.receiveErrorgetAllCountries(f);
			    } catch (java.lang.IllegalAccessException e) {
				// we cannot intantiate the class - throw the original Axis fault
				callback.receiveErrorgetAllCountries(f);
			    } catch (java.lang.InstantiationException e) {
				// we cannot intantiate the class - throw the original Axis fault
				callback.receiveErrorgetAllCountries(f);
			    } catch (org.apache.axis2.AxisFault e) {
				// we cannot intantiate the class - throw the original Axis fault
				callback.receiveErrorgetAllCountries(f);
			    }
			} else {
			    callback.receiveErrorgetAllCountries(f);
			}
		    } else {
			callback.receiveErrorgetAllCountries(f);
		    }
		} else {
		    callback.receiveErrorgetAllCountries(error);
		}
	    }

	    public void onFault(org.apache.axis2.context.MessageContext faultContext) {
		org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
			.getInboundFaultFromMessageContext(faultContext);
		onError(fault);
	    }

	    public void onComplete() {
		try {
		    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
		} catch (org.apache.axis2.AxisFault axisFault) {
		    callback.receiveErrorgetAllCountries(axisFault);
		}
	    }
	});

	org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
	if (_operations[0].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
	    _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
	    _operations[0].setMessageReceiver(_callbackReceiver);
	}

	// execute the operation client
	_operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see st.soa.CountryService#getCitiesByCountryName
     * @param getCitiesByCountryName2
     * 
     * @throws st.soa.CountryServiceCountryNotFoundExceptionException :
     */

    public st.soa.CountryServiceStub.GetCitiesByCountryNameResponse getCitiesByCountryName(

	    st.soa.CountryServiceStub.GetCitiesByCountryName getCitiesByCountryName2)

	    throws java.rmi.RemoteException

	    , st.soa.CountryServiceCountryNotFoundExceptionException {
	org.apache.axis2.context.MessageContext _messageContext = null;
	try {
	    org.apache.axis2.client.OperationClient _operationClient = _serviceClient
		    .createClient(_operations[1].getName());
	    _operationClient.getOptions().setAction("urn:getCitiesByCountryName");
	    _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

	    addPropertyToOperationClient(_operationClient,
		    org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

	    // create a message context
	    _messageContext = new org.apache.axis2.context.MessageContext();

	    // create SOAP envelope with that payload
	    org.apache.axiom.soap.SOAPEnvelope env = null;

	    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getCitiesByCountryName2,
		    optimizeContent(new javax.xml.namespace.QName("http://soa.st", "getCitiesByCountryName")),
		    new javax.xml.namespace.QName("http://soa.st", "getCitiesByCountryName"));

	    // adding SOAP soap_headers
	    _serviceClient.addHeadersToEnvelope(env);
	    // set the message context with that soap envelope
	    _messageContext.setEnvelope(env);

	    // add the message contxt to the operation client
	    _operationClient.addMessageContext(_messageContext);

	    // execute the operation client
	    _operationClient.execute(true);

	    org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
		    .getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
	    org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

	    java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
		    st.soa.CountryServiceStub.GetCitiesByCountryNameResponse.class, getEnvelopeNamespaces(_returnEnv));

	    return (st.soa.CountryServiceStub.GetCitiesByCountryNameResponse) object;

	} catch (org.apache.axis2.AxisFault f) {

	    org.apache.axiom.om.OMElement faultElt = f.getDetail();
	    if (faultElt != null) {
		if (faultExceptionNameMap.containsKey(
			new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getCitiesByCountryName"))) {
		    // make the fault by reflection
		    try {
			java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(
				new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getCitiesByCountryName"));
			java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
			java.lang.reflect.Constructor constructor = exceptionClass
				.getConstructor(java.lang.String.class);
			java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
			// message class
			java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(
				new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getCitiesByCountryName"));
			java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
			java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
			java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
				new java.lang.Class[] { messageClass });
			m.invoke(ex, new java.lang.Object[] { messageObject });

			if (ex instanceof st.soa.CountryServiceCountryNotFoundExceptionException) {
			    throw (st.soa.CountryServiceCountryNotFoundExceptionException) ex;
			}

			throw new java.rmi.RemoteException(ex.getMessage(), ex);
		    } catch (java.lang.ClassCastException e) {
			// we cannot intantiate the class - throw the original Axis fault
			throw f;
		    } catch (java.lang.ClassNotFoundException e) {
			// we cannot intantiate the class - throw the original Axis fault
			throw f;
		    } catch (java.lang.NoSuchMethodException e) {
			// we cannot intantiate the class - throw the original Axis fault
			throw f;
		    } catch (java.lang.reflect.InvocationTargetException e) {
			// we cannot intantiate the class - throw the original Axis fault
			throw f;
		    } catch (java.lang.IllegalAccessException e) {
			// we cannot intantiate the class - throw the original Axis fault
			throw f;
		    } catch (java.lang.InstantiationException e) {
			// we cannot intantiate the class - throw the original Axis fault
			throw f;
		    }
		} else {
		    throw f;
		}
	    } else {
		throw f;
	    }
	} finally {
	    if (_messageContext.getTransportOut() != null) {
		_messageContext.getTransportOut().getSender().cleanup(_messageContext);
	    }
	}
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see st.soa.CountryService#startgetCitiesByCountryName
     * @param getCitiesByCountryName2
     * 
     */
    public void startgetCitiesByCountryName(

	    st.soa.CountryServiceStub.GetCitiesByCountryName getCitiesByCountryName2,

	    final st.soa.CountryServiceCallbackHandler callback)

	    throws java.rmi.RemoteException {

	org.apache.axis2.client.OperationClient _operationClient = _serviceClient
		.createClient(_operations[1].getName());
	_operationClient.getOptions().setAction("urn:getCitiesByCountryName");
	_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

	addPropertyToOperationClient(_operationClient,
		org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

	// create SOAP envelope with that payload
	org.apache.axiom.soap.SOAPEnvelope env = null;
	final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

	// Style is Doc.

	env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getCitiesByCountryName2,
		optimizeContent(new javax.xml.namespace.QName("http://soa.st", "getCitiesByCountryName")),
		new javax.xml.namespace.QName("http://soa.st", "getCitiesByCountryName"));

	// adding SOAP soap_headers
	_serviceClient.addHeadersToEnvelope(env);
	// create message context with that soap envelope
	_messageContext.setEnvelope(env);

	// add the message context to the operation client
	_operationClient.addMessageContext(_messageContext);

	_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
	    public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
		try {
		    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

		    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
			    st.soa.CountryServiceStub.GetCitiesByCountryNameResponse.class,
			    getEnvelopeNamespaces(resultEnv));
		    callback.receiveResultgetCitiesByCountryName(
			    (st.soa.CountryServiceStub.GetCitiesByCountryNameResponse) object);

		} catch (org.apache.axis2.AxisFault e) {
		    callback.receiveErrorgetCitiesByCountryName(e);
		}
	    }

	    public void onError(java.lang.Exception error) {
		if (error instanceof org.apache.axis2.AxisFault) {
		    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
		    org.apache.axiom.om.OMElement faultElt = f.getDetail();
		    if (faultElt != null) {
			if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(
				faultElt.getQName(), "getCitiesByCountryName"))) {
			    // make the fault by reflection
			    try {
				java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
					.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
						"getCitiesByCountryName"));
				java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
				java.lang.reflect.Constructor constructor = exceptionClass
					.getConstructor(java.lang.String.class);
				java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
				// message class
				java.lang.String messageClassName = (java.lang.String) faultMessageMap
					.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
						"getCitiesByCountryName"));
				java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
				java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
				java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
					new java.lang.Class[] { messageClass });
				m.invoke(ex, new java.lang.Object[] { messageObject });

				if (ex instanceof st.soa.CountryServiceCountryNotFoundExceptionException) {
				    callback.receiveErrorgetCitiesByCountryName(
					    (st.soa.CountryServiceCountryNotFoundExceptionException) ex);
				    return;
				}

				callback.receiveErrorgetCitiesByCountryName(
					new java.rmi.RemoteException(ex.getMessage(), ex));
			    } catch (java.lang.ClassCastException e) {
				// we cannot intantiate the class - throw the original Axis fault
				callback.receiveErrorgetCitiesByCountryName(f);
			    } catch (java.lang.ClassNotFoundException e) {
				// we cannot intantiate the class - throw the original Axis fault
				callback.receiveErrorgetCitiesByCountryName(f);
			    } catch (java.lang.NoSuchMethodException e) {
				// we cannot intantiate the class - throw the original Axis fault
				callback.receiveErrorgetCitiesByCountryName(f);
			    } catch (java.lang.reflect.InvocationTargetException e) {
				// we cannot intantiate the class - throw the original Axis fault
				callback.receiveErrorgetCitiesByCountryName(f);
			    } catch (java.lang.IllegalAccessException e) {
				// we cannot intantiate the class - throw the original Axis fault
				callback.receiveErrorgetCitiesByCountryName(f);
			    } catch (java.lang.InstantiationException e) {
				// we cannot intantiate the class - throw the original Axis fault
				callback.receiveErrorgetCitiesByCountryName(f);
			    } catch (org.apache.axis2.AxisFault e) {
				// we cannot intantiate the class - throw the original Axis fault
				callback.receiveErrorgetCitiesByCountryName(f);
			    }
			} else {
			    callback.receiveErrorgetCitiesByCountryName(f);
			}
		    } else {
			callback.receiveErrorgetCitiesByCountryName(f);
		    }
		} else {
		    callback.receiveErrorgetCitiesByCountryName(error);
		}
	    }

	    public void onFault(org.apache.axis2.context.MessageContext faultContext) {
		org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
			.getInboundFaultFromMessageContext(faultContext);
		onError(fault);
	    }

	    public void onComplete() {
		try {
		    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
		} catch (org.apache.axis2.AxisFault axisFault) {
		    callback.receiveErrorgetCitiesByCountryName(axisFault);
		}
	    }
	});

	org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
	if (_operations[1].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
	    _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
	    _operations[1].setMessageReceiver(_callbackReceiver);
	}

	// execute the operation client
	_operationClient.execute(false);

    }

    /**
     * A utility method that copies the namepaces from the SOAPEnvelope
     */
    private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env) {
	java.util.Map returnMap = new java.util.HashMap();
	java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
	while (namespaceIterator.hasNext()) {
	    org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
	    returnMap.put(ns.getPrefix(), ns.getNamespaceURI());
	}
	return returnMap;
    }

    private javax.xml.namespace.QName[] opNameArray = null;

    private boolean optimizeContent(javax.xml.namespace.QName opName) {

	if (opNameArray == null) {
	    return false;
	}
	for (int i = 0; i < opNameArray.length; i++) {
	    if (opName.equals(opNameArray[i])) {
		return true;
	    }
	}
	return false;
    }

    // http://localhost:8080/countries-service/services/CountryService.CountryServiceHttpSoap12Endpoint/
    public static class ExtensionMapper {

	public static java.lang.Object getTypeObject(java.lang.String namespaceURI, java.lang.String typeName,
		javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {

	    if ("http://soa.st/xsd".equals(namespaceURI) && "CountryNotFoundException".equals(typeName)) {

		return CountryNotFoundException.Factory.parse(reader);

	    }

	    if ("http://soa.st/xsd".equals(namespaceURI) && "Country".equals(typeName)) {

		return Country.Factory.parse(reader);

	    }

	    if ("http://soa.st/xsd".equals(namespaceURI) && "City".equals(typeName)) {

		return City.Factory.parse(reader);

	    }

	    throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
	}

    }

    public static class CountryNotFoundException implements org.apache.axis2.databinding.ADBBean {
	/*
	 * This type was generated from the piece of schema that had name =
	 * CountryNotFoundException Namespace URI = http://soa.st/xsd Namespace Prefix =
	 * ns1
	 */

	/**
	 *
	 * @param parentQName
	 * @param factory
	 * @return org.apache.axiom.om.OMElement
	 */
	public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
		final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

	    org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
		    parentQName);
	    return factory.createOMElement(dataSource, parentQName);

	}

	public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
		throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
	    serialize(parentQName, xmlWriter, false);
	}

	public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
		boolean serializeType)
		throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

	    java.lang.String prefix = null;
	    java.lang.String namespace = null;

	    prefix = parentQName.getPrefix();
	    namespace = parentQName.getNamespaceURI();
	    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

	    if (serializeType) {

		java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://soa.st/xsd");
		if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
		    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
			    namespacePrefix + ":CountryNotFoundException", xmlWriter);
		} else {
		    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
			    "CountryNotFoundException", xmlWriter);
		}

	    }

	    xmlWriter.writeEndElement();

	}

	private static java.lang.String generatePrefix(java.lang.String namespace) {
	    if (namespace.equals("http://soa.st/xsd")) {
		return "ns1";
	    }
	    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
	}

	/**
	 * Utility method to write an element start tag.
	 */
	private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
		javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
	    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
	    if (writerPrefix != null) {
		xmlWriter.writeStartElement(namespace, localPart);
	    } else {
		if (namespace.length() == 0) {
		    prefix = "";
		} else if (prefix == null) {
		    prefix = generatePrefix(namespace);
		}

		xmlWriter.writeStartElement(prefix, localPart, namespace);
		xmlWriter.writeNamespace(prefix, namespace);
		xmlWriter.setPrefix(prefix, namespace);
	    }
	}

	/**
	 * Util method to write an attribute with the ns prefix
	 */
	private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
		java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
		throws javax.xml.stream.XMLStreamException {
	    if (xmlWriter.getPrefix(namespace) == null) {
		xmlWriter.writeNamespace(prefix, namespace);
		xmlWriter.setPrefix(prefix, namespace);
	    }
	    xmlWriter.writeAttribute(namespace, attName, attValue);
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
		javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
	    if (namespace.equals("")) {
		xmlWriter.writeAttribute(attName, attValue);
	    } else {
		registerPrefix(xmlWriter, namespace);
		xmlWriter.writeAttribute(namespace, attName, attValue);
	    }
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
		javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
		throws javax.xml.stream.XMLStreamException {

	    java.lang.String attributeNamespace = qname.getNamespaceURI();
	    java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
	    if (attributePrefix == null) {
		attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
	    }
	    java.lang.String attributeValue;
	    if (attributePrefix.trim().length() > 0) {
		attributeValue = attributePrefix + ":" + qname.getLocalPart();
	    } else {
		attributeValue = qname.getLocalPart();
	    }

	    if (namespace.equals("")) {
		xmlWriter.writeAttribute(attName, attributeValue);
	    } else {
		registerPrefix(xmlWriter, namespace);
		xmlWriter.writeAttribute(namespace, attName, attributeValue);
	    }
	}

	/**
	 * method to handle Qnames
	 */

	private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
		throws javax.xml.stream.XMLStreamException {
	    java.lang.String namespaceURI = qname.getNamespaceURI();
	    if (namespaceURI != null) {
		java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
		if (prefix == null) {
		    prefix = generatePrefix(namespaceURI);
		    xmlWriter.writeNamespace(prefix, namespaceURI);
		    xmlWriter.setPrefix(prefix, namespaceURI);
		}

		if (prefix.trim().length() > 0) {
		    xmlWriter.writeCharacters(
			    prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
		} else {
		    // i.e this is the default namespace
		    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
		}

	    } else {
		xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
	    }
	}

	private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
		throws javax.xml.stream.XMLStreamException {

	    if (qnames != null) {
		// we have to store this data until last moment since it is not possible to
		// write any
		// namespace data after writing the charactor data
		java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
		java.lang.String namespaceURI = null;
		java.lang.String prefix = null;

		for (int i = 0; i < qnames.length; i++) {
		    if (i > 0) {
			stringToWrite.append(" ");
		    }
		    namespaceURI = qnames[i].getNamespaceURI();
		    if (namespaceURI != null) {
			prefix = xmlWriter.getPrefix(namespaceURI);
			if ((prefix == null) || (prefix.length() == 0)) {
			    prefix = generatePrefix(namespaceURI);
			    xmlWriter.writeNamespace(prefix, namespaceURI);
			    xmlWriter.setPrefix(prefix, namespaceURI);
			}

			if (prefix.trim().length() > 0) {
			    stringToWrite.append(prefix).append(":").append(
				    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
			} else {
			    stringToWrite.append(
				    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
			}
		    } else {
			stringToWrite
				.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
		    }
		}
		xmlWriter.writeCharacters(stringToWrite.toString());
	    }

	}

	/**
	 * Register a namespace prefix
	 */
	private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
		throws javax.xml.stream.XMLStreamException {
	    java.lang.String prefix = xmlWriter.getPrefix(namespace);
	    if (prefix == null) {
		prefix = generatePrefix(namespace);
		javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
		while (true) {
		    java.lang.String uri = nsContext.getNamespaceURI(prefix);
		    if (uri == null || uri.length() == 0) {
			break;
		    }
		    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}
		xmlWriter.writeNamespace(prefix, namespace);
		xmlWriter.setPrefix(prefix, namespace);
	    }
	    return prefix;
	}

	/**
	 * databinding method to get an XML representation of this object
	 *
	 */
	public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
		throws org.apache.axis2.databinding.ADBException {

	    java.util.ArrayList elementList = new java.util.ArrayList();
	    java.util.ArrayList attribList = new java.util.ArrayList();

	    return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
		    attribList.toArray());

	}

	/**
	 * Factory class that keeps the parse method
	 */
	public static class Factory {

	    /**
	     * static method to create the object Precondition: If this object is an
	     * element, the current or next start element starts this object and any
	     * intervening reader events are ignorable If this object is not an element, it
	     * is a complex type and the reader is at the event just after the outer start
	     * element Postcondition: If this object is an element, the reader is positioned
	     * at its end element If this object is a complex type, the reader is positioned
	     * at the end element of its outer element
	     */
	    public static CountryNotFoundException parse(javax.xml.stream.XMLStreamReader reader)
		    throws java.lang.Exception {
		CountryNotFoundException object = new CountryNotFoundException();

		int event;
		java.lang.String nillableValue = null;
		java.lang.String prefix = "";
		java.lang.String namespaceuri = "";
		try {

		    while (!reader.isStartElement() && !reader.isEndElement())
			reader.next();

		    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
			java.lang.String fullTypeName = reader
				.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
			if (fullTypeName != null) {
			    java.lang.String nsPrefix = null;
			    if (fullTypeName.indexOf(":") > -1) {
				nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
			    }
			    nsPrefix = nsPrefix == null ? "" : nsPrefix;

			    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

			    if (!"CountryNotFoundException".equals(type)) {
				// find namespace for the prefix
				java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
				return (CountryNotFoundException) ExtensionMapper.getTypeObject(nsUri, type, reader);
			    }

			}

		    }

		    // Note all attributes that were handled. Used to differ normal attributes
		    // from anyAttributes.
		    java.util.Vector handledAttributes = new java.util.Vector();

		    reader.next();

		    while (!reader.isStartElement() && !reader.isEndElement())
			reader.next();

		    if (reader.isStartElement())
			// A start element we are not expecting indicates a trailing invalid property
			throw new org.apache.axis2.databinding.ADBException(
				"Unexpected subelement " + reader.getName());

		} catch (javax.xml.stream.XMLStreamException e) {
		    throw new java.lang.Exception(e);
		}

		return object;
	    }

	}// end of factory class

    }

    public static class Country implements org.apache.axis2.databinding.ADBBean {
	/*
	 * This type was generated from the piece of schema that had name = Country
	 * Namespace URI = http://soa.st/xsd Namespace Prefix = ns1
	 */

	/**
	 * field for Cities This was an Array!
	 */

	protected City[] localCities;

	/*
	 * This tracker boolean wil be used to detect whether the user called the set
	 * method for this attribute. It will be used to determine whether to include
	 * this field in the serialized XML
	 */
	protected boolean localCitiesTracker = false;

	public boolean isCitiesSpecified() {
	    return localCitiesTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return City[]
	 */
	public City[] getCities() {
	    return localCities;
	}

	/**
	 * validate the array for Cities
	 */
	protected void validateCities(City[] param) {

	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param Cities
	 */
	public void setCities(City[] param) {

	    validateCities(param);

	    localCitiesTracker = true;

	    this.localCities = param;
	}

	/**
	 * Auto generated add method for the array for convenience
	 * 
	 * @param param City
	 */
	public void addCities(City param) {
	    if (localCities == null) {
		localCities = new City[] {};
	    }

	    // update the setting tracker
	    localCitiesTracker = true;

	    java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localCities);
	    list.add(param);
	    this.localCities = (City[]) list.toArray(new City[list.size()]);

	}

	/**
	 * field for Continent
	 */

	protected java.lang.String localContinent;

	/*
	 * This tracker boolean wil be used to detect whether the user called the set
	 * method for this attribute. It will be used to determine whether to include
	 * this field in the serialized XML
	 */
	protected boolean localContinentTracker = false;

	public boolean isContinentSpecified() {
	    return localContinentTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getContinent() {
	    return localContinent;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param Continent
	 */
	public void setContinent(java.lang.String param) {
	    localContinentTracker = true;

	    this.localContinent = param;

	}

	/**
	 * field for Language
	 */

	protected java.lang.String localLanguage;

	/*
	 * This tracker boolean wil be used to detect whether the user called the set
	 * method for this attribute. It will be used to determine whether to include
	 * this field in the serialized XML
	 */
	protected boolean localLanguageTracker = false;

	public boolean isLanguageSpecified() {
	    return localLanguageTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getLanguage() {
	    return localLanguage;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param Language
	 */
	public void setLanguage(java.lang.String param) {
	    localLanguageTracker = true;

	    this.localLanguage = param;

	}

	/**
	 * field for Name
	 */

	protected java.lang.String localName;

	/*
	 * This tracker boolean wil be used to detect whether the user called the set
	 * method for this attribute. It will be used to determine whether to include
	 * this field in the serialized XML
	 */
	protected boolean localNameTracker = false;

	public boolean isNameSpecified() {
	    return localNameTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getName() {
	    return localName;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param Name
	 */
	public void setName(java.lang.String param) {
	    localNameTracker = true;

	    this.localName = param;

	}

	/**
	 *
	 * @param parentQName
	 * @param factory
	 * @return org.apache.axiom.om.OMElement
	 */
	public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
		final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

	    org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
		    parentQName);
	    return factory.createOMElement(dataSource, parentQName);

	}

	public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
		throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
	    serialize(parentQName, xmlWriter, false);
	}

	public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
		boolean serializeType)
		throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

	    java.lang.String prefix = null;
	    java.lang.String namespace = null;

	    prefix = parentQName.getPrefix();
	    namespace = parentQName.getNamespaceURI();
	    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

	    if (serializeType) {

		java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://soa.st/xsd");
		if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
		    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
			    namespacePrefix + ":Country", xmlWriter);
		} else {
		    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "Country", xmlWriter);
		}

	    }
	    if (localCitiesTracker) {
		if (localCities != null) {
		    for (int i = 0; i < localCities.length; i++) {
			if (localCities[i] != null) {
			    localCities[i].serialize(new javax.xml.namespace.QName("http://soa.st/xsd", "cities"),
				    xmlWriter);
			} else {

			    writeStartElement(null, "http://soa.st/xsd", "cities", xmlWriter);

			    // write the nil attribute
			    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
			    xmlWriter.writeEndElement();

			}

		    }
		} else {

		    writeStartElement(null, "http://soa.st/xsd", "cities", xmlWriter);

		    // write the nil attribute
		    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
		    xmlWriter.writeEndElement();

		}
	    }
	    if (localContinentTracker) {
		namespace = "http://soa.st/xsd";
		writeStartElement(null, namespace, "continent", xmlWriter);

		if (localContinent == null) {
		    // write the nil attribute

		    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

		} else {

		    xmlWriter.writeCharacters(localContinent);

		}

		xmlWriter.writeEndElement();
	    }
	    if (localLanguageTracker) {
		namespace = "http://soa.st/xsd";
		writeStartElement(null, namespace, "language", xmlWriter);

		if (localLanguage == null) {
		    // write the nil attribute

		    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

		} else {

		    xmlWriter.writeCharacters(localLanguage);

		}

		xmlWriter.writeEndElement();
	    }
	    if (localNameTracker) {
		namespace = "http://soa.st/xsd";
		writeStartElement(null, namespace, "name", xmlWriter);

		if (localName == null) {
		    // write the nil attribute

		    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

		} else {

		    xmlWriter.writeCharacters(localName);

		}

		xmlWriter.writeEndElement();
	    }
	    xmlWriter.writeEndElement();

	}

	private static java.lang.String generatePrefix(java.lang.String namespace) {
	    if (namespace.equals("http://soa.st/xsd")) {
		return "ns1";
	    }
	    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
	}

	/**
	 * Utility method to write an element start tag.
	 */
	private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
		javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
	    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
	    if (writerPrefix != null) {
		xmlWriter.writeStartElement(namespace, localPart);
	    } else {
		if (namespace.length() == 0) {
		    prefix = "";
		} else if (prefix == null) {
		    prefix = generatePrefix(namespace);
		}

		xmlWriter.writeStartElement(prefix, localPart, namespace);
		xmlWriter.writeNamespace(prefix, namespace);
		xmlWriter.setPrefix(prefix, namespace);
	    }
	}

	/**
	 * Util method to write an attribute with the ns prefix
	 */
	private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
		java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
		throws javax.xml.stream.XMLStreamException {
	    if (xmlWriter.getPrefix(namespace) == null) {
		xmlWriter.writeNamespace(prefix, namespace);
		xmlWriter.setPrefix(prefix, namespace);
	    }
	    xmlWriter.writeAttribute(namespace, attName, attValue);
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
		javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
	    if (namespace.equals("")) {
		xmlWriter.writeAttribute(attName, attValue);
	    } else {
		registerPrefix(xmlWriter, namespace);
		xmlWriter.writeAttribute(namespace, attName, attValue);
	    }
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
		javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
		throws javax.xml.stream.XMLStreamException {

	    java.lang.String attributeNamespace = qname.getNamespaceURI();
	    java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
	    if (attributePrefix == null) {
		attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
	    }
	    java.lang.String attributeValue;
	    if (attributePrefix.trim().length() > 0) {
		attributeValue = attributePrefix + ":" + qname.getLocalPart();
	    } else {
		attributeValue = qname.getLocalPart();
	    }

	    if (namespace.equals("")) {
		xmlWriter.writeAttribute(attName, attributeValue);
	    } else {
		registerPrefix(xmlWriter, namespace);
		xmlWriter.writeAttribute(namespace, attName, attributeValue);
	    }
	}

	/**
	 * method to handle Qnames
	 */

	private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
		throws javax.xml.stream.XMLStreamException {
	    java.lang.String namespaceURI = qname.getNamespaceURI();
	    if (namespaceURI != null) {
		java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
		if (prefix == null) {
		    prefix = generatePrefix(namespaceURI);
		    xmlWriter.writeNamespace(prefix, namespaceURI);
		    xmlWriter.setPrefix(prefix, namespaceURI);
		}

		if (prefix.trim().length() > 0) {
		    xmlWriter.writeCharacters(
			    prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
		} else {
		    // i.e this is the default namespace
		    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
		}

	    } else {
		xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
	    }
	}

	private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
		throws javax.xml.stream.XMLStreamException {

	    if (qnames != null) {
		// we have to store this data until last moment since it is not possible to
		// write any
		// namespace data after writing the charactor data
		java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
		java.lang.String namespaceURI = null;
		java.lang.String prefix = null;

		for (int i = 0; i < qnames.length; i++) {
		    if (i > 0) {
			stringToWrite.append(" ");
		    }
		    namespaceURI = qnames[i].getNamespaceURI();
		    if (namespaceURI != null) {
			prefix = xmlWriter.getPrefix(namespaceURI);
			if ((prefix == null) || (prefix.length() == 0)) {
			    prefix = generatePrefix(namespaceURI);
			    xmlWriter.writeNamespace(prefix, namespaceURI);
			    xmlWriter.setPrefix(prefix, namespaceURI);
			}

			if (prefix.trim().length() > 0) {
			    stringToWrite.append(prefix).append(":").append(
				    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
			} else {
			    stringToWrite.append(
				    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
			}
		    } else {
			stringToWrite
				.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
		    }
		}
		xmlWriter.writeCharacters(stringToWrite.toString());
	    }

	}

	/**
	 * Register a namespace prefix
	 */
	private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
		throws javax.xml.stream.XMLStreamException {
	    java.lang.String prefix = xmlWriter.getPrefix(namespace);
	    if (prefix == null) {
		prefix = generatePrefix(namespace);
		javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
		while (true) {
		    java.lang.String uri = nsContext.getNamespaceURI(prefix);
		    if (uri == null || uri.length() == 0) {
			break;
		    }
		    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}
		xmlWriter.writeNamespace(prefix, namespace);
		xmlWriter.setPrefix(prefix, namespace);
	    }
	    return prefix;
	}

	/**
	 * databinding method to get an XML representation of this object
	 *
	 */
	public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
		throws org.apache.axis2.databinding.ADBException {

	    java.util.ArrayList elementList = new java.util.ArrayList();
	    java.util.ArrayList attribList = new java.util.ArrayList();

	    if (localCitiesTracker) {
		if (localCities != null) {
		    for (int i = 0; i < localCities.length; i++) {

			if (localCities[i] != null) {
			    elementList.add(new javax.xml.namespace.QName("http://soa.st/xsd", "cities"));
			    elementList.add(localCities[i]);
			} else {

			    elementList.add(new javax.xml.namespace.QName("http://soa.st/xsd", "cities"));
			    elementList.add(null);

			}

		    }
		} else {

		    elementList.add(new javax.xml.namespace.QName("http://soa.st/xsd", "cities"));
		    elementList.add(localCities);

		}

	    }
	    if (localContinentTracker) {
		elementList.add(new javax.xml.namespace.QName("http://soa.st/xsd", "continent"));

		elementList.add(localContinent == null ? null
			: org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localContinent));
	    }
	    if (localLanguageTracker) {
		elementList.add(new javax.xml.namespace.QName("http://soa.st/xsd", "language"));

		elementList.add(localLanguage == null ? null
			: org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLanguage));
	    }
	    if (localNameTracker) {
		elementList.add(new javax.xml.namespace.QName("http://soa.st/xsd", "name"));

		elementList.add(localName == null ? null
			: org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localName));
	    }

	    return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
		    attribList.toArray());

	}

	/**
	 * Factory class that keeps the parse method
	 */
	public static class Factory {

	    /**
	     * static method to create the object Precondition: If this object is an
	     * element, the current or next start element starts this object and any
	     * intervening reader events are ignorable If this object is not an element, it
	     * is a complex type and the reader is at the event just after the outer start
	     * element Postcondition: If this object is an element, the reader is positioned
	     * at its end element If this object is a complex type, the reader is positioned
	     * at the end element of its outer element
	     */
	    public static Country parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
		Country object = new Country();

		int event;
		java.lang.String nillableValue = null;
		java.lang.String prefix = "";
		java.lang.String namespaceuri = "";
		try {

		    while (!reader.isStartElement() && !reader.isEndElement())
			reader.next();

		    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
			java.lang.String fullTypeName = reader
				.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
			if (fullTypeName != null) {
			    java.lang.String nsPrefix = null;
			    if (fullTypeName.indexOf(":") > -1) {
				nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
			    }
			    nsPrefix = nsPrefix == null ? "" : nsPrefix;

			    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

			    if (!"Country".equals(type)) {
				// find namespace for the prefix
				java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
				return (Country) ExtensionMapper.getTypeObject(nsUri, type, reader);
			    }

			}

		    }

		    // Note all attributes that were handled. Used to differ normal attributes
		    // from anyAttributes.
		    java.util.Vector handledAttributes = new java.util.Vector();

		    reader.next();

		    java.util.ArrayList list1 = new java.util.ArrayList();

		    while (!reader.isStartElement() && !reader.isEndElement())
			reader.next();

		    if (reader.isStartElement()
			    && new javax.xml.namespace.QName("http://soa.st/xsd", "cities").equals(reader.getName())) {

			// Process the array and step past its final element's end.

			nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
			if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
			    list1.add(null);
			    reader.next();
			} else {
			    list1.add(City.Factory.parse(reader));
			}
			// loop until we find a start element that is not part of this array
			boolean loopDone1 = false;
			while (!loopDone1) {
			    // We should be at the end element, but make sure
			    while (!reader.isEndElement())
				reader.next();
			    // Step out of this element
			    reader.next();
			    // Step to next element event.
			    while (!reader.isStartElement() && !reader.isEndElement())
				reader.next();
			    if (reader.isEndElement()) {
				// two continuous end elements means we are exiting the xml structure
				loopDone1 = true;
			    } else {
				if (new javax.xml.namespace.QName("http://soa.st/xsd", "cities")
					.equals(reader.getName())) {

				    nillableValue = reader
					    .getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
				    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
					list1.add(null);
					reader.next();
				    } else {
					list1.add(City.Factory.parse(reader));
				    }
				} else {
				    loopDone1 = true;
				}
			    }
			}
			// call the converter utility to convert and set the array

			object.setCities((City[]) org.apache.axis2.databinding.utils.ConverterUtil
				.convertToArray(City.class, list1));

		    } // End of if for expected property start element

		    else {

		    }

		    while (!reader.isStartElement() && !reader.isEndElement())
			reader.next();

		    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soa.st/xsd", "continent")
			    .equals(reader.getName())) {

			nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
			if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

			    java.lang.String content = reader.getElementText();

			    object.setContinent(
				    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

			} else {

			    reader.getElementText(); // throw away text nodes if any.
			}

			reader.next();

		    } // End of if for expected property start element

		    else {

		    }

		    while (!reader.isStartElement() && !reader.isEndElement())
			reader.next();

		    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soa.st/xsd", "language")
			    .equals(reader.getName())) {

			nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
			if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

			    java.lang.String content = reader.getElementText();

			    object.setLanguage(
				    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

			} else {

			    reader.getElementText(); // throw away text nodes if any.
			}

			reader.next();

		    } // End of if for expected property start element

		    else {

		    }

		    while (!reader.isStartElement() && !reader.isEndElement())
			reader.next();

		    if (reader.isStartElement()
			    && new javax.xml.namespace.QName("http://soa.st/xsd", "name").equals(reader.getName())) {

			nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
			if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

			    java.lang.String content = reader.getElementText();

			    object.setName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

			} else {

			    reader.getElementText(); // throw away text nodes if any.
			}

			reader.next();

		    } // End of if for expected property start element

		    else {

		    }

		    while (!reader.isStartElement() && !reader.isEndElement())
			reader.next();

		    if (reader.isStartElement())
			// A start element we are not expecting indicates a trailing invalid property
			throw new org.apache.axis2.databinding.ADBException(
				"Unexpected subelement " + reader.getName());

		} catch (javax.xml.stream.XMLStreamException e) {
		    throw new java.lang.Exception(e);
		}

		return object;
	    }

	}// end of factory class

    }

    public static class City implements org.apache.axis2.databinding.ADBBean {
	/*
	 * This type was generated from the piece of schema that had name = City
	 * Namespace URI = http://soa.st/xsd Namespace Prefix = ns1
	 */

	/**
	 * field for Capital
	 */

	protected boolean localCapital;

	/*
	 * This tracker boolean wil be used to detect whether the user called the set
	 * method for this attribute. It will be used to determine whether to include
	 * this field in the serialized XML
	 */
	protected boolean localCapitalTracker = false;

	public boolean isCapitalSpecified() {
	    return localCapitalTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return boolean
	 */
	public boolean getCapital() {
	    return localCapital;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param Capital
	 */
	public void setCapital(boolean param) {

	    // setting primitive attribute tracker to true
	    localCapitalTracker = true;

	    this.localCapital = param;

	}

	/**
	 * field for Name
	 */

	protected java.lang.String localName;

	/*
	 * This tracker boolean wil be used to detect whether the user called the set
	 * method for this attribute. It will be used to determine whether to include
	 * this field in the serialized XML
	 */
	protected boolean localNameTracker = false;

	public boolean isNameSpecified() {
	    return localNameTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getName() {
	    return localName;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param Name
	 */
	public void setName(java.lang.String param) {
	    localNameTracker = true;

	    this.localName = param;

	}

	/**
	 * field for Population
	 */

	protected int localPopulation;

	/*
	 * This tracker boolean wil be used to detect whether the user called the set
	 * method for this attribute. It will be used to determine whether to include
	 * this field in the serialized XML
	 */
	protected boolean localPopulationTracker = false;

	public boolean isPopulationSpecified() {
	    return localPopulationTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return int
	 */
	public int getPopulation() {
	    return localPopulation;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param Population
	 */
	public void setPopulation(int param) {

	    // setting primitive attribute tracker to true
	    localPopulationTracker = param != java.lang.Integer.MIN_VALUE;

	    this.localPopulation = param;

	}

	/**
	 *
	 * @param parentQName
	 * @param factory
	 * @return org.apache.axiom.om.OMElement
	 */
	public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
		final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

	    org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
		    parentQName);
	    return factory.createOMElement(dataSource, parentQName);

	}

	public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
		throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
	    serialize(parentQName, xmlWriter, false);
	}

	public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
		boolean serializeType)
		throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

	    java.lang.String prefix = null;
	    java.lang.String namespace = null;

	    prefix = parentQName.getPrefix();
	    namespace = parentQName.getNamespaceURI();
	    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

	    if (serializeType) {

		java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://soa.st/xsd");
		if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
		    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
			    namespacePrefix + ":City", xmlWriter);
		} else {
		    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "City", xmlWriter);
		}

	    }
	    if (localCapitalTracker) {
		namespace = "http://soa.st/xsd";
		writeStartElement(null, namespace, "capital", xmlWriter);

		if (false) {

		    throw new org.apache.axis2.databinding.ADBException("capital cannot be null!!");

		} else {
		    xmlWriter.writeCharacters(
			    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCapital));
		}

		xmlWriter.writeEndElement();
	    }
	    if (localNameTracker) {
		namespace = "http://soa.st/xsd";
		writeStartElement(null, namespace, "name", xmlWriter);

		if (localName == null) {
		    // write the nil attribute

		    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

		} else {

		    xmlWriter.writeCharacters(localName);

		}

		xmlWriter.writeEndElement();
	    }
	    if (localPopulationTracker) {
		namespace = "http://soa.st/xsd";
		writeStartElement(null, namespace, "population", xmlWriter);

		if (localPopulation == java.lang.Integer.MIN_VALUE) {

		    throw new org.apache.axis2.databinding.ADBException("population cannot be null!!");

		} else {
		    xmlWriter.writeCharacters(
			    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPopulation));
		}

		xmlWriter.writeEndElement();
	    }
	    xmlWriter.writeEndElement();

	}

	private static java.lang.String generatePrefix(java.lang.String namespace) {
	    if (namespace.equals("http://soa.st/xsd")) {
		return "ns1";
	    }
	    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
	}

	/**
	 * Utility method to write an element start tag.
	 */
	private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
		javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
	    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
	    if (writerPrefix != null) {
		xmlWriter.writeStartElement(namespace, localPart);
	    } else {
		if (namespace.length() == 0) {
		    prefix = "";
		} else if (prefix == null) {
		    prefix = generatePrefix(namespace);
		}

		xmlWriter.writeStartElement(prefix, localPart, namespace);
		xmlWriter.writeNamespace(prefix, namespace);
		xmlWriter.setPrefix(prefix, namespace);
	    }
	}

	/**
	 * Util method to write an attribute with the ns prefix
	 */
	private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
		java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
		throws javax.xml.stream.XMLStreamException {
	    if (xmlWriter.getPrefix(namespace) == null) {
		xmlWriter.writeNamespace(prefix, namespace);
		xmlWriter.setPrefix(prefix, namespace);
	    }
	    xmlWriter.writeAttribute(namespace, attName, attValue);
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
		javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
	    if (namespace.equals("")) {
		xmlWriter.writeAttribute(attName, attValue);
	    } else {
		registerPrefix(xmlWriter, namespace);
		xmlWriter.writeAttribute(namespace, attName, attValue);
	    }
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
		javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
		throws javax.xml.stream.XMLStreamException {

	    java.lang.String attributeNamespace = qname.getNamespaceURI();
	    java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
	    if (attributePrefix == null) {
		attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
	    }
	    java.lang.String attributeValue;
	    if (attributePrefix.trim().length() > 0) {
		attributeValue = attributePrefix + ":" + qname.getLocalPart();
	    } else {
		attributeValue = qname.getLocalPart();
	    }

	    if (namespace.equals("")) {
		xmlWriter.writeAttribute(attName, attributeValue);
	    } else {
		registerPrefix(xmlWriter, namespace);
		xmlWriter.writeAttribute(namespace, attName, attributeValue);
	    }
	}

	/**
	 * method to handle Qnames
	 */

	private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
		throws javax.xml.stream.XMLStreamException {
	    java.lang.String namespaceURI = qname.getNamespaceURI();
	    if (namespaceURI != null) {
		java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
		if (prefix == null) {
		    prefix = generatePrefix(namespaceURI);
		    xmlWriter.writeNamespace(prefix, namespaceURI);
		    xmlWriter.setPrefix(prefix, namespaceURI);
		}

		if (prefix.trim().length() > 0) {
		    xmlWriter.writeCharacters(
			    prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
		} else {
		    // i.e this is the default namespace
		    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
		}

	    } else {
		xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
	    }
	}

	private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
		throws javax.xml.stream.XMLStreamException {

	    if (qnames != null) {
		// we have to store this data until last moment since it is not possible to
		// write any
		// namespace data after writing the charactor data
		java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
		java.lang.String namespaceURI = null;
		java.lang.String prefix = null;

		for (int i = 0; i < qnames.length; i++) {
		    if (i > 0) {
			stringToWrite.append(" ");
		    }
		    namespaceURI = qnames[i].getNamespaceURI();
		    if (namespaceURI != null) {
			prefix = xmlWriter.getPrefix(namespaceURI);
			if ((prefix == null) || (prefix.length() == 0)) {
			    prefix = generatePrefix(namespaceURI);
			    xmlWriter.writeNamespace(prefix, namespaceURI);
			    xmlWriter.setPrefix(prefix, namespaceURI);
			}

			if (prefix.trim().length() > 0) {
			    stringToWrite.append(prefix).append(":").append(
				    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
			} else {
			    stringToWrite.append(
				    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
			}
		    } else {
			stringToWrite
				.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
		    }
		}
		xmlWriter.writeCharacters(stringToWrite.toString());
	    }

	}

	/**
	 * Register a namespace prefix
	 */
	private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
		throws javax.xml.stream.XMLStreamException {
	    java.lang.String prefix = xmlWriter.getPrefix(namespace);
	    if (prefix == null) {
		prefix = generatePrefix(namespace);
		javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
		while (true) {
		    java.lang.String uri = nsContext.getNamespaceURI(prefix);
		    if (uri == null || uri.length() == 0) {
			break;
		    }
		    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}
		xmlWriter.writeNamespace(prefix, namespace);
		xmlWriter.setPrefix(prefix, namespace);
	    }
	    return prefix;
	}

	/**
	 * databinding method to get an XML representation of this object
	 *
	 */
	public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
		throws org.apache.axis2.databinding.ADBException {

	    java.util.ArrayList elementList = new java.util.ArrayList();
	    java.util.ArrayList attribList = new java.util.ArrayList();

	    if (localCapitalTracker) {
		elementList.add(new javax.xml.namespace.QName("http://soa.st/xsd", "capital"));

		elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCapital));
	    }
	    if (localNameTracker) {
		elementList.add(new javax.xml.namespace.QName("http://soa.st/xsd", "name"));

		elementList.add(localName == null ? null
			: org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localName));
	    }
	    if (localPopulationTracker) {
		elementList.add(new javax.xml.namespace.QName("http://soa.st/xsd", "population"));

		elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPopulation));
	    }

	    return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
		    attribList.toArray());

	}

	/**
	 * Factory class that keeps the parse method
	 */
	public static class Factory {

	    /**
	     * static method to create the object Precondition: If this object is an
	     * element, the current or next start element starts this object and any
	     * intervening reader events are ignorable If this object is not an element, it
	     * is a complex type and the reader is at the event just after the outer start
	     * element Postcondition: If this object is an element, the reader is positioned
	     * at its end element If this object is a complex type, the reader is positioned
	     * at the end element of its outer element
	     */
	    public static City parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
		City object = new City();

		int event;
		java.lang.String nillableValue = null;
		java.lang.String prefix = "";
		java.lang.String namespaceuri = "";
		try {

		    while (!reader.isStartElement() && !reader.isEndElement())
			reader.next();

		    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
			java.lang.String fullTypeName = reader
				.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
			if (fullTypeName != null) {
			    java.lang.String nsPrefix = null;
			    if (fullTypeName.indexOf(":") > -1) {
				nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
			    }
			    nsPrefix = nsPrefix == null ? "" : nsPrefix;

			    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

			    if (!"City".equals(type)) {
				// find namespace for the prefix
				java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
				return (City) ExtensionMapper.getTypeObject(nsUri, type, reader);
			    }

			}

		    }

		    // Note all attributes that were handled. Used to differ normal attributes
		    // from anyAttributes.
		    java.util.Vector handledAttributes = new java.util.Vector();

		    reader.next();

		    while (!reader.isStartElement() && !reader.isEndElement())
			reader.next();

		    if (reader.isStartElement()
			    && new javax.xml.namespace.QName("http://soa.st/xsd", "capital").equals(reader.getName())) {

			nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
			if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
			    throw new org.apache.axis2.databinding.ADBException(
				    "The element: " + "capital" + "  cannot be null");
			}

			java.lang.String content = reader.getElementText();

			object.setCapital(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

			reader.next();

		    } // End of if for expected property start element

		    else {

		    }

		    while (!reader.isStartElement() && !reader.isEndElement())
			reader.next();

		    if (reader.isStartElement()
			    && new javax.xml.namespace.QName("http://soa.st/xsd", "name").equals(reader.getName())) {

			nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
			if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

			    java.lang.String content = reader.getElementText();

			    object.setName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

			} else {

			    reader.getElementText(); // throw away text nodes if any.
			}

			reader.next();

		    } // End of if for expected property start element

		    else {

		    }

		    while (!reader.isStartElement() && !reader.isEndElement())
			reader.next();

		    if (reader.isStartElement() && new javax.xml.namespace.QName("http://soa.st/xsd", "population")
			    .equals(reader.getName())) {

			nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
			if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
			    throw new org.apache.axis2.databinding.ADBException(
				    "The element: " + "population" + "  cannot be null");
			}

			java.lang.String content = reader.getElementText();

			object.setPopulation(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

			reader.next();

		    } // End of if for expected property start element

		    else {

			object.setPopulation(java.lang.Integer.MIN_VALUE);

		    }

		    while (!reader.isStartElement() && !reader.isEndElement())
			reader.next();

		    if (reader.isStartElement())
			// A start element we are not expecting indicates a trailing invalid property
			throw new org.apache.axis2.databinding.ADBException(
				"Unexpected subelement " + reader.getName());

		} catch (javax.xml.stream.XMLStreamException e) {
		    throw new java.lang.Exception(e);
		}

		return object;
	    }

	}// end of factory class

    }

    public static class GetAllCountries implements org.apache.axis2.databinding.ADBBean {

	public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://soa.st",
		"getAllCountries", "ns2");

	/**
	 *
	 * @param parentQName
	 * @param factory
	 * @return org.apache.axiom.om.OMElement
	 */
	public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
		final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

	    org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
		    MY_QNAME);
	    return factory.createOMElement(dataSource, MY_QNAME);

	}

	public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
		throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
	    serialize(parentQName, xmlWriter, false);
	}

	public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
		boolean serializeType)
		throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

	    java.lang.String prefix = null;
	    java.lang.String namespace = null;

	    prefix = parentQName.getPrefix();
	    namespace = parentQName.getNamespaceURI();
	    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

	    if (serializeType) {

		java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://soa.st");
		if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
		    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
			    namespacePrefix + ":getAllCountries", xmlWriter);
		} else {
		    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "getAllCountries",
			    xmlWriter);
		}

	    }

	    xmlWriter.writeEndElement();

	}

	private static java.lang.String generatePrefix(java.lang.String namespace) {
	    if (namespace.equals("http://soa.st")) {
		return "ns2";
	    }
	    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
	}

	/**
	 * Utility method to write an element start tag.
	 */
	private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
		javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
	    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
	    if (writerPrefix != null) {
		xmlWriter.writeStartElement(namespace, localPart);
	    } else {
		if (namespace.length() == 0) {
		    prefix = "";
		} else if (prefix == null) {
		    prefix = generatePrefix(namespace);
		}

		xmlWriter.writeStartElement(prefix, localPart, namespace);
		xmlWriter.writeNamespace(prefix, namespace);
		xmlWriter.setPrefix(prefix, namespace);
	    }
	}

	/**
	 * Util method to write an attribute with the ns prefix
	 */
	private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
		java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
		throws javax.xml.stream.XMLStreamException {
	    if (xmlWriter.getPrefix(namespace) == null) {
		xmlWriter.writeNamespace(prefix, namespace);
		xmlWriter.setPrefix(prefix, namespace);
	    }
	    xmlWriter.writeAttribute(namespace, attName, attValue);
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
		javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
	    if (namespace.equals("")) {
		xmlWriter.writeAttribute(attName, attValue);
	    } else {
		registerPrefix(xmlWriter, namespace);
		xmlWriter.writeAttribute(namespace, attName, attValue);
	    }
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
		javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
		throws javax.xml.stream.XMLStreamException {

	    java.lang.String attributeNamespace = qname.getNamespaceURI();
	    java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
	    if (attributePrefix == null) {
		attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
	    }
	    java.lang.String attributeValue;
	    if (attributePrefix.trim().length() > 0) {
		attributeValue = attributePrefix + ":" + qname.getLocalPart();
	    } else {
		attributeValue = qname.getLocalPart();
	    }

	    if (namespace.equals("")) {
		xmlWriter.writeAttribute(attName, attributeValue);
	    } else {
		registerPrefix(xmlWriter, namespace);
		xmlWriter.writeAttribute(namespace, attName, attributeValue);
	    }
	}

	/**
	 * method to handle Qnames
	 */

	private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
		throws javax.xml.stream.XMLStreamException {
	    java.lang.String namespaceURI = qname.getNamespaceURI();
	    if (namespaceURI != null) {
		java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
		if (prefix == null) {
		    prefix = generatePrefix(namespaceURI);
		    xmlWriter.writeNamespace(prefix, namespaceURI);
		    xmlWriter.setPrefix(prefix, namespaceURI);
		}

		if (prefix.trim().length() > 0) {
		    xmlWriter.writeCharacters(
			    prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
		} else {
		    // i.e this is the default namespace
		    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
		}

	    } else {
		xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
	    }
	}

	private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
		throws javax.xml.stream.XMLStreamException {

	    if (qnames != null) {
		// we have to store this data until last moment since it is not possible to
		// write any
		// namespace data after writing the charactor data
		java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
		java.lang.String namespaceURI = null;
		java.lang.String prefix = null;

		for (int i = 0; i < qnames.length; i++) {
		    if (i > 0) {
			stringToWrite.append(" ");
		    }
		    namespaceURI = qnames[i].getNamespaceURI();
		    if (namespaceURI != null) {
			prefix = xmlWriter.getPrefix(namespaceURI);
			if ((prefix == null) || (prefix.length() == 0)) {
			    prefix = generatePrefix(namespaceURI);
			    xmlWriter.writeNamespace(prefix, namespaceURI);
			    xmlWriter.setPrefix(prefix, namespaceURI);
			}

			if (prefix.trim().length() > 0) {
			    stringToWrite.append(prefix).append(":").append(
				    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
			} else {
			    stringToWrite.append(
				    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
			}
		    } else {
			stringToWrite
				.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
		    }
		}
		xmlWriter.writeCharacters(stringToWrite.toString());
	    }

	}

	/**
	 * Register a namespace prefix
	 */
	private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
		throws javax.xml.stream.XMLStreamException {
	    java.lang.String prefix = xmlWriter.getPrefix(namespace);
	    if (prefix == null) {
		prefix = generatePrefix(namespace);
		javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
		while (true) {
		    java.lang.String uri = nsContext.getNamespaceURI(prefix);
		    if (uri == null || uri.length() == 0) {
			break;
		    }
		    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}
		xmlWriter.writeNamespace(prefix, namespace);
		xmlWriter.setPrefix(prefix, namespace);
	    }
	    return prefix;
	}

	/**
	 * databinding method to get an XML representation of this object
	 *
	 */
	public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
		throws org.apache.axis2.databinding.ADBException {

	    java.util.ArrayList elementList = new java.util.ArrayList();
	    java.util.ArrayList attribList = new java.util.ArrayList();

	    return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
		    attribList.toArray());

	}

	/**
	 * Factory class that keeps the parse method
	 */
	public static class Factory {

	    /**
	     * static method to create the object Precondition: If this object is an
	     * element, the current or next start element starts this object and any
	     * intervening reader events are ignorable If this object is not an element, it
	     * is a complex type and the reader is at the event just after the outer start
	     * element Postcondition: If this object is an element, the reader is positioned
	     * at its end element If this object is a complex type, the reader is positioned
	     * at the end element of its outer element
	     */
	    public static GetAllCountries parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
		GetAllCountries object = new GetAllCountries();

		int event;
		java.lang.String nillableValue = null;
		java.lang.String prefix = "";
		java.lang.String namespaceuri = "";
		try {

		    while (!reader.isStartElement() && !reader.isEndElement())
			reader.next();

		    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
			java.lang.String fullTypeName = reader
				.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
			if (fullTypeName != null) {
			    java.lang.String nsPrefix = null;
			    if (fullTypeName.indexOf(":") > -1) {
				nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
			    }
			    nsPrefix = nsPrefix == null ? "" : nsPrefix;

			    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

			    if (!"getAllCountries".equals(type)) {
				// find namespace for the prefix
				java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
				return (GetAllCountries) ExtensionMapper.getTypeObject(nsUri, type, reader);
			    }

			}

		    }

		    // Note all attributes that were handled. Used to differ normal attributes
		    // from anyAttributes.
		    java.util.Vector handledAttributes = new java.util.Vector();

		    reader.next();

		    while (!reader.isStartElement() && !reader.isEndElement())
			reader.next();

		    if (reader.isStartElement())
			// A start element we are not expecting indicates a trailing invalid property
			throw new org.apache.axis2.databinding.ADBException(
				"Unexpected subelement " + reader.getName());

		} catch (javax.xml.stream.XMLStreamException e) {
		    throw new java.lang.Exception(e);
		}

		return object;
	    }

	}// end of factory class

    }

    public static class GetCitiesByCountryNameResponse implements org.apache.axis2.databinding.ADBBean {

	public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://soa.st",
		"getCitiesByCountryNameResponse", "ns2");

	/**
	 * field for _return This was an Array!
	 */

	protected City[] local_return;

	/*
	 * This tracker boolean wil be used to detect whether the user called the set
	 * method for this attribute. It will be used to determine whether to include
	 * this field in the serialized XML
	 */
	protected boolean local_returnTracker = false;

	public boolean is_returnSpecified() {
	    return local_returnTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return City[]
	 */
	public City[] get_return() {
	    return local_return;
	}

	/**
	 * validate the array for _return
	 */
	protected void validate_return(City[] param) {

	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param _return
	 */
	public void set_return(City[] param) {

	    validate_return(param);

	    local_returnTracker = true;

	    this.local_return = param;
	}

	/**
	 * Auto generated add method for the array for convenience
	 * 
	 * @param param City
	 */
	public void add_return(City param) {
	    if (local_return == null) {
		local_return = new City[] {};
	    }

	    // update the setting tracker
	    local_returnTracker = true;

	    java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(local_return);
	    list.add(param);
	    this.local_return = (City[]) list.toArray(new City[list.size()]);

	}

	/**
	 *
	 * @param parentQName
	 * @param factory
	 * @return org.apache.axiom.om.OMElement
	 */
	public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
		final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

	    org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
		    MY_QNAME);
	    return factory.createOMElement(dataSource, MY_QNAME);

	}

	public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
		throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
	    serialize(parentQName, xmlWriter, false);
	}

	public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
		boolean serializeType)
		throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

	    java.lang.String prefix = null;
	    java.lang.String namespace = null;

	    prefix = parentQName.getPrefix();
	    namespace = parentQName.getNamespaceURI();
	    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

	    if (serializeType) {

		java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://soa.st");
		if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
		    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
			    namespacePrefix + ":getCitiesByCountryNameResponse", xmlWriter);
		} else {
		    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
			    "getCitiesByCountryNameResponse", xmlWriter);
		}

	    }
	    if (local_returnTracker) {
		if (local_return != null) {
		    for (int i = 0; i < local_return.length; i++) {
			if (local_return[i] != null) {
			    local_return[i].serialize(new javax.xml.namespace.QName("http://soa.st", "return"),
				    xmlWriter);
			} else {

			    writeStartElement(null, "http://soa.st", "return", xmlWriter);

			    // write the nil attribute
			    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
			    xmlWriter.writeEndElement();

			}

		    }
		} else {

		    writeStartElement(null, "http://soa.st", "return", xmlWriter);

		    // write the nil attribute
		    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
		    xmlWriter.writeEndElement();

		}
	    }
	    xmlWriter.writeEndElement();

	}

	private static java.lang.String generatePrefix(java.lang.String namespace) {
	    if (namespace.equals("http://soa.st")) {
		return "ns2";
	    }
	    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
	}

	/**
	 * Utility method to write an element start tag.
	 */
	private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
		javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
	    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
	    if (writerPrefix != null) {
		xmlWriter.writeStartElement(namespace, localPart);
	    } else {
		if (namespace.length() == 0) {
		    prefix = "";
		} else if (prefix == null) {
		    prefix = generatePrefix(namespace);
		}

		xmlWriter.writeStartElement(prefix, localPart, namespace);
		xmlWriter.writeNamespace(prefix, namespace);
		xmlWriter.setPrefix(prefix, namespace);
	    }
	}

	/**
	 * Util method to write an attribute with the ns prefix
	 */
	private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
		java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
		throws javax.xml.stream.XMLStreamException {
	    if (xmlWriter.getPrefix(namespace) == null) {
		xmlWriter.writeNamespace(prefix, namespace);
		xmlWriter.setPrefix(prefix, namespace);
	    }
	    xmlWriter.writeAttribute(namespace, attName, attValue);
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
		javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
	    if (namespace.equals("")) {
		xmlWriter.writeAttribute(attName, attValue);
	    } else {
		registerPrefix(xmlWriter, namespace);
		xmlWriter.writeAttribute(namespace, attName, attValue);
	    }
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
		javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
		throws javax.xml.stream.XMLStreamException {

	    java.lang.String attributeNamespace = qname.getNamespaceURI();
	    java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
	    if (attributePrefix == null) {
		attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
	    }
	    java.lang.String attributeValue;
	    if (attributePrefix.trim().length() > 0) {
		attributeValue = attributePrefix + ":" + qname.getLocalPart();
	    } else {
		attributeValue = qname.getLocalPart();
	    }

	    if (namespace.equals("")) {
		xmlWriter.writeAttribute(attName, attributeValue);
	    } else {
		registerPrefix(xmlWriter, namespace);
		xmlWriter.writeAttribute(namespace, attName, attributeValue);
	    }
	}

	/**
	 * method to handle Qnames
	 */

	private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
		throws javax.xml.stream.XMLStreamException {
	    java.lang.String namespaceURI = qname.getNamespaceURI();
	    if (namespaceURI != null) {
		java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
		if (prefix == null) {
		    prefix = generatePrefix(namespaceURI);
		    xmlWriter.writeNamespace(prefix, namespaceURI);
		    xmlWriter.setPrefix(prefix, namespaceURI);
		}

		if (prefix.trim().length() > 0) {
		    xmlWriter.writeCharacters(
			    prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
		} else {
		    // i.e this is the default namespace
		    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
		}

	    } else {
		xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
	    }
	}

	private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
		throws javax.xml.stream.XMLStreamException {

	    if (qnames != null) {
		// we have to store this data until last moment since it is not possible to
		// write any
		// namespace data after writing the charactor data
		java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
		java.lang.String namespaceURI = null;
		java.lang.String prefix = null;

		for (int i = 0; i < qnames.length; i++) {
		    if (i > 0) {
			stringToWrite.append(" ");
		    }
		    namespaceURI = qnames[i].getNamespaceURI();
		    if (namespaceURI != null) {
			prefix = xmlWriter.getPrefix(namespaceURI);
			if ((prefix == null) || (prefix.length() == 0)) {
			    prefix = generatePrefix(namespaceURI);
			    xmlWriter.writeNamespace(prefix, namespaceURI);
			    xmlWriter.setPrefix(prefix, namespaceURI);
			}

			if (prefix.trim().length() > 0) {
			    stringToWrite.append(prefix).append(":").append(
				    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
			} else {
			    stringToWrite.append(
				    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
			}
		    } else {
			stringToWrite
				.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
		    }
		}
		xmlWriter.writeCharacters(stringToWrite.toString());
	    }

	}

	/**
	 * Register a namespace prefix
	 */
	private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
		throws javax.xml.stream.XMLStreamException {
	    java.lang.String prefix = xmlWriter.getPrefix(namespace);
	    if (prefix == null) {
		prefix = generatePrefix(namespace);
		javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
		while (true) {
		    java.lang.String uri = nsContext.getNamespaceURI(prefix);
		    if (uri == null || uri.length() == 0) {
			break;
		    }
		    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}
		xmlWriter.writeNamespace(prefix, namespace);
		xmlWriter.setPrefix(prefix, namespace);
	    }
	    return prefix;
	}

	/**
	 * databinding method to get an XML representation of this object
	 *
	 */
	public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
		throws org.apache.axis2.databinding.ADBException {

	    java.util.ArrayList elementList = new java.util.ArrayList();
	    java.util.ArrayList attribList = new java.util.ArrayList();

	    if (local_returnTracker) {
		if (local_return != null) {
		    for (int i = 0; i < local_return.length; i++) {

			if (local_return[i] != null) {
			    elementList.add(new javax.xml.namespace.QName("http://soa.st", "return"));
			    elementList.add(local_return[i]);
			} else {

			    elementList.add(new javax.xml.namespace.QName("http://soa.st", "return"));
			    elementList.add(null);

			}

		    }
		} else {

		    elementList.add(new javax.xml.namespace.QName("http://soa.st", "return"));
		    elementList.add(local_return);

		}

	    }

	    return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
		    attribList.toArray());

	}

	/**
	 * Factory class that keeps the parse method
	 */
	public static class Factory {

	    /**
	     * static method to create the object Precondition: If this object is an
	     * element, the current or next start element starts this object and any
	     * intervening reader events are ignorable If this object is not an element, it
	     * is a complex type and the reader is at the event just after the outer start
	     * element Postcondition: If this object is an element, the reader is positioned
	     * at its end element If this object is a complex type, the reader is positioned
	     * at the end element of its outer element
	     */
	    public static GetCitiesByCountryNameResponse parse(javax.xml.stream.XMLStreamReader reader)
		    throws java.lang.Exception {
		GetCitiesByCountryNameResponse object = new GetCitiesByCountryNameResponse();

		int event;
		java.lang.String nillableValue = null;
		java.lang.String prefix = "";
		java.lang.String namespaceuri = "";
		try {

		    while (!reader.isStartElement() && !reader.isEndElement())
			reader.next();

		    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
			java.lang.String fullTypeName = reader
				.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
			if (fullTypeName != null) {
			    java.lang.String nsPrefix = null;
			    if (fullTypeName.indexOf(":") > -1) {
				nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
			    }
			    nsPrefix = nsPrefix == null ? "" : nsPrefix;

			    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

			    if (!"getCitiesByCountryNameResponse".equals(type)) {
				// find namespace for the prefix
				java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
				return (GetCitiesByCountryNameResponse) ExtensionMapper.getTypeObject(nsUri, type,
					reader);
			    }

			}

		    }

		    // Note all attributes that were handled. Used to differ normal attributes
		    // from anyAttributes.
		    java.util.Vector handledAttributes = new java.util.Vector();

		    reader.next();

		    java.util.ArrayList list1 = new java.util.ArrayList();

		    while (!reader.isStartElement() && !reader.isEndElement())
			reader.next();

		    if (reader.isStartElement()
			    && new javax.xml.namespace.QName("http://soa.st", "return").equals(reader.getName())) {

			// Process the array and step past its final element's end.

			nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
			if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
			    list1.add(null);
			    reader.next();
			} else {
			    list1.add(City.Factory.parse(reader));
			}
			// loop until we find a start element that is not part of this array
			boolean loopDone1 = false;
			while (!loopDone1) {
			    // We should be at the end element, but make sure
			    while (!reader.isEndElement())
				reader.next();
			    // Step out of this element
			    reader.next();
			    // Step to next element event.
			    while (!reader.isStartElement() && !reader.isEndElement())
				reader.next();
			    if (reader.isEndElement()) {
				// two continuous end elements means we are exiting the xml structure
				loopDone1 = true;
			    } else {
				if (new javax.xml.namespace.QName("http://soa.st", "return").equals(reader.getName())) {

				    nillableValue = reader
					    .getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
				    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
					list1.add(null);
					reader.next();
				    } else {
					list1.add(City.Factory.parse(reader));
				    }
				} else {
				    loopDone1 = true;
				}
			    }
			}
			// call the converter utility to convert and set the array

			object.set_return((City[]) org.apache.axis2.databinding.utils.ConverterUtil
				.convertToArray(City.class, list1));

		    } // End of if for expected property start element

		    else {

		    }

		    while (!reader.isStartElement() && !reader.isEndElement())
			reader.next();

		    if (reader.isStartElement())
			// A start element we are not expecting indicates a trailing invalid property
			throw new org.apache.axis2.databinding.ADBException(
				"Unexpected subelement " + reader.getName());

		} catch (javax.xml.stream.XMLStreamException e) {
		    throw new java.lang.Exception(e);
		}

		return object;
	    }

	}// end of factory class

    }

    public static class CountryServiceCountryNotFoundException implements org.apache.axis2.databinding.ADBBean {

	public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://soa.st",
		"CountryServiceCountryNotFoundException", "ns2");

	/**
	 * field for CountryNotFoundException
	 */

	protected CountryNotFoundException localCountryNotFoundException;

	/*
	 * This tracker boolean wil be used to detect whether the user called the set
	 * method for this attribute. It will be used to determine whether to include
	 * this field in the serialized XML
	 */
	protected boolean localCountryNotFoundExceptionTracker = false;

	public boolean isCountryNotFoundExceptionSpecified() {
	    return localCountryNotFoundExceptionTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return CountryNotFoundException
	 */
	public CountryNotFoundException getCountryNotFoundException() {
	    return localCountryNotFoundException;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param CountryNotFoundException
	 */
	public void setCountryNotFoundException(CountryNotFoundException param) {
	    localCountryNotFoundExceptionTracker = true;

	    this.localCountryNotFoundException = param;

	}

	/**
	 *
	 * @param parentQName
	 * @param factory
	 * @return org.apache.axiom.om.OMElement
	 */
	public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
		final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

	    org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
		    MY_QNAME);
	    return factory.createOMElement(dataSource, MY_QNAME);

	}

	public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
		throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
	    serialize(parentQName, xmlWriter, false);
	}

	public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
		boolean serializeType)
		throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

	    java.lang.String prefix = null;
	    java.lang.String namespace = null;

	    prefix = parentQName.getPrefix();
	    namespace = parentQName.getNamespaceURI();
	    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

	    if (serializeType) {

		java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://soa.st");
		if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
		    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
			    namespacePrefix + ":CountryServiceCountryNotFoundException", xmlWriter);
		} else {
		    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
			    "CountryServiceCountryNotFoundException", xmlWriter);
		}

	    }
	    if (localCountryNotFoundExceptionTracker) {
		if (localCountryNotFoundException == null) {

		    writeStartElement(null, "http://soa.st", "CountryNotFoundException", xmlWriter);

		    // write the nil attribute
		    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
		    xmlWriter.writeEndElement();
		} else {
		    localCountryNotFoundException.serialize(
			    new javax.xml.namespace.QName("http://soa.st", "CountryNotFoundException"), xmlWriter);
		}
	    }
	    xmlWriter.writeEndElement();

	}

	private static java.lang.String generatePrefix(java.lang.String namespace) {
	    if (namespace.equals("http://soa.st")) {
		return "ns2";
	    }
	    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
	}

	/**
	 * Utility method to write an element start tag.
	 */
	private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
		javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
	    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
	    if (writerPrefix != null) {
		xmlWriter.writeStartElement(namespace, localPart);
	    } else {
		if (namespace.length() == 0) {
		    prefix = "";
		} else if (prefix == null) {
		    prefix = generatePrefix(namespace);
		}

		xmlWriter.writeStartElement(prefix, localPart, namespace);
		xmlWriter.writeNamespace(prefix, namespace);
		xmlWriter.setPrefix(prefix, namespace);
	    }
	}

	/**
	 * Util method to write an attribute with the ns prefix
	 */
	private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
		java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
		throws javax.xml.stream.XMLStreamException {
	    if (xmlWriter.getPrefix(namespace) == null) {
		xmlWriter.writeNamespace(prefix, namespace);
		xmlWriter.setPrefix(prefix, namespace);
	    }
	    xmlWriter.writeAttribute(namespace, attName, attValue);
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
		javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
	    if (namespace.equals("")) {
		xmlWriter.writeAttribute(attName, attValue);
	    } else {
		registerPrefix(xmlWriter, namespace);
		xmlWriter.writeAttribute(namespace, attName, attValue);
	    }
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
		javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
		throws javax.xml.stream.XMLStreamException {

	    java.lang.String attributeNamespace = qname.getNamespaceURI();
	    java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
	    if (attributePrefix == null) {
		attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
	    }
	    java.lang.String attributeValue;
	    if (attributePrefix.trim().length() > 0) {
		attributeValue = attributePrefix + ":" + qname.getLocalPart();
	    } else {
		attributeValue = qname.getLocalPart();
	    }

	    if (namespace.equals("")) {
		xmlWriter.writeAttribute(attName, attributeValue);
	    } else {
		registerPrefix(xmlWriter, namespace);
		xmlWriter.writeAttribute(namespace, attName, attributeValue);
	    }
	}

	/**
	 * method to handle Qnames
	 */

	private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
		throws javax.xml.stream.XMLStreamException {
	    java.lang.String namespaceURI = qname.getNamespaceURI();
	    if (namespaceURI != null) {
		java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
		if (prefix == null) {
		    prefix = generatePrefix(namespaceURI);
		    xmlWriter.writeNamespace(prefix, namespaceURI);
		    xmlWriter.setPrefix(prefix, namespaceURI);
		}

		if (prefix.trim().length() > 0) {
		    xmlWriter.writeCharacters(
			    prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
		} else {
		    // i.e this is the default namespace
		    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
		}

	    } else {
		xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
	    }
	}

	private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
		throws javax.xml.stream.XMLStreamException {

	    if (qnames != null) {
		// we have to store this data until last moment since it is not possible to
		// write any
		// namespace data after writing the charactor data
		java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
		java.lang.String namespaceURI = null;
		java.lang.String prefix = null;

		for (int i = 0; i < qnames.length; i++) {
		    if (i > 0) {
			stringToWrite.append(" ");
		    }
		    namespaceURI = qnames[i].getNamespaceURI();
		    if (namespaceURI != null) {
			prefix = xmlWriter.getPrefix(namespaceURI);
			if ((prefix == null) || (prefix.length() == 0)) {
			    prefix = generatePrefix(namespaceURI);
			    xmlWriter.writeNamespace(prefix, namespaceURI);
			    xmlWriter.setPrefix(prefix, namespaceURI);
			}

			if (prefix.trim().length() > 0) {
			    stringToWrite.append(prefix).append(":").append(
				    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
			} else {
			    stringToWrite.append(
				    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
			}
		    } else {
			stringToWrite
				.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
		    }
		}
		xmlWriter.writeCharacters(stringToWrite.toString());
	    }

	}

	/**
	 * Register a namespace prefix
	 */
	private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
		throws javax.xml.stream.XMLStreamException {
	    java.lang.String prefix = xmlWriter.getPrefix(namespace);
	    if (prefix == null) {
		prefix = generatePrefix(namespace);
		javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
		while (true) {
		    java.lang.String uri = nsContext.getNamespaceURI(prefix);
		    if (uri == null || uri.length() == 0) {
			break;
		    }
		    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}
		xmlWriter.writeNamespace(prefix, namespace);
		xmlWriter.setPrefix(prefix, namespace);
	    }
	    return prefix;
	}

	/**
	 * databinding method to get an XML representation of this object
	 *
	 */
	public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
		throws org.apache.axis2.databinding.ADBException {

	    java.util.ArrayList elementList = new java.util.ArrayList();
	    java.util.ArrayList attribList = new java.util.ArrayList();

	    if (localCountryNotFoundExceptionTracker) {
		elementList.add(new javax.xml.namespace.QName("http://soa.st", "CountryNotFoundException"));

		elementList.add(localCountryNotFoundException == null ? null : localCountryNotFoundException);
	    }

	    return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
		    attribList.toArray());

	}

	/**
	 * Factory class that keeps the parse method
	 */
	public static class Factory {

	    /**
	     * static method to create the object Precondition: If this object is an
	     * element, the current or next start element starts this object and any
	     * intervening reader events are ignorable If this object is not an element, it
	     * is a complex type and the reader is at the event just after the outer start
	     * element Postcondition: If this object is an element, the reader is positioned
	     * at its end element If this object is a complex type, the reader is positioned
	     * at the end element of its outer element
	     */
	    public static CountryServiceCountryNotFoundException parse(javax.xml.stream.XMLStreamReader reader)
		    throws java.lang.Exception {
		CountryServiceCountryNotFoundException object = new CountryServiceCountryNotFoundException();

		int event;
		java.lang.String nillableValue = null;
		java.lang.String prefix = "";
		java.lang.String namespaceuri = "";
		try {

		    while (!reader.isStartElement() && !reader.isEndElement())
			reader.next();

		    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
			java.lang.String fullTypeName = reader
				.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
			if (fullTypeName != null) {
			    java.lang.String nsPrefix = null;
			    if (fullTypeName.indexOf(":") > -1) {
				nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
			    }
			    nsPrefix = nsPrefix == null ? "" : nsPrefix;

			    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

			    if (!"CountryServiceCountryNotFoundException".equals(type)) {
				// find namespace for the prefix
				java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
				return (CountryServiceCountryNotFoundException) ExtensionMapper.getTypeObject(nsUri,
					type, reader);
			    }

			}

		    }

		    // Note all attributes that were handled. Used to differ normal attributes
		    // from anyAttributes.
		    java.util.Vector handledAttributes = new java.util.Vector();

		    reader.next();

		    while (!reader.isStartElement() && !reader.isEndElement())
			reader.next();

		    if (reader.isStartElement()
			    && new javax.xml.namespace.QName("http://soa.st", "CountryNotFoundException")
				    .equals(reader.getName())) {

			nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
			if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
			    object.setCountryNotFoundException(null);
			    reader.next();

			    reader.next();

			} else {

			    object.setCountryNotFoundException(CountryNotFoundException.Factory.parse(reader));

			    reader.next();
			}
		    } // End of if for expected property start element

		    else {

		    }

		    while (!reader.isStartElement() && !reader.isEndElement())
			reader.next();

		    if (reader.isStartElement())
			// A start element we are not expecting indicates a trailing invalid property
			throw new org.apache.axis2.databinding.ADBException(
				"Unexpected subelement " + reader.getName());

		} catch (javax.xml.stream.XMLStreamException e) {
		    throw new java.lang.Exception(e);
		}

		return object;
	    }

	}// end of factory class

    }

    public static class GetAllCountriesResponse implements org.apache.axis2.databinding.ADBBean {

	public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://soa.st",
		"getAllCountriesResponse", "ns2");

	/**
	 * field for _return This was an Array!
	 */

	protected Country[] local_return;

	/*
	 * This tracker boolean wil be used to detect whether the user called the set
	 * method for this attribute. It will be used to determine whether to include
	 * this field in the serialized XML
	 */
	protected boolean local_returnTracker = false;

	public boolean is_returnSpecified() {
	    return local_returnTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return Country[]
	 */
	public Country[] get_return() {
	    return local_return;
	}

	/**
	 * validate the array for _return
	 */
	protected void validate_return(Country[] param) {

	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param _return
	 */
	public void set_return(Country[] param) {

	    validate_return(param);

	    local_returnTracker = true;

	    this.local_return = param;
	}

	/**
	 * Auto generated add method for the array for convenience
	 * 
	 * @param param Country
	 */
	public void add_return(Country param) {
	    if (local_return == null) {
		local_return = new Country[] {};
	    }

	    // update the setting tracker
	    local_returnTracker = true;

	    java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(local_return);
	    list.add(param);
	    this.local_return = (Country[]) list.toArray(new Country[list.size()]);

	}

	/**
	 *
	 * @param parentQName
	 * @param factory
	 * @return org.apache.axiom.om.OMElement
	 */
	public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
		final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

	    org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
		    MY_QNAME);
	    return factory.createOMElement(dataSource, MY_QNAME);

	}

	public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
		throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
	    serialize(parentQName, xmlWriter, false);
	}

	public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
		boolean serializeType)
		throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

	    java.lang.String prefix = null;
	    java.lang.String namespace = null;

	    prefix = parentQName.getPrefix();
	    namespace = parentQName.getNamespaceURI();
	    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

	    if (serializeType) {

		java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://soa.st");
		if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
		    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
			    namespacePrefix + ":getAllCountriesResponse", xmlWriter);
		} else {
		    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
			    "getAllCountriesResponse", xmlWriter);
		}

	    }
	    if (local_returnTracker) {
		if (local_return != null) {
		    for (int i = 0; i < local_return.length; i++) {
			if (local_return[i] != null) {
			    local_return[i].serialize(new javax.xml.namespace.QName("http://soa.st", "return"),
				    xmlWriter);
			} else {

			    writeStartElement(null, "http://soa.st", "return", xmlWriter);

			    // write the nil attribute
			    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
			    xmlWriter.writeEndElement();

			}

		    }
		} else {

		    writeStartElement(null, "http://soa.st", "return", xmlWriter);

		    // write the nil attribute
		    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
		    xmlWriter.writeEndElement();

		}
	    }
	    xmlWriter.writeEndElement();

	}

	private static java.lang.String generatePrefix(java.lang.String namespace) {
	    if (namespace.equals("http://soa.st")) {
		return "ns2";
	    }
	    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
	}

	/**
	 * Utility method to write an element start tag.
	 */
	private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
		javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
	    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
	    if (writerPrefix != null) {
		xmlWriter.writeStartElement(namespace, localPart);
	    } else {
		if (namespace.length() == 0) {
		    prefix = "";
		} else if (prefix == null) {
		    prefix = generatePrefix(namespace);
		}

		xmlWriter.writeStartElement(prefix, localPart, namespace);
		xmlWriter.writeNamespace(prefix, namespace);
		xmlWriter.setPrefix(prefix, namespace);
	    }
	}

	/**
	 * Util method to write an attribute with the ns prefix
	 */
	private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
		java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
		throws javax.xml.stream.XMLStreamException {
	    if (xmlWriter.getPrefix(namespace) == null) {
		xmlWriter.writeNamespace(prefix, namespace);
		xmlWriter.setPrefix(prefix, namespace);
	    }
	    xmlWriter.writeAttribute(namespace, attName, attValue);
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
		javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
	    if (namespace.equals("")) {
		xmlWriter.writeAttribute(attName, attValue);
	    } else {
		registerPrefix(xmlWriter, namespace);
		xmlWriter.writeAttribute(namespace, attName, attValue);
	    }
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
		javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
		throws javax.xml.stream.XMLStreamException {

	    java.lang.String attributeNamespace = qname.getNamespaceURI();
	    java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
	    if (attributePrefix == null) {
		attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
	    }
	    java.lang.String attributeValue;
	    if (attributePrefix.trim().length() > 0) {
		attributeValue = attributePrefix + ":" + qname.getLocalPart();
	    } else {
		attributeValue = qname.getLocalPart();
	    }

	    if (namespace.equals("")) {
		xmlWriter.writeAttribute(attName, attributeValue);
	    } else {
		registerPrefix(xmlWriter, namespace);
		xmlWriter.writeAttribute(namespace, attName, attributeValue);
	    }
	}

	/**
	 * method to handle Qnames
	 */

	private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
		throws javax.xml.stream.XMLStreamException {
	    java.lang.String namespaceURI = qname.getNamespaceURI();
	    if (namespaceURI != null) {
		java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
		if (prefix == null) {
		    prefix = generatePrefix(namespaceURI);
		    xmlWriter.writeNamespace(prefix, namespaceURI);
		    xmlWriter.setPrefix(prefix, namespaceURI);
		}

		if (prefix.trim().length() > 0) {
		    xmlWriter.writeCharacters(
			    prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
		} else {
		    // i.e this is the default namespace
		    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
		}

	    } else {
		xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
	    }
	}

	private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
		throws javax.xml.stream.XMLStreamException {

	    if (qnames != null) {
		// we have to store this data until last moment since it is not possible to
		// write any
		// namespace data after writing the charactor data
		java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
		java.lang.String namespaceURI = null;
		java.lang.String prefix = null;

		for (int i = 0; i < qnames.length; i++) {
		    if (i > 0) {
			stringToWrite.append(" ");
		    }
		    namespaceURI = qnames[i].getNamespaceURI();
		    if (namespaceURI != null) {
			prefix = xmlWriter.getPrefix(namespaceURI);
			if ((prefix == null) || (prefix.length() == 0)) {
			    prefix = generatePrefix(namespaceURI);
			    xmlWriter.writeNamespace(prefix, namespaceURI);
			    xmlWriter.setPrefix(prefix, namespaceURI);
			}

			if (prefix.trim().length() > 0) {
			    stringToWrite.append(prefix).append(":").append(
				    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
			} else {
			    stringToWrite.append(
				    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
			}
		    } else {
			stringToWrite
				.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
		    }
		}
		xmlWriter.writeCharacters(stringToWrite.toString());
	    }

	}

	/**
	 * Register a namespace prefix
	 */
	private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
		throws javax.xml.stream.XMLStreamException {
	    java.lang.String prefix = xmlWriter.getPrefix(namespace);
	    if (prefix == null) {
		prefix = generatePrefix(namespace);
		javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
		while (true) {
		    java.lang.String uri = nsContext.getNamespaceURI(prefix);
		    if (uri == null || uri.length() == 0) {
			break;
		    }
		    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}
		xmlWriter.writeNamespace(prefix, namespace);
		xmlWriter.setPrefix(prefix, namespace);
	    }
	    return prefix;
	}

	/**
	 * databinding method to get an XML representation of this object
	 *
	 */
	public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
		throws org.apache.axis2.databinding.ADBException {

	    java.util.ArrayList elementList = new java.util.ArrayList();
	    java.util.ArrayList attribList = new java.util.ArrayList();

	    if (local_returnTracker) {
		if (local_return != null) {
		    for (int i = 0; i < local_return.length; i++) {

			if (local_return[i] != null) {
			    elementList.add(new javax.xml.namespace.QName("http://soa.st", "return"));
			    elementList.add(local_return[i]);
			} else {

			    elementList.add(new javax.xml.namespace.QName("http://soa.st", "return"));
			    elementList.add(null);

			}

		    }
		} else {

		    elementList.add(new javax.xml.namespace.QName("http://soa.st", "return"));
		    elementList.add(local_return);

		}

	    }

	    return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
		    attribList.toArray());

	}

	/**
	 * Factory class that keeps the parse method
	 */
	public static class Factory {

	    /**
	     * static method to create the object Precondition: If this object is an
	     * element, the current or next start element starts this object and any
	     * intervening reader events are ignorable If this object is not an element, it
	     * is a complex type and the reader is at the event just after the outer start
	     * element Postcondition: If this object is an element, the reader is positioned
	     * at its end element If this object is a complex type, the reader is positioned
	     * at the end element of its outer element
	     */
	    public static GetAllCountriesResponse parse(javax.xml.stream.XMLStreamReader reader)
		    throws java.lang.Exception {
		GetAllCountriesResponse object = new GetAllCountriesResponse();

		int event;
		java.lang.String nillableValue = null;
		java.lang.String prefix = "";
		java.lang.String namespaceuri = "";
		try {

		    while (!reader.isStartElement() && !reader.isEndElement())
			reader.next();

		    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
			java.lang.String fullTypeName = reader
				.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
			if (fullTypeName != null) {
			    java.lang.String nsPrefix = null;
			    if (fullTypeName.indexOf(":") > -1) {
				nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
			    }
			    nsPrefix = nsPrefix == null ? "" : nsPrefix;

			    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

			    if (!"getAllCountriesResponse".equals(type)) {
				// find namespace for the prefix
				java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
				return (GetAllCountriesResponse) ExtensionMapper.getTypeObject(nsUri, type, reader);
			    }

			}

		    }

		    // Note all attributes that were handled. Used to differ normal attributes
		    // from anyAttributes.
		    java.util.Vector handledAttributes = new java.util.Vector();

		    reader.next();

		    java.util.ArrayList list1 = new java.util.ArrayList();

		    while (!reader.isStartElement() && !reader.isEndElement())
			reader.next();

		    if (reader.isStartElement()
			    && new javax.xml.namespace.QName("http://soa.st", "return").equals(reader.getName())) {

			// Process the array and step past its final element's end.

			nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
			if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
			    list1.add(null);
			    reader.next();
			} else {
			    list1.add(Country.Factory.parse(reader));
			}
			// loop until we find a start element that is not part of this array
			boolean loopDone1 = false;
			while (!loopDone1) {
			    // We should be at the end element, but make sure
			    while (!reader.isEndElement())
				reader.next();
			    // Step out of this element
			    reader.next();
			    // Step to next element event.
			    while (!reader.isStartElement() && !reader.isEndElement())
				reader.next();
			    if (reader.isEndElement()) {
				// two continuous end elements means we are exiting the xml structure
				loopDone1 = true;
			    } else {
				if (new javax.xml.namespace.QName("http://soa.st", "return").equals(reader.getName())) {

				    nillableValue = reader
					    .getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
				    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
					list1.add(null);
					reader.next();
				    } else {
					list1.add(Country.Factory.parse(reader));
				    }
				} else {
				    loopDone1 = true;
				}
			    }
			}
			// call the converter utility to convert and set the array

			object.set_return((Country[]) org.apache.axis2.databinding.utils.ConverterUtil
				.convertToArray(Country.class, list1));

		    } // End of if for expected property start element

		    else {

		    }

		    while (!reader.isStartElement() && !reader.isEndElement())
			reader.next();

		    if (reader.isStartElement())
			// A start element we are not expecting indicates a trailing invalid property
			throw new org.apache.axis2.databinding.ADBException(
				"Unexpected subelement " + reader.getName());

		} catch (javax.xml.stream.XMLStreamException e) {
		    throw new java.lang.Exception(e);
		}

		return object;
	    }

	}// end of factory class

    }

    public static class GetCitiesByCountryName implements org.apache.axis2.databinding.ADBBean {

	public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://soa.st",
		"getCitiesByCountryName", "ns2");

	/**
	 * field for Name
	 */

	protected java.lang.String localName;

	/*
	 * This tracker boolean wil be used to detect whether the user called the set
	 * method for this attribute. It will be used to determine whether to include
	 * this field in the serialized XML
	 */
	protected boolean localNameTracker = false;

	public boolean isNameSpecified() {
	    return localNameTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getName() {
	    return localName;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param Name
	 */
	public void setName(java.lang.String param) {
	    localNameTracker = true;

	    this.localName = param;

	}

	/**
	 *
	 * @param parentQName
	 * @param factory
	 * @return org.apache.axiom.om.OMElement
	 */
	public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
		final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

	    org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
		    MY_QNAME);
	    return factory.createOMElement(dataSource, MY_QNAME);

	}

	public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
		throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
	    serialize(parentQName, xmlWriter, false);
	}

	public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
		boolean serializeType)
		throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

	    java.lang.String prefix = null;
	    java.lang.String namespace = null;

	    prefix = parentQName.getPrefix();
	    namespace = parentQName.getNamespaceURI();
	    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

	    if (serializeType) {

		java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://soa.st");
		if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
		    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
			    namespacePrefix + ":getCitiesByCountryName", xmlWriter);
		} else {
		    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "getCitiesByCountryName",
			    xmlWriter);
		}

	    }
	    if (localNameTracker) {
		namespace = "http://soa.st";
		writeStartElement(null, namespace, "name", xmlWriter);

		if (localName == null) {
		    // write the nil attribute

		    writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

		} else {

		    xmlWriter.writeCharacters(localName);

		}

		xmlWriter.writeEndElement();
	    }
	    xmlWriter.writeEndElement();

	}

	private static java.lang.String generatePrefix(java.lang.String namespace) {
	    if (namespace.equals("http://soa.st")) {
		return "ns2";
	    }
	    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
	}

	/**
	 * Utility method to write an element start tag.
	 */
	private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
		javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
	    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
	    if (writerPrefix != null) {
		xmlWriter.writeStartElement(namespace, localPart);
	    } else {
		if (namespace.length() == 0) {
		    prefix = "";
		} else if (prefix == null) {
		    prefix = generatePrefix(namespace);
		}

		xmlWriter.writeStartElement(prefix, localPart, namespace);
		xmlWriter.writeNamespace(prefix, namespace);
		xmlWriter.setPrefix(prefix, namespace);
	    }
	}

	/**
	 * Util method to write an attribute with the ns prefix
	 */
	private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
		java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
		throws javax.xml.stream.XMLStreamException {
	    if (xmlWriter.getPrefix(namespace) == null) {
		xmlWriter.writeNamespace(prefix, namespace);
		xmlWriter.setPrefix(prefix, namespace);
	    }
	    xmlWriter.writeAttribute(namespace, attName, attValue);
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
		javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
	    if (namespace.equals("")) {
		xmlWriter.writeAttribute(attName, attValue);
	    } else {
		registerPrefix(xmlWriter, namespace);
		xmlWriter.writeAttribute(namespace, attName, attValue);
	    }
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
		javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
		throws javax.xml.stream.XMLStreamException {

	    java.lang.String attributeNamespace = qname.getNamespaceURI();
	    java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
	    if (attributePrefix == null) {
		attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
	    }
	    java.lang.String attributeValue;
	    if (attributePrefix.trim().length() > 0) {
		attributeValue = attributePrefix + ":" + qname.getLocalPart();
	    } else {
		attributeValue = qname.getLocalPart();
	    }

	    if (namespace.equals("")) {
		xmlWriter.writeAttribute(attName, attributeValue);
	    } else {
		registerPrefix(xmlWriter, namespace);
		xmlWriter.writeAttribute(namespace, attName, attributeValue);
	    }
	}

	/**
	 * method to handle Qnames
	 */

	private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
		throws javax.xml.stream.XMLStreamException {
	    java.lang.String namespaceURI = qname.getNamespaceURI();
	    if (namespaceURI != null) {
		java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
		if (prefix == null) {
		    prefix = generatePrefix(namespaceURI);
		    xmlWriter.writeNamespace(prefix, namespaceURI);
		    xmlWriter.setPrefix(prefix, namespaceURI);
		}

		if (prefix.trim().length() > 0) {
		    xmlWriter.writeCharacters(
			    prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
		} else {
		    // i.e this is the default namespace
		    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
		}

	    } else {
		xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
	    }
	}

	private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
		throws javax.xml.stream.XMLStreamException {

	    if (qnames != null) {
		// we have to store this data until last moment since it is not possible to
		// write any
		// namespace data after writing the charactor data
		java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
		java.lang.String namespaceURI = null;
		java.lang.String prefix = null;

		for (int i = 0; i < qnames.length; i++) {
		    if (i > 0) {
			stringToWrite.append(" ");
		    }
		    namespaceURI = qnames[i].getNamespaceURI();
		    if (namespaceURI != null) {
			prefix = xmlWriter.getPrefix(namespaceURI);
			if ((prefix == null) || (prefix.length() == 0)) {
			    prefix = generatePrefix(namespaceURI);
			    xmlWriter.writeNamespace(prefix, namespaceURI);
			    xmlWriter.setPrefix(prefix, namespaceURI);
			}

			if (prefix.trim().length() > 0) {
			    stringToWrite.append(prefix).append(":").append(
				    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
			} else {
			    stringToWrite.append(
				    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
			}
		    } else {
			stringToWrite
				.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
		    }
		}
		xmlWriter.writeCharacters(stringToWrite.toString());
	    }

	}

	/**
	 * Register a namespace prefix
	 */
	private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
		throws javax.xml.stream.XMLStreamException {
	    java.lang.String prefix = xmlWriter.getPrefix(namespace);
	    if (prefix == null) {
		prefix = generatePrefix(namespace);
		javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
		while (true) {
		    java.lang.String uri = nsContext.getNamespaceURI(prefix);
		    if (uri == null || uri.length() == 0) {
			break;
		    }
		    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}
		xmlWriter.writeNamespace(prefix, namespace);
		xmlWriter.setPrefix(prefix, namespace);
	    }
	    return prefix;
	}

	/**
	 * databinding method to get an XML representation of this object
	 *
	 */
	public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
		throws org.apache.axis2.databinding.ADBException {

	    java.util.ArrayList elementList = new java.util.ArrayList();
	    java.util.ArrayList attribList = new java.util.ArrayList();

	    if (localNameTracker) {
		elementList.add(new javax.xml.namespace.QName("http://soa.st", "name"));

		elementList.add(localName == null ? null
			: org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localName));
	    }

	    return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
		    attribList.toArray());

	}

	/**
	 * Factory class that keeps the parse method
	 */
	public static class Factory {

	    /**
	     * static method to create the object Precondition: If this object is an
	     * element, the current or next start element starts this object and any
	     * intervening reader events are ignorable If this object is not an element, it
	     * is a complex type and the reader is at the event just after the outer start
	     * element Postcondition: If this object is an element, the reader is positioned
	     * at its end element If this object is a complex type, the reader is positioned
	     * at the end element of its outer element
	     */
	    public static GetCitiesByCountryName parse(javax.xml.stream.XMLStreamReader reader)
		    throws java.lang.Exception {
		GetCitiesByCountryName object = new GetCitiesByCountryName();

		int event;
		java.lang.String nillableValue = null;
		java.lang.String prefix = "";
		java.lang.String namespaceuri = "";
		try {

		    while (!reader.isStartElement() && !reader.isEndElement())
			reader.next();

		    if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
			java.lang.String fullTypeName = reader
				.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
			if (fullTypeName != null) {
			    java.lang.String nsPrefix = null;
			    if (fullTypeName.indexOf(":") > -1) {
				nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
			    }
			    nsPrefix = nsPrefix == null ? "" : nsPrefix;

			    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

			    if (!"getCitiesByCountryName".equals(type)) {
				// find namespace for the prefix
				java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
				return (GetCitiesByCountryName) ExtensionMapper.getTypeObject(nsUri, type, reader);
			    }

			}

		    }

		    // Note all attributes that were handled. Used to differ normal attributes
		    // from anyAttributes.
		    java.util.Vector handledAttributes = new java.util.Vector();

		    reader.next();

		    while (!reader.isStartElement() && !reader.isEndElement())
			reader.next();

		    if (reader.isStartElement()
			    && new javax.xml.namespace.QName("http://soa.st", "name").equals(reader.getName())) {

			nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
			if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

			    java.lang.String content = reader.getElementText();

			    object.setName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

			} else {

			    reader.getElementText(); // throw away text nodes if any.
			}

			reader.next();

		    } // End of if for expected property start element

		    else {

		    }

		    while (!reader.isStartElement() && !reader.isEndElement())
			reader.next();

		    if (reader.isStartElement())
			// A start element we are not expecting indicates a trailing invalid property
			throw new org.apache.axis2.databinding.ADBException(
				"Unexpected subelement " + reader.getName());

		} catch (javax.xml.stream.XMLStreamException e) {
		    throw new java.lang.Exception(e);
		}

		return object;
	    }

	}// end of factory class

    }

    private org.apache.axiom.om.OMElement toOM(st.soa.CountryServiceStub.GetAllCountries param, boolean optimizeContent)
	    throws org.apache.axis2.AxisFault {

	try {
	    return param.getOMElement(st.soa.CountryServiceStub.GetAllCountries.MY_QNAME,
		    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
	} catch (org.apache.axis2.databinding.ADBException e) {
	    throw org.apache.axis2.AxisFault.makeFault(e);
	}

    }

    private org.apache.axiom.om.OMElement toOM(st.soa.CountryServiceStub.GetAllCountriesResponse param,
	    boolean optimizeContent) throws org.apache.axis2.AxisFault {

	try {
	    return param.getOMElement(st.soa.CountryServiceStub.GetAllCountriesResponse.MY_QNAME,
		    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
	} catch (org.apache.axis2.databinding.ADBException e) {
	    throw org.apache.axis2.AxisFault.makeFault(e);
	}

    }

    private org.apache.axiom.om.OMElement toOM(st.soa.CountryServiceStub.GetCitiesByCountryName param,
	    boolean optimizeContent) throws org.apache.axis2.AxisFault {

	try {
	    return param.getOMElement(st.soa.CountryServiceStub.GetCitiesByCountryName.MY_QNAME,
		    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
	} catch (org.apache.axis2.databinding.ADBException e) {
	    throw org.apache.axis2.AxisFault.makeFault(e);
	}

    }

    private org.apache.axiom.om.OMElement toOM(st.soa.CountryServiceStub.GetCitiesByCountryNameResponse param,
	    boolean optimizeContent) throws org.apache.axis2.AxisFault {

	try {
	    return param.getOMElement(st.soa.CountryServiceStub.GetCitiesByCountryNameResponse.MY_QNAME,
		    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
	} catch (org.apache.axis2.databinding.ADBException e) {
	    throw org.apache.axis2.AxisFault.makeFault(e);
	}

    }

    private org.apache.axiom.om.OMElement toOM(st.soa.CountryServiceStub.CountryServiceCountryNotFoundException param,
	    boolean optimizeContent) throws org.apache.axis2.AxisFault {

	try {
	    return param.getOMElement(st.soa.CountryServiceStub.CountryServiceCountryNotFoundException.MY_QNAME,
		    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
	} catch (org.apache.axis2.databinding.ADBException e) {
	    throw org.apache.axis2.AxisFault.makeFault(e);
	}

    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
	    st.soa.CountryServiceStub.GetAllCountries param, boolean optimizeContent,
	    javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {

	try {

	    org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
	    emptyEnvelope.getBody()
		    .addChild(param.getOMElement(st.soa.CountryServiceStub.GetAllCountries.MY_QNAME, factory));
	    return emptyEnvelope;
	} catch (org.apache.axis2.databinding.ADBException e) {
	    throw org.apache.axis2.AxisFault.makeFault(e);
	}

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
	    st.soa.CountryServiceStub.GetCitiesByCountryName param, boolean optimizeContent,
	    javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {

	try {

	    org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
	    emptyEnvelope.getBody()
		    .addChild(param.getOMElement(st.soa.CountryServiceStub.GetCitiesByCountryName.MY_QNAME, factory));
	    return emptyEnvelope;
	} catch (org.apache.axis2.databinding.ADBException e) {
	    throw org.apache.axis2.AxisFault.makeFault(e);
	}

    }

    /* methods to provide back word compatibility */

    /**
     * get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory) {
	return factory.getDefaultEnvelope();
    }

    private java.lang.Object fromOM(org.apache.axiom.om.OMElement param, java.lang.Class type,
	    java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault {

	try {

	    if (st.soa.CountryServiceStub.CountryServiceCountryNotFoundException.class.equals(type)) {

		return st.soa.CountryServiceStub.CountryServiceCountryNotFoundException.Factory
			.parse(param.getXMLStreamReaderWithoutCaching());

	    }

	    if (st.soa.CountryServiceStub.GetAllCountries.class.equals(type)) {

		return st.soa.CountryServiceStub.GetAllCountries.Factory
			.parse(param.getXMLStreamReaderWithoutCaching());

	    }

	    if (st.soa.CountryServiceStub.GetAllCountriesResponse.class.equals(type)) {

		return st.soa.CountryServiceStub.GetAllCountriesResponse.Factory
			.parse(param.getXMLStreamReaderWithoutCaching());

	    }

	    if (st.soa.CountryServiceStub.GetCitiesByCountryName.class.equals(type)) {

		return st.soa.CountryServiceStub.GetCitiesByCountryName.Factory
			.parse(param.getXMLStreamReaderWithoutCaching());

	    }

	    if (st.soa.CountryServiceStub.GetCitiesByCountryNameResponse.class.equals(type)) {

		return st.soa.CountryServiceStub.GetCitiesByCountryNameResponse.Factory
			.parse(param.getXMLStreamReaderWithoutCaching());

	    }

	} catch (java.lang.Exception e) {
	    throw org.apache.axis2.AxisFault.makeFault(e);
	}
	return null;
    }

}
