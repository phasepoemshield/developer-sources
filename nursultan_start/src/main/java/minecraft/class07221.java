/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterators
 *  minecraft.class06069
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Iterators;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;
import minecraft.class06069;
import minecraft.class07185;
import minecraft.class07211;
import minecraft.class07536;
import org.jspecify.annotations.Nullable;

public final class class07221
extends Enum<class07221>
implements Iterable<class07211>,
Predicate<class07211> {
    public static final /* enum */ class07221 field_11062 = new class07221(new class07211[]{class07211.field_11043, class07211.field_11034, class07211.field_11035, class07211.field_11039}, new class07185[]{class07185.field_11048, class07185.field_11051});
    public static final /* enum */ class07221 field_11064 = new class07221(new class07211[]{class07211.field_11036, class07211.field_11033}, new class07185[]{class07185.field_11052});
    private final class07211[] field_11061;
    private final class07185[] field_11065;
    private static final /* synthetic */ class07221[] field_11063;

    private static /* synthetic */ class07221[] L() {
        return new class07221[]{field_11062, field_11064};
    }

    public List<class07211> L(class06069 class060692) {
        return class07536.y((Object[])this.field_11061, (class06069)class060692);
    }

    private class07221(class07211[] class07211Array, class07185[] class07185Array) {
        this.field_11061 = class07211Array;
        this.field_11065 = class07185Array;
    }

    public static class07221[] values() {
        return (class07221[])field_11063.clone();
    }

    public static class07221 valueOf(String string) {
        return Enum.valueOf(class07221.class, string);
    }

    @Override
    public Iterator<class07211> iterator() {
        return Iterators.forArray((Object[])this.field_11061);
    }

    public int y() {
        return this.field_11061.length;
    }

    public class07185 y(class06069 class060692) {
        return (class07185)class07536.N((Object[])this.field_11065, (class06069)class060692);
    }

    @Override
    public boolean test(@Nullable class07211 class072112) {
        return class072112 != null && class072112.z().M() == this;
    }

    public class07211 N(class06069 class060692) {
        return (class07211)((Object)class07536.N((Object[])this.field_11061, (class06069)class060692));
    }

    public Stream<class07211> N() {
        return Arrays.stream(this.field_11061);
    }

    static {
        field_11063 = class07221.L();
    }
}

