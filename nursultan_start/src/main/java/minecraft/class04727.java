/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  minecraft.class03597
 *  minecraft.class04591
 *  minecraft.class04638
 *  minecraft.class04982
 *  minecraft.class05111
 *  minecraft.class05434
 *  minecraft.class08392
 */
package minecraft;

import com.mojang.datafixers.util.Either;
import minecraft.class03597;
import minecraft.class04591;
import minecraft.class04638;
import minecraft.class04739;
import minecraft.class04982;
import minecraft.class05111;
import minecraft.class05434;
import minecraft.class08392;

class class04727
extends Thread {
    final /* synthetic */ class05434 N;
    final /* synthetic */ class04739 y;

    class04727(class04739 class047392, String string, class05434 class054342) {
        this.y = class047392;
        this.N = class054342;
        super(string);
    }

    @Override
    public void run() {
        class05434 class054342 = this.N;
        class05111 class051112 = class05111.N();
        while (class054342 != null) {
            Either<class05434, Exception> var3 = this.y.N(class054342, class051112);
            class054342 = (class05434)class04739.N(this.y).N(() -> {
                if (var3.right().isPresent()) {
                    class04739.N.error("Couldn't fetch templates", (Throwable)var3.right().get());
                    if (this.y.i.y()) {
                        this.y.B = class04591.N((String)class08392.N((String)"mco.template.select.failure", (Object[])new Object[0]), (class04638[])new class04638[0]);
                    }
                    return null;
                }
                class05434 class054342 = (class05434)var3.left().get();
                for (class04982 class049822 : class054342.y()) {
                    this.y.i.N(class049822);
                }
                if (class054342.y().isEmpty()) {
                    if (this.y.i.y()) {
                        class04982 class049822;
                        String string = class08392.N((String)"mco.template.select.none", (Object[])new Object[]{"%link"});
                        class049822 = class04638.N((String)class08392.N((String)"mco.template.select.none.linkTitle", (Object[])new Object[0]), (String)class03597.v.toString());
                        this.y.B = class04591.N((String)string, (class04638[])new class04638[]{class049822});
                    }
                    return null;
                }
                return class054342;
            }).join();
        }
    }
}

