class Result {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
    // Write your code here
        Map<Integer,Integer> count = new HashMap<>();
        int pairs = 0;
        for(int a: ar){
            if(count.containsKey(a)){
                count.put(a, count.get(a)+1);
            }else{
                count.put(a, 1);
            }   
        }
        
        for(Map.Entry<Integer, Integer> pair : count.entrySet()){
            if(pair.getValue()%2==0){
                int val = pair.getValue()/2;
                pairs+=val;
            }else{
               int val= (pair.getValue()-1)/2;
               pairs+=val;
            }
            
            
        }
         return pairs;   
    }

}
