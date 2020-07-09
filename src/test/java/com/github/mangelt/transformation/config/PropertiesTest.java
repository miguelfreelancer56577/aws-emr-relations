package com.github.mangelt.transformation.config;

import static org.assertj.core.api.Assertions.assertThat;

import org.apache.commons.configuration.Configuration;
import org.junit.Before;
import org.junit.Test;

import com.github.mangelt.transformation.support.Constants;

/**
 * Tests cases for {@link #Properties} class
 * 
 * @author mangelt
 *
 */
public class PropertiesTest {
	
	private Configuration configuration;
	
	@Before
	public void setUp() {
//		Initializing properties
		configuration = Properties.getConfiguration();
	}
	
	/**
	 * Test the loading of the properties files.
	 */
	@Test
	public void getConfiguration() {
//		getting singleton object 
		configuration = Properties.getConfiguration();
		String property = configuration.getString(Constants.APP_SPARK_CARD_UNDERSCORE);
		assertThat(property)
			.isNotEmpty()
			.isEqualTo(Constants.APP_SPARK_CARD_UNDERSCORE);
	}
	
}
