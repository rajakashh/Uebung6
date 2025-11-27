public class H2_main {
    
    public static boolean compareArrays(int[] a, int[] b) {

        if (a.length != b.length) {
            return false;
        }
        

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        
        return true;
    }
}
