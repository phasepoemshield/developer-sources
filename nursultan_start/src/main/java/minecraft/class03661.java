/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00751
 *  minecraft.class01584
 *  minecraft.class01896
 *  minecraft.class01935
 *  minecraft.class03530
 *  minecraft.class03556
 *  minecraft.class03776
 *  minecraft.class04086
 *  minecraft.class04227
 *  minecraft.class04382
 *  minecraft.class04420
 *  minecraft.class05934
 *  minecraft.class05946
 *  minecraft.class05966
 *  minecraft.class06290
 *  minecraft.class07086
 *  minecraft.class07305
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class00751;
import minecraft.class01584;
import minecraft.class01896;
import minecraft.class01935;
import minecraft.class03530;
import minecraft.class03556;
import minecraft.class03678;
import minecraft.class03690;
import minecraft.class03776;
import minecraft.class04086;
import minecraft.class04227;
import minecraft.class04382;
import minecraft.class04420;
import minecraft.class05934;
import minecraft.class05946;
import minecraft.class05966;
import minecraft.class06290;
import minecraft.class07086;
import minecraft.class07305;
import org.jspecify.annotations.Nullable;

public class class03661 {
    private static final class00392 N = class00392.L((String)"selectWorld.newWorld");
    private final List<Consumer<class03661>> y = new ArrayList<Consumer<class03661>>();
    private String L = N.getString();
    private class03678 u = class03678.field_20624;
    private class07086 i = class07086.field_5802;
    private @Nullable Boolean R;
    private String M;
    private boolean B;
    private boolean Z;
    private final Path z;
    private String U;
    private class01896 E;
    private class03690 W;
    private final List<class03690> m = new ArrayList<class03690>();
    private final List<class03690> P = new ArrayList<class03690>();
    private class07305 s;

    public void L(boolean bl) {
        this.Z = bl;
        this.N();
    }

    public String L() {
        return this.U;
    }

    private String L(String string) {
        String string2 = string.trim();
        try {
            return class06290.N((Path)this.z, (String)(!string2.isEmpty() ? string2 : N.getString()), (String)"");
        }
        catch (Exception exception) {
            try {
                return class06290.N((Path)this.z, (String)"World", (String)"");
            }
            catch (IOException iOException) {
                throw new RuntimeException("Could not create save folder", iOException);
            }
        }
    }

    public boolean M() {
        if (this.E()) {
            return true;
        }
        if (this.R()) {
            return false;
        }
        if (this.R == null) {
            return this.u() == class03678.field_20626;
        }
        return this.R;
    }

    public List<class03690> P() {
        return this.m;
    }

    public class07305 T() {
        return this.s;
    }

    public class03661(Path path, class01896 class018962, Optional<class05946<class04382>> optional, OptionalLong optionalLong) {
        this.z = path;
        this.E = class018962;
        this.W = new class03690((class03556<class04382>)((class03556)class03661.N(class018962, optional).orElse(null)));
        this.b();
        this.M = optionalLong.isPresent() ? Long.toString(optionalLong.getAsLong()) : "";
        this.B = class018962.L().u();
        this.Z = class018962.L().i();
        this.U = this.L(this.L);
        this.u = class018962.Z().N();
        this.s = new class07305(class018962.B().y());
        this.s.N(class018962.Z().y(), null);
        Optional.ofNullable(class018962.Z().L()).flatMap(class059462 -> class018962.N().method_46759(class04227.yM).flatMap(class007512 -> class007512.N(class059462))).map(class035292 -> ((class04086)class035292.N()).y()).ifPresent(class015842 -> this.N(class05966.N((class01584)class015842)));
    }

    public String B() {
        return this.M;
    }

    public boolean Z() {
        if (this.E()) {
            return false;
        }
        return this.B;
    }

    public class07086 i() {
        if (this.R()) {
            return class07086.field_5807;
        }
        return this.i;
    }

