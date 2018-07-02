package proba1;

import org.rapidoid.setup.On;
import org.rapidoid.u.U;

public class Main {
    public static void main(String[] args) {
        On.get("/hello").json(() -> U.map("msg", "Hello, world!"));
    }
}
