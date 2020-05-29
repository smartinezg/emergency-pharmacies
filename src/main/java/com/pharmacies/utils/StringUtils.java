package com.pharmacies.utils;

import java.io.IOException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StringUtils {
  private static Logger logger = LogManager.getLogger(StringUtils.class);

  public StringUtils() {}

  /**
   * Convert an object to String format
   * 
   * @param obj
   * @return The obj type as a String
   */
  public static <T> String objectToString(T obj) {
    ObjectMapper mapper = new ObjectMapper();

    try {
      mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
      return mapper.writeValueAsString(obj);
    } catch (JsonProcessingException e) {
      logger.error("Error StringUtils - JsonProcessingException : {} ", e.getMessage());
    }
    return null;
  }

  /**
   * Convert a String to an object with a class given
   * 
   * @param jsonString
   * @param clase
   * @return An object of the given class type
   * @throws IOException
   */
  public static <T> T stringToObject(String jsonString, Class<T> clase) throws IOException {
    if (jsonString == null || jsonString.isEmpty())
      return null;
    ObjectMapper mapper = new ObjectMapper();
    return mapper.readValue(jsonString, clase);
  }

}
