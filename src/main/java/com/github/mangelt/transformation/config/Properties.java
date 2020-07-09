package com.github.mangelt.transformation.config;

import java.util.Objects;

import org.apache.commons.configuration.CompositeConfiguration;
import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.configuration.SystemConfiguration;

import com.github.mangelt.transformation.exception.PropertiesException;
import com.github.mangelt.transformation.support.Constants;

/**
 * Loads the application properties used.
 * 
 * @author mangelt
 *
 */
public class Properties {

	private Properties() {}
	
	private static Configuration config;
	
	/**
	 * Loads configuration file and return a singleton object.
	 * 
	 * @return config
	 * @throws PropertiesException
	 */
	public static Configuration getConfiguration() {
		try
		{
			if(Objects.isNull(config)) {
				CompositeConfiguration config = new CompositeConfiguration();
				config.addConfiguration(new SystemConfiguration());
				config.addConfiguration(new PropertiesConfiguration(Constants.PATH_APPLICATION_PROPERTIES));
				Properties.config = config;
				return config;
			}else {
				return config;
			}
		}
		catch (Exception e) {
			throw new PropertiesException(e);
		}
		
	}
	
}
