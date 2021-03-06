package Pruefungsvorbereitung.Musterklausur1.Musterloesung.L1_A6bA9;

import java.util.*;
import java.util.function.*;

/** Some String-specific versions of methods that transform Lists. See
 *  ElementUtils for the better, generically-typed versions.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class StringUtils {
  public static List<String> allMatches(List<String> candidates, 
                                        Predicate<String> matchFunction) {
    List<String> results = new ArrayList<>();
    for(String possibleMatch: candidates) {
      if(matchFunction.test(possibleMatch)) {
        results.add(possibleMatch);
      }
    }
    return(results); 
  }
  
  
  public static List<String> transformedList(List<String> originals, 
                                             Function<String, String> transformer) {
    List<String> results = new ArrayList<>();
    for(String original: originals) {
      results.add(transformer.apply(original));
    }
    return(results); 
  }
  
  private StringUtils() {} // Uninstantiatable class
}
