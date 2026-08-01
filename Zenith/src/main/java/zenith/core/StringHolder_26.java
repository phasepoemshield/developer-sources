package zenith;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.Locale;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public class StringHolder_26 {
   private static final String IlIllII1I1I1l1lI111IIlI = "/assets/zenith/models/particles/6d9e3f4a.dat";
   private static final String lllIl11lllllllIl1l1Il111lIIl = "/assets/zenith/models/rotation_model_v2.json";
   private static final String II1111lII1llllIl111Il1111 = "6d9e3f4a.dat";
   private static final String lIlll1lIIIlI11lI1IlllllIlII = "rotation_model_v2.json";
   private static final byte[] lII111IlIl1l1l = new byte[]{90, 68, 76, 77, 2};
   private static final int I1l1lII1ll11II1lll11l1l1I = 16;
   private static final int l1I1l11llIIlIIl111l1lllI1I = 12;
   private static final int lIl1I1Il11llIl1 = 256;
   private static final int I1lIlI1lI11I1lIIII = 128;
   private static final int lIl11l1I1lllI1I1l = 73000;
   private static final SecureRandom II1I1IIlII = new SecureRandom();
   private static final String IlIlIIIIIl1ll111 = "fc_";
   private static final int IllIIll11lIIll1lIl111 = 28;
   private static final int Il1l11I1I1Il1lIl1lI1l = 3;
   private static final int II1I11I1l111 = 1000;
   private static final int lI11I1llllIIlIll = 15;
   private static final float lI1111IlIIllllI1I1llIl1 = 0.0F;
   private static final String[] II1Illl11l1I1lIlIIIIllI1IIllI = new String[]{
      "run/rotation_recordings/rotation_dataset_v2.csv",
      "run/rotation_recordings/rotation_dataset.csv",
      "rotation_recordings/rotation_dataset_v2.csv",
      "rotation_recordings/rotation_dataset.csv",
      "scripts/rotation_recordings/rotation_dataset_v2.csv",
      "scripts/rotation_recordings/rotation_dataset.csv",
      "rotation_dataset.csv",
      "C:\\source\\ZenithDLC\\run\\rotation_recordings\\rotation_dataset_v2.csv",
      "C:\\source\\ZenithDLC\\run\\rotation_recordings\\rotation_dataset.csv"
   };
   private static final String[] llI1II11l11lllIl1 = new String[]{"target_Diffyaw_step", "target_diff_yaw_step", "target_yaw_step"};
   private static final String[] lI1llIl1lI1Il11lll11ll1I11l1 = new String[]{"target_Diffpitch_step", "target_diff_pitch_step", "target_pitch_step"};
   private boolean II1l11I11I1IIlIlII11l11l = false;
   private lI1llIl1lllIl111Il11l$Event I11l111111;
   private int l111Illlll11I1IIIl = 24;
   private final Deque<float[]> IIlll1lIII1l1II = new ArrayDeque<>();
   private final Deque<float[]> lIlIl11l1lll1l1I1l1l1ll1IlI1 = new ArrayDeque<>();
   private final Random llll1lIIIIIl11II11l1lI11lIl1 = new Random();
   private int IlllIlI1I111IIIlI1I1llI1l = -1;
   private int lI1IlIII1lIl1lIIIlll1Ill = -1;
   private int lll1lI111I1lII1I1I1lllI1 = -1;

   private boolean III1I1III11II11llllIlII() {
      return ZenithClient.getInstance().ListHolder_7().getUsername().equals("developer");
   }

   private void EventImpl_27(String s) {
      if (this.III1I1III11II11llllIlII()) {
         TextHolder.EventImpl_27(s);
      }
   }

   private void ZenithInternal125(String s) {
      if (this.III1I1III11II11llllIlII()) {
         System.out.println(s);
      }
   }

   private void ZenithInternal062(String s) {
      if (this.III1I1III11II11llllIlII()) {
         System.err.println(s);
      }
   }

   private void EventTarget(Exception exception) {
      if (this.III1I1III11II11llllIlII()) {
         exception.printStackTrace();
      }
   }

   public void l1I11III1lllIII1l() {
      try {
         for (File file1 : this.I1I111ll()) {
            if (this.EventBus(file1)) {
               this.EventImpl_27(file1.getAbsolutePath());
               return;
            }
         }

         if (this.ZenithInternal111(IlIllII1I1I1l1lI111IIlI) || this.ZenithInternal111(lllIl11lllllllIl1l1Il111lIIl)) {
            return;
         }

         this.ZenithInternal062("[DeepLearning] No model found. Checked scripts/rotation_recordings, rotation_recordings, run and resources.");
      } catch (Exception exception) {
         this.ZenithInternal062("[DeepLearning] Failed to load model: " + exception.getMessage());
         this.EventTarget(exception);
      }
   }

   private File[] I1I111ll() {
      return new File[]{
         new File("scripts/rotation_recordings/6d9e3f4a.dat"),
         new File("rotation_recordings/6d9e3f4a.dat"),
         new File("run/rotation_recordings/6d9e3f4a.dat"),
         new File("run/6d9e3f4a.dat"),
         new File("6d9e3f4a.dat"),
         new File("C:\\source\\ZenithDLC\\scripts\\rotation_recordings\\6d9e3f4a.dat"),
         new File("scripts/rotation_recordings/rotation_model_v2.json"),
         new File("rotation_recordings/rotation_model_v2.json"),
         new File("run/rotation_recordings/rotation_model_v2.json"),
         new File("run/rotation_model_v2.json"),
         new File("rotation_model_v2.json"),
         new File("C:\\source\\ZenithDLC\\scripts\\rotation_recordings\\rotation_model_v2.json")
      };
   }

   private boolean EventBus(File file1) throws IOException {
      if (file1 != null && file1.exists() && file1.isFile()) {
         this.EventTarget(file1);
         return true;
      } else {
         return false;
      }
   }

   private boolean ZenithInternal111(String s) throws IOException {
      URL url = this.getClass().getResource(s);
      if (url == null) {
         return false;
      } else {
         boolean flag;
         try (InputStream inputstream = url.openStream()) {
            this.ZenithInternal125("[DeepLearning] Loading model from resource: " + s);
            this.StringHolder_8(inputstream, this.EventTarget(url));
            flag = true;
         }

         return flag;
      }
   }

   public void ZenithInternal095(InputStream inputstream) throws IOException {
      this.StringHolder_8(inputstream, null);
   }

   public void EventTarget(File file1) throws IOException {
      if (file1 != null && file1.exists() && file1.isFile()) {
         try (FileInputStream fileinputstream = new FileInputStream(file1)) {
            this.ZenithInternal125("[DeepLearning] Loading model from: " + file1.getPath());
            this.StringHolder_8(fileinputstream, file1);
         }
      } else {
         throw new IOException("Model file not found");
      }
   }

   private void StringHolder_8(InputStream inputstream, File file1) throws IOException {
      byte[] abyte = inputstream.readAllBytes();
      boolean flag = this.ZenithInternal061(abyte);
      String s = this.ZenithInternal084(abyte);
      this.ZenithInternal055(s);
      if (!flag) {
         this.StringHolder_8(file1, abyte);
      }
   }

   private void ZenithInternal055(String s) {
      Gson gson = new Gson();
      JsonObject jsonobject = (JsonObject)gson.fromJson(s, JsonObject.class);
      this.I11l111111 = this.byteHolder(jsonobject);
      this.II1l11I11I1IIlIlII11l11l = true;
      this.IIlIIllIIlIIlIIIl();
      this.ZenithInternal125(
         "[DeepLearning] Model loaded successfully (direct GRU MoE"
            + (this.I11l111111.IllI1I11I1l ? ", split heads" : "")
            + (this.I11l111111.II1IIlIlIllIl1lI1 ? ", two-head" : "")
            + ")"
      );
      this.ZenithInternal125("[DeepLearning] Input size: " + this.I11l111111.lIl1lllI1l1I1IllI1);
      this.ZenithInternal125("[DeepLearning] Sequence length: " + this.l111Illlll11I1IIIl);
      this.ZenithInternal125("[DeepLearning] Hidden size: " + this.I11l111111.ll1lI11lll1Il11II1Ill1I111I);
      this.ZenithInternal125("[DeepLearning] FC size: " + this.I11l111111.IllIll1IIII11l1I1Il11lII1l1lIl);
      this.ZenithInternal125("[DeepLearning] Output size: " + this.I11l111111.IIIlIIIl1lII1IIIIII1ll1IIIl);
      this.ZenithInternal125(
         "[DeepLearning] MoE experts: " + this.I11l111111.l1II1llI1IlIIlIIlI11l1 + " (fixed idle: " + this.I11l111111.Il1I1IlIllIllI1lIlIl1l1llIIIIl + ")"
      );
      this.ZenithInternal125("[DeepLearning] Norm type: " + this.I11l111111.lI1l1lIl1I1111l1llIl1);
      this.l1l1IIIIlI11llI();
   }

   private String ZenithInternal084(byte[] abyte) throws IOException {
      if (this.ZenithInternal061(abyte)) {
         return this.FinishThread(abyte);
      } else {
         String s = new String(abyte, StandardCharsets.UTF_8);
         if (!this.BlockHolder(s)) {
            throw new IOException("Unsupported model payload format");
         } else {
            return s;
         }
      }
   }

   private void StringHolder_8(File file1, byte[] abyte) throws IOException {
      if (file1 != null && file1.exists() && file1.isFile() && file1.canWrite()) {
         byte[] abyte1 = this.ZenithInternal064(this.StringHolder_19(abyte));
         Files.write(file1.toPath(), abyte1);
         this.ZenithInternal125("[DeepLearning] Plain model encrypted in-place: " + file1.getPath());
      }
   }

   private byte[] StringHolder_19(byte[] abyte) throws IOException {
      String s = new String(abyte, StandardCharsets.UTF_8);

      try {
         JsonObject jsonobject = (JsonObject)new Gson().fromJson(s, JsonObject.class);
         if (jsonobject != null && jsonobject.has("config") && jsonobject.get("config").isJsonObject()) {
            JsonObject jsonobject1 = jsonobject.getAsJsonObject("config");
            if (jsonobject1.has("feature_columns") && jsonobject1.get("feature_columns").isJsonArray()) {
               JsonArray jsonarray = jsonobject1.getAsJsonArray("feature_columns");
               JsonArray jsonarray1 = new JsonArray();

               for (int i = 0; i < jsonarray.size(); i++) {
                  String s1 = jsonarray.get(i).getAsString();
                  jsonarray1.add(this.GetSlotIdHandler(s1) ? s1 : this.EventImpl_25(s1));
               }

               jsonobject1.add("feature_columns", jsonarray1);
               return jsonobject.toString().getBytes(StandardCharsets.UTF_8);
            } else {
               return abyte;
            }
         } else {
            return abyte;
         }
      } catch (RuntimeException runtimeexception) {
         throw new IOException("Failed to obfuscate model feature names", runtimeexception);
      }
   }

   private boolean ZenithInternal061(byte[] abyte) {
      if (abyte != null && abyte.length > lII111IlIl1l1l.length + 16 + 12) {
         for (int i = 0; i < lII111IlIl1l1l.length; i++) {
            if (abyte[i] != lII111IlIl1l1l[i]) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private String FinishThread(byte[] abyte) throws IOException {
      try {
         int i = lII111IlIl1l1l.length;
         byte[] abyte1 = Arrays.copyOfRange(abyte, i, i + 16);
         i += 16;
         byte[] abyte2 = Arrays.copyOfRange(abyte, i, i + 12);
         i += 12;
         byte[] abyte3 = Arrays.copyOfRange(abyte, i, abyte.length);
         Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
         cipher.init(2, this.ZenithInternal021(abyte1), new GCMParameterSpec(128, abyte2));
         return new String(cipher.doFinal(abyte3), StandardCharsets.UTF_8);
      } catch (IllegalArgumentException | GeneralSecurityException generalsecurityexception) {
         throw new IOException("Failed to decrypt model payload", generalsecurityexception);
      }
   }

   private byte[] ZenithInternal064(byte[] abyte) throws IOException {
      try {
         byte[] abyte1 = new byte[16];
         byte[] abyte2 = new byte[12];
         II1I1IIlII.nextBytes(abyte1);
         II1I1IIlII.nextBytes(abyte2);
         Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
         cipher.init(1, this.ZenithInternal021(abyte1), new GCMParameterSpec(128, abyte2));
         byte[] abyte3 = cipher.doFinal(abyte);
         ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(lII111IlIl1l1l.length + abyte1.length + abyte2.length + abyte3.length);
         bytearrayoutputstream.write(lII111IlIl1l1l);
         bytearrayoutputstream.write(abyte1);
         bytearrayoutputstream.write(abyte2);
         bytearrayoutputstream.write(abyte3);
         return bytearrayoutputstream.toByteArray();
      } catch (GeneralSecurityException generalsecurityexception) {
         throw new IOException("Failed to encrypt model payload", generalsecurityexception);
      }
   }

   private SecretKeySpec ZenithInternal021(byte[] abyte) throws GeneralSecurityException {
      char[] achar = this.lIIlIllIIll1();

      SecretKeySpec secretkeyspec;
      try {
         PBEKeySpec pbekeyspec = new PBEKeySpec(achar, abyte, 73000, 256);
         byte[] abyte1 = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256").generateSecret(pbekeyspec).getEncoded();
         secretkeyspec = new SecretKeySpec(abyte1, "AES");
      } finally {
         Arrays.fill(achar, '\u0000');
      }

      return secretkeyspec;
   }

   private char[] lIIlIllIIll1() {
      int[] aint = new int[]{
         23,
         15,
         233,
         205,
         181,
         182,
         191,
         340,
         374,
         360,
         285,
         483,
         477,
         423,
         407,
         617,
         626,
         596,
         634,
         514,
         675,
         660,
         678,
         647,
         865,
         839,
         851,
         881,
         783,
         1015,
         966,
         956,
         921,
         1072,
         1045,
         1140,
         1107,
         1096
      };
      char[] achar = new char[aint.length];

      for (int i = 0; i < aint.length; i++) {
         achar[i] = (char)(aint[i] ^ 77 + i * 29);
      }

      return achar;
   }

   private String EventImpl_25(String s) {
      return "fc_" + Long.toUnsignedString(this.EventImpl_32(s), 16);
   }

   private long EventImpl_32(String s) {
      String s1 = this.ZenithInternal127(s);

      try {
         MessageDigest messagedigest = MessageDigest.getInstance("SHA-256");
         char[] achar = this.lIIlIllIIll1();

         try {
            for (char c0 : achar) {
               messagedigest.update((byte)(c0 >>> '\b'));
               messagedigest.update((byte)c0);
            }
         } finally {
            Arrays.fill(achar, '\u0000');
         }

         byte[] abyte = s1.getBytes(StandardCharsets.UTF_8);
         messagedigest.update((byte)124);
         messagedigest.update(abyte);
         byte[] abyte1 = messagedigest.digest();
         long j = 0L;

         for (int i = 0; i < 8; i++) {
            j = j << 8 | (long)abyte1[i] & 255L;
         }

         return j;
      } catch (GeneralSecurityException generalsecurityexception) {
         throw new IllegalStateException("Failed to hash model feature name", generalsecurityexception);
      }
   }

   private boolean GetSlotIdHandler(String s) {
      if (s != null && s.startsWith("fc_") && s.length() > "fc_".length()) {
         for (int i = "fc_".length(); i < s.length(); i++) {
            char c0 = s.charAt(i);
            boolean flag = c0 >= '0' && c0 <= '9' || c0 >= 'a' && c0 <= 'f' || c0 >= 'A' && c0 <= 'F';
            if (!flag) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean BlockHolder(String s) {
      if (s == null) {
         return false;
      } else {
         for (int i = 0; i < s.length(); i++) {
            char c0 = s.charAt(i);
            if (c0 != '\ufeff' && !Character.isWhitespace(c0)) {
               return c0 == '{';
            }
         }

         return false;
      }
   }

   private File EventTarget(URL url) {
      if (url != null && "file".equalsIgnoreCase(url.getProtocol())) {
         try {
            return new File(url.toURI());
         } catch (Exception exception) {
            return null;
         }
      } else {
         return null;
      }
   }

   private static String EventImpl_24(String... astring) {
      StringBuilder stringbuilder = new StringBuilder();

      for (String s : astring) {
         stringbuilder.append('/').append(s);
      }

      return stringbuilder.toString();
   }

   public void IIlIIllIIlIIlIIIl() {
      this.IIlll1lIII1l1II.clear();
      this.IIlI11l1lll1l1II1();
   }

   public void IlIl11llIl1l11l111IIlllllI() {
      this.lIlIl11l1lll1l1I1l1l1ll1IlI1.clear();
      this.IIlI11l1lll1l1II1();
   }

   private void IIlI11l1lll1l1II1() {
      this.IlllIlI1I111IIIlI1I1llI1l = -1;
      this.lI1IlIII1lIl1lIIIlll1Ill = -1;
      this.lll1lI111I1lII1I1I1lllI1 = -1;
   }

   public float[] StringHolder_8(float[] afloat) {
      floatHolder$Helper_4 li1llil1lllil111il11l$i1liiii1iii1lilil1l = this.EventBus(afloat);
      return li1llil1lllil111il11l$i1liiii1iii1lilil1l == null ? null : li1llil1lllil111il11l$i1liiii1iii1lilil1l.l1l111I11I1I();
   }

   public int IIl1Ill1lIII1I11lIl1l1IIIl() {
      return this.I11l111111 == null ? -1 : this.I11l111111.lIl1lllI1l1I1IllI1;
   }

   public floatHolder$Helper_4 EventBus(float[] afloat) {
      if (this.II1l11I11I1IIlIlII11l11l && this.I11l111111 != null && afloat != null) {
         if (afloat.length != this.I11l111111.lIl1lllI1l1I1IllI1) {
            this.ZenithInternal062("[DeepLearning] Invalid feature count: " + afloat.length + ", expected " + this.I11l111111.lIl1lllI1l1I1IllI1);
            return null;
         } else {
            this.IIlll1lIII1l1II.addLast((float[])afloat.clone());

            while (this.IIlll1lIII1l1II.size() > this.l111Illlll11I1IIIl) {
               this.IIlll1lIII1l1II.removeFirst();
            }

            return this.IIlll1lIII1l1II.size() < this.l111Illlll11I1IIIl ? null : this.EventBus(this.Il11lII1II1I());
         }
      } else {
         return null;
      }
   }

   public float[] EventTarget(float[] afloat) {
      if (this.II1l11I11I1IIlIlII11l11l && this.I11l111111 != null) {
         if (afloat != null) {
            if (afloat.length != this.I11l111111.lIl1lllI1l1I1IllI1) {
               return null;
            }

            this.IIlll1lIII1l1II.addLast((float[])afloat.clone());

            while (this.IIlll1lIII1l1II.size() > this.l111Illlll11I1IIIl) {
               this.IIlll1lIII1l1II.removeFirst();
            }
         }

         return this.IIlll1lIII1l1II.size() < this.l111Illlll11I1IIIl ? null : this.EventBus(this.Il11lII1II1I()).l1l111I11I1I();
      } else {
         return null;
      }
   }

   public float[] ZenithInternal095(float[] afloat) {
      if (this.II1l11I11I1IIlIlII11l11l && this.I11l111111 != null) {
         if (afloat != null) {
            if (afloat.length != this.I11l111111.lIl1lllI1l1I1IllI1) {
               return null;
            }

            this.lIlIl11l1lll1l1I1l1l1ll1IlI1.addLast((float[])afloat.clone());

            while (this.lIlIl11l1lll1l1I1l1l1ll1IlI1.size() > this.l111Illlll11I1IIIl) {
               this.lIlIl11l1lll1l1I1l1l1ll1IlI1.removeFirst();
            }
         }

         if (this.lIlIl11l1lll1l1I1l1l1ll1IlI1.size() < this.l111Illlll11I1IIIl) {
            return null;
         } else {
            float[][] afloat1 = new float[this.l111Illlll11I1IIIl][this.I11l111111.lIl1lllI1l1I1IllI1];
            int i = 0;

            for (float[] afloat2 : this.lIlIl11l1lll1l1I1l1l1ll1IlI1) {
               afloat1[i++] = afloat2;
            }

            return this.EventBus(afloat1).l1l111I11I1I();
         }
      } else {
         return null;
      }
   }

   private float[][] Il11lII1II1I() {
      float[][] afloat = new float[this.l111Illlll11I1IIIl][this.I11l111111.lIl1lllI1l1I1IllI1];
      int i = 0;

      for (float[] afloat1 : this.IIlll1lIII1l1II) {
         afloat[i++] = afloat1;
      }

      return afloat;
   }

   private float[] StringHolder_8(float[][] afloat) {
      return this.EventBus(afloat).l1l111I11I1I();
   }

   private floatHolder$Helper_4 EventBus(float[][] afloat) {
      float[][] afloat1 = new float[this.l111Illlll11I1IIIl][this.I11l111111.llllI111ll1Il1I11ll111l1l1];

      for (int i = 0; i < this.l111Illlll11I1IIIl; i++) {
         float[] afloat2 = this.StringHolder_8(afloat[i], this.I11l111111.l1II1IIIl1I11);
         float[] afloat3 = this.StringHolder_8(afloat2, this.I11l111111.l11IllIlI1II1lllI11l11, this.I11l111111.IlI1l111l1IIlII1II1);
         afloat3 = this.StringHolder_8(afloat3, this.I11l111111.I1llI1lIlI1Ill11I);
         afloat1[i] = this.EventImpl_24(afloat3);
      }

      float[] afloat6 = this.EventTarget(afloat1);
      float[] afloat7 = this.Event(
         this.StringHolder_8(afloat6, this.I11l111111.I111llIIlIllI11I1IlI1111IIl, this.I11l111111.l1l1Il1l1lII1II111Ill)
      );
      float[] afloat8 = this.Event(
         this.StringHolder_8(afloat7, this.I11l111111.lll11l111111IllI1lllI1Illl, this.I11l111111.lIl1III1llI1l1l1IlIlll)
      );
      if (this.I11l111111.IllI1I11I1l) {
         floatHolder$Helper_5 li1llil1lllil111il11l$ii1il11l111ii11iilx = this.StringHolder_8(
            afloat8,
            this.I11l111111.II11l11ll111II1Il11II1IlIII1l,
            this.I11l111111.I1I1llI11llI11I1lI,
            this.I11l111111.ll1Il11ll1l11l1lIl,
            this.I11l111111.llIllI1I1Il1IlIl1I1I1I1lIlI,
            this.IlllIlI1I111IIIlI1I1llI1l
         );
         floatHolder$Helper_5 li1llil1lllil111il11l$ii1il11l111ii11iilx = this.StringHolder_8(
            afloat8,
            this.I11l111111.l1lll11111I1l,
            this.I11l111111.I1Il1I11IlI11,
            this.I11l111111.Il1IIl111IIll1III,
            this.I11l111111.lII11I1I1lI111l1I1l1lII,
            this.lI1IlIII1lIl1lIIIlll1Ill
         );
         if (li1llil1lllil111il11l$ii1il11l111ii11iilx.lI1l1I1IIII && li1llil1lllil111il11l$ii1il11l111ii11iilx.lI1l1I1IIII) {
            this.IlllIlI1I111IIIlI1I1llI1l = li1llil1lllil111il11l$ii1il11l111ii11iilx.lIII1Il1lll1IlI1I1lI;
            this.lI1IlIII1lIl1lIIIlll1Ill = li1llil1lllil111il11l$ii1il11l111ii11iilx.lIII1Il1lll1IlI1I1lI;
            float f1 = this.I11l111111.II1IIlIlIllIl1lI1
               ? this.ZenithInternal042(this.StringHolder_8(afloat8, this.I11l111111.lI1II11lIl11IlI1Ill1I1III, this.I11l111111.Il1Il11I1I1lllIlII1IlI)[0])
               : 1.0F;
            float f2 = this.I11l111111.II1IIlIlIllIl1lI1
               ? this.ZenithInternal042(this.StringHolder_8(afloat8, this.I11l111111.I111Il11llI1lI, this.I11l111111.l1I1lllll1I1lI11l1I)[0])
               : 1.0F;
            float f3 = li1llil1lllil111il11l$ii1il11l111ii11iilx.Il1lIl111lIlll1Illll * f1;
            float f4 = li1llil1lllil111il11l$ii1il11l111ii11iilx.Il1lIl111lIlll1Illll * f2;
            return this.isFinite(f3) && this.isFinite(f4) && this.isFinite(f1) && this.isFinite(f2)
               ? new floatHolder$Helper_4(
                  f3,
                  f4,
                  f1,
                  f2,
                  li1llil1lllil111il11l$ii1il11l111ii11iilx.Il1lIl111lIlll1Illll,
                  li1llil1lllil111il11l$ii1il11l111ii11iilx.Il1lIl111lIlll1Illll,
                  li1llil1lllil111il11l$ii1il11l111ii11iilx.lI11lll1ll11I,
                  li1llil1lllil111il11l$ii1il11l111ii11iilx.lI11lll1ll11I,
                  li1llil1lllil111il11l$ii1il11l111ii11iilx.lIII1Il1lll1IlI1I1lI,
                  li1llil1lllil111il11l$ii1il11l111ii11iilx.lIII1Il1lll1IlI1I1lI
               )
               : this.lIlll11l11l1l11lll111I1IllI();
         } else {
            return this.lIlll11l11l1l11lll111I1IllI();
         }
      } else {
         float[] afloat4 = this.StringHolder_8(afloat8, this.I11l111111.Il1llllll1, this.I11l111111.I11l1llIllll1lI1lll1II1I);
         if (afloat4.length != this.I11l111111.l1II1llI1IlIIlIIlI11l1) {
            return this.lIlll11l11l1l11lll111I1IllI();
         } else {
            for (float f : afloat4) {
               if (!this.isFinite(f)) {
                  return this.lIlll11l11l1l11lll111I1IllI();
               }
            }

            float[] afloat9 = this.StringHolder_8(afloat8, this.I11l111111.llll111llll, this.I11l111111.I1ll1lllI11l1l1I1l1);
            int l = (this.I11l111111.Il1I1IlIllIllI1lIlIl1l1llIIIIl ? this.I11l111111.l1II1llI1IlIIlIIlI11l1 - 1 : this.I11l111111.l1II1llI1IlIIlIIlI11l1) * 2;
            if (afloat9.length != l) {
               return this.lIlll11l11l1l11lll111I1IllI();
            } else {
               float[][] afloat10 = new float[this.I11l111111.l1II1llI1IlIIlIIlI11l1][2];
               int i1 = 0;
               if (this.I11l111111.Il1I1IlIllIllI1lIlIl1l1llIIIIl) {
                  afloat10[0][0] = 0.0F;
                  afloat10[0][1] = 0.0F;

                  for (int j = 1; j < this.I11l111111.l1II1llI1IlIIlIIlI11l1; j++) {
                     afloat10[j][0] = afloat9[i1++];
                     afloat10[j][1] = afloat9[i1++];
                  }
               } else {
                  for (int j1 = 0; j1 < this.I11l111111.l1II1llI1IlIIlIIlI11l1; j1++) {
                     afloat10[j1][0] = afloat9[i1++];
                     afloat10[j1][1] = afloat9[i1++];
                  }
               }

               float[] afloat11 = this.EventImpl_21(afloat4);
               int k = this.StringHolder_8(afloat4, this.lll1lI111I1lII1I1I1lllI1);
               if (k >= 0 && k < afloat10.length) {
                  this.lll1lI111I1lII1I1I1lllI1 = k;
                  float[] afloat5 = this.StringHolder_8(afloat10, afloat11, k, this.EventBus(afloat4, k));
                  return afloat5.length == 2 && this.isFinite(afloat5[0]) && this.isFinite(afloat5[1])
                     ? new floatHolder$Helper_4(
                        afloat5[0], afloat5[1], 1.0F, 1.0F, afloat5[0], afloat5[1], afloat11, (float[])afloat11.clone(), k, k
                     )
                     : this.lIlll11l11l1l11lll111I1IllI();
               } else {
                  return this.lIlll11l11l1l11lll111I1IllI();
               }
            }
         }
      }
   }

   private floatHolder$Helper_5 StringHolder_8(
      float[] afloat, float[][] afloat1, float[] afloat2, float[][] afloat3, float[] afloat4, int i
   ) {
      float[] afloat5 = this.StringHolder_8(afloat, afloat1, afloat2);
      if (afloat5.length != this.I11l111111.l1II1llI1IlIIlIIlI11l1) {
         return floatHolder$Helper_5.ZenithInternal044(this.I11l111111.l1II1llI1IlIIlIIlI11l1);
      } else {
         float[] afloat6 = this.StringHolder_8(afloat, afloat3, afloat4);
         int j = this.I11l111111.Il1I1IlIllIllI1lIlIl1l1llIIIIl ? this.I11l111111.l1II1llI1IlIIlIIlI11l1 - 1 : this.I11l111111.l1II1llI1IlIIlIIlI11l1;
         if (afloat6.length != j) {
            return floatHolder$Helper_5.ZenithInternal044(this.I11l111111.l1II1llI1IlIIlIIlI11l1);
         } else {
            float[] afloat7 = new float[this.I11l111111.l1II1llI1IlIIlIIlI11l1];
            if (this.I11l111111.Il1I1IlIllIllI1lIlIl1l1llIIIIl) {
               afloat7[0] = 0.0F;

               for (int k = 1; k < this.I11l111111.l1II1llI1IlIIlIIlI11l1; k++) {
                  afloat7[k] = afloat6[k - 1];
               }
            } else {
               System.arraycopy(afloat6, 0, afloat7, 0, this.I11l111111.l1II1llI1IlIIlIIlI11l1);
            }

            float[] afloat8 = this.EventImpl_21(afloat5);
            int l = this.StringHolder_8(afloat5, i);
            if (l >= 0 && l < afloat7.length) {
               float f = this.StringHolder_8(afloat7, afloat8, l, this.EventBus(afloat5, l));
               return new floatHolder$Helper_5(f, afloat8, l, this.isFinite(f));
            } else {
               return floatHolder$Helper_5.ZenithInternal044(this.I11l111111.l1II1llI1IlIIlIIlI11l1);
            }
         }
      }
   }

   private float[] StringHolder_8(float[] afloat, lI1llIl1lllIl111Il11l$EventTarget li1llil1lllil111il11l$illi1l1l1) {
      float[] afloat1 = new float[afloat.length];

      for (int i = 0; i < afloat.length; i++) {
         float f = li1llil1lllil111il11l$illi1l1l1.l1IlIl1lllllllI1l1[i];
         if (Math.abs(f) < 1.0E-6F) {
            f = 1.0F;
         }

         afloat1[i] = (afloat[i] - li1llil1lllil111il11l$illi1l1l1.lIllll1IlllI1ll1ll[i]) / f;
      }

      return afloat1;
   }

   private float[] StringHolder_8(float[] afloat, ZenithInternal108$Helper li1llil1lllil111il11l$l1iil11li) {
      float f = 0.0F;

      for (float f1 : afloat) {
         f += f1;
      }

      f /= (float)afloat.length;
      float f4 = 0.0F;

      for (float f2 : afloat) {
         float f3 = f2 - f;
         f4 += f3 * f3;
      }

      f4 /= (float)afloat.length;
      float f5 = (float)(1.0 / Math.sqrt((double)f4 + 1.0E-5));
      float[] afloat1 = new float[afloat.length];

      for (int i = 0; i < afloat.length; i++) {
         float f6 = (afloat[i] - f) * f5;
         afloat1[i] = li1llil1lllil111il11l$l1iil11li.I1II1l1IIl1I1lIIIlIIl1I1III[i] * f6 + li1llil1lllil111il11l$l1iil11li.ll111111lI1IllllIll1[i];
      }

      return afloat1;
   }

   private float[] EventTarget(float[][] afloat) {
      int i = this.I11l111111.II1I111I11lI1;
      int j = this.I11l111111.ll1lI11lll1Il11II1Ill1I111I;
      float[][] afloat1 = new float[i][j];

      for (int k = 0; k < this.l111Illlll11I1IIIl; k++) {
         float[] afloat2 = afloat[k];

         for (int l = 0; l < i; l++) {
            ZenithInternal109$Helper li1llil1lllil111il11l$l1lll11l1l = this.I11l111111.l11lIl1l1l[l];
            float[] afloat3 = afloat1[l];
            int i1 = l == 0 ? this.I11l111111.llllI111ll1Il1I11ll111l1l1 : j;
            float[] afloat4 = new float[j];
            float[] afloat5 = new float[j];
            float[] afloat6 = new float[j];

            for (int j1 = 0; j1 < j; j1++) {
               float f = li1llil1lllil111il11l$l1lll11l1l.l1IllI11l1lI1ll11I[j1] + li1llil1lllil111il11l$l1lll11l1l.llIl1I11IIII[j1];
               float f1 = li1llil1lllil111il11l$l1lll11l1l.l1IllI11l1lI1ll11I[j + j1] + li1llil1lllil111il11l$l1lll11l1l.llIl1I11IIII[j + j1];
               float f2 = li1llil1lllil111il11l$l1lll11l1l.l1IllI11l1lI1ll11I[2 * j + j1];
               float f3 = li1llil1lllil111il11l$l1lll11l1l.llIl1I11IIII[2 * j + j1];

               for (int k1 = 0; k1 < i1; k1++) {
                  f += li1llil1lllil111il11l$l1lll11l1l.Ill1ll1I11l1lllIIl[j1][k1] * afloat2[k1];
                  f1 += li1llil1lllil111il11l$l1lll11l1l.Ill1ll1I11l1lllIIl[j + j1][k1] * afloat2[k1];
                  f2 += li1llil1lllil111il11l$l1lll11l1l.Ill1ll1I11l1lllIIl[2 * j + j1][k1] * afloat2[k1];
               }

               for (int i2 = 0; i2 < j; i2++) {
                  f += li1llil1lllil111il11l$l1lll11l1l.lIIIlllI11I1III1l1lIlIl[j1][i2] * afloat3[i2];
                  f1 += li1llil1lllil111il11l$l1lll11l1l.lIIIlllI11I1III1l1lIlIl[j + j1][i2] * afloat3[i2];
                  f3 += li1llil1lllil111il11l$l1lll11l1l.lIIIlllI11I1III1l1lIlIl[2 * j + j1][i2] * afloat3[i2];
               }

               afloat4[j1] = this.ZenithInternal042(f);
               afloat5[j1] = this.ZenithInternal042(f1);
               afloat6[j1] = (float)Math.tanh((double)(f2 + afloat4[j1] * f3));
            }

            float[] afloat7 = new float[j];

            for (int l1 = 0; l1 < j; l1++) {
               afloat7[l1] = (1.0F - afloat5[l1]) * afloat6[l1] + afloat5[l1] * afloat3[l1];
            }

            afloat1[l] = afloat7;
            afloat2 = afloat7;
         }
      }

      return afloat1[i - 1];
   }

   private float[] StringHolder_8(float[] afloat, float[][] afloat1, float[] afloat2) {
      int i = afloat1.length;
      float[] afloat3 = new float[i];

      for (int j = 0; j < i; j++) {
         float f = afloat2[j];

         for (int k = 0; k < afloat.length; k++) {
            f += afloat1[j][k] * afloat[k];
         }

         afloat3[j] = f;
      }

      return afloat3;
   }

   private float[] Event(float[] afloat) {
      float[] afloat1 = new float[afloat.length];

      for (int i = 0; i < afloat.length; i++) {
         afloat1[i] = (float)(0.5 * (double)afloat[i] * (1.0 + ZenithInternal028((double)afloat[i] / Math.sqrt(2.0))));
      }

      return afloat1;
   }

   private float[] EventImpl_24(float[] afloat) {
      float[] afloat1 = new float[afloat.length];

      for (int i = 0; i < afloat.length; i++) {
         float f = afloat[i];
         afloat1[i] = (float)((double)f / (1.0 + Math.exp((double)(-f))));
      }

      return afloat1;
   }

   public static double ZenithInternal028(double d0) {
      int i = d0 < 0.0 ? -1 : 1;
      d0 = Math.abs(d0);
      double d1 = 0.254829592;
      double d2 = -0.284496736;
      double d3 = 1.421413741;
      double d4 = -1.453152027;
      double d5 = 1.061405429;
      double d6 = 0.3275911;
      double d7 = 1.0 / (1.0 + d6 * d0);
      double d8 = 1.0 - ((((d5 * d7 + d4) * d7 + d3) * d7 + d2) * d7 + d1) * d7 * Math.exp(-d0 * d0);
      return (double)i * d8;
   }

   private float ZenithInternal042(float f) {
      return (float)(1.0 / (1.0 + Math.exp((double)(-f))));
   }

   private int ZenithInternal028(float[] afloat) {
      if (afloat != null && afloat.length != 0) {
         int i = 0;
         float f = afloat[0];

         for (int j = 1; j < afloat.length; j++) {
            if (afloat[j] > f) {
               f = afloat[j];
               i = j;
            }
         }

         return i;
      } else {
         return -1;
      }
   }

   private int StringHolder_8(float[] afloat, int i) {
      int j = this.ZenithInternal028(afloat);
      if (j < 0) {
         return -1;
      } else if (i >= 0 && i < afloat.length && i != j) {
         return afloat[j] - afloat[i] >= 0.0F ? j : i;
      } else {
         return j;
      }
   }

   private int EventBus(float[] afloat, int i) {
      if (afloat != null && afloat.length > 1) {
         int j = -1;
         float f = -Float.MAX_VALUE;

         for (int k = 0; k < afloat.length; k++) {
            if (k != i) {
               float f1 = afloat[k];
               if (j < 0 || f1 > f) {
                  j = k;
                  f = f1;
               }
            }
         }

         return j;
      } else {
         return -1;
      }
   }

   private float StringHolder_8(float[] afloat, float[] afloat1, int i, int j) {
      if (afloat != null && afloat1 != null && i >= 0 && i < afloat.length && i < afloat1.length) {
         float f = afloat1[i];
         float f1 = afloat[i] * f;
         float f2 = f;
         if (j >= 0 && j < afloat.length && j < afloat1.length) {
            float f3 = afloat1[j];
            f1 += afloat[j] * f3;
            f2 = f + f3;
         }

         return !(f2 <= 1.0E-6F) && this.isFinite(f2) ? f1 / f2 : afloat[i];
      } else {
         return 0.0F;
      }
   }

   private float[] StringHolder_8(float[][] afloat, float[] afloat1, int i, int j) {
      if (afloat != null && afloat1 != null && i >= 0 && i < afloat.length && i < afloat1.length) {
         float f = afloat1[i];
         float f1 = afloat[i][0] * f;
         float f2 = afloat[i][1] * f;
         float f3 = f;
         if (j >= 0 && j < afloat.length && j < afloat1.length) {
            float f4 = afloat1[j];
            f1 += afloat[j][0] * f4;
            f2 += afloat[j][1] * f4;
            f3 = f + f4;
         }

         return !(f3 <= 1.0E-6F) && this.isFinite(f3) ? new float[]{f1 / f3, f2 / f3} : afloat[i];
      } else {
         return new float[]{0.0F, 0.0F};
      }
   }

   private float[] EventImpl_21(float[] afloat) {
      float[] afloat1 = new float[afloat.length];
      if (afloat.length == 0) {
         return afloat1;
      } else {
         float f = afloat[0];

         for (int i = 1; i < afloat.length; i++) {
            f = Math.max(f, afloat[i]);
         }

         float f1 = 0.0F;

         for (int j = 0; j < afloat.length; j++) {
            afloat1[j] = (float)Math.exp((double)(afloat[j] - f));
            f1 += afloat1[j];
         }

         if (!(f1 <= 0.0F) && this.isFinite(f1)) {
            for (int k = 0; k < afloat1.length; k++) {
               afloat1[k] /= f1;
            }

            return afloat1;
         } else {
            Arrays.fill(afloat1, 1.0F / (float)afloat.length);
            return afloat1;
         }
      }
   }

   private boolean isFinite(float f) {
      return !Float.isNaN(f) && !Float.isInfinite(f);
   }

   private floatHolder$Helper_4 lIlll11l11l1l11lll111I1IllI() {
      int i = this.I11l111111 == null ? 0 : this.I11l111111.l1II1llI1IlIIlIIlI11l1;
      return new floatHolder$Helper_4(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, new float[i], new float[i], -1, -1);
   }

   private void l1l1IIIIlI11llI() {
      if (this.I11l111111 != null) {
         for (String s : II1Illl11l1I1lIlIIIIllI1IIllI) {
            File file1 = new File(s);
            if (file1.exists() && file1.isFile()) {
               try {
                  if (this.ZenithInternal095(file1)) {
                     return;
                  }
               } catch (Exception exception) {
                  this.ZenithInternal062("[DeepLearning] Model-check failed for dataset " + file1.getPath() + ": " + exception.getMessage());
               }
            }
         }

         this.ZenithInternal125("[DeepLearning] Model-check skipped: rotation_dataset.csv not found.");
      }
   }

   private boolean ZenithInternal095(File file1) throws IOException {
      if (this.I11l111111.I1Il1I1l1lIllIII1I111lI != null && this.I11l111111.I1Il1I1l1lIllIII1I111lI.length == this.I11l111111.lIl1lllI1l1I1IllI1) {
         try (BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(new FileInputStream(file1), StandardCharsets.UTF_8))) {
            String s = bufferedreader.readLine();
            if (s == null) {
               this.ZenithInternal125("[DeepLearning] Model-check skipped: dataset is empty: " + file1.getPath());
               return false;
            }

            String[] astring = this.EventImpl_14(s);
            int[] aint = this.StringHolder_8(astring, this.I11l111111.I1Il1I1l1lIllIII1I111lI);
            int i = this.StringHolder_8(astring, llI1II11l11lllIl1);
            int j = this.StringHolder_8(astring, lI1llIl1lI1Il11lll11ll1I11l1);
            int k = this.StringHolder_8(astring, new String[]{"session_id"});
            int l = this.StringHolder_8(astring, new String[]{"player_age"});
            int i1 = this.StringHolder_8(astring, new String[]{"timestamp_ms"});
            boolean flag = k >= 0 && l >= 0 && i1 >= 0;
            ArrayDeque arraydeque = new ArrayDeque();
            HashSet hashset = new HashSet();
            int j1 = 0;
            int k1 = 1;

            String s1;
            while ((s1 = bufferedreader.readLine()) != null) {
               k1++;
               if (!s1.isEmpty()) {
                  String[] astring1 = this.EventImpl_14(s1);
                  float[] afloat = this.StringHolder_8(astring1, aint);
                  if (afloat != null) {
                     Long olong = flag ? this.EventTarget(astring1, k) : null;
                     Integer integer = flag ? this.EventBus(astring1, l) : null;
                     Long olong1 = flag ? this.EventTarget(astring1, i1) : null;
                     if (!flag || olong != null && integer != null && olong1 != null) {
                        Float f = this.StringHolder_8(astring1, i);
                        Float f1 = this.StringHolder_8(astring1, j);
                        lI1llIl1lllIl111Il11l$EventBus li1llil1lllil111il11l$l1i1illlilixxx = new lI1llIl1lllIl111Il11l$EventBus(
                           afloat, olong, integer, olong1, f, f1, k1
                        );
                        lI1llIl1lllIl111Il11l$EventBus li1llil1lllil111il11l$l1i1illlilix = (lI1llIl1lllIl111Il11l$EventBus)arraydeque.peekLast();
                        if (li1llil1lllil111il11l$l1i1illlilix != null
                           && flag
                           && !this.StringHolder_8(li1llil1lllil111il11l$l1i1illlilix, li1llil1lllil111il11l$l1i1illlilixxx)) {
                           arraydeque.clear();
                        }

                        arraydeque.addLast(li1llil1lllil111il11l$l1i1illlilixxx);

                        while (arraydeque.size() > this.l111Illlll11I1IIIl) {
                           arraydeque.removeFirst();
                        }

                        if (arraydeque.size() >= this.l111Illlll11I1IIIl) {
                           lI1llIl1lllIl111Il11l$EventBus li1llil1lllil111il11l$l1i1illlilixx = (lI1llIl1lllIl111Il11l$EventBus)arraydeque.peekLast();
                           if (li1llil1lllil111il11l$l1i1illlilixx != null) {
                              long l1 = flag && li1llil1lllil111il11l$l1i1illlilixx.l11Il1I1lI11l != null
                                 ? li1llil1lllil111il11l$l1i1illlilixx.l11Il1I1lI11l
                                 : (long)k1;
                              if (!hashset.contains(l1)) {
                                 float[][] afloat1 = new float[this.l111Illlll11I1IIIl][this.I11l111111.lIl1lllI1l1I1IllI1];
                                 int i2 = 0;

                                 for (lI1llIl1lllIl111Il11l$EventBus li1llil1lllil111il11l$l1i1illlilixxx : arraydeque) {
                                    afloat1[i2++] = li1llil1lllil111il11l$l1i1illlilixxx.II1111llIIl1;
                                 }

                                 float[] afloat2 = this.StringHolder_8(afloat1);
                                 String s2 = "target=[n/a, n/a] err=[n/a, n/a]";
                                 if (li1llil1lllil111il11l$l1i1illlilixx != null
                                    && li1llil1lllil111il11l$l1i1illlilixx.IIlIIl1I111lIl11l != null
                                    && li1llil1lllil111il11l$l1i1illlilixx.I1l1I1I11Il1IllIl1 != null) {
                                    float f2 = afloat2[0] - li1llil1lllil111il11l$l1i1illlilixx.IIlIIl1I111lIl11l;
                                    float f3 = afloat2[1] - li1llil1lllil111il11l$l1i1illlilixx.I1l1I1I11Il1IllIl1;
                                    s2 = String.format(
                                       Locale.ROOT,
                                       "target=[%.6f, %.6f] err=[%.6f, %.6f]",
                                       li1llil1lllil111il11l$l1i1illlilixx.IIlIIl1I111lIl11l,
                                       li1llil1lllil111il11l$l1i1illlilixx.I1l1I1I11Il1IllIl1,
                                       f2,
                                       f3
                                    );
                                 }

                                 if (j1 == 0) {
                                    this.ZenithInternal125("[DeepLearning] Model-check dataset: " + file1.getPath());
                                    this.ZenithInternal125(
                                       String.format(
                                          Locale.ROOT, "[DeepLearning] Model-check java_aligned_windows up to %d sessions (one window per session)", 15
                                       )
                                    );
                                 }

                                 if (flag && li1llil1lllil111il11l$l1i1illlilixx != null) {
                                    this.ZenithInternal125(
                                       String.format(
                                          Locale.ROOT,
                                          "[DeepLearning] Model-check window end: sample=java_aligned_session_%d session=%d age=%d timestamp_ms=%d line=%d",
                                          j1 + 1,
                                          li1llil1lllil111il11l$l1i1illlilixx.l11Il1I1lI11l,
                                          li1llil1lllil111il11l$l1i1illlilixx.IIlII11lll11I1IlllIlll1I11l11l,
                                          li1llil1lllil111il11l$l1i1illlilixx.l1llII1IIlIlIIlI1,
                                          li1llil1lllil111il11l$l1i1illlilixx.II1IlI1l11I1llI11IllI1lI1l
                                       )
                                    );
                                 }

                                 this.ZenithInternal125(
                                    String.format(Locale.ROOT, "[DeepLearning] Model-check prediction: pred=[%.6f, %.6f] %s", afloat2[0], afloat2[1], s2)
                                 );
                                 hashset.add(l1);
                                 if (++j1 >= 15) {
                                    break;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }

            if (j1 > 0) {
               return true;
            }
         }

         this.ZenithInternal125("[DeepLearning] Model-check skipped: no valid window in " + file1.getPath());
         return false;
      } else {
         this.ZenithInternal125("[DeepLearning] Model-check skipped: model config.feature_columns missing or invalid.");
         return false;
      }
   }

   private boolean StringHolder_8(
      lI1llIl1lllIl111Il11l$EventBus li1llil1lllil111il11l$l1i1illlili, lI1llIl1lllIl111Il11l$EventBus li1llil1lllil111il11l$l1i1illlili
   ) {
      if (li1llil1lllil111il11l$l1i1illlilix.l11Il1I1lI11l == null || li1llil1lllil111il11l$l1i1illlili.l11Il1I1lI11l == null) {
         return true;
      } else if (!li1llil1lllil111il11l$l1i1illlilix.l11Il1I1lI11l.equals(li1llil1lllil111il11l$l1i1illlili.l11Il1I1lI11l)) {
         return false;
      } else if (li1llil1lllil111il11l$l1i1illlili.IIlII11lll11I1IlllIlll1I11l11l == null
         || li1llil1lllil111il11l$l1i1illlilix.IIlII11lll11I1IlllIlll1I11l11l == null
         || li1llil1lllil111il11l$l1i1illlili.IIlII11lll11I1IlllIlll1I11l11l < li1llil1lllil111il11l$l1i1illlilix.IIlII11lll11I1IlllIlll1I11l11l) {
         return false;
      } else if (li1llil1lllil111il11l$l1i1illlili.IIlII11lll11I1IlllIlll1I11l11l - li1llil1lllil111il11l$l1i1illlilix.IIlII11lll11I1IlllIlll1I11l11l > 3) {
         return false;
      } else {
         return li1llil1lllil111il11l$l1i1illlili.l1llII1IIlIlIIlI1 != null
               && li1llil1lllil111il11l$l1i1illlilix.l1llII1IIlIlIIlI1 != null
               && li1llil1lllil111il11l$l1i1illlili.l1llII1IIlIlIIlI1 >= li1llil1lllil111il11l$l1i1illlilix.l1llII1IIlIlIIlI1
            ? li1llil1lllil111il11l$l1i1illlili.l1llII1IIlIlIIlI1 - li1llil1lllil111il11l$l1i1illlilix.l1llII1IIlIlIIlI1 <= 1000L
            : false;
      }
   }

   private int[] StringHolder_8(String[] astring, long[] along) {
      int[] aint = new int[along.length];

      for (int i = 0; i < along.length; i++) {
         int j = this.StringHolder_8(astring, along[i]);
         if (j < 0) {
            throw new IllegalArgumentException("Dataset is missing model feature #" + (i + 1));
         }

         aint[i] = j;
      }

      return aint;
   }

   private int StringHolder_8(String[] astring, String[] astring1) {
      for (String s : astring1) {
         int i = this.StringHolder_8(astring, s);
         if (i >= 0) {
            return i;
         }
      }

      return -1;
   }

   private int StringHolder_8(String[] astring, String s) {
      for (int i = 0; i < astring.length; i++) {
         String s1 = this.ZenithInternal127(astring[i]);
         if (s.equals(s1)) {
            return i;
         }
      }

      return -1;
   }

   private int StringHolder_8(String[] astring, long i) {
      for (int j = 0; j < astring.length; j++) {
         if (this.EventImpl_32(astring[j]) == i) {
            return j;
         }
      }

      return -1;
   }

   private String ZenithInternal127(String s) {
      String s1 = s == null ? "" : s.trim();
      if (!s1.isEmpty() && s1.charAt(0) == '\ufeff') {
         s1 = s1.substring(1);
      }

      return s1;
   }

   private float[] StringHolder_8(String[] astring, int[] aint) {
      float[] afloat = new float[aint.length];

      for (int i = 0; i < aint.length; i++) {
         Float f = this.StringHolder_8(astring, aint[i]);
         if (f == null) {
            return null;
         }

         afloat[i] = f;
      }

      return afloat;
   }

   private Float StringHolder_8(String[] astring, int i) {
      if (i >= 0 && i < astring.length) {
         String s = astring[i].trim();
         if (s.isEmpty()) {
            return null;
         } else {
            try {
               float f = Float.parseFloat(s);
               return this.isFinite(f) ? f : null;
            } catch (NumberFormatException numberformatexception) {
               return null;
            }
         }
      } else {
         return null;
      }
   }

   private Integer EventBus(String[] astring, int i) {
      if (i >= 0 && i < astring.length) {
         String s = astring[i].trim();
         if (s.isEmpty()) {
            return null;
         } else {
            try {
               return Integer.parseInt(s);
            } catch (NumberFormatException numberformatexception1) {
               try {
                  float f = Float.parseFloat(s);
                  return this.isFinite(f) ? (int)f : null;
               } catch (NumberFormatException numberformatexception) {
                  return null;
               }
            }
         }
      } else {
         return null;
      }
   }

   private Long EventTarget(String[] astring, int i) {
      if (i >= 0 && i < astring.length) {
         String s = astring[i].trim();
         if (s.isEmpty()) {
            return null;
         } else {
            try {
               return Long.parseLong(s);
            } catch (NumberFormatException numberformatexception1) {
               try {
                  double d0 = Double.parseDouble(s);
                  return !Double.isNaN(d0) && !Double.isInfinite(d0) ? (long)d0 : null;
               } catch (NumberFormatException numberformatexception) {
                  return null;
               }
            }
         }
      } else {
         return null;
      }
   }

   private String[] EventImpl_14(String s) {
      ArrayList arraylist = new ArrayList();
      StringBuilder stringbuilder = new StringBuilder();
      boolean flag = false;

      for (int i = 0; i < s.length(); i++) {
         char c0 = s.charAt(i);
         if (c0 == '"') {
            if (flag && i + 1 < s.length() && s.charAt(i + 1) == '"') {
               stringbuilder.append('"');
               i++;
            } else {
               flag = !flag;
            }
         } else if (c0 == ',' && !flag) {
            arraylist.add(stringbuilder.toString());
            stringbuilder.setLength(0);
         } else {
            stringbuilder.append(c0);
         }
      }

      arraylist.add(stringbuilder.toString());
      return arraylist.toArray(new String[0]);
   }

   private lI1llIl1lllIl111Il11l$Event byteHolder(JsonObject jsonobject) {
      lI1llIl1lllIl111Il11l$Event li1llil1lllil111il11l$liil11l111liil1ll = new lI1llIl1lllIl111Il11l$Event();
      JsonObject jsonobject1 = jsonobject.getAsJsonObject("config");
      if (jsonobject1 == null) {
         throw new IllegalArgumentException("Model JSON is missing config section");
      } else {
         String s = jsonobject1.has("model_type") ? jsonobject1.get("model_type").getAsString() : "";
         if (!"direct_gru_moe_closed_loop".equalsIgnoreCase(s)) {
            throw new IllegalArgumentException(
               "Model format mismatch: expected config.model_type='direct_gru_moe_closed_loop' but got '" + s + "'. Re-train model."
            );
         } else {
            li1llil1lllil111il11l$liil11l111liil1ll.lI1l1lIl1I1111l1llIl1 = "in_proj_in_norm_silu";
            li1llil1lllil111il11l$liil11l111liil1ll.lIl1lllI1l1I1IllI1 = jsonobject1.has("input_size") ? jsonobject1.get("input_size").getAsInt() : 28;
            li1llil1lllil111il11l$liil11l111liil1ll.ll1lI11lll1Il11II1Ill1I111I = jsonobject1.get("hidden_size").getAsInt();
            li1llil1lllil111il11l$liil11l111liil1ll.II1I111I11lI1 = jsonobject1.get("num_layers").getAsInt();
            li1llil1lllil111il11l$liil11l111liil1ll.IllIll1IIII11l1I1Il11lII1l1lIl = jsonobject1.has("fc_size") ? jsonobject1.get("fc_size").getAsInt() : -1;
            li1llil1lllil111il11l$liil11l111liil1ll.IIIlIIIl1lII1IIIIII1ll1IIIl = jsonobject1.has("output_size")
               ? jsonobject1.get("output_size").getAsInt()
               : 2;
            li1llil1lllil111il11l$liil11l111liil1ll.l1II1llI1IlIIlIIlI11l1 = jsonobject1.has("moe_experts") ? jsonobject1.get("moe_experts").getAsInt() : 0;
            li1llil1lllil111il11l$liil11l111liil1ll.Il1I1IlIllIllI1lIlIl1l1llIIIIl = !jsonobject1.has("fixed_idle_expert")
               || jsonobject1.get("fixed_idle_expert").getAsBoolean();
            li1llil1lllil111il11l$liil11l111liil1ll.II1IIlIlIllIl1lI1 = jsonobject1.has("two_head") && jsonobject1.get("two_head").getAsBoolean();
            li1llil1lllil111il11l$liil11l111liil1ll.I1Il1I1l1lIllIII1I111lI = jsonobject1.has("feature_columns")
               ? this.ZenithInternal095(jsonobject1.getAsJsonArray("feature_columns"))
               : null;
            if (jsonobject1.has("sequence_length")) {
               this.l111Illlll11I1IIIl = Math.max(2, jsonobject1.get("sequence_length").getAsInt());
            }

            if (li1llil1lllil111il11l$liil11l111liil1ll.lIl1lllI1l1I1IllI1 <= 0) {
               throw new IllegalArgumentException("Invalid input_size=" + li1llil1lllil111il11l$liil11l111liil1ll.lIl1lllI1l1I1IllI1);
            } else if (li1llil1lllil111il11l$liil11l111liil1ll.IIIlIIIl1lII1IIIIII1ll1IIIl != 2) {
               throw new IllegalArgumentException("Expected output_size=2, got " + li1llil1lllil111il11l$liil11l111liil1ll.IIIlIIIl1lII1IIIIII1ll1IIIl);
            } else if (li1llil1lllil111il11l$liil11l111liil1ll.l1II1llI1IlIIlIIlI11l1 < 2) {
               throw new IllegalArgumentException("Expected moe_experts>=2, got " + li1llil1lllil111il11l$liil11l111liil1ll.l1II1llI1IlIIlIIlI11l1);
            } else if (li1llil1lllil111il11l$liil11l111liil1ll.I1Il1I1l1lIllIII1I111lI != null
               && li1llil1lllil111il11l$liil11l111liil1ll.I1Il1I1l1lIllIII1I111lI.length != li1llil1lllil111il11l$liil11l111liil1ll.lIl1lllI1l1I1IllI1) {
               throw new IllegalArgumentException("config.feature_columns size mismatch with input_size");
            } else {
               JsonObject jsonobject2 = jsonobject.getAsJsonObject("weights");
               if (jsonobject2 == null) {
                  throw new IllegalArgumentException("Model JSON is missing weights section");
               } else {
                  if (jsonobject2.has("feature_norm")) {
                     JsonObject jsonobject3 = jsonobject2.getAsJsonObject("feature_norm");
                     li1llil1lllil111il11l$liil11l111liil1ll.l1II1IIIl1I11 = new lI1llIl1lllIl111Il11l$EventTarget();
                     li1llil1lllil111il11l$liil11l111liil1ll.l1II1IIIl1I11.lIllll1IlllI1ll1ll = this.EventBus(jsonobject3.getAsJsonArray("mean"));
                     li1llil1lllil111il11l$liil11l111liil1ll.l1II1IIIl1I11.l1IlIl1lllllllI1l1 = this.EventBus(jsonobject3.getAsJsonArray("std"));
                     if (li1llil1lllil111il11l$liil11l111liil1ll.l1II1IIIl1I11.lIllll1IlllI1ll1ll.length
                           != li1llil1lllil111il11l$liil11l111liil1ll.lIl1lllI1l1I1IllI1
                        || li1llil1lllil111il11l$liil11l111liil1ll.l1II1IIIl1I11.l1IlIl1lllllllI1l1.length
                           != li1llil1lllil111il11l$liil11l111liil1ll.lIl1lllI1l1I1IllI1) {
                        throw new IllegalArgumentException("feature_norm size mismatch with input_size");
                     }
                  } else {
                     li1llil1lllil111il11l$liil11l111liil1ll.l1II1IIIl1I11 = new lI1llIl1lllIl111Il11l$EventTarget();
                     li1llil1lllil111il11l$liil11l111liil1ll.l1II1IIIl1I11.lIllll1IlllI1ll1ll = new float[li1llil1lllil111il11l$liil11l111liil1ll.lIl1lllI1l1I1IllI1];
                     li1llil1lllil111il11l$liil11l111liil1ll.l1II1IIIl1I11.l1IlIl1lllllllI1l1 = new float[li1llil1lllil111il11l$liil11l111liil1ll.lIl1lllI1l1I1IllI1];

                     for (int j = 0; j < li1llil1lllil111il11l$liil11l111liil1ll.lIl1lllI1l1I1IllI1; j++) {
                        li1llil1lllil111il11l$liil11l111liil1ll.l1II1IIIl1I11.lIllll1IlllI1ll1ll[j] = 0.0F;
                        li1llil1lllil111il11l$liil11l111liil1ll.l1II1IIIl1I11.l1IlIl1lllllllI1l1[j] = 1.0F;
                     }
                  }

                  JsonObject jsonobject5 = jsonobject2.getAsJsonObject("in_proj");
                  JsonObject jsonobject4 = jsonobject2.getAsJsonObject("in_norm");
                  if (jsonobject5 != null && jsonobject4 != null) {
                     li1llil1lllil111il11l$liil11l111liil1ll.l11IllIlI1II1lllI11l11 = this.EventTarget(jsonobject5.getAsJsonArray("weight"));
                     li1llil1lllil111il11l$liil11l111liil1ll.IlI1l111l1IIlII1II1 = this.EventBus(jsonobject5.getAsJsonArray("bias"));
                     li1llil1lllil111il11l$liil11l111liil1ll.I1llI1lIlI1Ill11I = new ZenithInternal108$Helper();
                     li1llil1lllil111il11l$liil11l111liil1ll.I1llI1lIlI1Ill11I.I1II1l1IIl1I1lIIIlIIl1I1III = this.EventBus(
                        jsonobject4.getAsJsonArray("weight")
                     );
                     li1llil1lllil111il11l$liil11l111liil1ll.I1llI1lIlI1Ill11I.ll111111lI1IllllIll1 = this.EventBus(jsonobject4.getAsJsonArray("bias"));
                     if (li1llil1lllil111il11l$liil11l111liil1ll.l11IllIlI1II1lllI11l11.length
                           == li1llil1lllil111il11l$liil11l111liil1ll.ll1lI11lll1Il11II1Ill1I111I
                        && li1llil1lllil111il11l$liil11l111liil1ll.IlI1l111l1IIlII1II1.length
                           == li1llil1lllil111il11l$liil11l111liil1ll.ll1lI11lll1Il11II1Ill1I111I) {
                        for (float[] afloat : li1llil1lllil111il11l$liil11l111liil1ll.l11IllIlI1II1lllI11l11) {
                           if (afloat.length != li1llil1lllil111il11l$liil11l111liil1ll.lIl1lllI1l1I1IllI1) {
                              throw new IllegalArgumentException("weights.in_proj inner size mismatch with input_size");
                           }
                        }

                        if (li1llil1lllil111il11l$liil11l111liil1ll.I1llI1lIlI1Ill11I.I1II1l1IIl1I1lIIIlIIl1I1III.length
                              == li1llil1lllil111il11l$liil11l111liil1ll.ll1lI11lll1Il11II1Ill1I111I
                           && li1llil1lllil111il11l$liil11l111liil1ll.I1llI1lIlI1Ill11I.ll111111lI1IllllIll1.length
                              == li1llil1lllil111il11l$liil11l111liil1ll.ll1lI11lll1Il11II1Ill1I111I) {
                           li1llil1lllil111il11l$liil11l111liil1ll.llllI111ll1Il1I11ll111l1l1 = li1llil1lllil111il11l$liil11l111liil1ll.ll1lI11lll1Il11II1Ill1I111I;
                           JsonObject jsonobject6 = jsonobject2.getAsJsonObject("gru");
                           if (jsonobject6 == null) {
                              throw new IllegalArgumentException("Model JSON is missing weights.gru");
                           } else {
                              li1llil1lllil111il11l$liil11l111liil1ll.l11lIl1l1l = new ZenithInternal109$Helper[li1llil1lllil111il11l$liil11l111liil1ll.II1I111I11lI1];

                              for (int k = 0; k < li1llil1lllil111il11l$liil11l111liil1ll.II1I111I11lI1; k++) {
                                 JsonObject jsonobject8 = jsonobject6.getAsJsonObject("l" + k);
                                 if (jsonobject8 == null) {
                                    throw new IllegalArgumentException("Missing GRU layer: l" + k);
                                 }

                                 ZenithInternal109$Helper li1llil1lllil111il11l$l1lll11l1l = new ZenithInternal109$Helper();
                                 li1llil1lllil111il11l$l1lll11l1l.Ill1ll1I11l1lllIIl = this.EventTarget(jsonobject8.getAsJsonArray("weight_ih"));
                                 li1llil1lllil111il11l$l1lll11l1l.lIIIlllI11I1III1l1lIlIl = this.EventTarget(jsonobject8.getAsJsonArray("weight_hh"));
                                 li1llil1lllil111il11l$l1lll11l1l.l1IllI11l1lI1ll11I = this.EventBus(jsonobject8.getAsJsonArray("bias_ih"));
                                 li1llil1lllil111il11l$l1lll11l1l.llIl1I11IIII = this.EventBus(jsonobject8.getAsJsonArray("bias_hh"));
                                 int i = k == 0
                                    ? li1llil1lllil111il11l$liil11l111liil1ll.llllI111ll1Il1I11ll111l1l1
                                    : li1llil1lllil111il11l$liil11l111liil1ll.ll1lI11lll1Il11II1Ill1I111I;
                                 if (li1llil1lllil111il11l$l1lll11l1l.Ill1ll1I11l1lllIIl.length
                                    != 3 * li1llil1lllil111il11l$liil11l111liil1ll.ll1lI11lll1Il11II1Ill1I111I) {
                                    throw new IllegalArgumentException("GRU weight_ih rows mismatch at layer l" + k);
                                 }

                                 if (li1llil1lllil111il11l$l1lll11l1l.lIIIlllI11I1III1l1lIlIl.length
                                    != 3 * li1llil1lllil111il11l$liil11l111liil1ll.ll1lI11lll1Il11II1Ill1I111I) {
                                    throw new IllegalArgumentException("GRU weight_hh rows mismatch at layer l" + k);
                                 }

                                 if (li1llil1lllil111il11l$l1lll11l1l.l1IllI11l1lI1ll11I.length
                                       != 3 * li1llil1lllil111il11l$liil11l111liil1ll.ll1lI11lll1Il11II1Ill1I111I
                                    || li1llil1lllil111il11l$l1lll11l1l.llIl1I11IIII.length
                                       != 3 * li1llil1lllil111il11l$liil11l111liil1ll.ll1lI11lll1Il11II1Ill1I111I) {
                                    throw new IllegalArgumentException("GRU bias size mismatch at layer l" + k);
                                 }

                                 for (float[] afloat1 : li1llil1lllil111il11l$l1lll11l1l.Ill1ll1I11l1lllIIl) {
                                    if (afloat1.length != i) {
                                       throw new IllegalArgumentException("GRU weight_ih input size mismatch at layer l" + k);
                                    }
                                 }

                                 for (float[] afloat4 : li1llil1lllil111il11l$l1lll11l1l.lIIIlllI11I1III1l1lIlIl) {
                                    if (afloat4.length != li1llil1lllil111il11l$liil11l111liil1ll.ll1lI11lll1Il11II1Ill1I111I) {
                                       throw new IllegalArgumentException("GRU weight_hh hidden size mismatch at layer l" + k);
                                    }
                                 }

                                 li1llil1lllil111il11l$liil11l111liil1ll.l11lIl1l1l[k] = li1llil1lllil111il11l$l1lll11l1l;
                              }

                              JsonObject jsonobject7 = jsonobject2.getAsJsonObject("fc1");
                              if (jsonobject7 == null) {
                                 throw new IllegalArgumentException("Model JSON is missing weights.fc1");
                              } else {
                                 li1llil1lllil111il11l$liil11l111liil1ll.I111llIIlIllI11I1IlI1111IIl = this.EventTarget(jsonobject7.getAsJsonArray("weight"));
                                 li1llil1lllil111il11l$liil11l111liil1ll.l1l1Il1l1lII1II111Ill = this.EventBus(jsonobject7.getAsJsonArray("bias"));
                                 JsonObject jsonobject9 = jsonobject2.getAsJsonObject("fc2");
                                 if (jsonobject9 == null) {
                                    throw new IllegalArgumentException("Model JSON is missing weights.fc2");
                                 } else {
                                    li1llil1lllil111il11l$liil11l111liil1ll.lll11l111111IllI1lllI1Illl = this.EventTarget(jsonobject9.getAsJsonArray("weight"));
                                    li1llil1lllil111il11l$liil11l111liil1ll.lIl1III1llI1l1l1IlIlll = this.EventBus(jsonobject9.getAsJsonArray("bias"));
                                    if (li1llil1lllil111il11l$liil11l111liil1ll.I111llIIlIllI11I1IlI1111IIl.length != 0
                                       && li1llil1lllil111il11l$liil11l111liil1ll.l1l1Il1l1lII1II111Ill.length != 0
                                       && li1llil1lllil111il11l$liil11l111liil1ll.lll11l111111IllI1lllI1Illl.length != 0
                                       && li1llil1lllil111il11l$liil11l111liil1ll.lIl1III1llI1l1l1IlIlll.length != 0) {
                                       for (float[] afloat2 : li1llil1lllil111il11l$liil11l111liil1ll.I111llIIlIllI11I1IlI1111IIl) {
                                          if (afloat2.length != li1llil1lllil111il11l$liil11l111liil1ll.ll1lI11lll1Il11II1Ill1I111I) {
                                             throw new IllegalArgumentException("weights.fc1 input size mismatch with hidden_size");
                                          }
                                       }

                                       if (li1llil1lllil111il11l$liil11l111liil1ll.I111llIIlIllI11I1IlI1111IIl.length
                                          != li1llil1lllil111il11l$liil11l111liil1ll.l1l1Il1l1lII1II111Ill.length) {
                                          throw new IllegalArgumentException("weights.fc1 rows must match fc1 bias length");
                                       } else {
                                          int l = li1llil1lllil111il11l$liil11l111liil1ll.I111llIIlIllI11I1IlI1111IIl.length;
                                          if (li1llil1lllil111il11l$liil11l111liil1ll.IllIll1IIII11l1I1Il11lII1l1lIl <= 0) {
                                             li1llil1lllil111il11l$liil11l111liil1ll.IllIll1IIII11l1I1Il11lII1l1lIl = l;
                                          } else if (li1llil1lllil111il11l$liil11l111liil1ll.IllIll1IIII11l1I1Il11lII1l1lIl != l) {
                                             throw new IllegalArgumentException("config.fc_size mismatch with weights.fc1");
                                          }

                                          if (li1llil1lllil111il11l$liil11l111liil1ll.lll11l111111IllI1lllI1Illl.length
                                                == li1llil1lllil111il11l$liil11l111liil1ll.IllIll1IIII11l1I1Il11lII1l1lIl
                                             && li1llil1lllil111il11l$liil11l111liil1ll.lIl1III1llI1l1l1IlIlll.length
                                                == li1llil1lllil111il11l$liil11l111liil1ll.IllIll1IIII11l1I1Il11lII1l1lIl) {
                                             for (float[] afloat3 : li1llil1lllil111il11l$liil11l111liil1ll.lll11l111111IllI1lllI1Illl) {
                                                if (afloat3.length != li1llil1lllil111il11l$liil11l111liil1ll.IllIll1IIII11l1I1Il11lII1l1lIl) {
                                                   throw new IllegalArgumentException("weights.fc2 input size mismatch with fc_size");
                                                }
                                             }

                                             boolean flag = jsonobject2.has("gate_yaw") && jsonobject2.has("gate_pitch");
                                             boolean flag1 = jsonobject2.has("move_yaw") && jsonobject2.has("move_pitch");
                                             li1llil1lllil111il11l$liil11l111liil1ll.IllI1I11I1l = flag;
                                             li1llil1lllil111il11l$liil11l111liil1ll.II1IIlIlIllIl1lI1 = li1llil1lllil111il11l$liil11l111liil1ll.II1IIlIlIllIl1lI1
                                                || flag1;
                                             if (flag) {
                                                li1llil1lllil111il11l$liil11l111liil1ll.II11l11ll111II1Il11II1IlIII1l = this.EventTarget(
                                                   jsonobject2.getAsJsonObject("gate_yaw").getAsJsonArray("weight")
                                                );
                                                li1llil1lllil111il11l$liil11l111liil1ll.I1I1llI11llI11I1lI = this.EventBus(
                                                   jsonobject2.getAsJsonObject("gate_yaw").getAsJsonArray("bias")
                                                );
                                                li1llil1lllil111il11l$liil11l111liil1ll.l1lll11111I1l = this.EventTarget(
                                                   jsonobject2.getAsJsonObject("gate_pitch").getAsJsonArray("weight")
                                                );
                                                li1llil1lllil111il11l$liil11l111liil1ll.I1Il1I11IlI11 = this.EventBus(
                                                   jsonobject2.getAsJsonObject("gate_pitch").getAsJsonArray("bias")
                                                );
                                                li1llil1lllil111il11l$liil11l111liil1ll.ll1Il11ll1l11l1lIl = this.EventTarget(
                                                   jsonobject2.getAsJsonObject("experts_yaw").getAsJsonArray("weight")
                                                );
                                                li1llil1lllil111il11l$liil11l111liil1ll.llIllI1I1Il1IlIl1I1I1I1lIlI = this.EventBus(
                                                   jsonobject2.getAsJsonObject("experts_yaw").getAsJsonArray("bias")
                                                );
                                                li1llil1lllil111il11l$liil11l111liil1ll.Il1IIl111IIll1III = this.EventTarget(
                                                   jsonobject2.getAsJsonObject("experts_pitch").getAsJsonArray("weight")
                                                );
                                                li1llil1lllil111il11l$liil11l111liil1ll.lII11I1I1lI111l1I1l1lII = this.EventBus(
                                                   jsonobject2.getAsJsonObject("experts_pitch").getAsJsonArray("bias")
                                                );
                                                if (li1llil1lllil111il11l$liil11l111liil1ll.II1IIlIlIllIl1lI1) {
                                                   if (!flag1) {
                                                      throw new IllegalArgumentException(
                                                         "Model JSON config.two_head=true but weights.move_yaw/move_pitch are missing"
                                                      );
                                                   }

                                                   li1llil1lllil111il11l$liil11l111liil1ll.lI1II11lIl11IlI1Ill1I1III = this.EventTarget(
                                                      jsonobject2.getAsJsonObject("move_yaw").getAsJsonArray("weight")
                                                   );
                                                   li1llil1lllil111il11l$liil11l111liil1ll.Il1Il11I1I1lllIlII1IlI = this.EventBus(
                                                      jsonobject2.getAsJsonObject("move_yaw").getAsJsonArray("bias")
                                                   );
                                                   li1llil1lllil111il11l$liil11l111liil1ll.I111Il11llI1lI = this.EventTarget(
                                                      jsonobject2.getAsJsonObject("move_pitch").getAsJsonArray("weight")
                                                   );
                                                   li1llil1lllil111il11l$liil11l111liil1ll.l1I1lllll1I1lI11l1I = this.EventBus(
                                                      jsonobject2.getAsJsonObject("move_pitch").getAsJsonArray("bias")
                                                   );
                                                   this.StringHolder_8(
                                                      li1llil1lllil111il11l$liil11l111liil1ll.lI1II11lIl11IlI1Ill1I1III,
                                                      li1llil1lllil111il11l$liil11l111liil1ll.Il1Il11I1I1lllIlII1IlI,
                                                      "move_yaw",
                                                      li1llil1lllil111il11l$liil11l111liil1ll.IllIll1IIII11l1I1Il11lII1l1lIl
                                                   );
                                                   this.StringHolder_8(
                                                      li1llil1lllil111il11l$liil11l111liil1ll.I111Il11llI1lI,
                                                      li1llil1lllil111il11l$liil11l111liil1ll.l1I1lllll1I1lI11l1I,
                                                      "move_pitch",
                                                      li1llil1lllil111il11l$liil11l111liil1ll.IllIll1IIII11l1I1Il11lII1l1lIl
                                                   );
                                                }
                                             } else {
                                                if (li1llil1lllil111il11l$liil11l111liil1ll.II1IIlIlIllIl1lI1) {
                                                   throw new IllegalArgumentException("Two-head models require split yaw/pitch gate and expert heads");
                                                }

                                                JsonObject jsonobject10 = jsonobject2.getAsJsonObject("gate");
                                                if (jsonobject10 == null) {
                                                   throw new IllegalArgumentException("Model JSON is missing weights.gate");
                                                }

                                                li1llil1lllil111il11l$liil11l111liil1ll.Il1llllll1 = this.EventTarget(jsonobject10.getAsJsonArray("weight"));
                                                li1llil1lllil111il11l$liil11l111liil1ll.I11l1llIllll1lI1lll1II1I = this.EventBus(
                                                   jsonobject10.getAsJsonArray("bias")
                                                );
                                                if (li1llil1lllil111il11l$liil11l111liil1ll.Il1llllll1.length
                                                      != li1llil1lllil111il11l$liil11l111liil1ll.l1II1llI1IlIIlIIlI11l1
                                                   || li1llil1lllil111il11l$liil11l111liil1ll.I11l1llIllll1lI1lll1II1I.length
                                                      != li1llil1lllil111il11l$liil11l111liil1ll.l1II1llI1IlIIlIIlI11l1) {
                                                   throw new IllegalArgumentException("weights.gate size mismatch with moe_experts");
                                                }

                                                JsonObject jsonobject11 = jsonobject2.getAsJsonObject("experts");
                                                if (jsonobject11 == null) {
                                                   throw new IllegalArgumentException("Model JSON is missing weights.experts");
                                                }

                                                li1llil1lllil111il11l$liil11l111liil1ll.llll111llll = this.EventTarget(jsonobject11.getAsJsonArray("weight"));
                                                li1llil1lllil111il11l$liil11l111liil1ll.I1ll1lllI11l1l1I1l1 = this.EventBus(
                                                   jsonobject11.getAsJsonArray("bias")
                                                );
                                                int i1 = (
                                                      li1llil1lllil111il11l$liil11l111liil1ll.Il1I1IlIllIllI1lIlIl1l1llIIIIl
                                                         ? li1llil1lllil111il11l$liil11l111liil1ll.l1II1llI1IlIIlIIlI11l1 - 1
                                                         : li1llil1lllil111il11l$liil11l111liil1ll.l1II1llI1IlIIlIIlI11l1
                                                   )
                                                   * li1llil1lllil111il11l$liil11l111liil1ll.IIIlIIIl1lII1IIIIII1ll1IIIl;
                                                if (li1llil1lllil111il11l$liil11l111liil1ll.llll111llll.length != i1
                                                   || li1llil1lllil111il11l$liil11l111liil1ll.I1ll1lllI11l1l1I1l1.length != i1) {
                                                   throw new IllegalArgumentException("weights.experts size mismatch with moe_experts/fixed_idle_expert");
                                                }
                                             }

                                             return li1llil1lllil111il11l$liil11l111liil1ll;
                                          } else {
                                             throw new IllegalArgumentException("weights.fc2 size mismatch with fc_size");
                                          }
                                       }
                                    } else {
                                       throw new IllegalArgumentException("weights.fc1 / weights.fc2 cannot be empty");
                                    }
                                 }
                              }
                           }
                        } else {
                           throw new IllegalArgumentException("weights.in_norm size mismatch with hidden_size");
                        }
                     } else {
                        throw new IllegalArgumentException("weights.in_proj size mismatch with hidden_size");
                     }
                  } else {
                     throw new IllegalArgumentException("Model JSON is missing weights.in_proj or weights.in_norm");
                  }
               }
            }
         }
      }
   }

   private float[] EventBus(JsonArray jsonarray) {
      float[] afloat = new float[jsonarray.size()];

      for (int i = 0; i < jsonarray.size(); i++) {
         afloat[i] = jsonarray.get(i).getAsFloat();
      }

      return afloat;
   }

   private float[][] EventTarget(JsonArray jsonarray) {
      float[][] afloat = new float[jsonarray.size()][];

      for (int i = 0; i < jsonarray.size(); i++) {
         afloat[i] = this.EventBus(jsonarray.get(i).getAsJsonArray());
      }

      return afloat;
   }

   private void StringHolder_8(float[][] afloat, float[] afloat1, String s, int i) {
      if (afloat == null || afloat1 == null || afloat.length != 1 || afloat1.length != 1) {
         throw new IllegalArgumentException("weights." + s + " must be a single-output linear head");
      } else if (afloat[0].length != i) {
         throw new IllegalArgumentException("weights." + s + " input size mismatch with fc_size");
      }
   }

   private long[] ZenithInternal095(JsonArray jsonarray) {
      long[] along = new long[jsonarray.size()];

      for (int i = 0; i < jsonarray.size(); i++) {
         String s = jsonarray.get(i).getAsString();
         along[i] = this.GetSlotIdHandler(s) ? Long.parseUnsignedLong(s.substring("fc_".length()), 16) : this.EventImpl_32(s);
      }

      return along;
   }

   public boolean llI11lIll1I11ll1lII() {
      return this.II1l11I11I1IIlIlII11l11l;
   }

   public lI1llIl1lllIl111Il11l$Event lI1lI1l1II1llIIlI1lIlIIIlI11I() {
      return this.I11l111111;
   }

   public int IIIIIIlIll1I1II1lIlI() {
      return this.l111Illlll11I1IIIl;
   }

   public Deque<float[]> l1IIIllI1Ill11111l11l1I() {
      return this.lIlIl11l1lll1l1I1l1l1ll1IlI1;
   }

   public Random IIIlIl1l1IlIl() {
      return this.llll1lIIIIIl11II11l1lI11lIl1;
   }

   public int lIlII1llI11llI1IlIlllI11lI1() {
      return this.IlllIlI1I111IIIlI1I1llI1l;
   }

   public int II1IIlIIll111() {
      return this.lI1IlIII1lIl1lIIIlll1Ill;
   }

   public int I111lIlIllIl11Il11l() {
      return this.lll1lI111I1lII1I1I1lllI1;
   }

   public Deque<float[]> I11lI1Il11IllIlIl11I() {
      return this.IIlll1lIII1l1II;
   }
}
