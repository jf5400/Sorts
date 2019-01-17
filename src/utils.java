public class utils {
    public static int[] randIntArr(int count){
        int[] arr= new int[count];
        for(int i=0; i<arr.length;i++){
            arr[i]=(int)(Math.random()*10001);
        }
        return arr;
    }

    public static double[] randdoubleArr(int count){
        double[] arr = new double[count];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (Math.random()*10001);
        }
        return arr;
    }

    public static String[] randomStringArr(int num, int length){
        String[] arr = new String[num];
        while (num > 0) {
            int i = 0;
            String s = "";
            while(i < length){
                char c= (char)((Math.random()*26)+97);
                s = s+c;
                i++;
            }
            num--;
            arr[num] = s;
        }
        return arr;
    }

    public static int binarySearch(int num, int[] arr){
        int min = 0;
        int max = arr.length;
        while(min <= max){
            int guess = (min + max)/2;
            if(num == arr[guess]){
                return guess;
            }
            else if(num > arr[guess]){
                max = guess - 1;
            }
            else if(num < arr[guess]){
                min = guess + 1;
            }
        }
        return -1;
    }
}
