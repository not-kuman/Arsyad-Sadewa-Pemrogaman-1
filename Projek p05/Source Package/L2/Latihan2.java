import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Latihan2 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String BacaInput = "";
        int JmlData = 0;
        int[] DataArray;

        System.out.print("Masukkan jumlah data: ");
        try {
            BacaInput = dataIn.readLine();
            JmlData = Integer.parseInt(BacaInput);
        } catch (IOException e) {
            System.out.println(" Ada kesalahan!");
        }

        DataArray = new int[JmlData];

        System.out.println();
        for (int i = 0; i < JmlData; i++) {
            System.out.print("Data Array[" + i   + "]: ");
            try {
                BacaInput = dataIn.readLine();
                DataArray[i] = Integer.parseInt(BacaInput);
            } catch (IOException e) {
                System.out.println(" Ada kesalahan!");
            }
        }
        System.out.println("\n--- Data dalam Array ---");
        for (int i = 0; i < JmlData; i++) {
            System.out.println("Data Array[" + i + "]: " + DataArray[i]);
        }

        if (JmlData > 0) {
            int max = DataArray[0];
            int min = DataArray[0];

            for (int i = 1; i < JmlData; i++) {
                if (DataArray[i] > max) {
                    max = DataArray[i];
                }
                if (DataArray[i] < min) {
                    min = DataArray[i];
                }
            }
            for (int i = 0; i < JmlData; i++) {
                for (int j = 0; j < JmlData - i - 1; j++) {
                    if (DataArray[j] > DataArray[j + 1]) {
                        int temp = DataArray[j];
                        DataArray[j] = DataArray[j + 1];
                        DataArray[j + 1] = temp;
                    }
                }
            }
            System.out.println("\nNilai Maksimal: " + max);
            System.out.println("Nilai Minimal: " + min);

            System.out.println("\n--- Data setelah diurutkan ---");
            for (int i = 0; i < JmlData; i++) {
                System.out.println("Data Array[" + i + "]: " + DataArray[i]);
            }
        }
    }
    
}
