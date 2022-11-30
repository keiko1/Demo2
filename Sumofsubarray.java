//https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118820/offering/1381867

import java.util.ArrayList;

public class Sumofsubarray {

  public static int subArrayCount(ArrayList < Integer > arr, int k) {

    // To store frequency of every remainder.
    ArrayList < Integer > remArr = new ArrayList < > (k);
    for (int i = 0; i < k; i++) {
      remArr.add(i, 0);
    }

    // To store prefix sum.
    long pre = 0;

    for (int i = 0; i < arr.size(); i++) {
      pre += arr.get(i);

      // If current remainder is 'x' then increase remainder 'x' frequency by '1'.
      remArr.set((int)(((pre % k) + k) % k), remArr.get((int)(((pre % k) + k) % k)) + 1);
    }

    // To store count of the all subarray has sum is divisible by 'k'.
    int count = 0; 

    // Iterate every occurence of remainder.
    for (int i = 0; i < k; i++) {
      if (remArr.get(i) > 1) {
      	
        // Total subarray with particular remainder.
        int totalPossibleCombination = ((remArr.get(i) * (remArr.get(i) - 1)) / 2);
        count = count + totalPossibleCombination;
      }
    }

    // Add remainder '0' frequency.
    count += remArr.get(0);

    return count;
  }

}
//     int count = 0;
//     int length = arr.size();
//     for(int i = 0; i < length; i++){
//         if(arr.get(i)  % k == 0){
//             count ++;
//         }
//         int sum = arr.get(i);
//         for(int j = i+1; j < length; j++){
//             sum = sum + arr.get(j); 
//             if(sum % k ==0){
//                 count ++;
//             }
//         }
            

//   }
//       return count;
