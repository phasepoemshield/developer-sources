package zenith;

@FunctionalInterface
public interface IAccept$EventBus$EventBus<E> {
   boolean accept(E e);
}
