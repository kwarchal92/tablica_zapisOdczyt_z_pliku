package tablica_zapis_do_pliku_i_odczyt_z_pliku;

import java.io.*;

class matrix
{
    int n = 10, i, j;
    int a[][] = new int[n][n];
    int b[][] = new int[n][n];
    int c[][] = new int[n][n];
    public void czytajDane()
    {
        System.out.println("\nWyświetlamy zawartośc tablicy A:\n");
        for (i = 0; i < n; i++)
        {
            for (j = 0; j < n; j++)
            {
                if (i == 1)
                    a[i][j] = 1;
                else
                    a[i][j] = 0;
                System.out.print(a[i][j] + "\t");
            }//j
            System.out.println();
        }//i
    }

    public void przetworzDane()
            throws IOException
    {
        System.out.println();
        System.out.println("\nPrzepisujemy zawartość tablicy A do tablicy B:\n");

        for (i = 0; i < n; i++)
        {
            for (j = 0; j < n; j++)
            {
                b[i][j] = a[j][i]; //przepisujemy tablice zgodnie z poleceniem
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
public class Main {
    public static void main(String[] args)
        throws IOException
    {
        matrix matrix1 = new matrix();

        matrix1.czytajDane();
        matrix1.przetworzDane();
    }
}
