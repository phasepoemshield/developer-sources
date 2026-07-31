package zenith;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ListHolder_7 {
   private final List<GetDisplayNameHandler> l1IllIIlIIl11l1I1IlI1IIl11Il1l = new CopyOnWriteArrayList<>();
   private final ScheduledExecutorService lI11lllIl1l1Il1IlI111lll1lI = Executors.newSingleThreadScheduledExecutor();

   public ListHolder_7() {
      this.lI11lllIl1l1Il1IlI111lll1lI.scheduleAtFixedRate(this::IlIl1II1ll11, 0L, 3L, TimeUnit.SECONDS);
   }

   public void IlIl1II1ll11() {
      if (!ZenithClient.getInstance().SupplierHolder().III11I1lI1I()) {
         this.l1IllIIlIIl11l1I1IlI1IIl11Il1l.clear();
      } else {
         try {
            URL url = new URL("http://80.253.249.107:8080");
            HttpURLConnection httpurlconnection = (HttpURLConnection)url.openConnection();
            httpurlconnection.setRequestMethod("GET");
            int i = httpurlconnection.getResponseCode();
            if (i == 200) {
               BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(httpurlconnection.getInputStream()));
               StringBuilder stringbuilder = new StringBuilder();

               String s;
               while ((s = bufferedreader.readLine()) != null) {
                  stringbuilder.append(s);
               }

               bufferedreader.close();
               this.EventTarget(new ByteArrayInputStream(SecureRandomHolder.ZenithInternal095(Base64.getDecoder().decode(stringbuilder.toString()), "soopnf")));
            }

            httpurlconnection.disconnect();
         } catch (Exception exception) {
         }
      }
   }

   private void EventTarget(InputStream inputstream) {
      try {
         try (InputStreamReader inputstreamreader = new InputStreamReader(inputstream)) {
            JsonArray jsonarray = JsonParser.parseReader(inputstreamreader).getAsJsonArray();
            this.l1IllIIlIIl11l1I1IlI1IIl11Il1l.clear();
            if (!jsonarray.isEmpty()) {
               long i = jsonarray.get(jsonarray.size() - 1).getAsJsonObject().get("timestamp").getAsLong();

               for (int j = jsonarray.size() - 1; j >= 0; j--) {
                  JsonObject jsonobject = jsonarray.get(j).getAsJsonObject();
                  long k = jsonobject.get("timestamp").getAsLong();
                  if (k != i) {
                     return;
                  }

                  String s = jsonobject.get("type").getAsString();
                  String s1 = jsonobject.get("message").getAsString();
                  GetDisplayNameHandler iili1iilllliiil = new GetDisplayNameHandler(s, s1, k);
                  if (iili1iilllliiil.l1lIlI11ll11l111()) {
                     this.l1IllIIlIIl11l1I1IlI1IIl11Il1l.addFirst(iili1iilllliiil);
                  }
               }

               return;
            }
         }
      } catch (IOException ioexception) {
         ioexception.printStackTrace();
      }
   }

   public List<GetDisplayNameHandler> llI1llllIllIlll1l1lI11lIIIl() {
      return this.l1IllIIlIIl11l1I1IlI1IIl11Il1l;
   }
}
