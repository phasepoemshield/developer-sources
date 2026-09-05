/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.glfw.GLFWVidMode
 *  org.lwjgl.glfw.GLFWVidMode$Buffer
 */
package minecraft;

import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jspecify.annotations.Nullable;
import org.lwjgl.glfw.GLFWVidMode;

public final class class04760 {
    private final int N;
    private final int y;
    private final int L;
    private final int u;
    private final int i;
    private final int R;
    private static final Pattern M = Pattern.compile("(\\d+)x(\\d+)(?:@(\\d+)(?::(\\d+))?)?");

    public int L() {
        return this.L;
    }

    public String M() {
        return String.format(Locale.ROOT, "%sx%s@%s:%s", this.N, this.y, this.R, this.L + this.u + this.i);
    }

    public class04760(int n, int n2, int n3, int n4, int n5, int n6) {
        this.N = n;
        this.y = n2;
        this.L = n3;
        this.u = n4;
        this.i = n5;
        this.R = n6;
    }

    public class04760(GLFWVidMode.Buffer buffer) {
        this.N = buffer.width();
        this.y = buffer.height();
        this.L = buffer.redBits();
        this.u = buffer.greenBits();
        this.i = buffer.blueBits();
        this.R = buffer.refreshRate();
    }

    public class04760(GLFWVidMode gLFWVidMode) {
        this.N = gLFWVidMode.width();
        this.y = gLFWVidMode.height();
        this.L = gLFWVidMode.redBits();
        this.u = gLFWVidMode.greenBits();
        this.i = gLFWVidMode.blueBits();
        this.R = gLFWVidMode.refreshRate();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        class04760 class047602 = (class04760)object;
        return this.N == class047602.N && this.y == class047602.y && this.L == class047602.L && this.u == class047602.u && this.i == class047602.i && this.R == class047602.R;
    }

    public String toString() {
        return String.format(Locale.ROOT, "%sx%s@%s (%sbit)", this.N, this.y, this.R, this.L + this.u + this.i);
    }

    public int hashCode() {
        return Objects.hash(this.N, this.y, this.L, this.u, this.i, this.R);
    }

    public int i() {
        return this.i;
    }

    public int u() {
        return this.u;
    }

    public int y() {
        return this.y;
    }

    public int N() {
        return this.N;
    }

    public static Optional<class04760> N(@Nullable String string) {
        if (string == null) {
            return Optional.empty();
        }
        try {
            Matcher matcher = M.matcher(string);
            if (matcher.matches()) {
                int n = Integer.parseInt(matcher.group(1));
                int n2 = Integer.parseInt(matcher.group(2));
                String string2 = matcher.group(3);
                int n3 = string2 == null ? 60 : Integer.parseInt(string2);
                String string3 = matcher.group(4);
                int n4 = string3 == null ? 24 : Integer.parseInt(string3);
                int n5 = n4 / 3;
                return Optional.of(new class04760(n, n2, n5, n5, n5, n3));
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return Optional.empty();
    }

    public int R() {
        return this.R;
    }
}

