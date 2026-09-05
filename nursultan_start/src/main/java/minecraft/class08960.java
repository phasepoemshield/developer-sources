/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 */
package minecraft;

import java.lang.invoke.LambdaMetafactory;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import minecraft.class00500;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class08952;
import minecraft.class08972;
import minecraft.class08976;

public interface class08960 {
    public class07211 M(class00500 var1);

    public boolean B(class00500 var1);

    public int u();

    private boolean N(int n, int n2) {
        return n > 0 && n2 + n <= this.u();
    }

    default public void N(class07284 class072842, class07209 class072092, class00500 class005002, class00500 class005003) {
        if (!this.B(class005002)) {
            return;
        }
        if (this.N(class005002, class005003)) {
            return;
        }
        class08952 class089522 = this.N(class072842, class072092, this.M(class005002));
        class08972 class089722 = class08972.field_61446;
        int n = class089522.N().N() ? this.N(class072842, class089522.N().L()).size() : 0;
        int n2 = class089522.y().N() ? this.N(class072842, class089522.y().L()).size() : 0;
        int n3 = 1;
        if (this.N(n, n3)) {
            class089722 = class089722.u();
            class089522.N().u();
            n3 += n;
        }
        if (this.N(n2, n3)) {
            class089722 = class089722.L();
            class089522.y().i();
        }
        this.N(class072842, class072092, class089722);
    }

    private class08952 N(class07284 class072842, class07209 class072092, class07211 class072112) {
        return new class08952(this, class072842, class072112, class072092, new HashMap<class07209, class08976>());
    }

    private boolean N(class00500 class005002, class00500 class005003) {
        boolean bl = this.R(class005002).N();
        boolean bl2 = this.B(class005003) && this.R(class005003).N();
        return bl || bl2;
    }

    private void N(IntFunction<class08976> intFunction, class08972 class089722, Consumer<class07209> consumer) {
        for (int i = 1; i < this.u(); ++i) {
            class08976 class089762 = intFunction.apply(i);
            if (class089762.N(class089722)) {
                consumer.accept(class089762.L());
            }
            if (class089762.y()) break;
        }
    }

    default public List<class07209> N(class07284 class072842, class07209 class072092) {
        class00500 class005002 = class072842.method_8320(class072092);
        if (!this.B(class005002)) {
            return List.of();
        }
        class08952 class089522 = this.N(class072842, class072092, this.M(class005002));
        LinkedList<class07209> linkedList = new LinkedList<class07209>();
        linkedList.add(class072092);
        this.N(class089522::N, class08972.field_61449, (Consumer<class07209>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, addFirst(java.lang.Object ), (Lminecraft/class07209;)V)(linkedList));
        this.N(class089522::y, class08972.field_61447, (Consumer<class07209>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, addLast(java.lang.Object ), (Lminecraft/class07209;)V)(linkedList));
        return linkedList;
    }

    default public void N(class07284 class072842, class07209 class072092, class08972 class089722) {
        class00500 class005002 = class072842.method_8320(class072092);
        if (this.R(class005002) != class089722) {
            class072842.method_8652(class072092, this.N(class005002, class089722), 3);
        }
    }

    public class00500 N(class00500 var1, class08972 var2);

    public class08972 R(class00500 var1);

    default public void a_(class07284 class072842, class07209 class072092, class00500 class005002) {
        class08952 class089522 = this.N(class072842, class072092, this.M(class005002));
        class089522.N().R();
        class089522.y().M();
    }
}

