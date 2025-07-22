
public class REverse {

    int i;

    void getData(int n) {
        i = n;
    }

    void putData() {
        int rev = 0;
        while (0 < i) {
            int dig = i % 10;
            rev = rev * 10 + dig;
            i /= 10;
        }
        System.out.println(rev);
    }
}
