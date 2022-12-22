package br.com.impacta.meuprimeiroprojeto;

public class Repetition {
    public void CheckIndex(int[] Numbers, int target){
        int prev;
        int curr;
        int result;

        int[] PositionsArray = {};

        for (int index = 0; index < Numbers.length; index++){
            if(index == Numbers.length - 1){
                curr = Numbers[index];
                result = curr;
            }else{
                curr = Numbers[index];
                prev = Numbers[index + 1];
                result = curr + prev;
            }

            if (result == target){
                //PositionsArray[index] = index;
                System.out.println(index);
            }
        }

        }

    public static void RunRepetition() {
        int[] nums = {2,7,11,15};
        Repetition repetition = new Repetition();

        repetition.CheckIndex(nums,2);
        repetition.CheckIndex(nums,4);
        repetition.CheckIndex(nums,5);
        repetition.CheckIndex(nums,9);
        repetition.CheckIndex(nums,18);
    }
    }


