public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
        final int N = Integer.parseInt(args[0]); 
        boolean[] isPrime = new boolean[N+1];

        for(int i = 2; i <= N; i++){
         isPrime[i] = true;// הגדרה שכל המספרים בתחום הזה הם ראשוניים 
        }
        for(int i = 2; i*i <= N; i++){
            if(isPrime[i])// כאן אומרים לי לסמן את כל הכפולות שלו כלא ראשוניות(מתחלקות בו)
               for(int j = i* i; j <= N; j+= i){
                   isPrime[j] = false;
             }
          }
          int count = 0; 

        for(int i = 2; i <= N; i++){
            if(isPrime[i]){
                System.out.println(i);
                count++;
            }
        }
        double percent = 100.0 * count / (N - 1);
        System.out.println("There are " + count + " primes between 2 and " + N + " (" + (int)percent + "% are primes)");
        

    }
}
    
