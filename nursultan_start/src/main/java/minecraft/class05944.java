/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class00040
 *  minecraft.class00044
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class01054
 *  minecraft.class01304
 *  minecraft.class01590
 *  minecraft.class01864
 *  minecraft.class01894
 *  minecraft.class01896
 *  minecraft.class02071
 *  minecraft.class03103
 *  minecraft.class03142
 *  minecraft.class03556
 *  minecraft.class04141
 *  minecraft.class04151
 *  minecraft.class04182
 *  minecraft.class04777
 *  minecraft.class04785
 *  minecraft.class04909
 *  minecraft.class05071
 *  minecraft.class05096
 *  minecraft.class05125
 *  minecraft.class05213
 *  minecraft.class05216
 *  minecraft.class05217
 *  minecraft.class05220
 *  minecraft.class05227
 *  minecraft.class05231
 *  minecraft.class05630
 *  minecraft.class05733
 *  minecraft.class06132
 *  minecraft.class06202
 *  minecraft.class06307
 *  minecraft.class06434
 *  minecraft.class06435
 *  minecraft.class06479
 *  minecraft.class06601
 *  minecraft.class06613
 *  minecraft.class07312
 *  minecraft.class07529
 *  minecraft.class07583
 *  minecraft.class08280
 *  minecraft.class08394
 *  minecraft.class08627
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import minecraft.class00040;
import minecraft.class00044;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class01054;
import minecraft.class01304;
import minecraft.class01590;
import minecraft.class01864;
import minecraft.class01894;
import minecraft.class01896;
import minecraft.class02071;
import minecraft.class03103;
import minecraft.class03142;
import minecraft.class03556;
import minecraft.class04141;
import minecraft.class04151;
import minecraft.class04182;
import minecraft.class04777;
import minecraft.class04785;
import minecraft.class04909;
import minecraft.class05071;
import minecraft.class05096;
import minecraft.class05125;
import minecraft.class05213;
import minecraft.class05216;
import minecraft.class05217;
import minecraft.class05220;
import minecraft.class05227;
import minecraft.class05231;
import minecraft.class05630;
import minecraft.class05733;
import minecraft.class05936;
import minecraft.class05978;
import minecraft.class06132;
import minecraft.class06202;
import minecraft.class06307;
import minecraft.class06434;
import minecraft.class06435;
import minecraft.class06479;
import minecraft.class06601;
import minecraft.class06613;
import minecraft.class07312;
import minecraft.class07529;
import minecraft.class07583;
import minecraft.class08280;
import minecraft.class08394;
import minecraft.class08627;
import org.jspecify.annotations.Nullable;

