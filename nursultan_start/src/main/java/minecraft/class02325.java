/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08501
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Optional;
import minecraft.class02328;
import minecraft.class02332;
import minecraft.class02346;
import minecraft.class08501;
import org.jspecify.annotations.Nullable;

public interface class02325<S> {
    public class02328 L();

    public int M();

    public class02325<S> i();

    public void u();

    public class02346<S> y();

    default public <T> Optional<T> y(class08501<S, T> class085012) {
        T t = this.N(class085012);
        if (t != null) {
            this.y().N(this.M());
        }
        if (!this.N().M()) {
            throw new IllegalStateException("Malformed scope: " + String.valueOf(this.N()));
        }
        return Optional.ofNullable(t);
    }

    public class02332 N();

    public void N(int var1);

    public <T> @Nullable T N(class08501<S, T> var1);

    public S R();
}

