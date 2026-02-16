class Row4 {
    public static void main(String[] args) {

        int n = 5;

        // K Pattern
        System.out.println("K Pattern:");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==1 || i+j==n/2+2 || i-j==n/2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        // Triangle Star
        System.out.println("\nTriangle:");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }

        // Reverse Number Pattern
        System.out.println("\nReverse Number:");
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++)
                System.out.print(i+" ");
            System.out.println();
        }
    }
}
