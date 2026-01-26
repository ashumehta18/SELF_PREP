public boolean serch(int[][] a , int x){
for(int i = 0 ;i<n;i++){
  for(int j = 0 ;j<m ;j++){
    if(a[i][j] == x) {
      //x = element target need to be found
      return true;
    }
  }
}
return false;
}
    
