public CalculatePrimeAndSumEven{
public int sumEvenNumbers(int[] elements)
{
	int total = 0;
	try{
	for(int i = 0; i <  elements.length; i++){
		if(elements[i]%2 == 0){
	total+=elements[i];
}
	}
}
catch(NullPointerException e){
System.out.println(e.getMessage())
}

if((total == 0  && elements.length==0)   ||  elements.length == 0 || elements == null){
	return -1;
}
return total;
}
}
