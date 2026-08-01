package zenith;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.security.auth.x500.X500Principal;

final class HostnameVerifierImpl implements HostnameVerifier {
   public static final HostnameVerifierImpl ZenithInternal150 = new HostnameVerifierImpl();
   private static final Pattern ArrayListHolder = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
   private static final int GetDisplayNameHandler_2 = 2;
   private static final int ZenithInternal016 = 7;

   private HostnameVerifierImpl() {
   }

   @Override
   public boolean verify(String s, SSLSession sslsession) {
      try {
         Certificate[] acertificate = sslsession.getPeerCertificates();
         return this.StringHolder_8(s, (X509Certificate)acertificate[0]);
      } catch (SSLException sslexception) {
         return false;
      }
   }

   public boolean StringHolder_8(String s, X509Certificate x509certificate) {
      return longHolder_5(s) ? this.EventBus(s, x509certificate) : this.EventTarget(s, x509certificate);
   }

   static boolean longHolder_5(String s) {
      return ArrayListHolder.matcher(s).matches();
   }

   private boolean EventBus(String s, X509Certificate x509certificate) {
      List list = StringHolder_8(x509certificate, 7);
      int i = 0;

      for (int j = list.size(); i < j; i++) {
         if (s.equalsIgnoreCase((String)list.get(i))) {
            return true;
         }
      }

      return false;
   }

   private boolean EventTarget(String s, X509Certificate x509certificate) {
      s = s.toLowerCase(Locale.US);
      boolean flag = false;
      List list = StringHolder_8(x509certificate, 2);
      int i = 0;

      for (int j = list.size(); i < j; i++) {
         flag = true;
         if (this.EventBus(s, (String)list.get(i))) {
            return true;
         }
      }

      if (!flag) {
         X500Principal x500principal = x509certificate.getSubjectX500Principal();
         String s1 = new StringHolder_19(x500principal).EventBus("cn");
         if (s1 != null) {
            return this.EventBus(s, s1);
         }
      }

      return false;
   }

   public static List<String> StringHolder_8(X509Certificate x509certificate) {
      List list = StringHolder_8(x509certificate, 7);
      List list1 = StringHolder_8(x509certificate, 2);
      ArrayList arraylist = new ArrayList(list.size() + list1.size());
      arraylist.addAll(list);
      arraylist.addAll(list1);
      return arraylist;
   }

   private static List<String> StringHolder_8(X509Certificate x509certificate, int i) {
      ArrayList arraylist = new ArrayList();

      try {
         Collection collection = x509certificate.getSubjectAlternativeNames();
         if (collection == null) {
            return Collections.emptyList();
         } else {
            for (Object object : collection) {
               List list = (List)object;
               if (list != null && list.size() >= 2) {
                  Integer integer = (Integer)list.get(0);
                  if (integer != null && integer == i) {
                     String s = (String)list.get(1);
                     if (s != null) {
                        arraylist.add(s);
                     }
                  }
               }
            }

            return arraylist;
         }
      } catch (CertificateParsingException certificateparsingexception) {
         return Collections.emptyList();
      }
   }

   private boolean EventBus(String s, String s1) {
      if (s == null || s.length() == 0 || s.startsWith(".") || s.endsWith("..")) {
         return false;
      } else if (s1 != null && s1.length() != 0 && !s1.startsWith(".") && !s1.endsWith("..")) {
         if (!s.endsWith(".")) {
            s = s + '.';
         }

         if (!s1.endsWith(".")) {
            s1 = s1 + '.';
         }

         s1 = s1.toLowerCase(Locale.US);
         if (!s1.contains("*")) {
            return s.equals(s1);
         } else if (!s1.startsWith("*.") || s1.indexOf(42, 1) != -1) {
            return false;
         } else if (s.length() < s1.length()) {
            return false;
         } else if ("*.".equals(s1)) {
            return false;
         } else {
            String s2 = s1.substring(1);
            if (!s.endsWith(s2)) {
               return false;
            } else {
               int i = s.length() - s2.length();
               return i <= 0 || s.lastIndexOf(46, i - 1) == -1;
            }
         }
      } else {
         return false;
      }
   }
}
