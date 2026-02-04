public TokenPass (int playerCount){
  /*  to be answered in part (a) */
   
  int token = count[playerCount];
  count[playerCount] =0;

  int i= playerCount + 1;

  while (token>=0)
  {
    if (i >= count.length)
    {
      i=0;
    }
    count[i]++;
    token--;
    index++;
  }
}

public void distributeCurrentPlayerTokens(){
  /* to be answered in part (b) */
  return count;
}
