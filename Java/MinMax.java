class MinMax {
    public static int[] minMax(int[] arr) {
        int  minimo = arr[0];
        int  maximo = arr[0];

        int [] minMax = new int[2];

        for (int elment : arr){
            if (elment < minimo) {
                minimo = elment;
            }
            if (elment > maximo) {
                maximo = elment;
            }
            minMax [0] = minimo;
            minMax [1] = maximo;
        }
        return minMax;
    }
}