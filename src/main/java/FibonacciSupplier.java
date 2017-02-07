import java.util.function.Supplier;

/**
 * Created by qiuzhanghua on 2017/2/7.
 */
public class FibonacciSupplier implements Supplier<Long> {
  private long previous = 1;
  private long current = 2;

  @Override
  public Long get() {
    long p = previous;
    long next = current + previous;
    previous = current;
    current = next;
    return p;
  }
}
