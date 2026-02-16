class Row5 {
    public static void main(String[] args) {

        int n = 5;

        // Half Diamond
        System.out.println("Half Diamond:");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }

        // Pascal Triangle
        System.out.println("\nPascal Triangle:");
        for(int i=0;i<n;i++){
            int num=1;
            for(int j=0;j<=i;j++){
                System.out.print(num+" ");
                num = num*(i-j)/(j+1);
            }
            System.out.println();
        }

        // Sandglass Pattern
        System.out.println("\nSandglass:");
        for(int i=n;i>=1;i--){
            for(int j=0;j<n-i;j++)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
        for(int i=2;i<=n;i++){
            for(int j=0;j<n-i;j++)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
