import java.util.*;
public class ProblemSet9 {
    public  int[] evenOdd(int[] arr) {
        int [] sequence = new int[arr.length];
        if( arr == null ){
            return null;
        } else {
            int count = 0;
            for(int i = 0; i < arr.length; i++){
                if(arr[i] % 2 == 0 ){
                    sequence[count]= arr[i];
                    count++;
                }
            }
            for( int j = 0; j < arr.length; j++){
                if(arr[j] % 2 == 1 ){
                    sequence[count] = arr[j];
                    count++;
                }
            }
            return sequence;
        }
    }

    public int[] notAlone(int[] arr, int alone) {
        if(arr == null || arr.length == 0){
            return null;
        }
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == alone){
                if(arr[i-1] > arr[i+1]){
                    arr[i] = arr[i-1];
                }else if (arr[i+1] > arr[i-1]){
                    arr[i] = arr[i+1];
                }
            }
        }
        return arr;
    }

    public  int[] shiftLeft(int[] arr) {
        int [] shift = new int[arr.length];

        if( arr == null || arr.length == 0 ){
            return null;
        } else{
            for( int i = 1; i < arr.length; i++){
                shift[ i-1] = arr[i];
            }
            shift[arr.length-1] = arr[0];
            return shift;
        }
    }

    public int[] fillIn(int start, int end) {
        int count = 0;
        int[] output = new int[end - start];

        if (start <= end) {
            for (int i = start; i <= end - 1; i++) {
                output[count] = i;
                count++;
            }

        }
        return output;
    }

    public  boolean triple(int[] arr) {
        if( arr == null ){
            return false;
        } else {
            int count = 0;
            for(int i = 0; i <arr.length; i++){
                if( arr[i] == 3){
                    count++;
                }
            }
            if(count == 3) {
                return true;
            } else{
                return false;
            }

        }

    }

    public int pairs(int[] a, int[] b) {
        int n;
        if (a == null || b == null || a.length != b.length) {
            return -1;
        }
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            n = a[i] - b[i];
            if (n <= 2 && n >= -2 && n != 0) {
                count++;
            }
        }
        return count;
    }

    public  boolean twentyFour(int[] arr) {
        if (arr == null) {
            return false;
        } else {
            int two = 0;
            int four = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] == 2 && arr[i - 1] == 2) {
                    two++;
                }
                if (arr[i] == 4 && arr[i - 1] == 4) {
                    four++;
                }
            }
            if (two >= 1 && four >= 1) {
                return false;
            } else if (four >= 1) {
                return true;
            } else if (two >= 1) {
                return true;
            } else {
                return false;
            }
        }
    }
    public boolean fourteen(int[] arr) {
        if (arr == null) {
            return false;
        } else {
            int remove = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 1 && arr[i] != 4) {
                    remove++;
                }
            }
            if (remove == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    public  int centeredAverage(int[] arr) {
        if(arr == null || arr.length < 3){
            return -1;
        }
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        int subtract = 0;
        int sum = 0;
        for(int k = 0; k < arr.length; k++){
            sum +=arr[k];
            if(arr[k] == max || arr[k] == min){
                subtract+= arr[k];
            }
        }
        sum = sum - subtract;
        int avg = sum / ((arr.length - 2));
        return avg;
    }

    public  int outliers(int[] arr) {
        if (arr == null || arr.length < 1) {
            return -1;
        } else {
            int minimum= arr[0];
            int maximum=arr[0];

            for (int i = 0; i <arr.length ; i++) {
                if( arr[i] > maximum){
                    maximum = arr[i];
                }
                if(arr[i] < minimum){
                    minimum = arr[i];
                }
            }

            return maximum - minimum;
        }
    }
}