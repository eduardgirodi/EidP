public class Stack {

    private int maxGroesse;
    private int aktuell;
    Object[] objectArray;
    
    public Stack(int maximalGroesse) {
        this.maxGroesse = maximalGroesse;
        this.aktuell = 0;
        objectArray = new Object[maximalGroesse];
    }

    public void push(Object o) {
        if(this.aktuell == this.maxGroesse) {
            return;
        }
        this.objectArray[this.aktuell] = o;
        this.aktuell++;
    }

    public Object pop() {
        if(this.aktuell == 0) {
            return null;
        }
        Object o = this.objectArray[aktuell -1];
        this.objectArray[aktuell -1] = null;
        this.aktuell--;
        return o;
    }

    public boolean isEmpty() {
        if(this.aktuell > 0) {
            return false;
        }
        else {
            return true;
        }
    }

    public int getAktuell() {
        return this.aktuell;
    }

    public int getMaxGroesse() {
        return this.maxGroesse;
    }

    public static void main(String[] args) {
        Stack st = new Stack(10);
        st.push("a");
        st.push("b");
        st.push("c");
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.isEmpty());
    }
}
