/**
 * Created by CullenGao on 5/10/16.
 */
public class Tuple<FIRST, SECOND> {

    private final FIRST first;
    private final SECOND second;

    public Tuple(FIRST first, SECOND second) {
        this.first = first;
        this.second = second;
    }

    public FIRST getFirst() {
        return this.first;
    }

    public SECOND getSecond() {
        return this.second;
    }

    public int hashCode() {
        final int prime = 31;
        int ret = 1;
        ret = prime * ret + ((first == null) ? 0 : first.hashCode());
        return ret;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        Tuple other = (Tuple) o;
        if (first == null) {
            if (other.first != null) {
                return false;
            }
        } else if (!first.equals(other.first)) {
            return false;
        }
        return true;
    }

    public int compareTo(Tuple<FIRST, SECOND> o) {
        if (o.getFirst() instanceof Comparable && getFirst() instanceof Comparable) {
            return ((Comparable<FIRST>) getFirst()).compareTo(o.getFirst());
        } else {
            return 0;
        }
    }

    public String toString() {
        return "Tuple [first = " + first + ", second = " + second + "]";
    }
}
