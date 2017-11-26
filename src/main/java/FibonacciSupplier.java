import java.util.function.Supplier;

/**
 * Created by qiuzhanghua on 2017/2/7.
 */
public class FibonacciSupplier implements Supplier<Long> {
	private long previous1 = 1;
	private long previous2 = 1;
	private long current = 2;

	// f(n-1)+f(n-2)+f(n-3)
	@Override
	public Long get() {
		long p = previous1;
		long next = previous1 + previous2 + current;
		previous1 = previous2;
		previous2 = current;
		current = next;
		return p;
	}
}
