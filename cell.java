public class cell {
    private int row, col;
    private boolean isLive;

    public cell(int row,int col){
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public boolean getIsLive() {
        return isLive;
    }

    public void setIsLive(boolean live) {
        isLive = live;
    }

}
