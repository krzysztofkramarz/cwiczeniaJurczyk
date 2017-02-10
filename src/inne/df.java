package inne;

/**
 * Created by kkramarz on 14.12.16.
 */
public class df {

    // create XmlHolder for request content
    def holder = new com.eviware.soapui.support.XmlHolder(mockRequest.requestContent)
    // get argument
    def errorCode = holder["//*:intermediaryId"]
    def trackingNumber = holder["//*:trackingNumber"]
    def applicationId = holder["//*:applicationId"]
    def transactionId = holder["//*:transactionId"]
    def String
    body
    log.info("errorCode "+errorCode)
            log.info("errorCode.class "+errorCode.class)

            log.info("trackingNumber "+trackingNumber)
            log.info("trackingNumber.class "+trackingNumber.class)

            if(errorCode.class !=String.class)

    {
        if (trackingNumber.class == String.class) {
            log.info("111")
            requestContext.trackingNumber = trackingNumber
        }
    }
    if(errorCode.class ==String.class)

    {
        log.info("222")
        requestContext.errorCode = errorCode
    }

    requestContext.applicationId =applicationId
    requestContext.transactionId =transactionId

		if(errorCode.class ==String.class)

    {
        log.info("333")

        if (errorCode.startsWith("E1")) {
            return "E1142 errorCode"
        } else if (errorCode.startsWith("E0")) {
            return "E0000 errorCode"
        } else return "No Errors errorCode"

    }

	else if(trackingNumber.startsWith("1000"))

    {
        return "No Errors"
    }
    else if(trackingNumber.startsWith("1142"))

    {
        return "E1142 Barcode reference [trackingNumber] is not valid"
    }
    else if(trackingNumber.startsWith("0000"))

    {
        return "E0000 Internal Exception Occurred"
    }

	else return"No Errors"

}
