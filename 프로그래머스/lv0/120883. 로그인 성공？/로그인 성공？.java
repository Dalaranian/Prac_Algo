class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        
        for(int i = 0;i<=db.length-1;i++){
            if(id_pw[0].equals(db[i][0])){
                if(id_pw[1].equals(db[i][1])){
                    answer = "login";
                }else{
                    answer = "wrong pw";
                }
                break;
            }else{
                answer = "fail";
            }
        }
        
        return answer;
    }
}