class Row1 {
    public static void main(String[] args) {

        int n = 5;

        // 1. Square Hollow Pattern
        System.out.println("Square Hollow Pattern:");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        // 2. Number Triangle
        System.out.println("\nNumber Triangle:");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // 3. Number Increasing Pyramid
        System.out.println("\nNumber Increasing Pyramid:");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // 4. Number Increasing Reverse Pyramid
        System.out.println("\nNumber Increasing Reverse Pyramid:");
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // 5. Number Changing Pyramid
        System.out.println("\nNumber Changing Pyramid:");
        int num = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }
}
