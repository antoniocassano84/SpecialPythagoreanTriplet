package com.company;

class Main {

    static void pythagoreanTriplets(int sum) {
        int a, b, c = 0;
        int m = 2;

        while (c < sum) {
            for (int n = 1; n < m; n++) {
                a = m * m - n * n;
                b = 2 * m * n;
                c = m * m + n * n;
                if (a + b + c == sum) {
                    System.out.println("a = " + a + "; b = " + b + "; c = " + c +
                            "; a X b X c = " + (a * b * c)); // Answer = 31875000
                    break;
                }
            }
            m++;
        }
    }

    public static void main(String args[]) {

        int sum = 1000;
        pythagoreanTriplets(sum);
    }
}

