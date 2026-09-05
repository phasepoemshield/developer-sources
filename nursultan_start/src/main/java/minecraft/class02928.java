/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02477
 *  minecraft.class06584
 *  minecraft.class06838
 */
package minecraft;

import java.util.function.UnaryOperator;
import java.util.stream.Stream;
import minecraft.class02477;
import minecraft.class06584;
import minecraft.class06838;

public interface class02928<T> {
    public T y();

    default public void N(class06584 class065843, UnaryOperator<class06584> unaryOperator) {
        Object object = class065843.method_58694(this.N());
        if (object != null) {
            UnaryOperator unaryOperator2 = class065842 -> {
                if (class065842.R()) {
                    return class065842;
                }
                class06584 class065843 = (class06584)unaryOperator.apply((class06584)class065842);
                class065843.R(class065843.U());
                return class065843;
            };
            this.N(class065843, this.N(object).map(unaryOperator2));
        }
    }

    default public class06838 N(class06584 class065842) {
        return () -> {
            Object object = class065842.method_58694(this.N());
            if (object != null) {
                return this.N(object).filter(class065842 -> !class065842.R());
            }
            return Stream.empty();
        };
    }

    public class02477<T> N();

    public T N(T var1, Stream<class06584> var2);

    public Stream<class06584> N(T var1);

    default public void N(class06584 class065842, T t, Stream<class06584> stream) {
        Object object = class065842.a_(this.N(), t);
        Object object2 = this.N(object, stream);
        class065842.N(this.N(), object2);
    }

    default public void N(class06584 class065842, Stream<class06584> stream) {
        this.N(class065842, this.y(), stream);
    }
}

