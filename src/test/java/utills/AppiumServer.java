/**
 * 
 */
package utills;

import javax.swing.text.Utilities;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

/**
 * 
 */
public class AppiumServer {
	
	
	    private final AppiumServiceBuilder serviceBuilder = new AppiumServiceBuilder();
	    private AppiumDriverLocalService server;
	    private int port;
//	    private final String appiumLogsLoc = "appium-logs";
//	    private final String logFileName = "logs";

	    public AppiumServer() {
	        this.port = 4750;
	        this.serviceBuilder.usingPort(port);
	        this.server = AppiumDriverLocalService.buildService(serviceBuilder);
	        this.server.start();
	    }

	    public void stop() {
	        this.server.stop();
	    }

	    public AppiumDriverLocalService get(){
	        return this.server;
	    }

}
