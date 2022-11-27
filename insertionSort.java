
public class insertionSort {

	public static void main(String[] args) {
		
int [] dizi1= {13 ,22,14,16,76,25,37,44,61,52};  // dizi1 adýnda dizi oluþturduk

for(int j=1;j<dizi1.length;j++) { // dizinin ikinnci indexinden itaberen arama yapmasý için döngü oluþturduk
	int key=dizi1[j];    // dizinin indeksinin deðerini  key  deðiþkenine atadýk
	int i=j-1;  // dizinin elemanlarýný geriye doðru taramasý için i deðiþkeni oluþturduk
	while(i>0 && dizi1[i]>= key) {
		dizi1[i+1]=dizi1[i];
		i--;  // diziyi geri doðru taramasý için   döngüye her girdiðinde i deðiþkenini 1 azaltýk
	}
	dizi1[i+1]=key;
	
}
for (int index=0;index<dizi1.length;index++) {
System.out.print(" "+ dizi1[index]);
}



	}

}
