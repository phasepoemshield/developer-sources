/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.util;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;
import jnr.ffi.util.AnnotationNameComparator;

public final class Annotations {
    public static final Collection<Annotation> EMPTY_ANNOTATIONS = Collections.emptyList();

    /*
     * WARNING - void declaration
     */
    public static final Collection<Annotation> mergeAnnotations(Collection<Annotation> ... collections) {
        int n;
        int totalLength = 0;
        Collection<Annotation>[] collectionArray = collections;
        int n2 = collectionArray.length;
        for (n = 0; n < n2; ++n) {
            Collection<Annotation> c = collectionArray[n];
            totalLength += c.size();
        }
        ArrayList all = new ArrayList(totalLength);
        Collection<Annotation>[] collectionArray2 = collections;
        n = collectionArray2.length;
        for (int i = 0; i < n; ++i) {
            void var6_8;
            Collection<Annotation> c = collectionArray2[i];
            all.addAll(var6_8);
        }
        return Annotations.sortedAnnotationCollection(collectionArray);
    }

    public static final Collection<Annotation> mergeAnnotations(Collection<Annotation> a2, Collection<Annotation> b2) {
        if (a2.isEmpty() && b2.isEmpty()) {
            return EMPTY_ANNOTATIONS;
        }
        if (!a2.isEmpty() && b2.isEmpty()) {
            return a2;
        }
        if (a2.isEmpty() && !b2.isEmpty()) {
            return b2;
        }
        ArrayList<Annotation> all = new ArrayList<Annotation>(a2);
        all.addAll(b2);
        return Annotations.sortedAnnotationCollection(all);
    }

    public static Collection<Annotation> sortedAnnotationCollection(Collection<Annotation> annotations) {
        if (annotations.size() < 2 || annotations instanceof SortedSet && ((SortedSet)annotations).comparator() instanceof AnnotationNameComparator) {
            return annotations;
        }
        TreeSet<Annotation> sorted2 = new TreeSet<Annotation>(AnnotationNameComparator.getInstance());
        sorted2.addAll(annotations);
        return Collections.unmodifiableSortedSet(sorted2);
    }

    private Annotations() {
    }

    public static Collection<Annotation> sortedAnnotationCollection(Annotation[] annotations) {
        if (annotations.length > 1) {
            return Annotations.sortedAnnotationCollection(Arrays.asList(annotations));
        }
        if (annotations.length > 0) {
            return Collections.singletonList(annotations[0]);
        }
        return Collections.emptyList();
    }
}

