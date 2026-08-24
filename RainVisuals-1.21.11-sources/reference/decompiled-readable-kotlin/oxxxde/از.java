package oxxxde;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;
import kotakbaz.rain.client.render.main.scissor.A;

// $VF: Compiled from heavy
public class از {
   public A current;
   private final Deque<A> stack = new ArrayDeque<>();

   public void push(A rect) {
      A scissorRect = rect;
      if (this.current != null) {
         scissorRect = Objects.requireNonNullElse(rect.intersection(this.current), new A(0.0F, 0.0F, 0.0F, 0.0F));
      }

      this.stack.addLast(scissorRect);
      this.current = scissorRect;
   }

   public void pop() {
      if (this.stack.isEmpty()) {
         throw new IllegalStateException("Scissor stack underflow");
      }

      this.stack.removeLast();
      this.current = this.stack.peekLast();
   }
}
