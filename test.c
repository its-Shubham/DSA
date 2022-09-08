// #include <stdio.h>

// int lis(int arr[], int n)
// {
//     int lis[n];
 
//     lis[0] = 1;
 
//     /* Compute optimized LIS values in
//        bottom up manner */
//     for (int i = 1; i < n; i++) {
//         lis[i] = 1;
//         for (int j = 0; j < i; j++)
//             if (arr[i] > arr[j] && lis[i] < lis[j] + 1)
//                 lis[i] = lis[j] + 1;
//     }
    
//     int max_ele = lis[0];
//     for (int i = 0; i<n; i++) {
//         if (lis[i] > max_ele) max_ele = lis[i];
//     }
//     // Return maximum value in lis[]
//     return max_ele;
// }
 
// /* Driver program to test above function */
// int main()
// {
//     int n;
//     scanf("%d", &n);
//     int arr[n];
//     for(int i = 0; i<n; i++) {
//         scanf("%d", &arr[i]);
//     }
//     printf("%d", lis(arr, n));
 
//     return 0;
// }



#include <stdio.h>
int main(){
    int x;

    for (x=-1; x<10;x++){
    if (x<5){
        continue;
        } else{
        break;
    } 
    printf("Nagarro");
    }
return 0;
}