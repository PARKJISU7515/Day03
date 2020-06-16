class CntSeven {
 public static void main(String[] args){
 
      int cnt =0;
      int first=   1;
      int last = 1000;


      for ( int i =last; i <= first; i++){
          
          int arr = i;


         while(arr >0){
          if( arr%10 == 8){
              cnt++;
          }
         
          arr /= 10;   // 1234%10    123%10   12%10 
         }

      }
         System.out.println("number of 8 ("+ first +"~"+last+"):" +cnt);

   }

}