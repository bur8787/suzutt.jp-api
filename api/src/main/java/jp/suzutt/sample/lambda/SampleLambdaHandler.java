package jp.suzutt.sample.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class SampleLambdaHandler implements RequestHandler<Object, String> {

	public String handleRequest(Object request, Context contexst) {
		return "Hello,suzutt";
	}
}