    private void b() {
        class00751 class007512 = this.U().N().L(class04227.yO);
        this.m.clear();
        this.m.addAll(class03661.N((class00751<class04382>)class007512, (class03530<class04382>)class04420.N).orElseGet(() -> class007512.z().map(class03690::new).toList()));
        this.P.clear();
        this.P.addAll((Collection<class03690>)class03661.N((class00751<class04382>)class007512, (class03530<class04382>)class04420.y).orElse(this.m));
        class03556<class04382> var2 = this.W.L();
        if (var2 != null) {
            class03690 class036902 = class03661.N(this.U(), var2.i()).map(class03690::new).orElse((class03690)((Object)this.m.getFirst()));
            if (class05966.N.get(var2.i()) != null) {
                this.W = class036902;
            } else {
                this.N(class036902);
            }
        }
    }

    public List<class03690> s() {
        return this.P;
    }

    public @Nullable class05966 m() {
        class03556<class04382> var1 = this.W().L();
        return var1 != null ? (class05966)class05966.N.get(var1.i()) : null;
    }

    public class01896 U() {
        return this.E;
    }

    public boolean z() {
        if (this.E() || this.R()) {
            return false;
        }
        return this.Z;
    }

    public class03678 u() {
        if (this.E()) {
            return class03678.field_20627;
        }
        return this.u;
    }

    public void y(String string) {
        this.M = string;
        this.E = this.E.N(class059342 -> class059342.N(class05934.N((String)this.B())));
        this.N();
    }

    public String y() {
        return this.L;
    }

    public void y(boolean bl) {
        this.B = bl;
        this.N();
    }

    public boolean E() {
        return this.E.i().L();
    }

    public void N() {
        boolean bl;
        boolean bl2 = this.z();
        if (bl2 != this.E.L().i()) {
            this.E = this.E.N(class059342 -> class059342.N(bl2));
        }
        if ((bl = this.Z()) != this.E.L().u()) {
            this.E = this.E.N(class059342 -> class059342.y(bl));
        }
        Iterator<Consumer<class03661>> var3 = this.y.iterator();
        while (var3.hasNext()) {
            var3.next().accept(this);
        }
    }

    public void N(class07086 class070862) {
        this.i = class070862;
        this.N();
    }

    public void N(class03678 class036782) {
        this.u = class036782;
        this.N();
    }

    public void N(class01896 class018962) {
        this.E = class018962;
        this.b();
        this.N();
    }

    public void N(class01935 class019352) {
        this.E = this.E.N(class019352);
        this.N();
    }

    public void N(class03690 class036902) {
        this.W = class036902;
        class03556<class04382> var2 = class036902.L();
        if (var2 != null) {
            this.N((class010222, class037642) -> ((class04382)var2.N()).N());
        }
    }

    public void N(String string) {
        this.L = string;
        this.U = this.L(string);
        this.N();
    }

    protected boolean N(class03776 class037762) {
        class03776 class037763 = this.E.B();
        if (class037763.N().N().equals(class037762.N().N()) && class037763.y().equals((Object)class037762.y())) {
            this.E = new class01896(this.E.L(), this.E.u(), this.E.i(), this.E.R(), this.E.M(), class037762, this.E.Z());
            return true;
        }
        return false;
    }

    public void N(class07305 class073052) {
        this.s = class073052;
        this.N();
    }

    private static Optional<List<class03690>> N(class00751<class04382> class007512, class03530<class04382> class035302) {
        return class007512.N(class035302).map(class035522 -> class035522.N().map(class03690::new).toList()).filter(list -> !list.isEmpty());
    }

    public void N(Consumer<class03661> consumer) {
        this.y.add(consumer);
    }

    public void N(boolean bl) {
        this.R = bl;
        this.N();
    }

    private static Optional<class03556<class04382>> N(class01896 class018962, Optional<class05946<class04382>> optional) {
        return optional.flatMap(class059462 -> class018962.N().L(class04227.yO).N(class059462));
    }

    public class03690 W() {
        return this.W;
    }

    public boolean R() {
        return this.u() == class03678.field_20625;
    }
}

