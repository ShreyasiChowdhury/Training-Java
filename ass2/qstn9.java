class qstn9 {
    public static void main(String[] args) {
        int n = 2, k = 0;
        int arr[][] = new int[n][n];
        int temp[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(args[k]);
                k++;
            }
        }

        int p = 0, q = 0;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                temp[p][q] = arr[i][j];
                q++;
            }
            q = 0;
            p++;
        }
        System.out.println("2-D Array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(temp[i][j] + " ");
            System.out.println();
        }
    }
}