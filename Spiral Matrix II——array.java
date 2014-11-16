if(n < 0) return null;
        int[][] res = new int[n][n];
       
        int x = 0;
        int y = 0;
        int val = 1;
        while(n > 0){
            if (n == 1) {
                res[y][x] = val ++;
                break;
            }
            for(int i = 0; i < n - 1; i ++){
                res[y][x + i] = val++;
            }
            for(int i = 0; i < n - 1; i ++){
                res[y + i][x + n - 1] = val++;
            }
            for(int i = 0; i < n - 1; i ++){
                res[y + n - 1][x + n - i - 1] = val++;
            }
            for(int i = 0; i < n - 1; i ++){
                res[y + n - i - 1][x] = val++;
            }
            x++;
            y++;
            n = n - 2;
        }
        return res;
    }
}

/*
    int lvl = n;
    int val = 1;
    for(int i = 0; i < lvl/2; i++){
            for(int j = i; j < n - i; j++){
                res[i][j] = val++;
            }
            for(int j = i + 1; j < n - i; j++){
                res[j][n - 1 - i] = val++;
            }
            for(int j = n - i - 2; j >= i; j--){
                res[n - 1 - i][j] = val++;
            }
            for(int j = n - i - 2; j > i; j--){
                res[j][i] = val++;
            }
        }
        if(n % 2 == 1){
            res[lvl/2][lvl/2] = val;  
        }
        return res;
        
    }
*/
