class Row3 {
    public static void main(String[] args) {

        int n = 5;

        // Square Fill
        System.out.println("Square Fill:");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++)
                System.out.print("* ");
            System.out.println();
        }

        // Right Half Pyramid
        System.out.println("\nRight Half Pyramid:");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }

        // Reverse Right Half Pyramid
        System.out.println("\nReverse Right Half Pyramid:");
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }

        // Left Half Pyramid
        System.out.println("\nLeft Half Pyramid:");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++)
                System.out.print("  ");
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }

        // Reverse Left Half Pyramid
        System.out.println("\nReverse Left Half Pyramid:");
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++)
                System.out.print("  ");
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
