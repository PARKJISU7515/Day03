//배열각 값의 해당 숫자가 나온 갯수 세기 

class ArryEx11 {
 public static void main(String[] args){
  
     int[] numArr = new int[10];
     int[] counter = new int[10];

     for (int i =0; i < numArr.length; i++){
         numArr[i] = (int)(Math.random () * 10);
        System.out.print(numArr[i]);
     }

     System.out.println();


     for(int i=0; i < numArr.length; i++){
         counter[numArr[i]]++;
     }


     for( int i=0; i < numArr.length; i++){
          System.out.print(i  + "의 개수" +counter[i]);
     }

    }


}