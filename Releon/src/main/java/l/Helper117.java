package l;

import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Helper117<V> {
   private final Deque<V> _entries = new LinkedList<>();
   private final Set<V> registered = new HashSet<>();
   public final Collection<V> entries = Collections.unmodifiableCollection(this._entries);

   public Helper117() {
   }

   public boolean method956(V var1) {
      return this.registered.contains(var1);
   }

   public void method957(V var1) {
      if (!this.method956((V)var1)) {
         this._entries.addFirst((V)var1);
         this.registered.add((V)var1);
      }
   }

   public void method958(V var1) {
      if (this.method956(var1)) {
         this._entries.remove(var1);
         this.registered.remove(var1);
      }
   }

   public Iterator<V> method959() {
      return this._entries.iterator();
   }

   public Iterator<V> method960() {
      return this._entries.descendingIterator();
   }

   public Stream<V> method961() {
      return this._entries.stream();
   }

   public Stream<V> method962() {
      Spliterator var1 = Spliterators.spliterator(this.method960(), (long)this._entries.size(), 16448);
      return StreamSupport.stream(var1, false);
   }
}
