
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String



def static "authorizepackage.authorizekeyword.authorize"(
    	String password	) {
    (new authorizepackage.authorizekeyword()).authorize(
        	password)
}


def static "loginpackage.loginkeyword.login"(
    	String username	
     , 	String password	) {
    (new loginpackage.loginkeyword()).login(
        	username
         , 	password)
}


def static "howlpackage.howlkeyword.deleteHowl"() {
    (new howlpackage.howlkeyword()).deleteHowl()
}
