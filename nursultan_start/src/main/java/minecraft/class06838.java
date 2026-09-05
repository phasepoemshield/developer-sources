/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04803
 *  minecraft.class06584
 */
package minecraft;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import minecraft.class04803;
import minecraft.class06584;
import minecraft.class06815;
import minecraft.class06831;
import minecraft.class06836;

public interface class06838 {
    public static final class06838 N = Stream::empty;

    public static class06838 N(class06838 class068382, class06838 class068383) {
        return () -> Stream.concat(class068382.itemCopies(), class068383.itemCopies());
    }

    public static class06838 N_64(List<? extends class06838> list) {
        return switch (list.size()) {
            case 0 -> N;
            case 1 -> (class06838)list.getFirst();
            case 2 -> class06838.N(list.get(0), list.get(1));
            default -> () -> list.stream().flatMap(class06838::itemCopies);
        };
    }

    default public class06838 N_65(Predicate<class06584> predicate) {
        return new class06815(this, predicate);
    }

    default public class06838 N(Function<class06584, ? extends class06838> function) {
        return new class06836(this, function);
    }

    default public class06838 N(int n) {
        return new class06831(this, n);
    }

    public static class06838 N(class04803 class048032) {
        return () -> Stream.of(class048032.N().t());
    }

    public static class06838 N(Collection<? extends class04803> collection) {
        return switch (collection.size()) {
            case 0 -> N;
            case 1 -> class06838.N(collection.iterator().next());
            default -> () -> collection.stream().map(class04803::N).map(class06584::t);
        };
    }

    public Stream<class06584> itemCopies();
}

