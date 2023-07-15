def boardstatus(board):
    print("Current status of the board: \n\n")
    for i in range(0,9):
      if(i>0 and i%3==0):
        print("\n")
      if(board[i]==0):print("_ ",end="");
      if(board[i]==-1):print("X ", end ="");
      if(board[i]==1):print("O ",end="");
    print("\n\n");
def player1turn(board):
  pos=int(input(" Enter ur turn of position from \n 1 2 3 \n 4 5 6 \n 7 8 9"))
  if(board[pos-1]!=0):
    print("Wrong move!!");
    exit(0);
  board[pos-1]=-1;
def player2turn(board):
  pos=int(input(" Enter ur turn of position from \n 1 2 3 \n 4 5 6 \n 7 8 9"))
  if(board[pos-1]!=0):
    print("Wrong move!!");
    exit(0);
  board[pos-1]=1;
def minmax(board,player):
  x=analyseboard(board);
  if(x!=0):
    return(x*player);
  pos=-1;
  value=-2;
  for i in range(0,9):
    if(board[i]==0):
      board[i]=player;
      score=-minmax(board,player*-1);
      board[i]=0;
      if(score>value):
        value=score;
        pos=i;
  if(pos==-1):return 0;
  return value;
def computerturn(board):
  pos=-1;
  value=-2;
  for i in range(0,9):
    if(board[i]==0):
      board[i]=1;
      score=-minmax(board,-1);
      board[i]=0;
      if(score>value):
        value=score;
        pos=i;
  board[pos]=1
def analyseboard(board):
  cb=[[0,1,2],[3,4,5],[6,7,8],[0,4,8],[2,4,6],[0,3,6],[1,4,7],[2,5,8]]#winning chances
  for i in range (0,8):
    if((board[cb[i][0]]!=0) and (board[cb[i][0]]==board[cb[i][1]]) and (board[cb[i][0]]==board[cb[i][2]])):return board[cb[i][0]];
  return 0;
def main():
  choice=int(input("\t 1) SINGLE PLAYER (OR) \n \t 2) MULTIPLAYER  \t"));
  board=[0,0,0,
         0,0,0,
         0,0,0]
  if(choice==1):
    print(" Computer -> 0 vs  You -> 1 ");
    player=int(input(" who is going to start first :"))
    for i in range(0,9):#single player coding
      if(analyseboard(board)!=0):break;
      if((i+player)%2==0):computerturn(board);
      else:
        boardstatus(board);
        player1turn(board);
  else: #multiplayer coding
    for i in range(0,9):
      if(analyseboard(board)!=0):break;
      if(i%2==0):
        boardstatus(board);
        player1turn(board);
      else:
        boardstatus(board);player2turn(board);
  x=analyseboard(board);
  if(x==0):boardstatus(board);print("Draw Match");
  if(x==-1):boardstatus(board);print("YOU won the game");
  if(x==1):boardstatus(board);print("Computer won the game");
