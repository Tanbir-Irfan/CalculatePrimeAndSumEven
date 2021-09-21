public class CalculatePrimeAndSumEven{
	public static void main(String[] args) {
		int[] elements = {-1, -2, -3, 0};
		System.out.println(sumEvenNumbers(elements));
	}
	public static int sumEvenNumbers(int[] elements)
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
			return -1;
		}

		if((total == 0  && elements.length==0) || elements.length == 0){
			return -1;
		}
		return total;
	}
}
