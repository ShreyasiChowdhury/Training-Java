class qstn10 {
    public static void main(String[] args) {
        int n = 3, k = 0;
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(args[k]);
                k++;
            }
        }
        int max = arr[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Greatest Element: " + max);
    }
}