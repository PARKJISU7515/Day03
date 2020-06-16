class Arry{
    public static void main(String[] args){

        char[] abc = { 'A','B', 'C'};
        char[] num = {'0', '1', '2', '3', '4', '5'};
        System.out.println(abc);   
        System.out.println(num);



        // 배열 abc와num을 붙여서 하나의 배열result 만들기  
        char[] result = new char [ abc.length+ num.length];
        System.arraycopy(abc, 0, result, 0, abc.length);
        System.arraycopy(num, 0, result, abc.length, num.length);
        System.out.println(result);    //ABC012345


        //배열 abc를 배열 num의 첫번째 위치부터 배열 abc의 길이만큼 복사 
        System.arraycopy(abc, 0, num, 0. abc.length);
        System.out.println(num);   //ABC345


        //number의 인덱스2위치에 3개 복사
        System.arraycopy(abc, 0, num, 2, 3);
           System.out.println(num);   //ABABC5



    }
}