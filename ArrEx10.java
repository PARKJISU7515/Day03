//버블정렬 알고리즘으로 크기준 정렬 

class Arry10 {
    public static void main(String[] args){


        int[] numArr = new int[10];

        for( int i =0; i < numArr.length; i++){
            System.out.print(numArr[i] = (int)(Math.random() * 10) );
        }

        for ( int i =0; i <numArr.length-1; i++){

            boolean changed = false;  //자리바꿈이 발생했는지 체크

            for( int j=0; j<numArr.length-1-i; j++){
                if(numArr[j] > numArr[j+1]){
                    int temp = numArr[j];
                    numArr[j] = numArr[j+1];
                    numArr[j+1] = temp; 

                    changed = true; // 자리바꿈 발생했음

                }  // 옆의값이 더 작으면 바꾸기

            }

            if(!changed) break;

            for(int k=0; k<numArr.length; k++){

                System.out.print(numArr[k]);
                System.out.println();
            }


        }



    }
}