
public class insertionSort {

	public static void main(String[] args) {
		
int [] dizi1= {13 ,22,14,16,76,25,37,44,61,52};  // dizi1 ad�nda dizi olu�turduk

for(int j=1;j<dizi1.length;j++) { // dizinin ikinnci indexinden itaberen arama yapmas� i�in d�ng� olu�turduk
	int key=dizi1[j];    // dizinin indeksinin de�erini  key  de�i�kenine atad�k
	int i=j-1;  // dizinin elemanlar�n� geriye do�ru taramas� i�in i de�i�keni olu�turduk
	while(i>0 && dizi1[i]>= key) {
		dizi1[i+1]=dizi1[i];
		i--;  // diziyi geri do�ru taramas� i�in   d�ng�ye her girdi�inde i de�i�kenini 1 azalt�k
	}
	dizi1[i+1]=key;
	
}
for (int index=0;index<dizi1.length;index++) {
System.out.print(" "+ dizi1[index]);
}



	}

}
