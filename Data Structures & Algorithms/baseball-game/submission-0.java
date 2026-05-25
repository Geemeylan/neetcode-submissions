class Solution {
    public int calPoints(String[] operations) {
        
        ArrayList<String> functions = new ArrayList<>(Arrays.asList(operations));
        ArrayList<Integer> record = new ArrayList<>();

        for (int i = 0; i < functions.size(); i++) {
            if (functions.get(i).equals("+")) {
                int score1 = record.get(record.size() - 1);
                int score2 = record.get(record.size() - 2);
                
                int sum =  score1 + score2;
                record.add(sum);
            } else if (functions.get(i).equals("D")) {
                int prevScore = record.get(record.size() -1);

                int product = prevScore * 2; 
                record.add(product);            
            } else if (functions.get(i).equals("C")) {
                record.remove(record.size() - 1);
            } else {
                record.add(Integer.parseInt(functions.get(i)));
            }
        }

        int output = 0;
        for (int val : record) {
            output += val;
        }

        return output;
    }
}