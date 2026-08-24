package jnr.ffi.util;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

// $VF: Compiled from Annotations.java
public final class Annotations {
   public static final Collection<Annotation> EMPTY_ANNOTATIONS = Collections.emptyList();

   public static final Collection<Annotation> mergeAnnotations(Collection<Annotation>... collections) {
      int totalLength = 0;

      for (Collection<Annotation> c : collections) {
         totalLength += c.size();
      }

      List<Annotation> var7 = new ArrayList(totalLength);

      for (Collection<Annotation> c : collections) {
         var7.addAll(c);
      }

      return sortedAnnotationCollection(var7);
   }

   public static final Collection<Annotation> mergeAnnotations(Collection<Annotation> a, Collection<Annotation> b) {
      if (a.isEmpty() && b.isEmpty()) {
         return EMPTY_ANNOTATIONS;
      }

      if (!a.isEmpty() && b.isEmpty()) {
         return a;
      }

      if (a.isEmpty() && !b.isEmpty()) {
         return b;
      }

      List<Annotation> all = new ArrayList<>(a);
      all.addAll(b);
      return sortedAnnotationCollection(all);
   }

   public static Collection<Annotation> sortedAnnotationCollection(Collection<Annotation> annotations) {
      if (annotations.size() >= 2 && (!(annotations instanceof SortedSet) || !(((SortedSet)annotations).comparator() instanceof AnnotationNameComparator))) {
         SortedSet<Annotation> sorted = new TreeSet<>(AnnotationNameComparator.getInstance());
         sorted.addAll(annotations);
         return Collections.unmodifiableSortedSet(sorted);
      } else {
         return annotations;
      }
   }

   private Annotations() {
   }

   public static Collection<Annotation> sortedAnnotationCollection(Annotation[] annotations) {
      if (annotations.length > 1) {
         return sortedAnnotationCollection(Arrays.asList(annotations));
      } else {
         return annotations.length > 0 ? Collections.singletonList(annotations[0]) : Collections.emptyList();
      }
   }
}
