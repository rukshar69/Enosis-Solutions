int f(int a[], int size_array){
	
	int sum;
	for(int i =0;i<size_array;i++){
		sum += a[i];
	}
	sum = sum/size_array;
	return sum;
}
