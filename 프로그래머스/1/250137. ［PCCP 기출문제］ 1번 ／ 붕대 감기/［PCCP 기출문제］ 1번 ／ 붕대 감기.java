class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int maxHealth = health;
        int success = 0;
        int currAttackTime = 0;
        for(int i = 1; i<= attacks[attacks.length - 1][0]; i++){
            if(i == attacks[currAttackTime][0]){
                health -= attacks[currAttackTime][1];
                currAttackTime++;
                success = 0;
                if(health <= 0) return -1;
                if(currAttackTime == attacks.length) break;
                System.out.println("i : "+ i + "/ health : "+health);
                continue;
            }
            if(health == maxHealth) continue;
            else{
                health += bandage[1];
                success++;
                if(success == bandage[0]){
                    health += bandage[2];
                    success = 0;
                } 
                if(health > maxHealth) health = maxHealth;
            }
            System.out.println("i : "+ i + "/ health : "+health);
        }
        
        
        return health;
    }
}