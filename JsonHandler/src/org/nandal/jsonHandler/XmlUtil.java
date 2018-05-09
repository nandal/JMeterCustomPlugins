package org.nandal.jsonHandler;

import org.apache.jmeter.util.JMeterUtils;
import org.apache.oro.text.regex.Pattern;
import org.apache.oro.text.regex.Perl5Matcher;

public class XmlUtil {

	public static boolean validateSchema(String toCheck, Pattern pattern) {
		Perl5Matcher localMatcher = JMeterUtils.getMatcher();
		return localMatcher.contains(toCheck, pattern);
	}
}
