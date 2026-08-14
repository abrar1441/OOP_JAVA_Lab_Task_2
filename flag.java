public class flag {
    public static void main(String[] args) {
        String p1 = "* * * * * * ================================== \n";
        String p2 = " * * * * * ================================== \n";
        String p3 = "============================================== \n";
        
        
        for (int i = 0; i < 4; i++) {
            System.out.print(p1);
            System.out.print(p2);
        }
        System.out.print(p1); 
        
        for (int i = 0; i < 6; i++) {
            System.out.print(p3);
        }
    }
}
