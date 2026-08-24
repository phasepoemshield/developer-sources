package oxxxde;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

// $VF: Compiled from heavy
public class از {
   public رم current;
   private final Deque<رم> stack = new ArrayDeque<>();

   public void push(رم rect) {
      رم scissorRect = rect;
      if (this.current != null) {
         scissorRect = Objects.requireNonNullElse(rect.intersection(this.current), new رم(0.0F, 0.0F, 0.0F, 0.0F));
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