public final class class05944
extends class05978
implements class07583 {
    private static final int L = 32;
    private final class05231 u;
    private final class06202 i;
    private final class05096 R;
    final class06434 N;
    private final class04182 M;
    private final class02071 B;
    private final class02071 Z;
    private final class02071 z;
    private @Nullable Path U;
    final /* synthetic */ class05231 y;

    public void L() {
        this.i.N((class05096)new class05733(bl -> {
            if (bl) {
                this.i.N((class05096)new class05125(true));
                this.u();
            }
            this.u.u();
        }, (class00392)class00392.L((String)"selectWorld.deleteQuestion"), (class00392)class00392.N((String)"selectWorld.deleteWarning", (Object[])new Object[]{this.N.y()}), (class00392)class00392.L((String)"selectWorld.deleteButton"), class05220.i));
    }

    public class05944(class05231 class052312, class05231 class052313, class06434 class064342) {
        ZonedDateTime zonedDateTime;
        this.y = class052312;
        this.u = class052313;
        this.i = class05231.N((class05231)class052313);
        this.R = class052313.i();
        this.N = class064342;
        this.M = class04182.N((class08627)this.i.NO(), (String)class064342.N());
        this.U = class064342.L();
        int n = class052313.method_25322() - this.E() - 2;
        class05216 class052162 = class00392.y((String)class064342.y());
        this.B = new class02071((class00392)class052162, (class01590)this.i.i_3);
        this.B.N(n);
        if (((class01590)this.i.i_3).N((class05936)class052162) > n) {
            this.B.method_47400(class04141.N((class00392)class052162));
        }
        Object object = class064342.N();
        long l = class064342.R();
        if (l != -1L) {
            zonedDateTime = ZonedDateTime.ofInstant(Instant.ofEpochMilli(l), ZoneId.systemDefault());
            object = (String)object + " (" + class05231.N.format(zonedDateTime) + ")";
        }
        zonedDateTime = class00392.y((String)object).y(-8355712);
        this.Z = new class02071((class00392)zonedDateTime, (class01590)this.i.i_3);
        this.Z.N(n);
        if (((class01590)this.i.i_3).y((String)object) > n) {
            this.Z.method_47400(class04141.N((class00392)zonedDateTime));
        }
        class00392 class003922 = class00390.N((class00392)class064342.j(), (class00405)class00405.N.N(-8355712));
        this.z = new class02071(class003922, (class01590)this.i.i_3);
        this.z.N(n);
        if (((class01590)this.i.i_3).N((class05936)class003922) > n) {
            this.z.method_47400(class04141.N((class00392)class003922));
        }
        this.U();
        this.m();
    }

    public String Z() {
        return this.N.y();
    }

    public void i() {
        class05227 class052272;
        class04785 class047852;
        this.W();
        String string = this.N.N();
        try {
            class047852 = this.i.NL().u(string);
        }
        catch (IOException iOException) {
            class06132.N((class06202)this.i, (String)string);
            class05231.z.error("Failed to access level {}", (Object)string, (Object)iOException);
            this.u.y();
            return;
        }
        catch (class04151 class041512) {
            class05231.z.warn("{}", (Object)class041512.getMessage());
            this.i.N(class01864.N(() -> this.i.N(this.R)));
            return;
        }
        try {
            class052272 = class05227.N((class06202)this.i, (class04785)class047852, bl -> {
                class047852.L();
                this.u.u();
            });
        }
        catch (IOException | class03103 | class03142 throwable) {
            class047852.L();
            class06132.N((class06202)this.i, (String)string);
            class05231.z.error("Failed to load world data {}", (Object)string, (Object)throwable);
            this.u.y();
            return;
        }
        this.i.N((class05096)class052272);
    }

    private void m() {
        if (this.U != null && Files.isRegularFile(this.U, new LinkOption[0])) {
            try (InputStream inputStream = Files.newInputStream(this.U, new OpenOption[0]);){
                this.M.N(class08280.N((InputStream)inputStream));
            }
            catch (Throwable throwable) {
                class05231.z.error("Invalid icon for world {}", (Object)this.N.N(), (Object)throwable);
                this.U = null;
            }
        } else {
            this.M.N();
        }
    }

    private void U() {
        if (this.U == null) {
            return;
        }
        try {
            BasicFileAttributes basicFileAttributes = Files.readAttributes(this.U, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            if (basicFileAttributes.isSymbolicLink()) {
                List var2 = this.i.Ni().N(this.U);
                if (!var2.isEmpty()) {
                    class05231.z.warn("{}", (Object)class04151.N((Path)this.U, (List)var2));
                    this.U = null;
                } else {
                    basicFileAttributes = Files.readAttributes(this.U, BasicFileAttributes.class, new LinkOption[0]);
                }
            }
            if (!basicFileAttributes.isRegularFile()) {
                this.U = null;
            }
        }
        catch (NoSuchFileException noSuchFileException) {
            this.U = null;
        }
        catch (IOException iOException) {
            class05231.z.error("could not validate symlink", (Throwable)iOException);
            this.U = null;
        }
    }

    @Override
    public void close() {
        if (!this.M.L()) {
            this.M.close();
        }
    }

    @Override
    public class06434 z() {
        return this.N;
    }

    public void u() {
        class04777 class047772 = this.i.NL();
        String string = this.N.N();
        try (class04785 class047852 = class047772.i(string);){
            class047852.U();
        }
        catch (IOException iOException) {
            class06132.y((class06202)this.i, (String)string);
            class05231.z.error("Failed to delete world {}", (Object)string, (Object)iOException);
        }
    }

    public void y() {
        if (!this.N.n()) {
            return;
        }
        if (this.N instanceof class06479) {
            this.i.N(class01864.N(() -> this.i.N(this.R)));
            return;
        }
        this.i.S().N(this.N.N(), () -> ((class05231)this.u).u());
    }

    private int E() {
        return this.method_73380() + 32 + 3;
    }

    public boolean N() {
        return this.N.n() || this.u.j == class05217.field_62202;
    }

    public boolean method_25404(class06601 class066012) {
        if (class066012.L() && this.N()) {
            this.i.Nr().N((class00044)class00040.N((class03556)class04909.OK, (float)1.0f));
            Consumer var2 = this.u.v;
            if (var2 != null) {
                var2.accept(this);
                return true;
            }
        }
        return super.method_25404(class066012);
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        if (this.N()) {
            int n = (int)class066132.n() - this.method_73380();
            int n2 = (int)class066132.t() - this.method_73382();
            if (bl || this.N(n, n2, 32) && this.u.j == class05217.field_62201) {
                this.i.Nr().N((class00044)class00040.N((class03556)class04909.OK, (float)1.0f));
                Consumer var5 = this.u.v;
                if (var5 != null) {
                    var5.accept(this);
                    return true;
                }
            }
        }
        return super.method_25402(class066132, bl);
    }

    private void W() {
        this.i.y((class05096)new class06307((class00392)class00392.L((String)"selectWorld.data_read")));
    }

    public void R() {
        this.W();
        try (class04785 class047852 = this.i.NL().u(this.N.N());){
            Pair var2 = this.i.S().N(class047852);
            class07312 class073122 = (class07312)var2.getFirst();
            class01896 class018962 = (class01896)var2.getSecond();
            Path path = class05213.N((Path)class047852.N(class05071.z), (class06202)this.i);
            class018962.y();
            if (class018962.L().R()) {
                this.i.N((class05096)new class05733(bl -> this.i.N((class05096)(bl ? class05213.N((class06202)this.i, () -> ((class05231)this.u).u(), (class07312)class073122, (class01896)class018962, (Path)path) : this.R)), (class00392)class00392.L((String)"selectWorld.recreate.customized.title"), (class00392)class00392.L((String)"selectWorld.recreate.customized.text"), class05220.Z, class05220.i));
            } else {
                this.i.N((class05096)class05213.N((class06202)this.i, () -> ((class05231)this.u).u(), (class07312)class073122, (class01896)class018962, (Path)path));
            }
        }
        catch (class04151 class041512) {
            class05231.z.warn("{}", (Object)class041512.getMessage());
            this.i.N(class01864.N(() -> this.i.N(this.R)));
        }
        catch (Exception exception) {
            class05231.z.error("Unable to recreate world", (Throwable)exception);
            this.i.N((class05096)new class01304(() -> this.i.N(this.R), (class00392)class00392.L((String)"selectWorld.recreate.error.title"), (class00392)class00392.L((String)"selectWorld.recreate.error.text")));
        }
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        int n3 = this.E();
        this.B.y(n3, this.method_73382() + 1);
        this.B.method_25394(class010542, n, n2, f);
        int n4 = this.method_73382();
        Objects.requireNonNull((class01590)this.i.i_3);
        this.Z.y(n3, n4 + 9 + 3);
        this.Z.method_25394(class010542, n, n2, f);
        int n5 = this.method_73382();
        Objects.requireNonNull((class01590)this.i.i_3);
        int n6 = n5 + 9;
        Objects.requireNonNull((class01590)this.i.i_3);
        this.z.y(n3, n6 + 9 + 3);
        this.z.method_25394(class010542, n, n2, f);
        class010542.N(class08394.Na, this.M.y(), this.method_73380(), this.method_73382(), 0.0f, 0.0f, 32, 32, 32, 32);
        if (this.u.j == class05217.field_62201 && (((Boolean)((class05630)this.i.i_7).Nm().method_41753()).booleanValue() || bl)) {
            class01894 class018942;
            class010542.N(this.method_73380(), this.method_73382(), this.method_73380() + 32, this.method_73382() + 32, -1601138544);
            int n7 = n - this.method_73380();
            int n8 = n2 - this.method_73382();
            boolean bl2 = this.N(n7, n8, 32);
            class01894 class018943 = bl2 ? class05231.B : class05231.Z;
            class01894 class018944 = bl2 ? class05231.R : class05231.M;
            class01894 class018945 = bl2 ? class05231.y : class05231.L;
            class01894 class018946 = class018942 = bl2 ? class05231.u : class05231.i;
            if (this.N instanceof class06479 || this.N instanceof class06435) {
                class010542.N(class08394.Na, class018945, this.method_73380(), this.method_73382(), 32, 32);
                class010542.N(class08394.Na, class018942, this.method_73380(), this.method_73382(), 32, 32);
                return;
            }
            if (this.N.s()) {
                class010542.N(class08394.Na, class018945, this.method_73380(), this.method_73382(), 32, 32);
                if (bl2) {
                    class010542.N(((class01590)this.i.i_3).L((class05936)class05231.P, 175), n, n2);
                }
            } else if (this.N.u()) {
                class010542.N(class08394.Na, class018945, this.method_73380(), this.method_73382(), 32, 32);
                if (bl2) {
                    class010542.N(((class01590)this.i.i_3).L((class05936)class05231.s, 175), n, n2);
                }
            } else if (!this.N.b()) {
                class010542.N(class08394.Na, class018945, this.method_73380(), this.method_73382(), 32, 32);
                if (bl2) {
                    class010542.N(((class01590)this.i.i_3).L((class05936)class05231.T, 175), n, n2);
                }
            } else if (this.N.W()) {
                class010542.N(class08394.Na, class018942, this.method_73380(), this.method_73382(), 32, 32);
                if (this.N.m()) {
                    class010542.N(class08394.Na, class018945, this.method_73380(), this.method_73382(), 32, 32);
                    if (bl2) {
                        class010542.N((List)ImmutableList.of((Object)class05231.U.method_30937(), (Object)class05231.E.method_30937()), n, n2);
                    }
                } else if (!class07529.y().comp_4031()) {
                    class010542.N(class08394.Na, class018944, this.method_73380(), this.method_73382(), 32, 32);
                    if (bl2) {
                        class010542.N((List)ImmutableList.of((Object)class05231.W.method_30937(), (Object)class05231.m.method_30937()), n, n2);
                    }
                }
                if (bl2) {
                    class05231.N((class05231)this.y, (class01054)class010542);
                }
            } else {
                class010542.N(class08394.Na, class018943, this.method_73380(), this.method_73382(), 32, 32);
                if (bl2) {
                    class05231.y((class05231)this.y, (class01054)class010542);
                }
            }
        }
    }

    public class00392 method_37006() {
        class05216 class052162 = class00392.N((String)"narrator.select.world_info", (Object[])new Object[]{this.N.y(), class00392.N((Date)new Date(this.N.R())), this.N.j()});
        if (this.N.s()) {
            class052162 = class05220.N((class00392[])new class00392[]{class052162, class05231.P});
        }
        if (this.N.i()) {
            class052162 = class05220.N((class00392[])new class00392[]{class052162, class05231.b});
        }
        return class00392.N((String)"narrator.select", (Object[])new Object[]{class052162});
    }
}

