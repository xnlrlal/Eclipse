package kr.co.ezenac.lambda04;

@FunctionalInterface
public interface TriFunction_t<T, U, V, R> {
		
	R apply (T t, U u, V v);

}
