package org.slf4j;

import java.io.Serializable;
import java.util.Iterator;

// $VF: Compiled from Marker.java
public interface Marker extends Serializable {
   String ANY_NON_NULL_MARKER = "+";
   String ANY_MARKER = "*";

   boolean contains(Marker var1);

   boolean hasReferences();

   @Override
   int hashCode();

   boolean remove(Marker var1);

   @Deprecated
   boolean hasChildren();

   String getName();

   boolean contains(String var1);

   @Override
   boolean equals(Object var1);

   void add(Marker var1);

   Iterator<Marker> iterator();
}
