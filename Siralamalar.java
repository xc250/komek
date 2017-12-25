package degiskenler;

public class Siralamalar {

	public static void bubbleSort(int dizi[]) { //diziyi her zaman en baştan küçük büyük kontrolü yapar, değişmediğinde işlem bitmiştir
		int degiskensayisi = dizi.length;
		int temp, i;
		boolean swap = true;
		// System.out.println(degiskensayisi);

		while (swap) {

			swap = false;
			for (i = 0; i < degiskensayisi - 1; i++) {
				if (dizi[i] > dizi[i + 1]) {
					temp = dizi[i + 1];
					dizi[i + 1] = dizi[i];
					dizi[i] = temp;
					swap = true;
				}

			}

		}

		for (i = 0; i < degiskensayisi; i++)
			System.out.println(i + 1 + "elemanÄ±" + dizi[i]);

	}

	public static void selectionSort(int dizi[]) { //her iç for döngüsünde dizinin en küçük elemanını bulur ve ilk elemana atar, dış for artıp 2. elemandan aynısını tekrarlar
		int degiskensayisi = dizi.length;
		int enkucukindex, i, j, enkucukdeger;

		for (i = 0; i < degiskensayisi - 1; i++) {
			enkucukindex = i;
			for (j = i + 1; j < degiskensayisi; j++) {

				if (dizi[j] < dizi[enkucukindex])
					enkucukindex = j;

			}

			enkucukdeger = dizi[enkucukindex];
			dizi[enkucukindex] = dizi[i];
			dizi[i] = enkucukdeger;

		}

		for (i = 0; i < degiskensayisi; i++)
			System.out.println(i + 1 + "elemanÄ±" + dizi[i]);

	}

}
