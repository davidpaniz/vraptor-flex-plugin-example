package br.com.caelum.vraptor.interceptor;

import java.util.Random;

import br.com.caelum.vraptor.InterceptionException;
import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.core.InterceptorStack;
import br.com.caelum.vraptor.flex.FlexIntercepts;
import br.com.caelum.vraptor.resource.ResourceMethod;

@FlexIntercepts
@Intercepts
public class FlexInterceptorExample implements Interceptor {

	private static final Random RANDOM = new Random();

	public boolean accepts(ResourceMethod resource) {
		return true;
	}

	public void intercept(InterceptorStack stack, ResourceMethod method, Object object) throws InterceptionException {
		System.out.println("Chamou Interceptor " + FlexInterceptorExample.class.getCanonicalName());
		int i = RANDOM.nextInt(2);
		if(i < 1)
			stack.next(method, object);
		else
			throw new RuntimeException("Não quero que continue");
	}

}
