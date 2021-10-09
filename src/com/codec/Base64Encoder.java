package codec;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;

public class Base64Encoder {

    public static void main(String... args) {

        Base64.Encoder encoder = Base64.getEncoder();

        System.out.println(new String(encoder.encode("And".getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8));

    }
}
