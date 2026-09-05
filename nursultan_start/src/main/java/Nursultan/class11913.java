/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11105
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5596
 *  com.mojang.blaze3d.vertex.VertexFormatElement
 *  minecraft.class01391
 *  minecraft.class01422
 *  minecraft.class02579
 *  minecraft.class02583
 *  minecraft.class02609
 *  minecraft.class06830
 *  minecraft.class07311
 *  minecraft.class07331
 */
package Nursultan;

import Nursultan.class11105;
import Nursultan.class11904;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormatElement;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import minecraft.class01391;
import minecraft.class01422;
import minecraft.class02579;
import minecraft.class02583;
import minecraft.class02609;
import minecraft.class06830;
import minecraft.class07311;
import minecraft.class07331;

public class class11913
extends class01422 {
    private static String[] j;
    public Object N_0;
    public Object N_1;
    public static Object y_0;
    public static Object y_1;
    public static Object y_2;

    public void L() {
    }

    private static void M() {
        j = new String[3];
        class11913.j[0] = "glint";
        class11913.j[1] = "Sampler0";
        class11913.j[2] = "Sampler0";
    }

    private float M(int n) {
        return ((float)n / 16.0f + 0.5f) / 16.0f;
    }

    public class11913() {
        super(new class02579(256), new LinkedHashMap());
        this.i();
        this.N_0 = new LinkedHashMap();
        this.N_1 = new ArrayList();
    }

    static {
        class11913.M();
        class11913.z();
        y_1 = class11913.N(0.2f, 1.0f, -0.7f);
        y_2 = class11913.N(-0.2f, 1.0f, 0.7f);
    }

    private void i() {
    }

    private static void z() {
        y_0 = j[2];
    }

    public void u() {
    }

    private int y(ByteBuffer byteBuffer, int n) {
        int n2 = byteBuffer.get(n) & 0xFF;
        int n3 = byteBuffer.get(n + 1) & 0xFF;
        int n4 = byteBuffer.get(n + 2) & 0xFF;
        return (byteBuffer.get(n + 3) & 0xFF) << 24 | n2 << 16 | n3 << 8 | n4;
    }

    private GpuTextureView y(class07311 class073112) {
        Map var3 = ((class11105)class073112).nursultan$getRenderSetup().N();
        class06830 class068302 = (class06830)var3.get(j[1]);
        if (class068302 == null) {
            class068302 = var3.values().stream().findFirst().orElse(null);
        }
        return class068302 == null ? null : class068302.N();
    }

    public List<class11904> y() {
        this.i();
        ArrayList<class11904> arrayList = new ArrayList<class11904>(((Map)this.N_0).size());
        ((Map)this.N_0).forEach((class073112, class073312) -> {
            class11904 class119042 = this.N((class07311)class073112, class073312.N());
            if (class119042 != null) {
                arrayList.add(class119042);
            }
        });
        return arrayList;
    }

    public void N(class07311 class073112) {
    }

    private int[] N(VertexFormat.class_5596 class_55962, int n) {
        if (class_55962 == VertexFormat.class_5596.field_27382) {
            int n2 = n / 4;
            int[] nArray = new int[n2 * 6];
            for (int i = 0; i < n2; ++i) {
                int n3 = i * 4;
                int n4 = i * 6;
                nArray[n4] = n3;
                nArray[n4 + 1] = n3 + 1;
                nArray[n4 + 2] = n3 + 2;
                nArray[n4 + 3] = n3 + 2;
                nArray[n4 + 4] = n3 + 3;
                nArray[n4 + 5] = n3;
            }
            return nArray;
        }
        if (class_55962 == VertexFormat.class_5596.field_27379) {
            int[] nArray = new int[n];
            for (int i = 0; i < n; ++i) {
                nArray[i] = i;
            }
            return nArray;
        }
        return null;
    }

    private float N(ByteBuffer byteBuffer, int n) {
        float f = (float)byteBuffer.get(n) / 127.0f;
        float f2 = (float)byteBuffer.get(n + 1) / 127.0f;
        float f3 = (float)byteBuffer.get(n + 2) / 127.0f;
        float f4 = Math.max(0.0f, ((float[])y_1)[0] * f + ((float[])y_1)[1] * f2 + ((float[])y_1)[2] * f3);
        float f5 = Math.max(0.0f, ((float[])y_2)[0] * f + ((float[])y_2)[1] * f2 + ((float[])y_2)[2] * f3);
        return Math.min(1.0f, (f4 + f5) * 0.6f + 0.4f);
    }

    public void N() {
        this.i();
        ((Map)this.N_0).clear();
        ((List)this.N_1).forEach(class02579::close);
        ((List)this.N_1).clear();
    }

    private static float[] N(float f, float f2, float f3) {
        float f4 = (float)Math.sqrt(f * f + f2 * f2 + f3 * f3);
        return new float[]{f / f4, f2 / f4, f3 / f4};
    }

    private int N(int n, float f) {
        int n2 = n >>> 24;
        int n3 = (int)((float)(n >> 16 & 0xFF) * f);
        int n4 = (int)((float)(n >> 8 & 0xFF) * f);
        int n5 = (int)((float)(n & 0xFF) * f);
        return n2 << 24 | n3 << 16 | n4 << 8 | n5;
    }

    private class11904 N(class07311 class073112, class02609 class026092) {
        if (class026092 == null) {
            return null;
        }
        if (class073112.field_64011.contains(j[0])) {
            class026092.close();
            return null;
        }
        try (class02609 class026093 = class026092;){
            GpuTextureView gpuTextureView = this.y(class073112);
            if (gpuTextureView == null) {
                class11904 class119042 = null;
                return class119042;
            }
            class02583 class025832 = class026092.L();
            VertexFormat vertexFormat = class025832.N();
            if (!vertexFormat.contains(VertexFormatElement.POSITION) || !vertexFormat.contains(VertexFormatElement.UV0)) {
                class11904 class119043 = null;
                return class119043;
            }
            int[] nArray = this.N(class025832.u(), class025832.y());
            if (nArray == null) {
                class11904 class119044 = null;
                return class119044;
            }
            int n = vertexFormat.getVertexSize();
            int n2 = vertexFormat.getOffset(VertexFormatElement.POSITION);
            int n3 = vertexFormat.getOffset(VertexFormatElement.UV0);
            int n4 = vertexFormat.contains(VertexFormatElement.COLOR) ? vertexFormat.getOffset(VertexFormatElement.COLOR) : -1;
            int n5 = vertexFormat.contains(VertexFormatElement.UV2) ? vertexFormat.getOffset(VertexFormatElement.UV2) : -1;
            int n6 = vertexFormat.contains(VertexFormatElement.NORMAL) ? vertexFormat.getOffset(VertexFormatElement.NORMAL) : -1;
            ByteBuffer byteBuffer = class026092.N().duplicate().order(ByteOrder.nativeOrder());
            int n7 = class025832.y();
            float[] fArray = new float[n7 * 3];
            float[] fArray2 = new float[n7 * 2];
            int[] nArray2 = new int[n7];
            float[] fArray3 = new float[n7 * 2];
            float[] fArray4 = new float[n7 * 3];
            for (int i = 0; i < n7; ++i) {
                int n8;
                int n9 = i * n;
                fArray[i * 3] = byteBuffer.getFloat(n9 + n2);
                fArray[i * 3 + 1] = byteBuffer.getFloat(n9 + n2 + 4);
                fArray[i * 3 + 2] = byteBuffer.getFloat(n9 + n2 + 8);
                fArray2[i * 2] = byteBuffer.getFloat(n9 + n3);
                fArray2[i * 2 + 1] = byteBuffer.getFloat(n9 + n3 + 4);
                fArray3[i * 2] = this.M(n5 < 0 ? 240 : (int)byteBuffer.getShort(n9 + n5));
                fArray3[i * 2 + 1] = this.M(n5 < 0 ? 240 : (int)byteBuffer.getShort(n9 + n5 + 2));
                int n10 = n8 = n4 < 0 ? -1 : this.y(byteBuffer, n9 + n4);
                if (n6 >= 0) {
                    fArray4[i * 3] = (float)byteBuffer.get(n9 + n6) / 127.0f;
                    fArray4[i * 3 + 1] = (float)byteBuffer.get(n9 + n6 + 1) / 127.0f;
                    fArray4[i * 3 + 2] = (float)byteBuffer.get(n9 + n6 + 2) / 127.0f;
                    n8 = this.N(n8, this.N(byteBuffer, n9 + n6));
                } else {
                    fArray4[i * 3 + 2] = 1.0f;
                }
                nArray2[i] = n8;
            }
            class11904 class119045 = new class11904(gpuTextureView, fArray, fArray2, nArray2, fArray3, fArray4, nArray);
            return class119045;
        }
    }

    public class01391 method_73477(class07311 class073113) {
        this.i();
        return (class01391)((Map)this.N_0).computeIfAbsent(class073113, class073112 -> {
            this.i();
            class02579 class025792 = new class02579(class073112.method_22722());
            ((List)this.N_1).add(class025792);
            return new class07331(class025792, class073112.method_23033(), class073112.method_23031());
        });
    }
}

