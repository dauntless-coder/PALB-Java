public class Row2 {

        public static void main(String[] args) {

            int n = 5;

            // 1. Zero-One Triangle
            System.out.println("Zero-One Triangle:");
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print((i+j)%2 + " ");
                }
                System.out.println();
            }

            // 2. Palindrome Triangle
            System.out.println("\nPalindrome Triangle:");
            for(int i=1;i<=n;i++){
                for(int j=n-i;j>=1;j--)
                    System.out.print(" ");

                for(int j=i;j>=1;j--)
                    System.out.print(j);

                for(int j=2;j<=i;j++)
                    System.out.print(j);

                System.out.println();
            }

            // 3. Rhombus Pattern
            System.out.println("\nRhombus Pattern:");
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++)
                    System.out.print(" ");
                for(int j=1;j<=n;j++)
                    System.out.print("* ");
                System.out.println();
            }

            // 4. Diamond Pattern
            System.out.println("\nDiamond Pattern:");
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++)
                    System.out.print(" ");
                for(int j=1;j<=2*i-1;j++)
                    System.out.print("*");
                System.out.println();
            }
            for(int i=n-1;i>=1;i--){
                for(int j=1;j<=n-i;j++)
                    System.out.print(" ");
                for(int j=1;j<=2*i-1;j++)
                    System.out.print("*");
                System.out.println();
            }

            // 5. Butterfly Pattern
            System.out.println("\nButterfly Pattern:");
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++)
                    System.out.print("*");

                for(int j=1;j<=2*(n-i);j++)
                    System.out.print(" ");

                for(int j=1;j<=i;j++)
                    System.out.print("*");

                System.out.println();
            }
            for(int i=n;i>=1;i--){
                for(int j=1;j<=i;j++)
                    System.out.print("*");

                for(int j=1;j<=2*(n-i);j++)
                    System.out.print(" ");

                for(int j=1;j<=i;j++)
                    System.out.print("*");

                System.out.println();
            }
        }
    }


