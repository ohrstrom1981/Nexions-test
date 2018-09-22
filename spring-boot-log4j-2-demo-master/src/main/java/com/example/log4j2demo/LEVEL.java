/**
 * 
 */
package com.example.log4j2demo;

/**
 * @author ohrst
 *
 */
public enum LEVEL {
	   INFO("info"),
	   WARNING("warning"),
	   DEBUG("debug"),
	   ERROR("error"),
	   FATAL("fatal");
	
	   private String value;
	   private LEVEL(String value) {
	      this.value = value;
	   }
	   
	   public String getValue() {
	      return value;
	   }
	   
	   @Override
	    public String toString() {
	        return getValue();
	    }
}
