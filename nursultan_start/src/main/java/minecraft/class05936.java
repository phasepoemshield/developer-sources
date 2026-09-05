/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10547
 *  Nursultan.class10550
 *  Nursultan.class10551
 *  com.google.common.collect.ImmutableList
 *  minecraft.class00405
 *  minecraft.class06244
 */
package minecraft;

import Nursultan.class10547;
import Nursultan.class10550;
import Nursultan.class10551;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import minecraft.class00405;
import minecraft.class05933;
import minecraft.class05935;
import minecraft.class05977;
import minecraft.class06244;

public interface class05936 {
    public static final Optional<class06244> L = Optional.of(class06244.field_17274);
    public static final class05936 u = new class05933();

    default public String getString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.N_8(string -> {
            stringBuilder.append(string);
            return Optional.empty();
        });
        return stringBuilder.toString();
    }

    public static class05936 N(List<? extends class05936> list) {
        return new class10550(list);
    }

    public <T> Optional<T> N_8(class05977<T> var1);

    public <T> Optional<T> N(class05935<T> var1, class00405 var2);

    public static class05936 N(String string, class00405 class004052) {
        return new class10547(string, class004052);
    }

    public static class05936 N(class05936 ... class05936Array) {
        return class05936.N((List<? extends class05936>)ImmutableList.copyOf((Object[])class05936Array));
    }

    public static class05936 R(String string) {
        return new class10551(string);
    }
}

