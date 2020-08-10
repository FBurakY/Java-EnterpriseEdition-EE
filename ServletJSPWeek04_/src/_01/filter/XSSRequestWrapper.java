package _01.filter;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class XSSRequestWrapper extends HttpServletRequestWrapper {

	public XSSRequestWrapper(HttpServletRequest request) {
		super(request);
	}

	@Override
	public String getParameter(String name) {
		String value = super.getParameter(name);
		return htmlEncode(value);
	}

	public static String htmlEncode(String parameter) {
		for (String key : encodeDecodeMap.keySet()) {
			parameter = parameter.replaceAll("(?i)" + key, encodeDecodeMap.get(key));
		}
		System.out.println("encoded : " + parameter);
		return parameter;
	}

	private static final HashMap<String, String> encodeDecodeMap = new HashMap<String, String>();
	static {
		encodeDecodeMap.put("<", "&#60;");
		encodeDecodeMap.put(">", "&#62;");
		encodeDecodeMap.put("\"", "&#34;");
		// http://unicode-table.com/en/
	}
}
