package jp.suzutt.sample.lambda;

import java.util.HashMap;
import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class SampleLambdaHandler implements RequestHandler<Object, Object> {

	public Object handleRequest(Object request, Context contexst) {
		Map<String,String> map = new HashMap<String, String>();
		String key = "name";
		String value = "suzutt";
		map.put(key, value);
		return map;
	}
}